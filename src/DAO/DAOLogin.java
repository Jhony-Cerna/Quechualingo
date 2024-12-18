package DAO;
import Controlador.ControladorMenu;
import Controlador.ControladorRegistroExitoso;
import Modelo.Usuario;
import Vista.IniciarSesion;
import java.sql.*;
import Vista.MenuPrincipal;
import Vista.Registrarse;
import Vista.RegistroExitoso;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class DAOLogin {

    public DAOLogin() {
    }
    public void Logearse(IniciarSesion form, String user, String pass) {
    if (!user.equals("") && !pass.equals("")) {
        try (Connection cn = Conexion.conectar()) {
            String query = "SELECT u.ID, u.nombre, u.email, " +
                           "n.nombre AS nivel, up.puntaje " +
                           "FROM usuario u " +
                           "LEFT JOIN usuario_nivel un ON u.ID = un.IDusuario " +
                           "LEFT JOIN nivel n ON un.Idnivel = n.ID " +
                           "LEFT JOIN usuario_puntaje up ON u.ID = up.IDusuario " +
                           "WHERE u.nombre = ? AND u.pass = ?";
            try (PreparedStatement pst = cn.prepareStatement(query)) {
                pst.setString(1, user);
                pst.setString(2, pass);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        int id = rs.getInt("ID");
                        String nombre = rs.getString("nombre");
                        String email = rs.getString("email");
                        String nivel = rs.getString("nivel");
                        int puntaje = rs.getInt("puntaje");

                        Principal.Principal.user = new Usuario(id, email, nombre, nivel, puntaje);
                        MenuPrincipal menu = new MenuPrincipal();
                        ControladorMenu control = new ControladorMenu(menu);
                        form.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                        form.txtCorreo.setText("");
                        form.pswContra.setText("");
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al Acceder: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
    }
}

    public void Registrarse(Registrarse form, String user, String correo, String pass) {
        if (!user.equals("") && !pass.equals("")) {
            if (esCorreoValido(correo)) {
                if (esContrasenaValida(pass)) {
                    if (!emailExiste(correo)) {
                        try (Connection cn = Conexion.conectar()) {
                            // Inicia una transacción
                            cn.setAutoCommit(false);
                            
                            // Inserta el nuevo usuario
                            String insertUsuario = "INSERT INTO usuario (email, pass, nombre) VALUES (?, ?, ?)";
                            try (PreparedStatement pst = cn.prepareStatement(insertUsuario, Statement.RETURN_GENERATED_KEYS)) {
                                pst.setString(1, correo);
                                pst.setString(2, pass);
                                pst.setString(3, user);
                                pst.executeUpdate();
                                
                                // Obtener el ID generado del usuario insertado
                                ResultSet generatedKeys = pst.getGeneratedKeys();
                                int userID = 0;
                                if (generatedKeys.next()) {
                                    userID = generatedKeys.getInt(1);
                                }

                                // Asigna nivel novato al usuario
                                String asignarNivel = "{call AsignarNivelNovato(?)}";
                                try (CallableStatement cst = cn.prepareCall(asignarNivel)) {
                                    cst.setInt(1, userID);
                                    cst.execute();
                                }
                                
                                // Inserta puntaje inicial para el usuario
                                String insertPuntaje = "INSERT INTO usuario_puntaje (IDusuario) VALUES (?)";
                                try (PreparedStatement pstPuntaje = cn.prepareStatement(insertPuntaje)) {
                                    pstPuntaje.setInt(1, userID);
                                    pstPuntaje.executeUpdate();
                                }
                                Principal.Principal.user = new Usuario(userID, correo, user, "Novato", 0);
                            }

                            // Confirma la transacción
                            cn.commit();
                            
                            RegistroExitoso reg = new RegistroExitoso();
                            ControladorRegistroExitoso control = new ControladorRegistroExitoso(reg);
                            form.dispose();
                        } catch (SQLException e) {
                            System.err.println("Error al registrar: " + e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Correo ya registrado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener entre 6 y 12 caracteres.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Correo no válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }

    public boolean esCorreoValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean esContrasenaValida(String pass) {
        return pass.length() >= 6 && pass.length() <= 12;
    }
    
    private boolean emailExiste(String correo) {
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT COUNT(*) FROM usuario WHERE email = ?");
            pst.setString(1, correo);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; // El correo electrónico ya está registrado
              }
            } catch (SQLException e) {
                System.err.println("Error al actualizar");
            }
        return false;
    }
}
