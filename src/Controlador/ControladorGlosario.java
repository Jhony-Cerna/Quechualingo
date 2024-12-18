package Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formatos.*;
import Modelo.Glosario;
import Vista.Glosario2;
import DAO.*;
import Vista.MenuPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ControladorGlosario implements ActionListener{
       Glosario2 vista;
      DAOGlosario crud; // c: create r:read  u:update   d=delete    
      Glosario glo;
      public ControladorGlosario(Glosario2 f1) {
        this.vista = f1;
        this.vista.btnRegistrar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
        this.vista.btnConsultar.addActionListener(this);
        this.vista.btnRegresar.addActionListener(this);
        this.vista.jtblDatos.addMouseListener(new TablaMouseListener());

        f1.setTitle("Glosario");
        f1.jtxtID.setEnabled(false);
        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        ActualizarForma();
    }
      
      private class TablaMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            int filaSeleccionada = vista.jtblDatos.getSelectedRow();
            if (filaSeleccionada != -1) {
                Object idGlosarioObj = vista.jtblDatos.getModel().getValueAt(filaSeleccionada, 0);
                Object espanolObj = vista.jtblDatos.getModel().getValueAt(filaSeleccionada, 1);
                Object quechuaObj = vista.jtblDatos.getModel().getValueAt(filaSeleccionada, 2);

                String idGlosario = idGlosarioObj != null ? idGlosarioObj.toString() : "";
                String espanol = espanolObj != null ? espanolObj.toString() : "";
                String quechua = quechuaObj != null ? quechuaObj.toString() : "";

                vista.jtxtID.setText(idGlosario);
                vista.jtxtEspañol.setText(espanol);
                vista.jtxtQuechua.setText(quechua);
            }
        }
    }
      
       void ActualizarForma(){
         crud = new DAOGlosario();
         crud.MostrarGlosario(vista.jtblDatos);
         //ProcesosFrmCliente.Estado1(vista);
         vista.jtxtID.setText("");
        vista.jtxtEspañol.setText("");
        vista.jtxtQuechua.setText("");
     }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegistrar){
         String español = vista.jtxtEspañol.getText().trim();
            String quechua = vista.jtxtQuechua.getText().trim();
            crud=new DAOGlosario();
            crud.InsertarGlosario(español, quechua);
        ActualizarForma();
       }
        
             if(e.getSource()== vista.btnConsultar){
       int IDGlosario=Mensajes2.M2("Ingrese el ID del Glosario a buscar...");
       crud=new DAOGlosario();
       glo=crud.ConsultarRegistro(IDGlosario);
       if(glo==null){
           Mensajes2.M1("El id"+IDGlosario+" no existe en la tabla Glosario...");
       }else{
           vista.jtxtID.setText(Integer.toString(glo.getIDGlosario()));
           vista.jtxtEspañol.setText(glo.getEspañol());
           vista.jtxtQuechua.setText(glo.getQuechua());
       }
       }
             
             if(e.getSource()== vista.btnActualizar){
            //glo= ProcesosGlosario.LeerDatos(vista);
            String español = vista.jtxtEspañol.getText().trim();
            String quechua = vista.jtxtQuechua.getText().trim();
            int IDGlosario=Integer.parseInt(vista.jtxtID.getText() );
            
            crud = new DAOGlosario();
            crud.ActualizarRegistro(español, quechua, IDGlosario);
            ActualizarForma();
       }
             
              if(e.getSource()== vista.btnEliminar){
           int respuesta= Mensajes2.M3("Confirmar!!!", "¿Desea eliminar el registro?");
           if(respuesta==0){
               int IDGlosario= Integer.parseInt(vista.jtxtID.getText());
               crud= new DAOGlosario();
               crud.EliminarRegistro(IDGlosario);
               ActualizarForma();
           }
       }
              
              if(e.getSource()== vista.btnRegresar){
            MenuPrincipal Menu = new MenuPrincipal();
            ControladorMenu control=new ControladorMenu(Menu);
            Menu.setVisible(true);
            vista.dispose();
        }
             
    }
    
}
