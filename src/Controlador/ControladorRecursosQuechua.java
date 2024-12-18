package Controlador;
import Formatos.Mensajes2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import Modelo.Glosario;
import Vista.Recursos.RecursosQuechua;
//import DAO.*;
import Vista.MenuPrincipal;
import Vista.Recursos.RecursoMultimedia;
import Vista.Recursos.RecursosLinks;
import Vista.Recursos.RecursosA;
import java.net.URI;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URISyntaxException;

public class ControladorRecursosQuechua implements ActionListener{
RecursosQuechua vista;
public ControladorRecursosQuechua(RecursosQuechua f3){ 
         vista=f3;
         vista.btnALinks.addActionListener(this);
         vista.btnRegresar.addActionListener(this);
         vista.btnAMultimedia.addActionListener(this);
          vista.btnLinkKultura.addActionListener(this);
           vista.btnLinkSuyan.addActionListener(this);
       f3.setTitle("Recursos Quechua");    
       f3.setVisible(true);
       f3.setLocationRelativeTo(null);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegresar){
      RecursosA RA = new RecursosA();
      ControladorRecursosA control = new ControladorRecursosA(RA);
            vista.dispose();
    }
        
        if(e.getSource()== vista.btnALinks){
             RecursosLinks rL = new RecursosLinks();
             ControladorRecursosLinks control = new ControladorRecursosLinks(rL);
            vista.dispose();
    }
        
        if(e.getSource()== vista.btnAMultimedia){
             RecursoMultimedia rM = new RecursoMultimedia();
             ControladorRecursoMultimedia control= new ControladorRecursoMultimedia(rM);
            vista.dispose();
    }
       
        if(e.getSource() == vista.btnLinkKultura) {
    if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://repositorio.cultura.gob.pe/bitstream/handle/CULTURA/410/Una_mirada_al_mundo_quechua.pdf?sequence=1");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
        
        if(e.getSource() == vista.btnLinkSuyan) {
    if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://peru.travel/es/masperu/descubre-el-origen-del-quechua-el-idioma-de-los-incas");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

    }
}
