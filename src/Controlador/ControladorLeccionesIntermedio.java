
package Controlador;

import Controlador.Informacion.ControladorI_Intermedio_Deseo;
import Controlador.Informacion.ControladorI_Intermedio_Oraciones;
import Controlador.Informacion.ControladorI_Intermedio_Tiempo;
import Controlador.Informacion.ControladorI_Principiante_Saludos;
import Vista.Informacion.I_Intermedio_Deseo;
import Vista.Informacion.I_Intermedio_Oraciones;
import Vista.Informacion.I_Intermedio_Tiempo;
import Vista.Informacion.I_Principiante_Saludos;
import Vista.Lecciones_Intermedio;
import Vista.Seleccion_Nivel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLeccionesIntermedio implements ActionListener{
    Lecciones_Intermedio vista;

    public ControladorLeccionesIntermedio(Lecciones_Intermedio form) {
        vista=form;
        vista.setLocationRelativeTo(null);
        vista.btnRegresar.addActionListener(this);
        vista.btnDeseo.addActionListener(this);
        vista.btnOraciones.addActionListener(this);
        vista.btnConjugacion.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setTitle("Seleccionar Leccion - Quechualingo"); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegresar){
            Seleccion_Nivel form = new Seleccion_Nivel();
            ControladorSeleccionarNivel control = new ControladorSeleccionarNivel(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnDeseo){
            I_Intermedio_Deseo form = new I_Intermedio_Deseo();
            ControladorI_Intermedio_Deseo controlador = new ControladorI_Intermedio_Deseo(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnOraciones){
            I_Intermedio_Oraciones form = new I_Intermedio_Oraciones();
            ControladorI_Intermedio_Oraciones Controlador = new ControladorI_Intermedio_Oraciones(form);
            vista.dispose();
            
        }
        if(e.getSource()== vista.btnConjugacion){
            I_Intermedio_Tiempo form = new I_Intermedio_Tiempo();
            ControladorI_Intermedio_Tiempo Controlador = new ControladorI_Intermedio_Tiempo(form);
            vista.dispose();
        }
    }
    
}
