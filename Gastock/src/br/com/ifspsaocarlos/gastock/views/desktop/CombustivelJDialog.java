package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Ccombustivel;
import br.com.ifspsaocarlos.gastock.controllers.Combustivel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class CombustivelJDialog extends javax.swing.JDialog {

    private Combustivel combustivel;
    private boolean salvou;

    /**
     * Creates new form CombustivelJDialog
     *
     * @param parent
     */
    public CombustivelJDialog(java.awt.Window parent) {

        super(parent);

        initComponents();
        init();//Inicializar os itens posto na tela

        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(parent);// a tela irá abrir no centro
    }

    private void init() {
        salvou = false;
        setCombustivel(new Combustivel());
    }

    public void setCombustivel(Combustivel c) {

        combustivel = c;

        if (combustivel == null) {

            combustivel = new Combustivel();
        }

        nomeTxt.setText(combustivel.getNome());
        precoTxt.setText(combustivel.getPreco() + "");// Transformando o valor em string

        salvou = false;
    }

    public Combustivel getCombustivel() {

        combustivel.setNome(nomeTxt.getText());

        double preco = Double.parseDouble(precoTxt.getText());
        combustivel.setPreco(preco);

        return combustivel;
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
        nomeTxt = new javax.swing.JTextField();
        precoTxt = new javax.swing.JTextField();
        salvarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Combustível");

        jLabel2.setText("Nome:");

        jLabel3.setText("Preço");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(precoTxt)
                        .addGap(131, 131, 131))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarBtn)
                .addGap(18, 18, 18)
                .addComponent(cancelarBtn)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn)
                    .addComponent(salvarBtn))
                .addContainerGap())
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

            Combustivel c = getCombustivel();

            if (c.getCombustivelId() == 0) {
                Ccombustivel.getInstancia().adcionar(c); // salva no bd    
            } else {
                Ccombustivel.getInstancia().modificar(c); // modificar 
                
            }
            
            setVisible(false);
            JOptionPane.showMessageDialog(this, "O produto foi salvo com sucesso!");
            
            salvou = true;

        } catch (Exception err) {

            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_salvarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables
}
