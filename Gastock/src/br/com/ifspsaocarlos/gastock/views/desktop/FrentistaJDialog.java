package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Cfrentista;
import br.com.ifspsaocarlos.gastock.library.Frentista;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class FrentistaJDialog extends javax.swing.JDialog {

    private Frentista frentista;
    private boolean salvou;

    /**
     * Creates new form FrentistaJDialog
     *
     * @param parent
     */
    public FrentistaJDialog(java.awt.Window parent) {

        super(parent);

        initComponents();
        init();//Inicializar os itens posto na tela

        setModal(true); // sempre ira travar a tela anterior
        setLocationRelativeTo(parent);// a tela irá abrir no centro
    }

    private void init() {
        salvou = false;
        setFrentista(new Frentista());
    }

    public void setFrentista(Frentista c) {

        frentista = c;

        if (frentista == null) {

            frentista = new Frentista();
        }

        nomeTxt.setText(frentista.getNome());
        senhaTxt.setText(frentista.getSenha());
        precoTxt.setText(frentista.getSalario() + "");// Transformando o valor em string

        salvou = false;
    }

    public Frentista getFrentista() {

        frentista.setNome(nomeTxt.getText());
        frentista.setSenha(senhaTxt.getText());

        double salario = Double.parseDouble(precoTxt.getText());
        frentista.setSalario(salario);

        return frentista;
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
        jLabel1 = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar/Editar Frentista");

        jLabel2.setText("Nome:");

        jLabel3.setText("Salario");

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

        jLabel1.setText("Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarBtn)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(senhaTxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precoTxt)))
                        .addGap(137, 137, 137))))
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
                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarBtn)
                    .addComponent(salvarBtn))
                .addContainerGap(18, Short.MAX_VALUE))
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

            Frentista c = getFrentista();

            if (c.getFrentista() == 0) {
                Cfrentista.getInstancia().adcionar(c); // salva no bd    
            } else {
                Cfrentista.getInstancia().modificar(c); // modificar 
                
            }
            
            setVisible(false);
            JOptionPane.showMessageDialog(this, "O Frentista foi salvo com sucesso!");
            
            salvou = true;

        } catch (Exception err) {

            JOptionPane.showMessageDialog(this, err);
        }
    }//GEN-LAST:event_salvarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JTextField senhaTxt;
    // End of variables declaration//GEN-END:variables
}
