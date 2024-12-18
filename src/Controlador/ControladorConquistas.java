
package Controlador;


import Vista.Conquistas;
import Vista.MenuPrincipal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorConquistas implements ActionListener{
    Conquistas Frmconqui;
    public ControladorConquistas(Conquistas form){
        Frmconqui = form;
        AjustarTabla(Frmconqui);
        Frmconqui.btnMain.addActionListener(this);
        Frmconqui.btnTraducir.addActionListener(this);
        Frmconqui.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        Frmconqui.setLocationRelativeTo(null);
        Frmconqui.setVisible(true);
        Frmconqui.setTitle("Conquistas ⚔");
        CalcularLogros();
    }
     public void AjustarTabla(Conquistas form){
       form.lblESP.setVisible(true);
       form.lblQuechua.setVisible(false);
    }
     void CalcularLogros(){
         int puntos = Principal.Principal.user.getPuntaje();
         System.out.println(puntos);
         if(puntos >= 100){
             Frmconqui.jlbl1.setForeground(Color.red);
             Frmconqui.jlbl1.setText("CONQUISTADO");
         }
         if(puntos >= 500){
             Frmconqui.jlbl2.setForeground(Color.red);
             Frmconqui.jlbl2.setText("CONQUISTADO");
         }
         if(puntos >= 1000){
             Frmconqui.jlbl3.setForeground(Color.red);
             Frmconqui.jlbl3.setText("CONQUISTADO");
         }
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Frmconqui.btnMain){
            MenuPrincipal form = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(form);
            Frmconqui.dispose();
        }
        if(e.getSource()== Frmconqui.btnTraducir){
            if(Frmconqui.lblESP.isVisible()==true){
            Frmconqui.lblESP.setVisible(false);
             Frmconqui.lblQuechua.setVisible(true);
             Frmconqui.jlblLogro1.setText("100 puntokunata chaskiy");
             Frmconqui.jlblLogro2.setText("500 puntokunata chaskiy");
             Frmconqui.jlblLogro3.setText("1000 puntokunata chaskiy");
            }else{
            Frmconqui.lblESP.setVisible(true);
             Frmconqui.lblQuechua.setVisible(false);
             Frmconqui.jlblLogro1.setText("Consigue 100 puntos");
             Frmconqui.jlblLogro2.setText("Consigue 500 puntos");
             Frmconqui.jlblLogro3.setText("Consigue 1000 puntos");
            }
        }
    }
    
}
