package Formatos;
//libreria
import java.util.Date;
import javax.swing.JOptionPane;
public class Mensajes2 {

public static void M1(String mensaje){
    JOptionPane.showMessageDialog(null,mensaje);
}    

public static int M2(String mensaje){
    return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
}

public static int M3(String titulo,String mensaje){
    return JOptionPane.showConfirmDialog(null,mensaje, titulo,JOptionPane.OK_CANCEL_OPTION);
}// si ingresa el usuario OK representa el valor de 0
    
public static String M4(String mensaje){
    return JOptionPane.showInputDialog(mensaje);
}



}
