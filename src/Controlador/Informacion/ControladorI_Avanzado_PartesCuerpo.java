
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorAvanzadoCuerpoHumano1;
import Controlador.Ejercicios.ControladorIntermedioVerboDeseo;
import Vista.Ejercicios.Avanzado_PartesCuerpo1;
import Vista.Ejercicios.Intermedio_VerboDeseo;
import Vista.Informacion.I_Avanzado_PartesCuerpo;
import Vista.Informacion.I_Intermedio_Deseo;
import Vista.Lecciones_Avanzado;
import Vista.Lecciones_Intermedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Avanzado_PartesCuerpo implements ActionListener{
    I_Avanzado_PartesCuerpo info;
    public ControladorI_Avanzado_PartesCuerpo(I_Avanzado_PartesCuerpo form){
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
            Avanzado_PartesCuerpo1 form = new Avanzado_PartesCuerpo1();
            ControladorAvanzadoCuerpoHumano1 control = new ControladorAvanzadoCuerpoHumano1(form);
            info.dispose();
        }
    }
    
}
