package DAO;
import Controlador.ControladorMenu;
import Controlador.ControladorRegistroExitoso;
import Modelo.Usuario;
import Vista.IniciarSesion;
import java.sql.*;
import Vista.MenuPrincipal;
import Vista.Registrarse;
import Vista.RegistroExitoso;
import javax.swing.JOptionPane;

public class DAOEliminarCuenta {

    public DAOEliminarCuenta() {
    }
    public void eliminarCuenta(int userId) {
        try (Connection cn = Conexion.conectar()) {
            cn.setAutoCommit(false);
            try (PreparedStatement pst = cn.prepareStatement("DELETE FROM toppuntajes WHERE IDusuario = ?")) {
                pst.setInt(1, userId);
                pst.executeUpdate();
            }
            
            try (PreparedStatement pst = cn.prepareStatement("DELETE FROM usuario_nivel WHERE IDusuario = ?")) {
                pst.setInt(1, userId);
                pst.executeUpdate();
            }

            try (PreparedStatement pst = cn.prepareStatement("DELETE FROM usuario_puntaje WHERE IDusuario = ?")) {
                pst.setInt(1, userId);
                pst.executeUpdate();    
            }

            try (PreparedStatement pst = cn.prepareStatement("DELETE FROM usuario WHERE ID = ?")) {
                pst.setInt(1, userId);
                pst.executeUpdate();
            }

            cn.commit();

            JOptionPane.showMessageDialog(null, "Cuenta eliminada exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al eliminar la cuenta: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar la cuenta: " + e.getMessage());
        }
    }
    
}
