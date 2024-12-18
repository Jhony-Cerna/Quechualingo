//comentario para saber el real 03/12
package Principal;

import Controlador.ControladorInicio;
import Modelo.Usuario;
import Vista.Inicio;

public class Principal {
    public static Inicio form;
    public static ControladorInicio control;
    public static Usuario user;
    
    public static void main(String[] args) {
       form = new Inicio();
       control = new ControladorInicio(form);
       
    }
    
}
