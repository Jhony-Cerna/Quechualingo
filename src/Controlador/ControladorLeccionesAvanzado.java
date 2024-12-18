
package Controlador;

import Controlador.Informacion.ControladorI_Avanzado_Dialogo;
import Controlador.Informacion.ControladorI_Avanzado_PartesCuerpo;
import Controlador.Informacion.ControladorI_Avanzado_Sufijo1;
import Vista.Informacion.I_Avanzado_Dialogo;
import Vista.Informacion.I_Avanzado_PartesCuerpo;
import Vista.Informacion.I_Avanzado_Sufijo1;
import Vista.Lecciones_Avanzado;
import Vista.Seleccion_Nivel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLeccionesAvanzado implements ActionListener{
    Lecciones_Avanzado vista;

    public ControladorLeccionesAvanzado(Lecciones_Avanzado form) {
        vista=form;
        vista.setLocationRelativeTo(null);
        vista.btnRegresar.addActionListener(this);
        vista.btnDialogos.addActionListener(this);
        vista.btnPartesdelcuerpoh.addActionListener(this);
        vista.btnUsodelsufijo.addActionListener(this);
        vista.btnTraducir.addActionListener(this);
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
        if(e.getSource()== vista.btnDialogos){
            I_Avanzado_Dialogo info = new I_Avanzado_Dialogo();
            ControladorI_Avanzado_Dialogo Controlador = new ControladorI_Avanzado_Dialogo(info);
            vista.dispose();
        }
        if(e.getSource()== vista.btnPartesdelcuerpoh){
            I_Avanzado_PartesCuerpo info = new I_Avanzado_PartesCuerpo();
            ControladorI_Avanzado_PartesCuerpo control = new ControladorI_Avanzado_PartesCuerpo(info);
            vista.dispose();
        }
        if(e.getSource()== vista.btnUsodelsufijo){
            I_Avanzado_Sufijo1 info = new I_Avanzado_Sufijo1();
            ControladorI_Avanzado_Sufijo1 control = new ControladorI_Avanzado_Sufijo1(info);
            vista.dispose();
        }
        if(e.getSource()== vista.btnTraducir){
            
        }
    }
    
}
