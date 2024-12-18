
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorPrincipianteSaludos;
import Controlador.Ejercicios.ControladorPrincipianteSemana;
import Vista.Ejercicios.Principiante_EjerDias;
import Vista.Ejercicios.Principiante_EjerSaludos;
import Vista.Informacion.I_Principiante_DiasSemana;
import Vista.Informacion.I_Principiante_Saludos;
import Vista.IniciarSesion;
import Vista.Inicio;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Principiante_DiasSemana implements ActionListener{
    I_Principiante_DiasSemana info;
    public ControladorI_Principiante_DiasSemana(I_Principiante_DiasSemana form){
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
            Principiante_EjerDias ejercicio = new Principiante_EjerDias();
            ControladorPrincipianteSemana control = new ControladorPrincipianteSemana(ejercicio);
            info.dispose();
        }
    }
    
}
