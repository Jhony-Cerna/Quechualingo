
package Controlador;

import DAO.DAOTablaPuntajes;
import Vista.TablaDePuntuaciones;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorTablaPuntuacion implements ActionListener{
    TablaDePuntuaciones tabla;
    DAOTablaPuntajes dao;
    DefaultTableModel model = new DefaultTableModel(new String[]{"IdTOP", "NombreUsuario", "Puntos", "Nivel"}, 0);
    public ControladorTablaPuntuacion(TablaDePuntuaciones form){
        tabla = form;
        AjustarTabla(tabla);
        tabla.btnMenu.addActionListener(this);
        tabla.btnTraducir.addActionListener(this);
        tabla.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        tabla.setLocationRelativeTo(null);
        tabla.setVisible(true);
        tabla.setTitle("Tabla de puntuaciones");
        dao = new DAOTablaPuntajes(tabla);
    }
     public void AjustarTabla(TablaDePuntuaciones form){
       form.lblESP.setVisible(true);
       form.lblQuechua.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==tabla.btnMenu){
            MenuPrincipal form = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(form);
            tabla.dispose();
        }
        if(e.getSource()== tabla.btnTraducir){
            if(tabla.lblESP.isVisible()==true){
            tabla.lblESP.setVisible(false);
            tabla.lblQuechua.setVisible(true);
            }else{
            tabla.lblESP.setVisible(true);
            tabla.lblQuechua.setVisible(false);
            }
        }
    }
    
}
