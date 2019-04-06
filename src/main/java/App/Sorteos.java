/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import logica.sorteos.*;

/**
 *
 * @author Dell
 */
public class Sorteos extends javax.swing.JFrame {

    /**
     * Creates new form CrearSorteos
     */
    public Sorteos() {
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
        NombreSorteo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TipoSorteo = new javax.swing.JTextField();
        CodigoSorteo = new javax.swing.JTextField();
        EmisionesSorteo = new javax.swing.JTextField();
        FechaSorteo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxSorteos = new javax.swing.JComboBox<>();
        BotonCrearSorteo = new javax.swing.JButton();
        BotonEliminarSorteo = new javax.swing.JButton();
        AcumuladoSorteo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sorteos");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nombre del Sorteo:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Tipo de Sorteo:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Codigo:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Emisiones:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Fecha del Sorteo");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Tipo de Sorteos:");

        ComboBoxSorteos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loteria", "Lotto", "Bingo", "Tiempos" }));

        BotonCrearSorteo.setText("Crear Sorteo");
        BotonCrearSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearSorteoActionPerformed(evt);
            }
        });

        BotonEliminarSorteo.setText("Eliminar Sorteo");
        BotonEliminarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarSorteoActionPerformed(evt);
            }
        });

        AcumuladoSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcumuladoSorteoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Acumulado:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("La fecha del sorteo debe ser ingresa \ncon el siguiente formato:dd-MMM-yyyy\nMMM es la abreviacion en ingles de \nmes\nEl monto del acumulado se debe de \ningresar solo si el Sorteo es de tipo \nLotto");
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AcumuladoSorteo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(FechaSorteo)
                                    .addComponent(ComboBoxSorteos, 0, 113, Short.MAX_VALUE)
                                    .addComponent(EmisionesSorteo)
                                    .addComponent(CodigoSorteo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TipoSorteo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NombreSorteo)))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonEliminarSorteo)
                            .addComponent(BotonCrearSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrearSorteo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarSorteo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmisionesSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AcumuladoSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxSorteos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCrearSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearSorteoActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            String dateInString = FechaSorteo.getText().trim();
            Date date = formatter.parse(dateInString);
            if (ComboBoxSorteos.getSelectedItem().equals("Loteria")) {
                logica.sorteos.Loteria loteria = new logica.sorteos.Loteria(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
                MainApp.gestorLoteria.crear(loteria);
            }
            else if (ComboBoxSorteos.getSelectedItem().equals("Lotto")) {
                Lotto lotto = new Lotto(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date, Integer.parseInt(AcumuladoSorteo.getText().trim()));
                MainApp.gestorLotto.crear(lotto);
            } 
            else if (ComboBoxSorteos.getSelectedItem().equals("Bingo")) {
                logica.sorteos.Bingo bingo = new logica.sorteos.Bingo(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
                MainApp.gestorBingo.crear(bingo);
            } 
            else if (ComboBoxSorteos.getSelectedItem().equals("Tiempos")) {
                logica.sorteos.Tiempos tiempos = new logica.sorteos.Tiempos(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
                MainApp.gestorTiempos.crear(tiempos);
            }
            NombreSorteo.setText(" ");
            TipoSorteo.setText(" ");
            CodigoSorteo.setText(" ");
            EmisionesSorteo.setText(" ");
            FechaSorteo.setText(" ");
            AcumuladoSorteo.setText(" ");
        } catch (Exception e) {
            Validacion V = new Validacion(this, true);
            V.setLocationRelativeTo(null);
            V.setVisible(true);
        }
    }//GEN-LAST:event_BotonCrearSorteoActionPerformed

    private void AcumuladoSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcumuladoSorteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcumuladoSorteoActionPerformed

    private void BotonEliminarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarSorteoActionPerformed
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            String dateInString = FechaSorteo.getText().trim();
            Date date = formatter.parse(dateInString);
            logica.sorteos.Sorteos S = new logica.sorteos.Sorteos(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
            if (ComboBoxSorteos.getSelectedItem().equals("Loteria")) {
               logica.sorteos.Loteria loteria = new logica.sorteos.Loteria(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
                MainApp.gestorLoteria.eliminar(S);
            }
            else if (ComboBoxSorteos.getSelectedItem().equals("Lotto")) {
                Lotto lotto = new Lotto(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date, Integer.parseInt(AcumuladoSorteo.getText().trim()));
                MainApp.gestorLotto.eliminar(lotto);
            } 
            else if (ComboBoxSorteos.getSelectedItem().equals("Bingo")) {
                logica.sorteos.Bingo bingo = new logica.sorteos.Bingo(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
                MainApp.gestorBingo.eliminar(bingo);
            } 
            else if (ComboBoxSorteos.getSelectedItem().equals("Tiempos")) {
                logica.sorteos.Tiempos tiempos = new logica.sorteos.Tiempos(NombreSorteo.getText(), TipoSorteo.getText(), Integer.parseInt(CodigoSorteo.getText().trim()), Integer.parseInt(EmisionesSorteo.getText().trim()), date);
                MainApp.gestorTiempos.eliminar(tiempos);
            }
            NombreSorteo.setText(" ");
            TipoSorteo.setText(" ");
            CodigoSorteo.setText(" ");
            EmisionesSorteo.setText(" ");
            FechaSorteo.setText(" ");
            AcumuladoSorteo.setText(" ");
        } catch (Exception e) {
            Validacion V = new Validacion(this, true);
            V.setLocationRelativeTo(null);
            V.setVisible(true);
        }
    }//GEN-LAST:event_BotonEliminarSorteoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AcumuladoSorteo;
    private javax.swing.JButton BotonCrearSorteo;
    private javax.swing.JButton BotonEliminarSorteo;
    private javax.swing.JTextField CodigoSorteo;
    private javax.swing.JComboBox<String> ComboBoxSorteos;
    private javax.swing.JTextField EmisionesSorteo;
    private javax.swing.JTextField FechaSorteo;
    private javax.swing.JTextField NombreSorteo;
    private javax.swing.JTextField TipoSorteo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
