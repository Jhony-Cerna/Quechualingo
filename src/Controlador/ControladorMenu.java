
package Controlador;

import IA.EjecutarIA;
import Vista.*;
import Vista.Recursos.RecursosA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu implements ActionListener{
    MenuPrincipal  vista;
    public ControladorMenu(MenuPrincipal fm){
        vista = fm;
        AjustarMenu();
        vista.btnCerrarSesion.addActionListener(this);
        vista.btnChatbot.addActionListener(this);
        vista.btnEliminarCuenta.addActionListener(this);
        vista.btnGlosario.addActionListener(this);
        vista.btnLogros.addActionListener(this);
        vista.btnPracticar.addActionListener(this);
        vista.btnRecursos.addActionListener(this);
        vista.btnTablaPuntajes.addActionListener(this);
        vista.btnTest.addActionListener(this);
        vista.btnTraducir.addActionListener(this);
        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("Menu - Quechualingo");  
    }
    public void AjustarMenu(){
        vista.setLocationRelativeTo(null);
        vista.lblESP.setVisible(true);
        vista.lblQuechua.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnCerrarSesion){
            IniciarSesion form = new IniciarSesion();
            ControladorLogin control = new ControladorLogin(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnChatbot){
            EjecutarIA ia = new EjecutarIA();
            ia.Ejecutar();
        }
        if(e.getSource()== vista.btnEliminarCuenta){
            EliminarCuenta form = new EliminarCuenta();
            ControladorEliminar control = new ControladorEliminar(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnGlosario){
            Glosario2 glo=new Glosario2();
            ControladorGlosario control = new ControladorGlosario(glo);
            vista.dispose();
        }
        if(e.getSource()== vista.btnLogros){
           Conquistas form = new Conquistas();
           ControladorConquistas control = new ControladorConquistas(form);
           vista.dispose();
        }
        if(e.getSource()== vista.btnPracticar){
            Seleccion_Nivel form = new Seleccion_Nivel();
            ControladorSeleccionarNivel control = new ControladorSeleccionarNivel(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnRecursos){
            RecursosA RA=new RecursosA();
            ControladorRecursosA control = new ControladorRecursosA(RA);
            vista.dispose();
        }
        if(e.getSource()== vista.btnTablaPuntajes){
            TablaDePuntuaciones form = new TablaDePuntuaciones();
            ControladorTablaPuntuacion control = new ControladorTablaPuntuacion(form);
            vista.dispose();
        }
        if(e.getSource()== vista.btnTest){
            SeleccionarTestDeNivelación test = new SeleccionarTestDeNivelación();
            ControladorSeleccionarTest control = new ControladorSeleccionarTest(test);
            vista.dispose();
        }
        if(e.getSource()== vista.btnTraducir){
            if(vista.lblESP.isVisible()==true){
            vista.lblESP.setVisible(false);
            vista.lblQuechua.setVisible(true);
            }else{
            vista.lblESP.setVisible(true);
            vista.lblQuechua.setVisible(false);
            }
        }
        
    }
}
