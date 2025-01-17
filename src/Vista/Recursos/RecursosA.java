/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Recursos;

import Vista.MenuPrincipal;

/**
 *
 * @author USER
 */
public class RecursosA extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public RecursosA() {
        initComponents();
        lblQuechua.setVisible(true);
        lblEspañol.setVisible(false);
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
        btnRegresar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnTraducir = new javax.swing.JButton();
        lblEspañol = new javax.swing.JLabel();
        lblQuechua = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setToolTipText("");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 220, 40));

        btnConfirmar.setToolTipText("");
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 300, 60));

        btnTraducir.setToolTipText("");
        btnTraducir.setContentAreaFilled(false);
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });
        jPanel1.add(btnTraducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 80, 80));

        lblEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UITRecursos (1).png"))); // NOI18N
        jPanel1.add(lblEspañol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        lblQuechua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UITRecursosQuechua (1).png"))); // NOI18N
        jPanel1.add(lblQuechua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraducirActionPerformed
       /* if(lblQuechua.isVisible()==true){
            lblQuechua.setVisible(false);
            lblEspañol.setVisible(true);
        }else{
            lblQuechua.setVisible(true);
            lblEspañol.setVisible(false);
        }*/
    }//GEN-LAST:event_btnTraducirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
      /*  MenuPrincipal Menu = new MenuPrincipal();
        Menu.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       /* RecursosQuechua RQ = new RecursosQuechua();
        RQ.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(RecursosA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecursosA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecursosA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecursosA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecursosA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConfirmar;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnTraducir;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblEspañol;
    public javax.swing.JLabel lblQuechua;
    // End of variables declaration//GEN-END:variables
}
