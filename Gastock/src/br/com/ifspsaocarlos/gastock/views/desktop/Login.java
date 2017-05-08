/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Frentista;
import br.com.ifspsaocarlos.gastock.controllers.Gerente;
import com.sun.glass.events.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import br.com.ifspsaocarlos.gastock.bemVindo.bemVindo;

/**
 *
 * @author Alex
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form sistema
     */
     
    
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        labelHora = new ClockLabel();
        labelLogin = new javax.swing.JLabel();
        textLogin = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        imagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autenticação - Gastock");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(480, 390));
        setMinimumSize(new java.awt.Dimension(480, 390));
        setUndecorated(true);
        setPreferredSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(480, 390));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(null);

        jLabel1.setText("Unidade São Carlos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 110, 230, 16);

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(270, 320, 120, 50);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(100, 320, 120, 50);

        labelHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 0, 0));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText(getDateTime());
        labelHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelHora);
        labelHora.setBounds(70, 170, 340, 20);

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("Login");
        getContentPane().add(labelLogin);
        labelLogin.setBounds(40, 220, 60, 22);

        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        getContentPane().add(textLogin);
        textLogin.setBounds(40, 250, 180, 30);

        labelSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha");
        getContentPane().add(labelSenha);
        labelSenha.setBounds(270, 220, 100, 22);

        textSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textSenhaFocusGained(evt);
            }
        });
        textSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(textSenha);
        textSenha.setBounds(270, 250, 180, 30);

        imagemFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/fundo.png"))); // NOI18N
        imagemFundo.setAlignmentY(0.0F);
        imagemFundo.setMaximumSize(new java.awt.Dimension(480, 390));
        imagemFundo.setMinimumSize(new java.awt.Dimension(480, 390));
        imagemFundo.setPreferredSize(new java.awt.Dimension(480, 390));
        getContentPane().add(imagemFundo);
        imagemFundo.setBounds(0, 0, 480, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {                                         

        Frentista[] f = new Frentista[3];
        f[0] = new Frentista("Geraldo","1234",1000.01f);
        f[1] = new Frentista("Agnalda","1234",2000.01f);
        f[2] = new Frentista("Robertina","1234",2000.01f);
        
        Gerente[] g = new Gerente[1];
        g[0] = new Gerente();
        g[0].setNome("admin");
        g[0].setSalario(9999.99f);
        g[0].setSenha("admin");
        
        Gerente user = null;
        
        for (Gerente ger : g){
            if (textLogin.getText().equals(ger.getNome()) && textSenha.getText().equals(ger.getSenha())) {
                this.dispose();
                JOptionPane.showMessageDialog(null, "Bem vindo");
                user = ger;
                /*Create and display form*/
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
             new PrincipalJframe().setVisible(true);   
            }
        });
            this.dispose();
            }
        }
        if (user == null){
            this.setVisible(false);
             JOptionPane.showMessageDialog(null, "Acesso Negado");
             this.setVisible(true);
        }
            
        
        
    }
    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLoginActionPerformed

    private void textSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusGained
        textSenha.setText("");
    }//GEN-LAST:event_textSenhaFocusGained

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        bemVindo tela = new bemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSairActionPerformed

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           btnEntrar.doClick();
       }
    }//GEN-LAST:event_textSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTextField textLogin;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables

    private String getDateTime() {
         return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
