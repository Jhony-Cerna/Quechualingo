package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.Informacion.ControladorI_Avanzado_PartesCuerpo;
import Controlador.Informacion.ControladorI_Avanzado_Sufijo1;
import Vista.Ejercicios.Avanzado_PartesCuerpo1;
import Vista.Ejercicios.Avanzado_PartesCuerpo2;
import Vista.Ejercicios.Avanzado_Sufijo1;
import Vista.Ejercicios.Avanzado_Sufijo2;
import Vista.Felicidades;
import Vista.Informacion.I_Avanzado_PartesCuerpo;
import Vista.Informacion.I_Avanzado_Sufijo1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorAvanzadoSufijo2 implements ActionListener{
    
    Avanzado_Sufijo2 form;
    int points;
    int puntosperdidos;
    public ControladorAvanzadoSufijo2(Avanzado_Sufijo2 ventana, int puntos, int puntosresta) {
        form = ventana;
        points = puntos;
        puntosperdidos = puntosresta;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta02,form.jpbProgreso);
        addDocumentListener(form.txtPregunta03,form.jpbProgreso);
        addDocumentListener(form.txtPregunta04,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Sufijo Parte 2 - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        double progressBarValue = (double) 4 / 8 * 100;
        form.jpbProgreso.setValue((int) progressBarValue);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = points;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("MISIYKUNA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta02.getText().toUpperCase().trim().equals("ÑAWIYKIKUNA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta03.getText().toUpperCase().trim().equals("KAWALLUKUNA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta04.getText().toUpperCase().trim().equals("WISIKUNA")){
            puntos++;
            }else puntosperdidos++;
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();
        }
        if (e.getSource() == form.btnRegresar) {
            I_Avanzado_Sufijo1 info = new I_Avanzado_Sufijo1();
            ControladorI_Avanzado_Sufijo1 control = new ControladorI_Avanzado_Sufijo1(info);
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
                int totalFields = 8; // Total de preguntas
            int filledFields = 4;

            if (!form.txtPregunta1.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta02.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta03.getText().isEmpty()) filledFields++;
            if (!form.txtPregunta04.getText().isEmpty()) filledFields++;

            // Calcular el valor de la barra de progreso como porcentaje del total de campos
            double progressBarValue = (double) filledFields / totalFields * 100;
            jpbProgreso.setValue((int) progressBarValue);
            }
        });
    }
    
    
    
}
