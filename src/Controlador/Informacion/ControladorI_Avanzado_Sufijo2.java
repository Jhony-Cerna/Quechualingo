
package Controlador.Informacion;

import Controlador.*;
import Controlador.Ejercicios.ControladorAvanzadoSufijo1;
import Controlador.Ejercicios.ControladorAvanzadoSufijo2;
import Vista.Ejercicios.Avanzado_Sufijo1;
import Vista.Ejercicios.Avanzado_Sufijo2;
import Vista.Informacion.I_Avanzado_Sufijo1;
import Vista.Informacion.I_Avanzado_Sufijo2;
import Vista.Lecciones_Avanzado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorI_Avanzado_Sufijo2 implements ActionListener{
    I_Avanzado_Sufijo2 info;
    int points;
    int puntosperdidos;
    public ControladorI_Avanzado_Sufijo2(I_Avanzado_Sufijo2 form, int puntos, int puntosresta){
        info = form;
        points = puntos;
        puntosperdidos = puntosresta;
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
            Avanzado_Sufijo2 form = new Avanzado_Sufijo2();
            ControladorAvanzadoSufijo2 control = new ControladorAvanzadoSufijo2(form, points, puntosperdidos);
            info.dispose();
        }
    }
    
}
