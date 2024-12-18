package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Recursos.RecursosLinks;
import Vista.Recursos.RecursosQuechua;
import java.io.IOException;
import java.net.URISyntaxException;
public class ControladorRecursosLinks implements ActionListener{
RecursosLinks vista;  
        public ControladorRecursosLinks(RecursosLinks f5){ 
         vista=f5;
         vista.Curso_Willay.addActionListener(this);
         vista.btnRegresar.addActionListener(this);
         vista.Guia_de_Lengua.addActionListener(this);
         vista.Lenguas_Wikipedia.addActionListener(this);
         vista.Manual_Academia.addActionListener(this);
       f5.setTitle("Recursos Links");    
       f5.setVisible(true);
       f5.setLocationRelativeTo(null);
        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegresar){
      RecursosQuechua rq = new RecursosQuechua();
      ControladorRecursosQuechua control = new ControladorRecursosQuechua(rq);
            vista.dispose();
    }
        
          if(e.getSource()== vista.Curso_Willay){
           if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://willay.org.pe/curso-quechua-basico/");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
          
          
            if(e.getSource()== vista.Guia_de_Lengua){
           if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://repositorio.cultura.gob.pe/bitstream/handle/CULTURA/402/Gu%C3%ADa_de_lengua_quechua_para_castellano-hablantes%20con%20OCR.pdf?sequence=3");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
            
            
            if(e.getSource()== vista.Lenguas_Wikipedia){
           if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://es.wikipedia.org/wiki/Lenguas_quechuas");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
            
            if(e.getSource()== vista.Manual_Academia){
           if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://www.academia.edu/38937626/Manual_Auto_Instructivo_CURSO_QUECHUA_BASICO_Elaborado_por_Dra_NOEMI_VIZCARDO_ROZAS");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
            
            
            
            
          
    }
    
}
