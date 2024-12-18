package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import Modelo.Glosario;
import Vista.Recursos.RecursosA;
//import DAO.*;
import Vista.MenuPrincipal;
import Vista.Recursos.RecursosQuechua;
public class ControladorRecursosA implements ActionListener{
    RecursosA vista;  
        public ControladorRecursosA(RecursosA f2){ 
         vista=f2;
         vista.setLocationRelativeTo(null);
         vista.btnConfirmar.addActionListener(this);
         vista.btnRegresar.addActionListener(this);
         vista.btnTraducir.addActionListener(this);
       f2.setTitle("Recursos");    
       f2.setVisible(true);
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegresar){
        MenuPrincipal menu = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(menu);
            vista.dispose();
    }
        
        if(e.getSource()== vista.btnConfirmar){
      RecursosQuechua rq = new RecursosQuechua();
      ControladorRecursosQuechua control = new ControladorRecursosQuechua(rq);
         //   rq.setVisible(true);
            vista.dispose();
    }
        if(e.getSource()== vista.btnTraducir){
            if(vista.lblEspañol.isVisible()==true){
            vista.lblEspañol.setVisible(false);
            vista.lblQuechua.setVisible(true);
            }else{
            vista.lblEspañol.setVisible(true);
            vista.lblQuechua.setVisible(false);
            }
        }
    
}
}
