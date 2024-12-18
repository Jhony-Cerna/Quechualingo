package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.Informacion.ControladorI_Intermedio_Tiempo;
import Vista.Ejercicios.Intermedio_TiempoPresente;
import Vista.Felicidades;
import Vista.Informacion.I_Intermedio_Tiempo;
import Vista.Lecciones_Intermedio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorIntermedioTiempoPresente implements ActionListener{
    
    Intermedio_TiempoPresente form;
    
    public ControladorIntermedioTiempoPresente(Intermedio_TiempoPresente ventana) {
        form = ventana;
        form.btnConfirmar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
        addDocumentListener(form.txtPregunta5,form.jpbProgreso);
        addDocumentListener(form.txtPregunta6,form.jpbProgreso);
        form.setSize(598, 420);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        ventana.setTitle("Colores - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnConfirmar) {
            int puntos = 0;
            int puntosperdidos = 0;
            if(form.txtPregunta1.getText().toLowerCase().trim().equals("ñuqa takini")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toLowerCase().trim().equals("qam aqata munanki")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toLowerCase().trim().equals("ñuqa tusuni")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toLowerCase().trim().equals("pay papata tarpun")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta5.getText().toLowerCase().trim().equals("pay munakun")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta6.getText().toLowerCase().trim().equals("noqa mikhuni")){
            puntos++;
            }else puntosperdidos++;
            
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();

        }
        if (e.getSource() == form.btnRegresar) {
            I_Intermedio_Tiempo info = new I_Intermedio_Tiempo();
            ControladorI_Intermedio_Tiempo Controlador = new ControladorI_Intermedio_Tiempo(info);
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

                double progressBarValue = (textFieldCount - emptyFields) * 16.7; // Aumentar un 16.7% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
}
