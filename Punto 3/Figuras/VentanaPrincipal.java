/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Figuras;

/**
 *
 * @author User
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        dp = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnubFiguras = new javax.swing.JMenu();
        mnuCilindro = new javax.swing.JMenuItem();
        mnuCubo = new javax.swing.JMenuItem();
        mnuEsfera = new javax.swing.JMenuItem();
        mnuPiramide = new javax.swing.JMenuItem();
        mnuPrisma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        mnubFiguras.setText("Figuras");

        mnuCilindro.setText("Cilindro");
        mnuCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCilindroActionPerformed(evt);
            }
        });
        mnubFiguras.add(mnuCilindro);

        mnuCubo.setText("Cubo");
        mnuCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCuboActionPerformed(evt);
            }
        });
        mnubFiguras.add(mnuCubo);

        mnuEsfera.setText("Esfera");
        mnuEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEsferaActionPerformed(evt);
            }
        });
        mnubFiguras.add(mnuEsfera);

        mnuPiramide.setText("Piramide");
        mnuPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPiramideActionPerformed(evt);
            }
        });
        mnubFiguras.add(mnuPiramide);

        mnuPrisma.setText("Prisma");
        mnuPrisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrismaActionPerformed(evt);
            }
        });
        mnubFiguras.add(mnuPrisma);

        jMenuBar1.add(mnubFiguras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPrismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrismaActionPerformed
        VentanaPrisma vprifrm = new VentanaPrisma();
        dp.add(vprifrm);
        vprifrm.setClosable(true);
        vprifrm.setVisible(true);
    }//GEN-LAST:event_mnuPrismaActionPerformed

    private void mnuCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCilindroActionPerformed
        VentanaCilindro vcilfrm = new VentanaCilindro();
        dp.add(vcilfrm);
        vcilfrm.setClosable(true);
        vcilfrm.setVisible(true);
    }//GEN-LAST:event_mnuCilindroActionPerformed

    private void mnuCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCuboActionPerformed
       VentanaCubo vcubofrm = new VentanaCubo();
       dp.add(vcubofrm);
       vcubofrm.setClosable(true);
       vcubofrm.setVisible(true);
    }//GEN-LAST:event_mnuCuboActionPerformed

    private void mnuEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEsferaActionPerformed
        VentanaEsfera vesffrm = new VentanaEsfera();
        dp.add(vesffrm);
        vesffrm.setClosable(true);
        vesffrm.setVisible(true);
    }//GEN-LAST:event_mnuEsferaActionPerformed

    private void mnuPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPiramideActionPerformed
        VentanaPiramide vpirfrm = new VentanaPiramide();
        dp.add(vpirfrm);
        vpirfrm.setClosable(true);
        vpirfrm.setVisible(true);
    }//GEN-LAST:event_mnuPiramideActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuCilindro;
    private javax.swing.JMenuItem mnuCubo;
    private javax.swing.JMenuItem mnuEsfera;
    private javax.swing.JMenuItem mnuPiramide;
    private javax.swing.JMenuItem mnuPrisma;
    private javax.swing.JMenu mnubFiguras;
    // End of variables declaration//GEN-END:variables
}
