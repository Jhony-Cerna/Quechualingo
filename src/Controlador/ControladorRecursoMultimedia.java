package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Recursos.RecursoMultimedia;
import Vista.Recursos.RecursosQuechua;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
public class ControladorRecursoMultimedia implements ActionListener{
RecursoMultimedia vista;  
        public ControladorRecursoMultimedia(RecursoMultimedia f4){ 
         vista=f4;
         vista.Quechua_AhoraMasFacil.addActionListener(this);
         vista.btnRegresar.addActionListener(this);
         vista.Palabras_Basicas_Quechua.addActionListener(this);
         vista.Aprende_Quechua_Facil.addActionListener(this);
       f4.setTitle("Recursos Multimedia");    
       f4.setVisible(true);
       f4.setLocationRelativeTo(null);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()== vista.btnRegresar){
       RecursosQuechua rq = new RecursosQuechua();
      ControladorRecursosQuechua control = new ControladorRecursosQuechua(rq);
            vista.dispose();
    }
         
         if(e.getSource()== vista.Quechua_AhoraMasFacil){
       if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://youtu.be/3WEWhXiVg50?si=15FGU84khxYmdK8e");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                System.out.println("Error al abrir la URL: " + ex.getMessage());
                ex.printStackTrace();
            }
                    }
    }
}
         
         
         if(e.getSource()== vista.Palabras_Basicas_Quechua){
             if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://youtu.be/QDkJEasTs0I?si=hQ_HzZwt46nc2MGp");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
         
         
         if(e.getSource()== vista.Aprende_Quechua_Facil){
           if(java.awt.Desktop.isDesktopSupported()) {
        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
        if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            try {
                java.net.URI uri = new java.net.URI("https://youtu.be/AvfWFFphiNk?si=nO2x5AMue-liu_XR");
                desktop.browse(uri);
            } catch (URISyntaxException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
         
         
         
         
}
    
}
