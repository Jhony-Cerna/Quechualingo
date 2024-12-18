package Controlador.Examen;
import Controlador.ControladorFelicidades;
import Controlador.ControladorMenu;
import Controlador.ControladorSeleccionarTest;
import Vista.Examen.TestAvanzado4;
import Vista.Felicidades;
import Vista.MenuPrincipal;
import Vista.SeleccionarTestDeNivelación;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorTestAvanzado4 implements ActionListener{
    
    TestAvanzado4 form;
    
    public ControladorTestAvanzado4(TestAvanzado4 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
     

        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Test-Nivel-Avanzado  - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos=0;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("RIMANMI ÑAWI")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toUpperCase().trim().equals("TAKIY-CHI")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toUpperCase().trim().equals("DICEN QUE ES BONITO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toUpperCase().trim().equals("HACER CANTAR")){
            puntos++;
            }else puntosperdidos++;
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();
        }
            if (e.getSource() == form.btnRegresar) {
            SeleccionarTestDeNivelación info = new SeleccionarTestDeNivelación();
            ControladorSeleccionarTest Controlador = new ControladorSeleccionarTest(info);
            form.dispose();
        }
    }

    private void addDocumentListener(JTextField textField, JProgressBar jpbProgreso) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateProgressBar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateProgressBar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // No sirve en este caso
            }

            private void updateProgressBar() {
                int totalFields = 4; // Total de preguntas
            int filledFields = 0;

            if (!form.txtPregunta1.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta2.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta3.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta4.getText().isEmpty()) filledFields++;
 


            // Calcular el valor de la barra de progreso como porcentaje del total de campos
            double progressBarValue = (double) filledFields / totalFields * 100;
            jpbProgreso.setValue((int) progressBarValue);
            }
        });
    }
    
    
    
}
