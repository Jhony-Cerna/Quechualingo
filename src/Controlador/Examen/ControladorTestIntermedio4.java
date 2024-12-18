package Controlador.Examen;

import Controlador.ControladorFelicidades;
import Controlador.ControladorSeleccionarTest;
import Vista.Examen.TestIntermedio4;
import Vista.Felicidades;
import Vista.SeleccionarTestDeNivelación;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorTestIntermedio4 implements ActionListener{
TestIntermedio4 form;

public ControladorTestIntermedio4(TestIntermedio4 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4_1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4_2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4_3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4_4,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4_5,form.jpbProgreso);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        ventana.setTitle("Examen Intermedio - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos=0;
            if(form.txtPregunta1.getText().toLowerCase().trim().equals("puriyta munani")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toLowerCase().trim().equals("kutimunaymi")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toLowerCase().trim().equals("pukllayta munani")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4_1.getText().toLowerCase().trim().equals("tupaq")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4_2.getText().toLowerCase().trim().equals("pukllanki")){
            puntos++;
            } else puntosperdidos++;
            if(form.txtPregunta4_3.getText().toLowerCase().trim().equals("pukllay")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4_4.getText().toLowerCase().trim().equals("pukllasunchik")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4_5.getText().toLowerCase().trim().equals("pukllanku")){
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
                int textFieldCount = 8; //Cantidad de respuestas en el ejercicio
                int emptyFields = 0;
                if (form.txtPregunta1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta3.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4_1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4_2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4_3.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4_4.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4_5.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 12.5; // Aumentar un 12.5% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
}
