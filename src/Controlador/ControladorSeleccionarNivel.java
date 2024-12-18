
package Controlador;

import Vista.Lecciones_Avanzado;
import Vista.Lecciones_Intermedio;
import Vista.Lecciones_Principiante;
import Vista.MenuPrincipal;
import Vista.Seleccion_Nivel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorSeleccionarNivel implements ActionListener{
    Seleccion_Nivel vista;

    public ControladorSeleccionarNivel(Seleccion_Nivel form) {
        vista=form;
        vista.setLocationRelativeTo(null);
        vista.btnRegresar.addActionListener(this);
        vista.btnPrincipiante.addActionListener(this);
        vista.btnIntermedio.addActionListener(this);
        vista.btnAvanzado.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setTitle("Seleccionar Nivel - Quechualingo"); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegresar){
            MenuPrincipal form = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnPrincipiante){
            Lecciones_Principiante form = new Lecciones_Principiante();
            ControladorLeccionesPrincipiante control = new ControladorLeccionesPrincipiante(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnIntermedio){
            Lecciones_Intermedio form = new Lecciones_Intermedio();
            ControladorLeccionesIntermedio control = new ControladorLeccionesIntermedio(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnAvanzado){
            Lecciones_Avanzado form = new Lecciones_Avanzado();
            ControladorLeccionesAvanzado control = new ControladorLeccionesAvanzado(form);
            vista.dispose();
        }
    }
    
}
