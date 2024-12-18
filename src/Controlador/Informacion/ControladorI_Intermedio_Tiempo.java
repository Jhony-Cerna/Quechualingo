
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorIntermedioTiempoPresente;
import Vista.Ejercicios.Intermedio_TiempoPresente;
import Vista.Informacion.I_Intermedio_Tiempo;
import Vista.Lecciones_Intermedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Intermedio_Tiempo implements ActionListener{
    I_Intermedio_Tiempo info;
    public ControladorI_Intermedio_Tiempo(I_Intermedio_Tiempo form){
        info = form;
        form.btnRegresar.addActionListener(this);
        form.btnContinuar.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setTitle("Informacion - Quechualingo");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==info.btnRegresar){
            Lecciones_Intermedio lecciones = new Lecciones_Intermedio();
            ControladorLeccionesIntermedio control = new ControladorLeccionesIntermedio(lecciones);
            info.dispose();
        }
        if(e.getSource()==info.btnContinuar){
            Intermedio_TiempoPresente ejercicio = new Intermedio_TiempoPresente();
            ControladorIntermedioTiempoPresente control = new ControladorIntermedioTiempoPresente(ejercicio);
            info.dispose();
        }
    }
    
}
