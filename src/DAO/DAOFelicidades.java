package DAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOFelicidades {

    public DAOFelicidades() {
    }
    public void SumarPuntos(int puntos) {
        int puntouser = Principal.Principal.user.getPuntaje();
        if((puntouser+puntos) < 0){
            JOptionPane.showMessageDialog(null, "Se esta quedando sin puntos, quiza este ejercicio era muy avanzado para usted.");
            puntos=0;
        }
        try (Connection conn = Conexion.conectar()) {
            String sql = "{CALL AgregarPuntosUsuario(?, ?)}";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, Principal.Principal.user.getID());
                stmt.setInt(2, puntos);
                stmt.execute();
                System.out.println("Puntos agregados exitosamente.");
                Principal.Principal.user.setPuntaje(puntos);
                ActualizarNivel();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ActualizarNivel(){
        int points = Principal.Principal.user.getPuntaje();
        String nivel = Principal.Principal.user.getNivel();
        int userID = Principal.Principal.user.getID();
        if(points>=500 && nivel.equals("Novato")){
            AsignarNivelIntermedio(userID);
            JOptionPane.showMessageDialog(null, "Felicitaciones, haz alcanzado el nivel Intermedio.");
        }
        if(points>=1000 && nivel.equals("Intermedio")){
            AsignarNivelAvanzado(userID);
            JOptionPane.showMessageDialog(null, "Felicitaciones, ahora eres un quechuhablante de nivel Avanzado.");
        }
    }
    
    public void AsignarNivelIntermedio(int userID){
        String asignarNivel = "{call AsignarIntermedio(?)}";
        try(Connection cn = Conexion.conectar()){
            CallableStatement cst = cn.prepareCall(asignarNivel);
            cst.setInt(1, userID);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void AsignarNivelAvanzado(int userID){
        String asignarNivel = "{call AsignarNivelAvanzado(?)}";
        try(Connection cn = Conexion.conectar()){
            CallableStatement cst = cn.prepareCall(asignarNivel);
            cst.setInt(1, userID);
            cst.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
