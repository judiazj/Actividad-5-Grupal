/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class VentanaPiramide extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaPiramide
     */
    public VentanaPiramide() {
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

        lblBase = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblApotema = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtApotema = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblVolumen = new javax.swing.JLabel();
        lblSuperficie = new javax.swing.JLabel();
        imgPiramide = new javax.swing.JLabel();

        setTitle("Piramide");

        lblBase.setText("Base(cms)");

        lblAltura.setText("Altura(cms)");

        lblApotema.setText("Apotema(cms)");

        txtApotema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApotemaActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblVolumen.setText("Volumen (cm3):");

        lblSuperficie.setText("Superficie (cm2):");

        imgPiramide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/piramide.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addGap(18, 18, 18)
                        .addComponent(txtAltura))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBase)
                        .addGap(18, 18, 18)
                        .addComponent(txtBase))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSuperficie)
                            .addComponent(lblVolumen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcular)
                                .addGap(57, 57, 57)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblApotema)
                                .addGap(18, 18, 18)
                                .addComponent(txtApotema)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgPiramide, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBase)
                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApotema)
                            .addComponent(txtApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpiar))
                        .addGap(28, 28, 28)
                        .addComponent(lblVolumen)
                        .addGap(18, 18, 18)
                        .addComponent(lblSuperficie))
                    .addComponent(imgPiramide, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApotemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApotemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApotemaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try{
            double base = Double.parseDouble(txtBase.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            double apotema = Double.parseDouble(txtApotema.getText());
            
            Piramide AuxPir = new Piramide(base, altura, apotema);
            
            lblVolumen.setText("Volumen (cm3): " + String.format("%.2f", AuxPir.volumen) );
            lblSuperficie.setText("Superficie (cm2): " + String.format("%.2f", AuxPir.superficie) );
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caracteres no validos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtBase.setText("");
        txtAltura.setText("");
        txtApotema.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel imgPiramide;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblApotema;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblSuperficie;
    private javax.swing.JLabel lblVolumen;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApotema;
    private javax.swing.JTextField txtBase;
    // End of variables declaration//GEN-END:variables
}
