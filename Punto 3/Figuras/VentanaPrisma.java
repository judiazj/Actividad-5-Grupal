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
public class VentanaPrisma extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaPrisma
     */
    public VentanaPrisma() {
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

        lblCara = new javax.swing.JLabel();
        txtCara = new javax.swing.JTextField();
        lblLado = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblVolumen = new javax.swing.JLabel();
        lblSuperficie = new javax.swing.JLabel();
        imgPrisma = new javax.swing.JLabel();

        setTitle("Prisma");

        lblCara.setText("Caras de la base(cant)");

        lblLado.setText("Lado cara(cms)");

        txtLado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLadoActionPerformed(evt);
            }
        });

        lblAltura.setText("Altura(cms)");

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

        imgPrisma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prisma.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLado)
                        .addGap(18, 18, 18)
                        .addComponent(txtLado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCara)
                        .addGap(18, 18, 18)
                        .addComponent(txtCara))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSuperficie)
                            .addComponent(lblVolumen)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCalcular)
                                .addGap(63, 63, 63)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAltura)
                                .addGap(18, 18, 18)
                                .addComponent(txtAltura)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(imgPrisma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCara)
                            .addComponent(txtCara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLado)
                            .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnLimpiar))
                        .addGap(18, 18, 18)
                        .addComponent(lblVolumen)
                        .addGap(18, 18, 18)
                        .addComponent(lblSuperficie))
                    .addComponent(imgPrisma, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLadoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        try{
            int cara = Integer.parseInt(txtCara.getText());
            double lado = Double.parseDouble(txtLado.getText());
            double altura = Double.parseDouble(txtAltura.getText());
            
            Prisma AuxPri = new Prisma(cara, lado, altura);
            
            lblVolumen.setText("Volumen (cm3): " + String.format("%.2f", AuxPri.volumen) );
            lblSuperficie.setText("Superficie (cm2): " + String.format("%.2f", AuxPri.superficie) );
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Caracteres no validos");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCara.setText("");
        txtLado.setText("");
        txtAltura.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel imgPrisma;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblCara;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblSuperficie;
    private javax.swing.JLabel lblVolumen;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCara;
    private javax.swing.JTextField txtLado;
    // End of variables declaration//GEN-END:variables
}
