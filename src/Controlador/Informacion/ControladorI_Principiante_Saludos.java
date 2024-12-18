
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorPrincipianteSaludos;
import Vista.Ejercicios.Principiante_EjerSaludos;
import Vista.Informacion.I_Principiante_Saludos;
import Vista.IniciarSesion;
import Vista.Inicio;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Principiante_Saludos implements ActionListener{
    I_Principiante_Saludos info;
    public ControladorI_Principiante_Saludos(I_Principiante_Saludos form){
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
            Principiante_EjerSaludos ejercicio = new Principiante_EjerSaludos();
            ControladorPrincipianteSaludos control = new ControladorPrincipianteSaludos(ejercicio);
            info.dispose();
        }
    }
    
}
