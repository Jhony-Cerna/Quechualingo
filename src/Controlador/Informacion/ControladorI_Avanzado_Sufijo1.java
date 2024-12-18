
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorAvanzadoCuerpoHumano1;
import Controlador.Ejercicios.ControladorAvanzadoSufijo1;
import Vista.Ejercicios.Avanzado_PartesCuerpo1;
import Vista.Ejercicios.Avanzado_Sufijo1;
import Vista.Informacion.I_Avanzado_PartesCuerpo;
import Vista.Informacion.I_Avanzado_Sufijo1;
import Vista.Lecciones_Avanzado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Avanzado_Sufijo1 implements ActionListener{
    I_Avanzado_Sufijo1 info;
    public ControladorI_Avanzado_Sufijo1(I_Avanzado_Sufijo1 form){
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
            Avanzado_Sufijo1 form = new Avanzado_Sufijo1();
            ControladorAvanzadoSufijo1 control = new ControladorAvanzadoSufijo1(form);
            info.dispose();
        }
    }
    
}
