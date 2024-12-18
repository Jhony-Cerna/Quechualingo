package Controlador;

import Controlador.Examen.*;
import Vista.Examen.*;
import Vista.MenuPrincipal;
import Vista.SeleccionarTestDeNivelación;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ControladorSeleccionarTest implements ActionListener {

    SeleccionarTestDeNivelación vista;

    public ControladorSeleccionarTest(SeleccionarTestDeNivelación form) {
        vista = form;
        vista.setLocationRelativeTo(null);
        vista.btnRegresar.addActionListener(this);
        vista.btnPrincipiante.addActionListener(this);
        vista.btnIntermedio.addActionListener(this);
        vista.btnAvanzado.addActionListener(this);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setTitle("Seleccionar Test - Quechualingo");
    }

    public static int getRandomNumber() {
        Random random = new Random();
        // nextInt(3) retorna un número entre 0 (incluido) y 3 (excluido)
        return random.nextInt(4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegresar) {
            MenuPrincipal menu = new MenuPrincipal();
            ControladorMenu control = new ControladorMenu(menu);
            vista.dispose();
        }
        if (e.getSource() == vista.btnPrincipiante) {
            int randomNumber = getRandomNumber();
            switch (randomNumber) {
                case 0:
                    TestPrincipiante1 form = new TestPrincipiante1();
                    ControladorTestPrincipiante1 control = new ControladorTestPrincipiante1(form);
                    vista.dispose();
                    break;
                case 1:
                    TestPrincipiante2 form2 = new TestPrincipiante2();
                    ControladorTestPrincipiante2 control2 = new ControladorTestPrincipiante2(form2);
                    vista.dispose();
                    break;
                case 2:
                    TestPrincipiante3 form3 = new TestPrincipiante3();
                    ControladorTestPrincipiante3 control3 = new ControladorTestPrincipiante3(form3);
                    vista.dispose();
                    break;
                case 3:
                    TestPrincipiante4 form4 = new TestPrincipiante4();
                    ControladorTestPrincipiante4 control4 = new ControladorTestPrincipiante4(form4);
                    vista.dispose();
                    break;
            }
        }
        if (e.getSource() == vista.btnIntermedio) {
            int randomNumber = getRandomNumber();
            switch (randomNumber) {
                case 0:
                    TestIntermedio1 form = new TestIntermedio1();
                    ControladorTestIntermedio1 control = new ControladorTestIntermedio1(form);
                    vista.dispose();
                    break;
                case 1:
                    TestIntermedio2 form2 = new TestIntermedio2();
                    ControladorTestIntermedio2 control2 = new ControladorTestIntermedio2(form2);
                    vista.dispose();
                    break;
                case 2:
                    TestIntermedio3 form3 = new TestIntermedio3();
                    ControladorTestIntermedio3 control3 = new ControladorTestIntermedio3(form3);
                    vista.dispose();
                    break;
                case 3:
                    TestIntermedio4 form4 = new TestIntermedio4();
                    ControladorTestIntermedio4 control4 = new ControladorTestIntermedio4(form4);
                    vista.dispose();
                    break;
            }
        }
        if (e.getSource() == vista.btnAvanzado) {
            int randomNumber = getRandomNumber();
            switch (randomNumber) {
                case 0:
                    TestAvanzado1 form = new TestAvanzado1();
                    ControladorTestAvanzado1 control = new ControladorTestAvanzado1(form);
                    vista.dispose();
                    break;
                case 1:
                    TestAvanzado2 form2 = new TestAvanzado2();
                    ControladorTestAvanzado2 control2 = new ControladorTestAvanzado2(form2);
                    vista.dispose();
                    break;
                case 2:
                    TestAvanzado3 form3 = new TestAvanzado3();
                    ControladorTestAvanzado3 control3 = new ControladorTestAvanzado3(form3);
                    vista.dispose();
                    break;
                case 3:
                    TestAvanzado4 form4 = new TestAvanzado4();
                    ControladorTestAvanzado4 control4 = new ControladorTestAvanzado4(form4);
                    vista.dispose();
                    break;
            }
        }
    }

}
