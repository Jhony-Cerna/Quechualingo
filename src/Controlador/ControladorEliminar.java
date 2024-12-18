
package Controlador;

import DAO.DAOEliminarCuenta;
import Vista.EliminarContinuar;
import Vista.EliminarCuenta;
import Vista.IniciarSesion;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEliminar implements ActionListener {
    EliminarCuenta form;
    public ControladorEliminar(EliminarCuenta ventana) {
        form=ventana;
        form.setLocationRelativeTo(null);
        form.btnCancelar.addActionListener(this);
        form.btnConfirmar.addActionListener(this);
        form.btnTraducir.addActionListener(this);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        form.lblESP.setVisible(true);
        form.lblQuechua.setVisible(false);
        ventana.setVisible(true);
        ventana.setTitle("Eliminar Cuenta - Quechualingo");
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnConfirmar) {
            int userId = Principal.Principal.user.getID(); // Corrección aquí
            DAOEliminarCuenta dao = new DAOEliminarCuenta();
            dao.eliminarCuenta(userId);

            EliminarContinuar eliminarContinuar = new EliminarContinuar();
            ControladorEliminarContinuar control = new ControladorEliminarContinuar(eliminarContinuar);
            form.dispose();
        }
    

        
        
        if(e.getSource()==form.btnCancelar){
            MenuPrincipal menu = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(menu);
            form.dispose();
        }
        if(e.getSource()==form.btnTraducir){
            if(form.lblESP.isVisible()==true){
            form.lblESP.setVisible(false);
            form.lblQuechua.setVisible(true);
            }else{
            form.lblESP.setVisible(true);
            form.lblQuechua.setVisible(false);
            }
        }
    }
    
}
