package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.Informacion.ControladorI_Avanzado_PartesCuerpo;
import Controlador.Informacion.ControladorI_Principiante_Saludos;
import Vista.Ejercicios.Avanzado_PartesCuerpo1;
import Vista.Ejercicios.Avanzado_PartesCuerpo2;
import Vista.Ejercicios.Principiante_EjerSaludos;
import Vista.Felicidades;
import Vista.Informacion.I_Avanzado_PartesCuerpo;
import Vista.Informacion.I_Principiante_Saludos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorAvanzadoCuerpoHumano1 implements ActionListener{
    
    Avanzado_PartesCuerpo1 form;
    
    public ControladorAvanzadoCuerpoHumano1(Avanzado_PartesCuerpo1 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta01,form.jpbProgreso);
        addDocumentListener(form.txtPregunta02,form.jpbProgreso);
        addDocumentListener(form.txtPregunta03,form.jpbProgreso);
        addDocumentListener(form.txtPregunta04,form.jpbProgreso);
        addDocumentListener(form.txtPregunta05,form.jpbProgreso);
        addDocumentListener(form.txtPregunta06,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Partes del cuerpo humano Parte 1 - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos = 0;
            if(form.txtPregunta01.getText().toUpperCase().trim().equals("CABEZA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta02.getText().toUpperCase().trim().equals("PIERNA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta03.getText().toUpperCase().trim().equals("PELO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta04.getText().toUpperCase().trim().equals("BRAZO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta05.getText().toUpperCase().trim().equals("CODO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta06.getText().toUpperCase().trim().equals("PIE")){
            puntos++;
            }else puntosperdidos++;
            Avanzado_PartesCuerpo2 siguiente = new Avanzado_PartesCuerpo2();
            ControladorAvanzadoCuerpoHumano2 control = new ControladorAvanzadoCuerpoHumano2(siguiente,puntos, puntosperdidos);
            form.dispose();
        }
        if (e.getSource() == form.btnRegresar) {
            I_Avanzado_PartesCuerpo info = new I_Avanzado_PartesCuerpo();
            ControladorI_Avanzado_PartesCuerpo control = new ControladorI_Avanzado_PartesCuerpo(info);
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
                int totalFields = 12; // Total de preguntas
            int filledFields = 0;

            if (!form.txtPregunta01.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta02.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta03.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta04.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta05.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta06.getText().isEmpty()) filledFields++;

            // Calcular el valor de la barra de progreso como porcentaje del total de campos
            double progressBarValue = (double) filledFields / totalFields * 100;
            jpbProgreso.setValue((int) progressBarValue);
            }
        });
    }
    
    
    
}
