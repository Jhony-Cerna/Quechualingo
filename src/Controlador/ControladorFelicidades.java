
package Controlador;


import DAO.DAOFelicidades;
import Vista.Felicidades;
import Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorFelicidades implements ActionListener{
    Felicidades vista;
    DAO.DAOFelicidades dao;
    public ControladorFelicidades(Felicidades form, int puntos, int puntosperdidos){
        vista = form;
        vista.btnConfirmar.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setTitle("Felicitaciones");
        puntos=puntos*5;
        puntosperdidos=puntosperdidos*2;
        if(puntosperdidos == 0){
            vista.lblPuntos.setText("Completaste correctamente todas las preguntas.\nObtuviste "+puntos+" puntos");
            OtorgarPuntos(puntos+10);  
        }else if(puntos <= 0){
            vista.lblPuntos.setText("No lograste responder ninguna pregunta correctamente.");
            OtorgarPuntos((puntosperdidos*-1));
            System.out.println("1");
        }else{
            puntos = puntos-puntosperdidos;
            if(puntos<1){
                vista.lblPuntos.setText("No ganaste ningun punto, quiza podrias revisar nuestra sección de Recursos.");
            }else{
                vista.lblPuntos.setText("Obtuviste "+puntos+" puntos");
                OtorgarPuntos(puntos);
                System.out.println("3");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnConfirmar){
            MenuPrincipal menu = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(menu);
            vista.dispose();
        }
    }

    private void OtorgarPuntos(int puntos) {
        dao = new DAOFelicidades();
        dao.SumarPuntos(puntos);
    }
    
}
