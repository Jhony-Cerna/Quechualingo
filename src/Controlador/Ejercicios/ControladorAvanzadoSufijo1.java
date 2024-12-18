package Controlador.Ejercicios;

import Controlador.Informacion.ControladorI_Avanzado_PartesCuerpo;
import Controlador.Informacion.ControladorI_Avanzado_Sufijo1;
import Controlador.Informacion.ControladorI_Avanzado_Sufijo2;
import Vista.Ejercicios.Avanzado_PartesCuerpo1;
import Vista.Ejercicios.Avanzado_PartesCuerpo2;
import Vista.Ejercicios.Avanzado_Sufijo1;
import Vista.Informacion.I_Avanzado_PartesCuerpo;
import Vista.Informacion.I_Avanzado_Sufijo1;
import Vista.Informacion.I_Avanzado_Sufijo2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorAvanzadoSufijo1 implements ActionListener{
    
    Avanzado_Sufijo1 form;
    
    public ControladorAvanzadoSufijo1(Avanzado_Sufijo1 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta02,form.jpbProgreso);
        addDocumentListener(form.txtPregunta03,form.jpbProgreso);
        addDocumentListener(form.txtPregunta04,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Sufijo Parte 1 - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos = 0;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("ALLQUY")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta02.getText().toUpperCase().trim().equals("UMAN")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta03.getText().toUpperCase().trim().equals("MISIY")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta04.getText().toUpperCase().trim().equals("MAKIY")){
            puntos++;
            }else puntosperdidos++;
            I_Avanzado_Sufijo2 info = new I_Avanzado_Sufijo2();
            ControladorI_Avanzado_Sufijo2 control = new ControladorI_Avanzado_Sufijo2(info,puntos,puntosperdidos);
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
            int filledFields = 0;

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
