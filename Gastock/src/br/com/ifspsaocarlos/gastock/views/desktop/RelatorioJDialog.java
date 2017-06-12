package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Crelatorio;
import br.com.ifspsaocarlos.gastock.library.Relatorio;

import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class RelatorioJDialog extends javax.swing.JDialog {

    private Relatorio relatorio;
    private boolean salvou;
    

    /**
     * Creates new form RelatorioJDialog
     *
     * @param parent
     */
    public RelatorioJDialog(java.awt.Window parent) {

        super(parent);

        initComponents();
        init();//Inicializar os itens posto na tela

        
        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(parent);// a tela irá abrir no centro
    }

    private void init() {
        salvou = false;
        setRelatorio(new Relatorio());
    }

    public void setRelatorio(Relatorio c) {

        relatorio = c;

        if (relatorio == null) {

            relatorio = new Relatorio();
        }

        combustivelTxt.setText(relatorio.getCombustivel() + "");// Transformando o valor em string
        bombaTxt.setText(relatorio.getBomba() + "");// Transformando o valor em string
        quantidadeTxt.setText(relatorio.getQuantidade() + "");// Transformando o valor em string
        precoTxt.setText(relatorio.getPrecoTotal() + "");// Transformando o valor em string

        salvou = false;
    }

    public Relatorio getRelatorio() {

        relatorio.setCombustivel(combustivelTxt.getText());
        
        int bomba = Integer.parseInt(bombaTxt.getText());
        relatorio.setBomba(bomba);
        
        double quantidade = Double.parseDouble(quantidadeTxt.getText());
        relatorio.setQuantidade(quantidade);
        
        double preco = Double.parseDouble(precoTxt.getText());
        relatorio.setPrecoTotal(preco);

        return relatorio;
    }

    public boolean isSalvou() {
        return salvou;
    }

    public void setSalvou(boolean salvou) {
        this.salvou = salvou;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantidadeTxt = new javax.swing.JTextField();
        salvarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        precoTxt = new javax.swing.JTextField();
        combustivelTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bombaTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar/Editar Combustível");

        jLabel2.setText("Combustivel:");

        jLabel3.setText("Quantidade:");

        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Preço:");

        jLabel4.setText("Bomba");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarBtn)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(quantidadeTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(combustivelTxt))
                                .addGap(131, 131, 131))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bombaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combustivelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bombaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn)
                    .addComponent(salvarBtn))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        salvou = false;
        setVisible(false);
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed

        try {

            salvou = false;

            Relatorio c = getRelatorio();

            if (c.getRelatorio() == 0) {
                Crelatorio.getInstancia().adcionar(c); // salva no bd    
            } else {
                Crelatorio.getInstancia().modificar(c); // modificar 

            }

            setVisible(false);
            JOptionPane.showMessageDialog(this, "O produto foi salvo com sucesso!");

            salvou = true;

        } catch (Exception err) {

            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_salvarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bombaTxt;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField combustivelTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JTextField quantidadeTxt;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables
}
