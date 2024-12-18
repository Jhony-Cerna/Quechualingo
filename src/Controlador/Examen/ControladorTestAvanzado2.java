package Controlador.Examen;

import Controlador.ControladorFelicidades;
import Controlador.ControladorSeleccionarTest;
import Vista.Examen.TestAvanzado2;
import Vista.Felicidades;
import Vista.SeleccionarTestDeNivelación;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorTestAvanzado2 implements ActionListener{
    
    TestAvanzado2 form;
    
    public ControladorTestAvanzado2(TestAvanzado2 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        ventana.setTitle("Test de nivel Avanzado - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos=0;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("PAPAYPA SUTINMI MATIAS")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toUpperCase().trim().equals("ÑOQAN 30 WATAQAN")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toUpperCase().trim().equals("ÑOQAN YACHACHIKQA KASI, ¿QANPAQ?")){
            puntos++;
            }else puntosperdidos++;
            
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();

        }
        if (e.getSource() == form.btnRegresar) {
            SeleccionarTestDeNivelación test = new SeleccionarTestDeNivelación();
            ControladorSeleccionarTest control = new ControladorSeleccionarTest(test);
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

                double progressBarValue = (textFieldCount - emptyFields) * 34; // Aumentar un 25% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
