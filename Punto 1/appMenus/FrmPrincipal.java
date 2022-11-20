/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appMenus;

/**
 *
 * @author Bernardo
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuItem1 = new javax.swing.JMenuItem();
        dp = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuPitagoras = new javax.swing.JMenuItem();
        mnuOhm = new javax.swing.JMenu();
        mnuVoltaje = new javax.swing.JMenuItem();
        mnuCorriente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuAcerca = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicacion Menus");

        dp.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pitagoras");

        mnuPitagoras.setText("Calcular Pitagoras");
        mnuPitagoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPitagorasActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPitagoras);

        jMenuBar1.add(jMenu2);

        mnuOhm.setText("Ohm");

        mnuVoltaje.setText("Calcular Voltaje");
        mnuVoltaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVoltajeActionPerformed(evt);
            }
        });
        mnuOhm.add(mnuVoltaje);

        mnuCorriente.setText("Calcular Corriente");
        mnuCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCorrienteActionPerformed(evt);
            }
        });
        mnuOhm.add(mnuCorriente);

        jMenuBar1.add(mnuOhm);

        jMenu4.setText("Acerca");

        mnuAcerca.setText("Acerca de");
        mnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuAcerca);

        jMenuBar1.add(jMenu4);

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

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuPitagorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPitagorasActionPerformed
        // TODO add your handling code here:
        FrmPitagoras pitagoras = new FrmPitagoras();
        dp.add(pitagoras);
        pitagoras.setClosable(true);
        pitagoras.setVisible(true);
    }//GEN-LAST:event_mnuPitagorasActionPerformed

    private void mnuVoltajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVoltajeActionPerformed
        FrmVoltaje voltaje = new FrmVoltaje();
        dp.add(voltaje);
        voltaje.setClosable(true);
        voltaje.setVisible(true);
    }//GEN-LAST:event_mnuVoltajeActionPerformed

    private void mnuCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCorrienteActionPerformed
        FrmCorriente corriente = new FrmCorriente();
        dp.add(corriente);
        corriente.setClosable(true);
        corriente.setVisible(true);
    }//GEN-LAST:event_mnuCorrienteActionPerformed

    private void mnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaActionPerformed
        // TODO add your handling code here:
        FrmAcercaDe acerca = new FrmAcercaDe();
        dp.add(acerca);
        acerca.setClosable(true);
        acerca.setVisible(true);
    }//GEN-LAST:event_mnuAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnuAcerca;
    private javax.swing.JMenuItem mnuCorriente;
    private javax.swing.JMenu mnuOhm;
    private javax.swing.JMenuItem mnuPitagoras;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenuItem mnuVoltaje;
    // End of variables declaration//GEN-END:variables
}
