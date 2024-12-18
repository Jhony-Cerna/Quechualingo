package DAO;
import Modelo.Glosario;
import javax.swing.JTable;
import javax.swing.JLabel;
import Formatos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DAOGlosario extends Conexion{

    public DAOGlosario() {}
    //Método que muestra los datos de la tabla cliente en un JTable
 public void MostrarGlosario(JTable tabla){
     String[] titulos={"ID Glosario","Español","Quechua"};
     DefaultTableModel modelo = new DefaultTableModel(null,titulos);
     tabla.setModel(modelo);
     Glosario glo =  new Glosario();
     
     try (Connection cn = Conexion.conectar()) {
         String query ="select IDGlosario,español,quechua from glosario where indicadorGlo='S'"; 
         try (PreparedStatement pst = cn.prepareStatement(query)) {
             try (ResultSet rs = pst.executeQuery()) {
             while(rs.next()){
             
                        int IDGlosario = rs.getInt("IDGlosario");
                        String español = rs.getString("español");
                        String quechua = rs.getString("quechua");
              modelo.addRow(new Object[]{IDGlosario, español, quechua});
     }
         }//fin while        
             
        cn.close();
     }catch(SQLException e){
        Mensajes2.M1("ERROR no se pueden mostrar los Glosarios ...."+e);
     }
 }      catch (SQLException ex) {
            Logger.getLogger(DAOGlosario.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
 public void InsertarGlosario(String español,String quechua){
     String query = "INSERT INTO glosario(español, quechua, indicadorGlo) VALUES (?, ?, 'S')";
     try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(query)) {
         //preparamos la consulta
         
         //actualizando los parametros
         ps.setString(1, español);
                    ps.setString(2, quechua);
                    ps.executeUpdate(); //actualizamos la consulta y ejecutamos
         Mensajes2.M1("Datos insertados correctamente");
                    
     }catch(Exception e){
         Mensajes2.M1("ERROR no se puede insertar Glosario..."+e);
     }
 }
 
 //metodo que recupera un registro de la tabla Glosario mediante su id
 public Glosario ConsultarRegistro(int IDGlosario){
     Glosario glo = null;
     String query = "SELECT IDGlosario, español, quechua, indicadorGlo FROM Glosario WHERE indicadorGlo='S' AND IDGlosario=?";
      try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(query)) {
        
            ps.setInt(1, IDGlosario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    glo = new Glosario();
                    glo.setIDGlosario(rs.getInt("IDGlosario"));
                    glo.setEspañol(rs.getString("español"));
                    glo.setQuechua(rs.getString("quechua"));
                    glo.setIndicadorGlo(rs.getString("indicadorGlo"));
                }
            }

        } catch (SQLException e) {
            Mensajes2.M1("ERROR no se puede consultar el registro: " + e);
        }
        return glo;
    }
 
 //método que actualiza un registro  de la tabla Glosario por medio de su id
 public void ActualizarRegistro(String español,String quechua,int IDGlosario){//continuar
      String query = "UPDATE glosario SET español=?, quechua=? WHERE IDGlosario=?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setString(1, español);
                    ps.setString(2, quechua);
                    ps.setInt(3, IDGlosario);
                    ps.executeUpdate();
            Mensajes2.M1("Registro actualizado correctamente");

        } catch (SQLException e) {
            Mensajes2.M1("ERROR no se puede actualizar el registro: " + e);
        }
 }
 
  //método que elimina (inhabilita) un registro de la tabla cliente
 public void EliminarRegistro(int IDGlosario){
     String query = "UPDATE glosario SET indicadorGlo='N' WHERE IDGlosario=?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(query)) {

            ps.setInt(1, IDGlosario);
            ps.executeUpdate();
            Mensajes2.M1("Registro eliminado de la tabla Glosario");

        } catch (SQLException e) {
            Mensajes2.M1("ERROR no se puede eliminar el registro: " + e);
        }
 }
}
