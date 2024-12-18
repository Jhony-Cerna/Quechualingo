/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Jhony
 */
public class Seleccion_Nivel extends javax.swing.JFrame {

    /**
     * Creates new form Seleccion_Nivel
     */
    public Seleccion_Nivel() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnIntermedio = new javax.swing.JButton();
        btnAvanzado = new javax.swing.JButton();
        btnPrincipiante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1040, 660));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Perro_QLingo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ave_Qlingo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 180, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Llama_Qlingo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 150));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B_Regresar.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnIntermedio.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnIntermedio.setForeground(new java.awt.Color(255, 255, 255));
        btnIntermedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B_intermedio.png"))); // NOI18N
        btnIntermedio.setBorderPainted(false);
        btnIntermedio.setContentAreaFilled(false);
        btnIntermedio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIntermedio.setIconTextGap(10);
        jPanel1.add(btnIntermedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 200, 90));

        btnAvanzado.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnAvanzado.setForeground(new java.awt.Color(255, 255, 255));
        btnAvanzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B_avanzado.png"))); // NOI18N
        btnAvanzado.setBorderPainted(false);
        btnAvanzado.setContentAreaFilled(false);
        btnAvanzado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnAvanzado.setIconTextGap(10);
        jPanel1.add(btnAvanzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 200, 90));

        btnPrincipiante.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnPrincipiante.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/B_principiante.png"))); // NOI18N
        btnPrincipiante.setBorderPainted(false);
        btnPrincipiante.setContentAreaFilled(false);
        btnPrincipiante.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPrincipiante.setIconTextGap(10);
        jPanel1.add(btnPrincipiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 200, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/P_NIVEL.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 381));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            java.util.logging.Logger.getLogger(Seleccion_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion_Nivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion_Nivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAvanzado;
    public javax.swing.JButton btnIntermedio;
    public javax.swing.JButton btnPrincipiante;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}