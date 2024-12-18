
package Controlador;

import Vista.IniciarSesion;
import Vista.MenuPrincipal;
import Vista.RegistroExitoso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistroExitoso implements ActionListener{
    RegistroExitoso reg;

    public ControladorRegistroExitoso(RegistroExitoso form) {
        reg = form;
        form.btnContinuar.addActionListener(this);
        form.btnTraducir.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setTitle("Registro exitoso - Quechualingo");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== reg.btnTraducir){
            if(reg.lblESP.isVisible()==true){
            reg.lblESP.setVisible(false);
            reg.lblQuechua.setVisible(true);
            }else{
            reg.lblESP.setVisible(true);
            reg.lblQuechua.setVisible(false);
            }
        }
        if(e.getSource()==reg.btnContinuar){
            MenuPrincipal menu = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(menu);
            reg.dispose();
        }
    }
    
}
