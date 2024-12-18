package Controlador.Examen;

import Controlador.ControladorFelicidades;
import Controlador.ControladorSeleccionarTest;
import Controlador.Examen.ControladorTestPrincipiante2;
import Controlador.Informacion.ControladorI_Principiante_Animales;
import Vista.Examen.TestPrincipiante2;
import Vista.Examen.TestPrincipiante4;
import Vista.Felicidades;
import Vista.Informacion.I_Principiante_Animales;
import Vista.SeleccionarTestDeNivelación;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ControladorTestPrincipiante4 implements ActionListener{
    
    TestPrincipiante4 form;
    
    public ControladorTestPrincipiante4(TestPrincipiante4 ventana) {
        form = ventana;
        form.btnContinuar.addActionListener(this);
        form.btnRegresar.addActionListener(this);
        addDocumentListener(form.txtPregunta1,form.jpbProgreso);
        addDocumentListener(form.txtPregunta2,form.jpbProgreso);
        addDocumentListener(form.txtPregunta3,form.jpbProgreso);
        addDocumentListener(form.txtPregunta4,form.jpbProgreso);
        addDocumentListener(form.txtPregunta5,form.jpbProgreso);
        addDocumentListener(form.txtPregunta6,form.jpbProgreso);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Examen Principiante - Quechualingo");
        ventana.setDefaultCloseOperation(form.EXIT_ON_CLOSE);

        
        // Agregar action listener a los botones de la ventana intermedia
        //form.btnConfirmar.addActionListener(this);
        //form.btnRegresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == form.btnContinuar) {
            int puntos = 0;
            int puntosperdidos=0;
            if(form.txtPregunta1.getText().toLowerCase().trim().equals("arbol")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta2.getText().toLowerCase().trim().equals("pachakuna")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta3.getText().toLowerCase().trim().equals("qullqi")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta4.getText().toLowerCase().trim().equals("yachakuq")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta5.getText().toLowerCase().trim().equals("yaku")){
            puntos++;
            }else puntosperdidos++;
            if(form.txtPregunta6.getText().toLowerCase().trim().equals("kusi")){
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
                int textFieldCount = 6; //Cantidad de respuestas en el ejercicio
                int emptyFields = 0;
                if (form.txtPregunta1.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta2.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta3.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta4.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta5.getText().isEmpty()) emptyFields++;
                if (form.txtPregunta6.getText().isEmpty()) emptyFields++;

                double progressBarValue = (textFieldCount - emptyFields) * 18; // Aumentar un 25.00% por cada campo q no esta vacío
                jpbProgreso.setValue((int)progressBarValue);
            }
        });
    }
    
    
    
}
