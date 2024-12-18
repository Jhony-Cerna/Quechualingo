
package Controlador;

import DAO.DAOLogin;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLogin implements ActionListener{
    IniciarSesion logeo;
    DAOLogin crud;
    public ControladorLogin(IniciarSesion fm){
        logeo = fm;
        AjustarLogin(logeo);
        logeo.btnIngresar.addActionListener(this);
        logeo.btnRegresar.addActionListener(this);
        logeo.btnRegistrarse.addActionListener(this);
        logeo.btnTraducir.addActionListener(this);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Login - Quechualingo");  
    }
    public void AjustarLogin(IniciarSesion form){
       form.setLocationRelativeTo(null);
       logeo.lblESP.setVisible(true);
       logeo.lblQuechua.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== logeo.btnIngresar){
            String user = logeo.txtCorreo.getText().trim();
            String pass = logeo.pswContra.getText().trim();
            crud = new DAOLogin();
            crud.Logearse(logeo,user,pass);
        }
        if(e.getSource()== logeo.btnTraducir){
            if(logeo.lblESP.isVisible()==true){
            logeo.lblESP.setVisible(false);
            logeo.lblQuechua.setVisible(true);
            }else{
            logeo.lblESP.setVisible(true);
            logeo.lblQuechua.setVisible(false);
            }
        }
        if(e.getSource()== logeo.btnRegistrarse){
            Registrarse form = new Registrarse();
            ControladorRegistro control = new ControladorRegistro(form);
            logeo.dispose();
        }
        if(e.getSource()== logeo.btnRegresar){
            Inicio form = new Inicio();
            ControladorInicio control = new ControladorInicio(form);
            logeo.dispose();
        }
    }
}
