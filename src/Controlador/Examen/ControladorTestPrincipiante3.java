package Controlador.Examen;

import Controlador.ControladorFelicidades;
import Controlador.ControladorSeleccionarTest;
import Vista.Examen.TestPrincipiante1;
import Vista.Examen.TestPrincipiante2;
import Vista.Examen.TestPrincipiante3;
import Vista.Felicidades;
import Vista.SeleccionarTestDeNivelación;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorTestPrincipiante3 implements ActionListener{
    
    TestPrincipiante3 form;
    
    public ControladorTestPrincipiante3(TestPrincipiante3 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
        addDocumentListener(form.txtPregunta5,form.jpbProgreso);
        addDocumentListener(form.txtPregunta6,form.jpbProgreso);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        ventana.setTitle("Test de nivel Principiante - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos=0;
            if(form.txtPregunta1.getText().toUpperCase().trim().equals("ALLQU")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toUpperCase().trim().equals("CHALLLWA")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toUpperCase().trim().equals("OCTOPUS NISQA")){
            puntos++;
            }else if(form.txtPregunta3.getText().toUpperCase().trim().equals("OCTOPUS")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toUpperCase().trim().equals("LEON")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta5.getText().toUpperCase().trim().equals("MISI")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta6.getText().toUpperCase().trim().equals("PATO")){
            puntos++;
            }else if(form.txtPregunta6.getText().toUpperCase().trim().equals("WASWA")){
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
                int textFieldCount = 6; //Cantidad de respuestas en el ejercicio
                int emptyFields = 0;
                if (form.txtPregunta1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta3.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta5.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta6.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 18; // Aumentar un 25% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
