
package Controlador;

import Vista.IniciarSesion;
import Vista.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorInicio implements ActionListener{
    Inicio inicio;
    public ControladorInicio(Inicio form){
        inicio = form;
        form.btnIniciar.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setTitle("Incio - Quechualingo");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==inicio.btnIniciar){
            IniciarSesion form = new IniciarSesion();
            ControladorLogin control = new ControladorLogin(form);
            inicio.dispose();
        }
    }
    
}
