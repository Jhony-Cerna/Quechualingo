
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorIntermedioOraciones;
import Vista.Ejercicios.Intermedio_FormacionOraciones;
import Vista.Ejercicios.Intermedio_TiempoPresente;
import Vista.Ejercicios.Principiante_EjerAnimales;
import Vista.Informacion.I_Intermedio_Deseo;
import Vista.Informacion.I_Intermedio_Oraciones;
import Vista.Informacion.I_Intermedio_Tiempo;
import Vista.Informacion.I_Principiante_Animales;
import Vista.IniciarSesion;
import Vista.Inicio;
import Vista.Lecciones_Intermedio;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Intermedio_Oraciones implements ActionListener{
    I_Intermedio_Oraciones info;
    public ControladorI_Intermedio_Oraciones(I_Intermedio_Oraciones form){
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
            Intermedio_FormacionOraciones ejercicio = new Intermedio_FormacionOraciones();
            ControladorIntermedioOraciones control = new ControladorIntermedioOraciones(ejercicio);
            info.dispose();
        }
    }
    
}
