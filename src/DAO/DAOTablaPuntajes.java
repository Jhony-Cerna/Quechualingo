package DAO;

import Vista.TablaDePuntuaciones;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DAOTablaPuntajes {

    public DAOTablaPuntajes(TablaDePuntuaciones tabla) {
        String titulos[] = {"IdTOP", "NombreUsuario", "Puntos", "Nivel"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        tabla.jtblDatos.setModel(model);
        CargarPuntajes(model);
    }

    public void LlenarTopPuntajes() {
        try (Connection conn = Conexion.conectar()) {
            String sql = "{call LlenarTopPuntajes()}";
            CallableStatement stmt = conn.prepareCall(sql);
            stmt.execute();
            System.out.println("Top puntajes llenados correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CargarPuntajes(DefaultTableModel model) {
        // Llenar la tabla de top puntajes antes de cargar los puntajes en el JTable
        LlenarTopPuntajes();

        try (Connection conn = Conexion.conectar()) {
            String sql = "{call MostrarTopPuntajesConNivel()}";
            CallableStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            // Procesar el resultado y agregar filas al modelo de tabla
            while (rs.next()) {
                int idTop = rs.getInt("IdTOP");
                String nombreUsuario = rs.getString("NombreUsuario");
                int puntos = rs.getInt("Puntos");
                String nivel = rs.getString("Nivel");
                model.addRow(new Object[]{idTop, nombreUsuario, puntos, nivel});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
