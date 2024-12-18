
package Controlador;

import DAO.DAOLogin;
import Vista.IniciarSesion;
import Vista.Registrarse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistro implements ActionListener{
    Registrarse registro;
    DAOLogin crud;

    public ControladorRegistro(Registrarse form) {
        registro = form;
        form.setLocationRelativeTo(null);
        registro.btnRegistrarse.addActionListener(this);
        registro.btnRegresar.addActionListener(this);
        registro.btnTraducir.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setTitle("Registro - Quechualingo");  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== registro.btnRegistrarse){
            String nombre = registro.txtUsuario.getText().trim();
            String correo = registro.txtCorreo.getText().trim();
            String pass = registro.txtContra.getText().trim();
            crud = new DAOLogin();
            crud.Registrarse(registro,nombre,correo,pass);
        }
        if(e.getSource()== registro.btnRegresar){
            IniciarSesion form = new IniciarSesion();
            ControladorLogin control = new ControladorLogin(form);
            registro.dispose();
        }
        if(e.getSource()== registro.btnTraducir){
            if(registro.lblESP.isVisible()==true){
            registro.lblESP.setVisible(false);
            registro.lblQuechua.setVisible(true);
            }else{
            registro.lblESP.setVisible(true);
            registro.lblQuechua.setVisible(false);
            }
        }
    }
    
    
}
