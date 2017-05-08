/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.bemVindo;

import br.com.ifspsaocarlos.gastock.views.desktop.Login;
import br.com.ifspsaocarlos.gastock.views.embarcado.Painel;
import br.com.ifspsaocarlos.gastock.views.desktop.ClockLabel;
/**
 *
 * @author Dias
 */
public class bemVindo extends javax.swing.JFrame {

    /**
     * Creates new form bemVindo
     */
    public bemVindo() {
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

        labelEscolha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonVendas = new javax.swing.JButton();
        buttonGerenciamento = new javax.swing.JButton();
        labelHora = new ClockLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));

        labelEscolha.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        labelEscolha.setText("Escolha o Módulo");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/Logo.png"))); // NOI18N

        buttonVendas.setBackground(new java.awt.Color(0, 153, 0));
        buttonVendas.setForeground(new java.awt.Color(255, 255, 255));
        buttonVendas.setText("Módulo Vendas");
        buttonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVendasActionPerformed(evt);
            }
        });

        buttonGerenciamento.setBackground(new java.awt.Color(255, 0, 0));
        buttonGerenciamento.setForeground(new java.awt.Color(255, 255, 255));
        buttonGerenciamento.setText("Módulo de Gerenciamento");
        buttonGerenciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerenciamentoActionPerformed(evt);
            }
        });

        labelHora.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 0, 0));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(buttonGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(labelEscolha)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEscolha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(buttonGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVendasActionPerformed
        Painel embarcado = new Painel();
        embarcado.setVisible(true);
        embarcado.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_buttonVendasActionPerformed

    private void buttonGerenciamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciamentoActionPerformed
        Login desktop = new Login();
        desktop.setVisible(true);
        desktop.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_buttonGerenciamentoActionPerformed

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
            java.util.logging.Logger.getLogger(bemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bemVindo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bemVindo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerenciamento;
    private javax.swing.JButton buttonVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelEscolha;
    private javax.swing.JLabel labelHora;
    // End of variables declaration//GEN-END:variables
}
