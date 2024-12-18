package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.Informacion.ControladorI_Principiante_Animales;
import Vista.Ejercicios.Principiante_EjerAnimales;
import Vista.Felicidades;
import Vista.Informacion.I_Principiante_Animales;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorPrincipianteAnimales implements ActionListener{
    
    Principiante_EjerAnimales form;
    
    public ControladorPrincipianteAnimales(Principiante_EjerAnimales ventana) {
        form = ventana;
        form.btnConfirmar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Animales - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);

        
        // Agregar action listener a los botones de la ventana intermedia
        //form.btnConfirmar.addActionListener(this);
        //form.btnRegresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnConfirmar) {
            int puntos = 0;
            int puntosperdidos = 0;
            if(form.txtPregunta1.getText().toLowerCase().trim().equals("perro")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toLowerCase().trim().equals("caballo")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toLowerCase().trim().equals("gato")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toLowerCase().trim().equals("pinguino")){
            puntos++;
            }else puntosperdidos++;
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();

        }
        if (e.getSource() == form.btnRegresar) {
            I_Principiante_Animales info = new I_Principiante_Animales();
            ControladorI_Principiante_Animales control = new ControladorI_Principiante_Animales(info);
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

                double progressBarValue = (textFieldCount - emptyFields) * 25; // Aumentar un 25.00% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
