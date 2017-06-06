package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Ctanque;
import br.com.ifspsaocarlos.gastock.library.Tanque;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class TanqueListarDialog extends javax.swing.JDialog {

    private TanqueTabelaModel tableModel;

    /**
     * Creates new form TanqueListarDialog
     *
     * @param parent
     */
    public TanqueListarDialog(java.awt.Window parent) {
        super(parent);

        initComponents();
        init();

        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(null);// a tela irá abrir no centro
    }

    private void init() {

        tableModel = new TanqueTabelaModel();
        tabelaTanque.setModel(tableModel);
    }

    public Tanque getTanqueSelecionado() throws Exception {

        int row = tabelaTanque.getSelectedRow();
        if (row == -1) {
            throw new Exception("Por favor, selecione uma linha da tabela.");
        }

        return tableModel.get(row);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adcionarBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();
        excluirBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTanque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Combustível");

        adcionarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icon/add_01.png"))); // NOI18N
        adcionarBtn.setBorder(null);
        adcionarBtn.setBorderPainted(false);
        adcionarBtn.setContentAreaFilled(false);
        adcionarBtn.setFocusPainted(false);
        adcionarBtn.setFocusable(false);
        adcionarBtn.setRequestFocusEnabled(false);
        adcionarBtn.setVerifyInputWhenFocusTarget(false);
        adcionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcionarBtnActionPerformed(evt);
            }
        });

        editarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icon/editar_01.png"))); // NOI18N
        editarBtn.setBorder(null);
        editarBtn.setBorderPainted(false);
        editarBtn.setContentAreaFilled(false);
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        excluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icon/excluir_01.png"))); // NOI18N
        excluirBtn.setBorder(null);
        excluirBtn.setBorderPainted(false);
        excluirBtn.setContentAreaFilled(false);
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        tabelaTanque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaTanque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adcionarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adcionarBtn)
                    .addComponent(editarBtn)
                    .addComponent(excluirBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Gerenciar Tanque");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed

        try {

            Tanque c = getTanqueSelecionado();

            TanqueJDialog dialog = new TanqueJDialog(this);
            dialog.setTanque(c);
            dialog.setVisible(true);

            if (dialog.isSalvou()) {
                tableModel.modificar(tabelaTanque.getSelectedRow(),
                        dialog.getTanque());
            }

            dialog.dispose();
            dialog = null;

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }

    }//GEN-LAST:event_editarBtnActionPerformed

    private void adcionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcionarBtnActionPerformed

        TanqueJDialog dialog = new TanqueJDialog(this);
        dialog.setVisible(true);

        if (dialog.isSalvou()) {
            tableModel.adicionar(dialog.getTanque());
        }

        dialog.dispose();
        dialog = null;
    }//GEN-LAST:event_adcionarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed

        try {
            Tanque c = getTanqueSelecionado();

            String txt = "Você deseja deletar o produto " + c.getCombustivel() + " ?";
            int resultado = JOptionPane.showConfirmDialog(this, txt);

            if (resultado == JOptionPane.YES_OPTION) {

                Ctanque.getInstancia().excluir(c.getTanque());
                tableModel.excluir(tabelaTanque.getSelectedRow());
            } else {
                throw new Exception("A ação foi cancelada pelo usuário.");
            }
            JOptionPane.showMessageDialog(this, "O produto foi excluido com sucesso.");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }


    }//GEN-LAST:event_excluirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TanqueListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TanqueListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TanqueListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TanqueListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TanqueListarDialog dialog = new TanqueListarDialog(new javax.swing.JFrame());
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adcionarBtn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTanque;
    // End of variables declaration//GEN-END:variables
}
