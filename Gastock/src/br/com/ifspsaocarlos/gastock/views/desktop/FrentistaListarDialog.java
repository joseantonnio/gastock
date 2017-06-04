package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Cfrentista;
import br.com.ifspsaocarlos.gastock.library.Frentista;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrentistaListarDialog extends javax.swing.JDialog {

    private FrentistaTabelaModel tableModel;

    /**
     * Creates new form FrentistaListarDialog
     *
     * @param parent
     */
    public FrentistaListarDialog(java.awt.Window parent) {
        super(parent);

        initComponents();
        init();

        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(null);// a tela irá abrir no centro
    }

    private void init() {

        tableModel = new FrentistaTabelaModel();
        tabelaFrentista.setModel(tableModel);
    }

    public Frentista getFrentistaSelecionado() throws Exception {

        int row = tabelaFrentista.getSelectedRow();
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
        tabelaFrentista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Frentista");

        adcionarBtn.setText("Adicionar");
        adcionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcionarBtnActionPerformed(evt);
            }
        });

        editarBtn.setText("Editar");
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        tabelaFrentista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaFrentista);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed

        try {

            Frentista c = getFrentistaSelecionado();

            FrentistaJDialog dialog = new FrentistaJDialog(this);
            dialog.setFrentista(c);
            dialog.setVisible(true);

            if (dialog.isSalvou()) {
                tableModel.modificar(tabelaFrentista.getSelectedRow(),
                        dialog.getFrentista());
            }

            dialog.dispose();
            dialog = null;

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }

    }//GEN-LAST:event_editarBtnActionPerformed

    private void adcionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcionarBtnActionPerformed

        FrentistaJDialog dialog = new FrentistaJDialog(this);
        dialog.setVisible(true);

        if (dialog.isSalvou()) {
            tableModel.adicionar(dialog.getFrentista());
        }

        dialog.dispose();
        dialog = null;
    }//GEN-LAST:event_adcionarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed

        try {
            Frentista c = getFrentistaSelecionado();

            String txt = "Você deseja deletar o produto " + c.getNome() + " ?";
            int resultado = JOptionPane.showConfirmDialog(this, txt);

            if (resultado == JOptionPane.YES_OPTION) {

                Cfrentista.getInstancia().excluir(c.getFrentistaId());
                tableModel.excluir(tabelaFrentista.getSelectedRow());
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
            java.util.logging.Logger.getLogger(FrentistaListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrentistaListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrentistaListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrentistaListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrentistaListarDialog dialog = new FrentistaListarDialog(new javax.swing.JFrame());
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
    private javax.swing.JTable tabelaFrentista;
    // End of variables declaration//GEN-END:variables
}
