
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorAvanzadoDialogo;
import Vista.Ejercicios.Avanzado_Dialogo;
import Vista.Informacion.I_Avanzado_Dialogo;
import Vista.Lecciones_Avanzado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Avanzado_Dialogo implements ActionListener{
    I_Avanzado_Dialogo info;
    public ControladorI_Avanzado_Dialogo(I_Avanzado_Dialogo form){
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
            Lecciones_Avanzado lecciones = new Lecciones_Avanzado();
            ControladorLeccionesAvanzado control = new ControladorLeccionesAvanzado(lecciones);
            info.dispose();
        }
        if(e.getSource()==info.btnContinuar){
            Avanzado_Dialogo form = new Avanzado_Dialogo();
            ControladorAvanzadoDialogo control = new ControladorAvanzadoDialogo(form);
            info.dispose();
        }
    }
    
}
