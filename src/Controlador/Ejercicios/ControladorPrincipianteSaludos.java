package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.Informacion.ControladorI_Principiante_Saludos;
import Vista.Ejercicios.Principiante_EjerSaludos;
import Vista.Felicidades;
import Vista.Informacion.I_Principiante_Saludos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorPrincipianteSaludos implements ActionListener{
    
    Principiante_EjerSaludos form;
    
    public ControladorPrincipianteSaludos(Principiante_EjerSaludos ventana) {
        form = ventana;
        form.btnConfirmar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Saludos - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnConfirmar) {
            int puntos = 0;
            int puntosperdidos = 0;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("ALI PUNDZA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toUpperCase().trim().equals("ALI CHISHI")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toUpperCase().trim().equals("ALI TUTA")){
            puntos++;
            }else puntosperdidos++;
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();
        }
        if (e.getSource() == form.btnRegresar) {
            I_Principiante_Saludos info = new I_Principiante_Saludos();
            ControladorI_Principiante_Saludos control = new ControladorI_Principiante_Saludos(info);
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
                int textFieldCount = 3; //Cantidad de respuestas en el ejercicio
                int emptyFields = 0;
                if (form.txtPregunta1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta3.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 33.33; // Aumentar un 33.33% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
