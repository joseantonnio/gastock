/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastock;

import java.awt.Font;
import java.text.NumberFormat;

/**
 *
 * @author Vaio
 */
public class Painel extends javax.swing.JFrame {

    private int entrarStatus = 0;
    private Bomba bomba;
    private String numero;
    private String senha;
    private int numCombustivel = -1;

    /**
     * Creates new form Painel
     */
    public Painel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnZero = new javax.swing.JButton();
        btnAsterisco = new javax.swing.JButton();
        btnHashtag = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnAbastecerL = new javax.swing.JButton();
        textBandeira = new javax.swing.JTextField();
        textPreco = new javax.swing.JTextField();
        textLitros = new javax.swing.JTextField();
        textQuantidade = new javax.swing.JTextField();
        labelQuantidade = new javax.swing.JLabel();
        labelLitros = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        textTotal = new javax.swing.JTextField();
        labelTotal = new javax.swing.JLabel();
        btnAbastecerRS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gastock - Sistema Embarcado");
        setLocationByPlatform(true);
        setName("formPainel"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnAsterisco.setText("*");
        btnAsterisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsteriscoActionPerformed(evt);
            }
        });

        btnHashtag.setText("#");

        btnUm.setText("1");
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setText("2");
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnQuatro.setText("4");
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSete.setText("7");
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setText("8");
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setText("9");
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(255, 255, 0));
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(0, 0, 255));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnParar.setBackground(new java.awt.Color(255, 0, 0));
        btnParar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnParar.setForeground(new java.awt.Color(255, 255, 255));
        btnParar.setText("PARAR BOMBA");

        btnAbastecerL.setBackground(new java.awt.Color(0, 255, 0));
        btnAbastecerL.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnAbastecerL.setText("ABASTECER (L)");
        btnAbastecerL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecerLActionPerformed(evt);
            }
        });

        textBandeira.setEditable(false);
        textBandeira.setBackground(new java.awt.Color(0, 0, 0));
        textBandeira.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textBandeira.setForeground(new java.awt.Color(0, 255, 0));
        textBandeira.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textBandeira.setText("PRESSIONE \"ENTRAR\"");

        textPreco.setEditable(false);
        textPreco.setBackground(new java.awt.Color(0, 0, 0));
        textPreco.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        textPreco.setForeground(new java.awt.Color(255, 255, 255));
        textPreco.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textPreco.setText("3,766");

        textLitros.setEditable(false);
        textLitros.setBackground(new java.awt.Color(0, 0, 0));
        textLitros.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        textLitros.setForeground(new java.awt.Color(255, 255, 255));
        textLitros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textLitros.setText("0,00");

        textQuantidade.setEditable(false);
        textQuantidade.setBackground(new java.awt.Color(0, 0, 0));
        textQuantidade.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        textQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        textQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textQuantidade.setText("0");

        labelQuantidade.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelQuantidade.setText("QUANTIDADE");

        labelLitros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelLitros.setText("LITROS");

        labelPreco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPreco.setText("PREÇO LITRO");

        textTotal.setEditable(false);
        textTotal.setBackground(new java.awt.Color(0, 0, 0));
        textTotal.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        textTotal.setForeground(new java.awt.Color(255, 255, 255));
        textTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textTotal.setText("0,00");
        textTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTotalActionPerformed(evt);
            }
        });

        labelTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTotal.setText("TOTAL A PAGAR");

        btnAbastecerRS.setBackground(new java.awt.Color(0, 255, 0));
        btnAbastecerRS.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnAbastecerRS.setText("ABASTECER (R$)");
        btnAbastecerRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbastecerRSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textBandeira, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(labelPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelLitros)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAsterisco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEntrar))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAbastecerL, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAbastecerRS, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(labelQuantidade)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTotal)
                                    .addComponent(textLitros, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTotal)
                                .addGap(28, 28, 28)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textPreco)
                    .addComponent(textLitros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(labelLitros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelQuantidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotal)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbastecerL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbastecerRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsterisco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHashtag, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setNumCombustivel(int num){
        this.numCombustivel = num;
    }
    
    public int getNumCombustivel(){
        return this.numCombustivel;
    }
    
    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        btnPress("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        switch (entrarStatus) {
            case 0:
                textBandeira.setText("INSIRA O NÚMERO DA BOMBA");
                entrarStatus = 1;
                break;

            case 1:
                numero = textQuantidade.getText();
                textQuantidade.setText("0");
                textBandeira.setText("DIGITE A SENHA DA BOMBA");
                entrarStatus = 2;
                break;

            case 2:
                senha = textQuantidade.getText();
                textQuantidade.setText("0");
                textBandeira.setText("AUTENTICANDO...");
                bomba = new Bomba(Integer.parseInt(numero), senha);
                if (bomba.autenticado) {
                    entrarStatus = 3;
                    textBandeira.setFont(new Font("Arial", Font.PLAIN, 20));
                    textBandeira.setText("ESCOLHA O COMBUSTÍVEL (1, 2, 3 OU 4)");
                } else {
                    entrarStatus = 0;
                    textBandeira.setText("DADOS INCORRETOS");
                }
                break;

            case 3:
                
                this.numCombustivel = (Integer.parseInt(textQuantidade.getText()));
                if (this.numCombustivel > 0 && this.numCombustivel < 5){                
                    bomba.setCombustiveis();
                    textBandeira.setText(bomba.getCombustivel(this.numCombustivel));
                    textPreco.setText(String.valueOf(bomba.getPreco(this.numCombustivel)));
                    textQuantidade.setText("0");
                    entrarStatus = 4;
                }
                else{
                    entrarStatus = 3;
                    textBandeira.setText("(1, 2, 3 OU 4)");
                }
                break;

            case 4:
                break;

            default:
                numero = null;
                senha = null;
                entrarStatus = 0;
                textBandeira.setText("PRESSIONE \"ENTRAR\"");
                break;

        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnAsteriscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsteriscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsteriscoActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        btnPress("0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        btnPress("1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        btnPress("2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        btnPress("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        btnPress("4");
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        btnPress("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        btnPress("7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        btnPress("8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        btnPress("9");
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        textQuantidade.setText("0");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAbastecerLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecerLActionPerformed
        if (numCombustivel == -1){
            textBandeira.setText("POR FAVOR ENTRE");
        }
        else{
            new Thread(abastecendoL).start();
        }
    }//GEN-LAST:event_btnAbastecerLActionPerformed

    private void btnAbastecerRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbastecerRSActionPerformed
        if (numCombustivel == -1){
            textBandeira.setText("POR FAVOR ENTRE");
        }
        else{
            new Thread(abastecendoRS).start();
        }
    }//GEN-LAST:event_btnAbastecerRSActionPerformed

    private void textTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTotalActionPerformed

    private Runnable abastecendoL = new Runnable() {
        public void run() {

            float litros = 0;
            float quantidade = strToFloat(textQuantidade.getText());
            float preco = bomba.getPreco(getNumCombustivel());

            while (litros < quantidade) {

                litros += 0.01;
                NumberFormat total = NumberFormat.getInstance();
                NumberFormat total_litros = NumberFormat.getInstance();
                textTotal.setText(total.format(litros * preco));
                textLitros.setText(total_litros.format(litros));
            }
        }
    };

    private Runnable abastecendoRS = new Runnable() {
        public void run() {

            float litros = 0;
            float quantidade = strToFloat(textQuantidade.getText());
            float preco = strToFloat(textPreco.getText());
            float preco_total = strToFloat(textTotal.getText());
            
            while (preco_total < quantidade) {
                
                litros += 0.01;
                
                NumberFormat total = NumberFormat.getInstance();
                NumberFormat total_litros = NumberFormat.getInstance();
                
                preco_total = litros * preco;
                
                textTotal.setText(total.format(litros * preco));
                textLitros.setText(total_litros.format(litros));
                
            }
        }
    };

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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }
    
    private float strToFloat(String valor){
        
        valor = valor.replace(".", "");
        valor = valor.replace(",", ".");
        
        return Float.parseFloat(valor);
    }

    private void btnPress(String valor) {

        if (textQuantidade.getText().length() < 7) {

            if (textQuantidade.getText().equals("0")) {
                textQuantidade.setText(valor);
            } else {
                textQuantidade.setText(textQuantidade.getText() + valor);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbastecerL;
    private javax.swing.JButton btnAbastecerRS;
    private javax.swing.JButton btnAsterisco;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnHashtag;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel labelLitros;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQuantidade;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextField textBandeira;
    private javax.swing.JTextField textLitros;
    private javax.swing.JTextField textPreco;
    private javax.swing.JTextField textQuantidade;
    private javax.swing.JTextField textTotal;
    // End of variables declaration//GEN-END:variables
}
