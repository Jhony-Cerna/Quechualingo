package Controlador.Ejercicios;

import Controlador.ControladorFelicidades;
import Controlador.ControladorLeccionesPrincipiante;
import Controlador.Informacion.ControladorI_Principiante_DiasSemana;
import Vista.Ejercicios.Principiante_EjerDias;
import Vista.Felicidades;
import Vista.Informacion.I_Principiante_DiasSemana;
import Vista.Lecciones_Principiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorPrincipianteSemana implements ActionListener{
    
    Principiante_EjerDias form;
    
    public ControladorPrincipianteSemana(Principiante_EjerDias ventana) {
        form = ventana;
        form.btnConfirmar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
        addDocumentListener(form.txtPregunta5,form.jpbProgreso);
        addDocumentListener(form.txtPregunta6,form.jpbProgreso);
        addDocumentListener(form.txtPregunta7,form.jpbProgreso);
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
            if(form.txtPregunta1.getText().toLowerCase().trim().equals("killachay")){
            puntos++;
            } else puntosperdidos++;
            if(form.txtPregunta2.getText().toLowerCase().trim().equals("atipackay")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toLowerCase().trim().equals("chaskachay")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toLowerCase().trim().equals("quyllurchay")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta5.getText().toLowerCase().trim().equals("illapachay")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta6.getText().toLowerCase().trim().equals("kuychipachay")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta7.getText().toLowerCase().trim().equals("intichay")){
            puntos++;
            }else puntosperdidos++;
            Felicidades ventana = new Felicidades();
            ControladorFelicidades control = new ControladorFelicidades(ventana, puntos, puntosperdidos);
            form.dispose();

        }
        if (e.getSource() == form.btnRegresar) {
            I_Principiante_DiasSemana info = new I_Principiante_DiasSemana();
            ControladorI_Principiante_DiasSemana control = new ControladorI_Principiante_DiasSemana(info);
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
                int textFieldCount = 7; //Cantidad de respuestas en el ejercicio
                int emptyFields = 0;
                if (form.txtPregunta1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta3.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta5.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta6.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta7.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 14.29; // Aumentar un 14.29% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
