/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import logica.tiquetes.TiquetesBingo;

/**
 *
 * @author Dell
 */
public class GestorTiquetesBingo extends javax.swing.JFrame {

    /**
     * Creates new form GestorTiquetesLotto
     */
    public GestorTiquetesBingo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numE1 = new javax.swing.JTextField();
        numE3 = new javax.swing.JTextField();
        numE4 = new javax.swing.JTextField();
        numE2 = new javax.swing.JTextField();
        numE5 = new javax.swing.JTextField();
        numE6 = new javax.swing.JTextField();
        numE7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        numE8 = new javax.swing.JTextField();
        numE9 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pedidos de Bingo");

        jLabel2.setText("Números elegidos: ");

        numE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numE1ActionPerformed(evt);
            }
        });

        numE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numE3ActionPerformed(evt);
            }
        });

        numE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numE2ActionPerformed(evt);
            }
        });

        numE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numE7ActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        numE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numE8ActionPerformed(evt);
            }
        });

        numE9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numE9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numE1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numE9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numE1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numE9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numE1ActionPerformed

    private void numE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numE7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numE7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            TiquetesBingo TL = new TiquetesBingo("Valeria", UsuariosApp.NombreUsuario.getText().trim(), "Bingo", Integer.parseInt(numE1.getText().trim()), Integer.parseInt(numE2.getText().trim()), Integer.parseInt(numE3.getText().trim()), Integer.parseInt(numE4.getText().trim()), Integer.parseInt(numE5.getText().trim()), Integer.parseInt(numE6.getText().trim()), Integer.parseInt(numE7.getText().trim()), Integer.parseInt(numE8.getText().trim()), Integer.parseInt(numE9.getText().trim()));
            MainApp.gestorTLotto.crear(TL);
            this.setVisible(false);
            UsuariosApp.NombreUsuario.setText("");
            UsuariosApp.CedulaUsuario.setText("");
            UsuariosApp.fecha_Nacimento_Usuario.setText("");
            UsuariosApp.EdadUsuario.setText("");
            UsuariosApp.TelefonoUsuario.setText("");
            UsuariosApp.DireccionUsuario.setText("");
            UsuariosApp.emailUsuario.setText("");
        } catch (Exception e) {
            Validacion V = new Validacion(this, true);
            V.setLocationRelativeTo(null);
            V.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numE2ActionPerformed

    private void numE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numE3ActionPerformed

    private void numE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numE8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numE8ActionPerformed

    private void numE9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numE9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numE9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField numE1;
    private javax.swing.JTextField numE2;
    private javax.swing.JTextField numE3;
    private javax.swing.JTextField numE4;
    private javax.swing.JTextField numE5;
    private javax.swing.JTextField numE6;
    private javax.swing.JTextField numE7;
    private javax.swing.JTextField numE8;
    private javax.swing.JTextField numE9;
    // End of variables declaration//GEN-END:variables
}
