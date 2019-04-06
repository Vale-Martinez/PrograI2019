package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import logica.gestores.*;
import logica.gestores.tiquetes.GestorTiquetesLoteria;
import logica.gestores.tiquetes.GestorTiquetesLotto;
import logica.gestores.tiquetes.GestorTiquetesBingo;
import logica.gestores.tiquetes.GestorTiquetesTiempos;
import logica.sorteos.*;
import logica.tiquetes.*;
import logica.usuario.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        iniciar();
        initComponents();
    }
    //crea los gestor universales
    static GestorSorteosLoteria gestorLoteria = new GestorSorteosLoteria();
    static GestorSorteosLotto gestorLotto = new GestorSorteosLotto();
    static GestorSorteosBingo gestorBingo = new GestorSorteosBingo();
    static GestorSorteosTiempos gestorTiempos = new GestorSorteosTiempos();

    static gestorUsuarios gUsuarios = new gestorUsuarios();

    static GestorTiquetesLoteria gestorTLoteria = new GestorTiquetesLoteria();
    static GestorTiquetesLotto gestorTLotto = new GestorTiquetesLotto();
    static GestorTiquetesBingo gestorTBingo = new GestorTiquetesBingo();
    static GestorTiquetesTiempos gestorTTiempos = new GestorTiquetesTiempos();

    //se crean datos "almacenados" que seran predeterminados en una funcion inciar
    private void iniciar() {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            String dateInString = "05-Apr-2019";
            Date d= formatter.parse(dateInString);
            logica.sorteos.Sorteos loteria1 = new Loteria("Sorteo dia de la madre", "Ordinario", 001, 100, d);
            logica.sorteos.Sorteos loteria2 = new Loteria("Sorteo dia de la padre", "Ordinario", 002, 100, d);
            gestorLoteria.crear(loteria1);
            gestorLoteria.crear(loteria2);
            
            Lotto lotto1 = new Lotto("Sorteo dia de la madre", "Ordinario", 001, 100, d, 1000000);
            Lotto lotto2 = new Lotto("Sorteo dia de la padre", "Ordinario", 002, 100, d, 1000000);
            gestorLotto.crear(lotto1);
            gestorLotto.crear(lotto2);
            
            Bingo bingo1 = new Bingo("Sorteo dia de la padre", "Ordinario", 001, 100, d);
            Bingo bingo2 = new Bingo("Sorteo dia de la padre", "Ordinario", 002, 100, d);
            gestorBingo.crear(bingo1);
            gestorBingo.crear(bingo2);
            
            Tiempos tiempos1 = new Tiempos("Sorteo dia de la padre", "Ordinario", 001, 100, d);
            Tiempos tiempos2 = new Tiempos("Sorteo dia de la padre", "Ordinario", 002, 100, d);
            gestorTiempos.crear(tiempos1);
            gestorTiempos.crear(tiempos2);
            
            Usuario u1 = new Usuario(901220797, 87852339, 18, "31/08/2000", "Valeria Martinez", "Cartago", "valemar3108@gmail.com");
            Usuario u2 = new Usuario(222, 556, 18, "12/09/2000", "Federico Alfaro", "Alajuela", "tobialfarocampos@gmail.com");
            gUsuarios.crear(u1);
            gUsuarios.crear(u2);
            
            TiquetesLoteria TL1 = new TiquetesLoteria("Valeria", "Federico", "Ordinario", 06);
            TiquetesLoteria TL2 = new TiquetesLoteria("Valeria", "Federico", "Extraordinario", 54);
            gestorTLoteria.crear(TL1);
            gestorTLoteria.crear(TL2);
            
            TiquetesLotto TLotto1 = new TiquetesLotto("Valeria", "Federico", "Ordinario", 06, 28, 78, 47, 96, 01, 07);
            TiquetesLotto TLotto2 = new TiquetesLotto("Valeria", "Federico", "Ordinario", 01, 02, 03, 04, 05, 06, 07);
            gestorTLotto.crear(TLotto1);
            gestorTLotto.crear(TLotto2);
            
            TiquetesBingo TBingo1 = new TiquetesBingo("Valeria", "Federico", "Ordinario", 03, 78, 55, 11, 45, 56, 89, 00, 19);
            TiquetesBingo TBingo2 = new TiquetesBingo("Valeria", "Federico", "Ordinario", 85, 42, 14, 74, 60, 83, 12, 71, 02);
            gestorTBingo.crear(TBingo1);
            gestorTBingo.crear(TBingo2);
            
            TiquetesTiempos TTiempos1 = new TiquetesTiempos("Valeria", "Federico", "Ordinario", 45, 02);
            TiquetesTiempos TTiempos2 = new TiquetesTiempos("Valeria", "Federico", "Ordinario", 83, 12);
            gestorTTiempos.crear(TTiempos1);
            gestorTTiempos.crear(TTiempos2);
        } catch (ParseException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        BotonSorteos = new javax.swing.JButton();
        BotonPedidoTiquetes = new javax.swing.JButton();
        BotonCalendarizado = new javax.swing.JButton();
        BotonRealizarSorteo = new javax.swing.JButton();
        BotonBuscarSorteo = new javax.swing.JButton();
        BotonSorteo = new javax.swing.JButton();
        BotonAtencionP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        LabelTitulo.setBackground(new java.awt.Color(143, 166, 201));
        LabelTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        LabelTitulo.setText("LottoTec");
        LabelTitulo.setOpaque(true);

        BotonSorteos.setText("Sorteos disponibles");
        BotonSorteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSorteosActionPerformed(evt);
            }
        });

        BotonPedidoTiquetes.setText("Pedidos de tiquetes");
        BotonPedidoTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidoTiquetesActionPerformed(evt);
            }
        });

        BotonCalendarizado.setText("Pedido calendarizado");
        BotonCalendarizado.setActionCommand("");

        BotonRealizarSorteo.setText("Realizar sorteo");
        BotonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRealizarSorteoActionPerformed(evt);
            }
        });

        BotonBuscarSorteo.setText("Buscar sorteo");
        BotonBuscarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarSorteoActionPerformed(evt);
            }
        });

        BotonSorteo.setText("Sorteos");
        BotonSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSorteoActionPerformed(evt);
            }
        });

        BotonAtencionP.setText("Atencion de Pedidos");
        BotonAtencionP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtencionPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BotonSorteos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTitulo)
                    .addComponent(BotonPedidoTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCalendarizado)
                    .addComponent(BotonRealizarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAtencionP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addGap(33, 33, 33)
                .addComponent(BotonSorteos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonPedidoTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCalendarizado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonRealizarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonBuscarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAtencionP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPedidoTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidoTiquetesActionPerformed
        UsuariosApp UsuariosApp = new UsuariosApp();
        UsuariosApp.setVisible(true);
    }//GEN-LAST:event_BotonPedidoTiquetesActionPerformed

    private void BotonBuscarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarSorteoActionPerformed
        BusquedaSorteo BusquedaSorteo = new BusquedaSorteo();
        BusquedaSorteo.setVisible(true);
    }//GEN-LAST:event_BotonBuscarSorteoActionPerformed

    private void BotonSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSorteoActionPerformed
        Sorteos Sorteos = new Sorteos();
        Sorteos.setVisible(true);
    }//GEN-LAST:event_BotonSorteoActionPerformed

    private void BotonSorteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSorteosActionPerformed
        SorteosDisponibles SorteosDisponibles = new SorteosDisponibles();
        SorteosDisponibles.MostrarSorteosDisponibles.setText("Sorteos Loteria \n" + MainApp.gestorLoteria.toString()
                + "Sorteos Lotto \n" + MainApp.gestorLotto.toString()
                + "Sorteos Bingo \n" + MainApp.gestorBingo.toString()
                + "Sorteos Tiempos \n" + MainApp.gestorTiempos.toString());
        SorteosDisponibles.setVisible(true);
    }//GEN-LAST:event_BotonSorteosActionPerformed

    private void BotonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRealizarSorteoActionPerformed
        RealizarSorteo RealizarSorteo = new RealizarSorteo();
        RealizarSorteo.MostrarSorteos.setText("Último Sorteo Loteria \n" + MainApp.gestorLoteria.getListaSorteosLoteria().getTail().getElement().toString() + "\n"
                + "Último Sorteo Lotto \n" + MainApp.gestorLotto.getListaSorteosLotto().getTail().getElement().toString() + "\n"
                + "Último Sorteo Bingo \n" + MainApp.gestorBingo.getListaSorteosBingo().getTail().getElement().toString() + "\n"
                + "Último Sorteo Tiempos \n" + MainApp.gestorTiempos.getListaSorteosTiempos().getTail().getElement().toString());
        try {
            RealizandoSorteos RS = new RealizandoSorteos(this, true);
            RS.setVisible(true);
            Thread.sleep(2500);
            RS.setVisible(false);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        RealizarSorteo.setVisible(true);
    }//GEN-LAST:event_BotonRealizarSorteoActionPerformed

    private void BotonAtencionPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtencionPActionPerformed
     
    }//GEN-LAST:event_BotonAtencionPActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtencionP;
    private javax.swing.JButton BotonBuscarSorteo;
    private javax.swing.JButton BotonCalendarizado;
    private javax.swing.JButton BotonPedidoTiquetes;
    private javax.swing.JButton BotonRealizarSorteo;
    private javax.swing.JButton BotonSorteo;
    private javax.swing.JButton BotonSorteos;
    private javax.swing.JLabel LabelTitulo;
    // End of variables declaration//GEN-END:variables
}
