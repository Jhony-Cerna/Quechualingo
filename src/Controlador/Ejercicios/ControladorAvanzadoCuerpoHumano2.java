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

public class ControladorAvanzadoCuerpoHumano2 implements ActionListener{
    
    Avanzado_PartesCuerpo2 form;
    int puntos = 0;
    int puntosperdidos = 0;
    public ControladorAvanzadoCuerpoHumano2(Avanzado_PartesCuerpo2 ventana, int points, int losepoints) {
        form = ventana;
        puntos = points;
        puntosperdidos = losepoints;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta07,form.jpbProgreso);
        addDocumentListener(form.txtPregunta08,form.jpbProgreso);
        addDocumentListener(form.txtPregunta09,form.jpbProgreso);
        addDocumentListener(form.txtPregunta10,form.jpbProgreso);
        addDocumentListener(form.txtPregunta11,form.jpbProgreso);
        addDocumentListener(form.txtPregunta12,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Partes del cuerpo humano Parte 2 - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        double progressBarValue = (double) 6 / 12 * 100;
        form.jpbProgreso.setValue((int) progressBarValue);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            if(form.txtPregunta07.getText().toUpperCase().trim().equals("CUELLO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta08.getText().toUpperCase().trim().equals("NARIZ")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta09.getText().toUpperCase().trim().equals("BARRIGA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta10.getText().toUpperCase().trim().equals("BOCA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta11.getText().toUpperCase().trim().equals("OJO")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta12.getText().toUpperCase().trim().equals("OREJA")){
            puntos++;
            }else puntosperdidos++;
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
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
            int filledFields = 6;

            if (!form.txtPregunta07.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta08.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta09.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta10.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta11.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta12.getText().isEmpty()) filledFields++;

            // Calcular el valor de la barra de progreso como porcentaje del total de campos
            double progressBarValue = (double) filledFields / totalFields * 100;
            jpbProgreso.setValue((int) progressBarValue);
            }
        });
    }
    
    
    
}
