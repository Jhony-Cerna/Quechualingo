
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorPrincipianteColores;
import Controlador.Ejercicios.ControladorPrincipianteSaludos;
import Vista.Ejercicios.Principiante_EjerColores;
import Vista.Informacion.I_Principiante_Colores;
import Vista.Informacion.I_Principiante_Saludos;
import Vista.IniciarSesion;
import Vista.Inicio;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Principiante_Colores1 implements ActionListener{
    I_Principiante_Colores info;
    public ControladorI_Principiante_Colores1(I_Principiante_Colores form){
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
            Lecciones_Principiante lecciones = new Lecciones_Principiante();
            ControladorLeccionesPrincipiante control = new ControladorLeccionesPrincipiante(lecciones);
            info.dispose();
        }
        if(e.getSource()==info.btnContinuar){
            Principiante_EjerColores ejercicio = new Principiante_EjerColores();
            ControladorPrincipianteColores control = new ControladorPrincipianteColores(ejercicio);
            info.dispose();
        }
    }
    
}
