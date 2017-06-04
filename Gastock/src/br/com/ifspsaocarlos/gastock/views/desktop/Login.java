/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.library.Frentista;
import br.com.ifspsaocarlos.gastock.library.Gerente;
import com.sun.glass.events.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import br.com.ifspsaocarlos.gastock.views.splash.BemVindo;
import java.awt.Image;
import javax.swing.ImageIcon;

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

        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        labelHora = new ClockLabel();
        textLogin = new javax.swing.JTextField();
        textSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autenticação - Gastock");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(480, 390));
        setMinimumSize(new java.awt.Dimension(480, 390));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 667));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 667));
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(logo);
        logo.setBounds(330, 70, 350, 125);
        logo.getAccessibleContext().setAccessibleName("logo");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icons/dark/appbar.user.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 220, 76, 76);
        jLabel1.getAccessibleContext().setAccessibleName("iconeUsuario");

        btnEntrar.setBackground(new java.awt.Color(0, 119, 192));
        btnEntrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(310, 430, 390, 50);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icons/dark/appbar.close.png"))); // NOI18N
        btnSair.setBorderPainted(false);
        btnSair.setContentAreaFilled(false);
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icons/light/appbar.close.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(950, 0, 50, 50);

        labelHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelHora.setForeground(new java.awt.Color(0, 119, 192));
        labelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHora.setText(getDateTime());
        labelHora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labelHora);
        labelHora.setBounds(290, 580, 430, 20);

        textLogin.setText("Usuário");
        textLogin.setToolTipText("Usuário");
        textLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textLoginFocusGained(evt);
            }
        });
        textLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLoginActionPerformed(evt);
            }
        });
        getContentPane().add(textLogin);
        textLogin.setBounds(310, 300, 390, 30);

        textSenha.setText("Senha");
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
        textSenha.setBounds(310, 350, 390, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {

        Frentista[] f = new Frentista[3];
        f[0] = new Frentista(1,"Geraldo", "1234", 1000.01f);
        f[1] = new Frentista(2,"Agnalda", "1234", 2000.01f);
        f[2] = new Frentista(3,"Robertina", "1234", 2000.01f);

        Gerente[] g = new Gerente[1];
        g[0] = new Gerente();
        g[0].setNome("admin");
        g[0].setSalario(9999.99f);
        g[0].setSenha("admin");

        Gerente user = null;

        for (Gerente ger : g) {
            if (textLogin.getText().equals(ger.getNome()) && textSenha.getText().equals(ger.getSenha())) {
                this.dispose();
                //JOptionPane.showMessageDialog(null, "Bem vindo");
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
        if (user == null) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Acesso Negado");
            this.setVisible(true);
        }

    }
    private void textLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLoginActionPerformed
    }//GEN-LAST:event_textLoginActionPerformed

    private void textSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textSenhaFocusGained
        textSenha.setText("");
    }//GEN-LAST:event_textSenhaFocusGained

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        BemVindo tela = new BemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSairActionPerformed

    private void textSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_textSenhaKeyPressed

    private void textLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textLoginFocusGained

        String teste = textLogin.getText();

        if (teste.equals("Usuário")) {
            textLogin.setText("");
        }
    }//GEN-LAST:event_textLoginFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon imageIcon = new ImageIcon("src/br/com/ifspsaocarlos/gastock/images/logo2.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(350, 125, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        
        logo.setIcon(imageIcon);
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelHora;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField textLogin;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables

    private String getDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
