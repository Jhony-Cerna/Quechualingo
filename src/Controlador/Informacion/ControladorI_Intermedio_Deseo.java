
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorIntermedioVerboDeseo;
import Vista.Ejercicios.Intermedio_VerboDeseo;
import Vista.Informacion.I_Intermedio_Deseo;
import Vista.Lecciones_Intermedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Intermedio_Deseo implements ActionListener{
    I_Intermedio_Deseo info;
    public ControladorI_Intermedio_Deseo(I_Intermedio_Deseo form){
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
            Intermedio_VerboDeseo ejercicio = new Intermedio_VerboDeseo();
            ControladorIntermedioVerboDeseo control = new ControladorIntermedioVerboDeseo(ejercicio);
            info.dispose();
        }
    }
    
}
