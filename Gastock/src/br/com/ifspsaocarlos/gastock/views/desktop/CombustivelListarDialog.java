package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Ccombustivel;
import br.com.ifspsaocarlos.gastock.controllers.Combustivel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class CombustivelListarDialog extends javax.swing.JDialog {

    private CombustivelTabelaModel tableModel;

    /**
     * Creates new form CombustivelListarDialog
     *
     * @param parent
     */
    public CombustivelListarDialog(java.awt.Window parent) {
        super(parent);

        initComponents();
        init();

        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(null);// a tela irá abrir no centro
    }

    private void init() {

        tableModel = new CombustivelTabelaModel();
        tabelaCombustivel.setModel(tableModel);
    }

    public Combustivel getCombustivelSelecionado() throws Exception {

        int row = tabelaCombustivel.getSelectedRow();
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
        listarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCombustivel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COMBUSTIVEL");

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

        listarBtn.setText("Listar");
        listarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBtnActionPerformed(evt);
            }
        });

        tabelaCombustivel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaCombustivel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(adcionarBtn)
                        .addGap(26, 26, 26)
                        .addComponent(editarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(excluirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listarBtn)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adcionarBtn)
                    .addComponent(editarBtn)
                    .addComponent(excluirBtn)
                    .addComponent(listarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed

        try {

            Combustivel c = getCombustivelSelecionado();

            CombustivelJDialog dialog = new CombustivelJDialog(this);
            dialog.setCombustivel(c);
            dialog.setVisible(true);

            if (dialog.isSalvou()) {
                tableModel.modificar(tabelaCombustivel.getSelectedRow(),
                        dialog.getCombustivel());
            }

            dialog.dispose();
            dialog = null;

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }

    }//GEN-LAST:event_editarBtnActionPerformed

    private void adcionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcionarBtnActionPerformed

        CombustivelJDialog dialog = new CombustivelJDialog(this);
        dialog.setVisible(true);

        if (dialog.isSalvou()) {
            tableModel.adicionar(dialog.getCombustivel());
        }

        dialog.dispose();
        dialog = null;
    }//GEN-LAST:event_adcionarBtnActionPerformed

    private void listarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBtnActionPerformed

        try {

            List<Combustivel> lista = Ccombustivel.getInstancia().listar();

            tableModel.setLista(lista);

        } catch (Exception err) {
            JOptionPane.showMessageDialog(this, err);
        }

    }//GEN-LAST:event_listarBtnActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed

        try {
            Combustivel c = getCombustivelSelecionado();

            String txt = "Você deseja deletar o produto " + c.getNome() + " ?";
            int resultado = JOptionPane.showConfirmDialog(this, txt);

            if (resultado == JOptionPane.YES_OPTION) {

                Ccombustivel.getInstancia().excluir(c.getCombustivelId());
                tableModel.excluir(tabelaCombustivel.getSelectedRow());
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
            java.util.logging.Logger.getLogger(CombustivelListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CombustivelListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CombustivelListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CombustivelListarDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CombustivelListarDialog dialog = new CombustivelListarDialog(new javax.swing.JFrame());
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
    private javax.swing.JButton listarBtn;
    private javax.swing.JTable tabelaCombustivel;
    // End of variables declaration//GEN-END:variables
}
