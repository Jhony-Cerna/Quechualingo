/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Vista.Informacion.I_Avanzado_Sufijo1;
import Vista.Informacion.I_Avanzado_Dialogo;
import Vista.Informacion.I_Avanzado_PartesCuerpo;

/**
 *
 * @author USER
 */
public class Lecciones_Avanzado extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public Lecciones_Avanzado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUsodelsufijo = new javax.swing.JButton();
        btnDialogos = new javax.swing.JButton();
        btnPartesdelcuerpoh = new javax.swing.JButton();
        btnTraducir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblESP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsodelsufijo.setToolTipText("");
        btnUsodelsufijo.setBorderPainted(false);
        btnUsodelsufijo.setContentAreaFilled(false);
        btnUsodelsufijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsodelsufijoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsodelsufijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 240, 150));

        btnDialogos.setToolTipText("");
        btnDialogos.setBorderPainted(false);
        btnDialogos.setContentAreaFilled(false);
        btnDialogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDialogos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 240, 140));

        btnPartesdelcuerpoh.setToolTipText("");
        btnPartesdelcuerpoh.setBorderPainted(false);
        btnPartesdelcuerpoh.setContentAreaFilled(false);
        btnPartesdelcuerpoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartesdelcuerpohActionPerformed(evt);
            }
        });
        jPanel1.add(btnPartesdelcuerpoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 340, 170));

        btnTraducir.setToolTipText("");
        btnTraducir.setBorderPainted(false);
        btnTraducir.setContentAreaFilled(false);
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });
        jPanel1.add(btnTraducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 80, 80));

        btnRegresar.setToolTipText("");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, 40));

        lblESP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UIAvanzadoLeccionesESP (1).png"))); // NOI18N
        jPanel1.add(lblESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1100, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraducirActionPerformed

    }//GEN-LAST:event_btnTraducirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnDialogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogosActionPerformed

    }//GEN-LAST:event_btnDialogosActionPerformed

    private void btnUsodelsufijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsodelsufijoActionPerformed

    }//GEN-LAST:event_btnUsodelsufijoActionPerformed

    private void btnPartesdelcuerpohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartesdelcuerpohActionPerformed

    }//GEN-LAST:event_btnPartesdelcuerpohActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lecciones_Avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecciones_Avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecciones_Avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecciones_Avanzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecciones_Avanzado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDialogos;
    public javax.swing.JButton btnPartesdelcuerpoh;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnTraducir;
    public javax.swing.JButton btnUsodelsufijo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblESP;
    // End of variables declaration//GEN-END:variables
}
