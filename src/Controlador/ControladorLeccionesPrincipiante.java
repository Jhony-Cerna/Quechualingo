
package Controlador;

import Controlador.Informacion.ControladorI_Principiante_Animales;
import Controlador.Informacion.ControladorI_Principiante_Colores1;
import Controlador.Informacion.ControladorI_Principiante_DiasSemana;
import Controlador.Informacion.ControladorI_Principiante_Saludos;
import Vista.Informacion.I_Principiante_Animales;
import Vista.Informacion.I_Principiante_Colores;
import Vista.Informacion.I_Principiante_DiasSemana;
import Vista.Informacion.I_Principiante_Saludos;
import Vista.Lecciones_Principiante;
import Vista.Seleccion_Nivel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLeccionesPrincipiante implements ActionListener{
    Lecciones_Principiante vista;

    public ControladorLeccionesPrincipiante(Lecciones_Principiante form) {
        vista=form;
        vista.setLocationRelativeTo(null);
        vista.btnRegresar.addActionListener(this);
        vista.btnAnimales.addActionListener(this);
        vista.btnColores.addActionListener(this);
        vista.btnSaludos.addActionListener(this);
        vista.btnSemana.addActionListener(this);
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
        if(e.getSource()== vista.btnAnimales){
            I_Principiante_Animales form = new I_Principiante_Animales();
            ControladorI_Principiante_Animales control = new ControladorI_Principiante_Animales(form);
            vista.dispose();
            
        }
        if(e.getSource()== vista.btnColores){
            I_Principiante_Colores form = new I_Principiante_Colores();
            ControladorI_Principiante_Colores1 control = new ControladorI_Principiante_Colores1(form);
            vista.dispose();
            
        }
        if(e.getSource()== vista.btnSaludos){
            I_Principiante_Saludos form = new I_Principiante_Saludos();
            ControladorI_Principiante_Saludos control = new ControladorI_Principiante_Saludos(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnSemana){
            I_Principiante_DiasSemana form = new I_Principiante_DiasSemana();
            ControladorI_Principiante_DiasSemana control = new ControladorI_Principiante_DiasSemana(form);
            vista.dispose();
            
        }
    }
    
}
