
package Controlador;

import Vista.EliminarContinuar;
import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEliminarContinuar implements ActionListener{
    EliminarContinuar form;
    public ControladorEliminarContinuar(EliminarContinuar ventana) {
        form=ventana;
        form.setLocationRelativeTo(null);
        form.btnContinuar.addActionListener(this);
        form.btnTraducir.addActionListener(this);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        form.lblESP.setVisible(true);
        form.lblQuechua.setVisible(false);
        ventana.setVisible(true);
        ventana.setTitle("Eliminar Cuenta - Quechualingo");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==form.btnTraducir){
            if(form.lblESP.isVisible()==true){
            form.lblESP.setVisible(false);
            form.lblQuechua.setVisible(true);
            }else{
            form.lblESP.setVisible(true);
            form.lblQuechua.setVisible(false);
            }
        }
        if(e.getSource()==form.btnContinuar){
            Inicio inicio = new Inicio();
            ControladorInicio control = new ControladorInicio(inicio);
            form.dispose();
        }
    }
}
