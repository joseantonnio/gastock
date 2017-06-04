package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Ctanque;
import br.com.ifspsaocarlos.gastock.library.Tanque;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class TanqueJDialog extends javax.swing.JDialog {

    private Tanque tanque;
    private boolean salvou;

    /**
     * Creates new form TanqueJDialog
     *
     * @param parent
     */
    public TanqueJDialog(java.awt.Window parent) {

        super(parent);

        initComponents();
        init();//Inicializar os itens posto na tela

        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(parent);// a tela irá abrir no centro
    }

    private void init() {
        salvou = false;
        setTanque(new Tanque());
    }

    public void setTanque(Tanque c) {

        tanque = c;

        if (tanque == null) {

            tanque = new Tanque();
        }

        nomeTxt.setText(tanque.getCombustivel());
        quantidadeTxt.setText(tanque.getQuantidade() + "");// Transformando o valor em string

        salvou = false;
    }

    public Tanque getTanque() {

        tanque.setCombustivel(nomeTxt.getText());

        double quantidade = Double.parseDouble(quantidadeTxt.getText());
        tanque.setQuantidade(quantidade);

        return tanque;
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
        quantidadeTxt = new javax.swing.JTextField();
        salvarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar/Editar Combustível");

        jLabel2.setText("Combustivel");

        jLabel3.setText("Quantidade");

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
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(quantidadeTxt)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvarBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelarBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
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

            Tanque c = getTanque();

            if (c.getTanqueId() == 0) {
                Ctanque.getInstancia().adcionar(c); // salva no bd    
            } else {
                Ctanque.getInstancia().modificar(c); // modificar 
                
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
    private javax.swing.JTextField quantidadeTxt;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables
}
