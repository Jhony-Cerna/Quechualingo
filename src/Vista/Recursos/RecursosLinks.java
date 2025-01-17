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
public class RecursosLinks extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public RecursosLinks() {
        initComponents();
        lblQuechua.setVisible(true);
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
        Guia_de_Lengua = new javax.swing.JButton();
        Curso_Willay = new javax.swing.JButton();
        Lenguas_Wikipedia = new javax.swing.JButton();
        Manual_Academia = new javax.swing.JButton();
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
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 40));

        Guia_de_Lengua.setToolTipText("");
        Guia_de_Lengua.setContentAreaFilled(false);
        Guia_de_Lengua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guia_de_LenguaActionPerformed(evt);
            }
        });
        jPanel1.add(Guia_de_Lengua, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 770, 70));

        Curso_Willay.setToolTipText("");
        Curso_Willay.setContentAreaFilled(false);
        jPanel1.add(Curso_Willay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 550, 40));

        Lenguas_Wikipedia.setToolTipText("");
        Lenguas_Wikipedia.setContentAreaFilled(false);
        jPanel1.add(Lenguas_Wikipedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 590, 80));

        Manual_Academia.setToolTipText("");
        Manual_Academia.setContentAreaFilled(false);
        jPanel1.add(Manual_Academia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 760, 120));

        lblQuechua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UILinks (1).png"))); // NOI18N
        jPanel1.add(lblQuechua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
     /*   RecursosQuechua RQ = new RecursosQuechua();
        RQ.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void Guia_de_LenguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guia_de_LenguaActionPerformed
        
    }//GEN-LAST:event_Guia_de_LenguaActionPerformed

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
            java.util.logging.Logger.getLogger(RecursosLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecursosLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecursosLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecursosLinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new RecursosLinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Curso_Willay;
    public javax.swing.JButton Guia_de_Lengua;
    public javax.swing.JButton Lenguas_Wikipedia;
    public javax.swing.JButton Manual_Academia;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuechua;
    // End of variables declaration//GEN-END:variables
}
