
package Vista;

public class IniciarSesion extends javax.swing.JFrame {


    public IniciarSesion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pswContra = new javax.swing.JPasswordField();
        btnRegresar = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        btnTraducir = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        lblQuechua = new javax.swing.JLabel();
        lblESP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswContra.setBackground(new java.awt.Color(234, 234, 234));
        pswContra.setBorder(null);
        jPanel1.add(pswContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 420, 50));

        btnRegresar.setToolTipText("");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 40));

        btnRegistrarse.setToolTipText("");
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setContentAreaFilled(false);
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 200, 40));

        btnIngresar.setToolTipText("");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 320, 60));

        btnTraducir.setToolTipText("");
        btnTraducir.setBorderPainted(false);
        btnTraducir.setContentAreaFilled(false);
        jPanel1.add(btnTraducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, 80, 80));

        txtCorreo.setBackground(new java.awt.Color(234, 234, 234));
        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 450, 60));

        lblQuechua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UIInicioSesionQUECHUA.jpg"))); // NOI18N
        jPanel1.add(lblQuechua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        lblESP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UIInicioSesionESP.jpg"))); // NOI18N
        jPanel1.add(lblESP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    public javax.swing.JButton btnRegistrarse;
    public javax.swing.JButton btnRegresar;
    public javax.swing.JButton btnTraducir;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblESP;
    public javax.swing.JLabel lblQuechua;
    public javax.swing.JPasswordField pswContra;
    public javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
