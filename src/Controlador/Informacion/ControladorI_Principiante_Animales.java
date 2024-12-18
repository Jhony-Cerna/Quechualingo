
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorPrincipianteAnimales;
import Controlador.Ejercicios.ControladorPrincipianteSaludos;
import Vista.Ejercicios.Principiante_EjerAnimales;
import Vista.Informacion.I_Principiante_Animales;
import Vista.IniciarSesion;
import Vista.Inicio;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Principiante_Animales implements ActionListener{
    I_Principiante_Animales info;
    public ControladorI_Principiante_Animales(I_Principiante_Animales form){
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
            Principiante_EjerAnimales ejercicio = new Principiante_EjerAnimales();
            ControladorPrincipianteAnimales control = new ControladorPrincipianteAnimales(ejercicio);
            info.dispose();
        }
    }
    
}
