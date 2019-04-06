/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class BusquedaSorteo extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaSorteo
     */
    public BusquedaSorteo() {
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
        ComboBoxSorteo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        NombreBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TipoBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarBusquedas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PrecioBusqueda = new javax.swing.JTextField();
        FechaBusqueda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("Que sorteo desea buscar:");

        ComboBoxSorteo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loteria", "Lotto", "Bingo", "Tiempo" }));
        ComboBoxSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSorteoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        NombreBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreBusquedaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo:");

        TipoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoBusquedaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MostrarBusquedas.setColumns(20);
        MostrarBusquedas.setRows(5);
        MostrarBusquedas.setEnabled(false);
        jScrollPane1.setViewportView(MostrarBusquedas);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Búsqueda de sorteos");

        jLabel5.setText("Precio:");

        PrecioBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioBusquedaActionPerformed(evt);
            }
        });

        FechaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaBusquedaActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha del Sorteo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrecioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSorteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxSorteoActionPerformed

    private void NombreBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreBusquedaActionPerformed

    private void TipoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoBusquedaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            String dateInString = FechaBusqueda.getText().trim();
            if (ComboBoxSorteo.getSelectedItem().equals("Loteria")) {
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorLoteria.Buscar(NombreBusqueda.getText(), TipoBusqueda.getText(), date));
                }
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorLoteria.Buscar(NombreBusqueda.getText(), "", null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorLoteria.Buscar("", TipoBusqueda.getText(), null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorLoteria.Buscar("", "", date));
                }
                if (NombreBusqueda.getText() == "" && TipoBusqueda.getText() == "") {
                    MostrarBusquedas.setText(MainApp.gestorLoteria.toString());
                }
            } else if (ComboBoxSorteo.getSelectedItem().equals("Lotto")) {
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorLotto.Buscar(NombreBusqueda.getText(), TipoBusqueda.getText(), date));
                }
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorLotto.Buscar(NombreBusqueda.getText(), "", null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorLotto.Buscar("", TipoBusqueda.getText(), null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorLotto.Buscar("", "", date));
                }
                if (NombreBusqueda.getText() == "" && TipoBusqueda.getText() == "") {
                    MostrarBusquedas.setText(MainApp.gestorLotto.toString());
                }

            } else if (ComboBoxSorteo.getSelectedItem().equals("Bingo")) {
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorBingo.Buscar(NombreBusqueda.getText(), TipoBusqueda.getText(), date));
                }
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorBingo.Buscar(NombreBusqueda.getText(), "", null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorBingo.Buscar("", TipoBusqueda.getText(), null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorBingo.Buscar("", "", date));
                }
                if (NombreBusqueda.getText() == "" && TipoBusqueda.getText() == "") {
                    MostrarBusquedas.setText(MainApp.gestorBingo.toString());
                }

            } else if (ComboBoxSorteo.getSelectedItem().equals("Tiempos")) {
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorTiempos.Buscar(NombreBusqueda.getText(), TipoBusqueda.getText(), date));
                }
                if (NombreBusqueda.getText() != " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorTiempos.Buscar(NombreBusqueda.getText(), "", null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() != " " && FechaBusqueda.getText() == " ") {
                    MostrarBusquedas.setText(MainApp.gestorTiempos.Buscar("", TipoBusqueda.getText(), null));
                }
                if (NombreBusqueda.getText() == " " && TipoBusqueda.getText() == " " && FechaBusqueda.getText() != " ") {
                    Date date = formatter.parse(dateInString);
                    MostrarBusquedas.setText(MainApp.gestorTiempos.Buscar("", "", date));
                }
                if (NombreBusqueda.getText() == "" && TipoBusqueda.getText() == "") {
                    MostrarBusquedas.setText(MainApp.gestorTiempos.toString());
                }
            }
        } catch (Exception e) {
            Validacion V = new Validacion(this, true);
            V.setLocationRelativeTo(null);
            V.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioBusquedaActionPerformed

    private void FechaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSorteo;
    private javax.swing.JTextField FechaBusqueda;
    private javax.swing.JTextArea MostrarBusquedas;
    private javax.swing.JTextField NombreBusqueda;
    private javax.swing.JTextField PrecioBusqueda;
    private javax.swing.JTextField TipoBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
