package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.Informacion.ControladorI_Avanzado_Dialogo;
import Vista.Ejercicios.Avanzado_Dialogo;
import Vista.Felicidades;
import Vista.Informacion.I_Avanzado_Dialogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorAvanzadoDialogo implements ActionListener{
    
    Avanzado_Dialogo form;
    
    public ControladorAvanzadoDialogo(Avanzado_Dialogo ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        ventana.setTitle("Dialogo - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos = 0;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("¿CÓMO ESTAS?")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toUpperCase().trim().equals("MI NOMBRE ES PEDRO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toUpperCase().trim().equals("¿Y EL TUYO?")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toUpperCase().trim().equals("SOY DE LIMA ¿Y TU?")){
            puntos++;
            }else puntosperdidos++;
            
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();

        }
        if (e.getSource() == form.btnRegresar) {
            I_Avanzado_Dialogo info = new I_Avanzado_Dialogo();
            ControladorI_Avanzado_Dialogo Controlador = new ControladorI_Avanzado_Dialogo(info);
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
                int textFieldCount = 4; //Cantidad de respuestas en el ejercicio
                int emptyFields = 0;
                if (form.txtPregunta1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta3.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 25; // Aumentar un 25% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
