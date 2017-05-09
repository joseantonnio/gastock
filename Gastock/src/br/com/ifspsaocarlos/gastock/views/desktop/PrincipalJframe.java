
package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.views.splash.BemVindo;
import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class PrincipalJframe extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJframe
     */
    public PrincipalJframe() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }


 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        combustivelBtn = new javax.swing.JButton();
        bombaBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        combustivelMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gastock - Modulo de Gerenciamento");

        jToolBar1.setRollover(true);

        combustivelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icon-combust.png"))); // NOI18N
        combustivelBtn.setFocusable(false);
        combustivelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combustivelBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combustivelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustivelBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(combustivelBtn);

        bombaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/bomba.png"))); // NOI18N
        bombaBtn.setFocusPainted(false);
        bombaBtn.setFocusable(false);
        bombaBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bombaBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(bombaBtn);

        cadastroMenu.setText("Cadastro");

        combustivelMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        combustivelMenu.setText("Combustível");
        combustivelMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustivelMenuActionPerformed(evt);
            }
        });
        cadastroMenu.add(combustivelMenu);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem1.setText("Tanque");
        cadastroMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Bomba");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        cadastroMenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem3.setText("Bico");
        cadastroMenu.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem4.setText("Frentista");
        cadastroMenu.add(jMenuItem4);

        jMenuBar1.add(cadastroMenu);

        jMenu1.setText("Relatórios");
        jMenuBar1.add(jMenu1);

        menuSair.setText("Sair");
        menuSair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 319, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combustivelMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustivelMenuActionPerformed
       
        CombustivelListarDialog dialog = new CombustivelListarDialog(this);
        dialog.setVisible(true);
        dialog.dispose();
        
        dialog = null;
    }//GEN-LAST:event_combustivelMenuActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        this.setVisible(false);        
        BemVindo tela= new BemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuSairMouseClicked

    private void combustivelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustivelBtnActionPerformed
        combustivelMenuActionPerformed(evt);
    }//GEN-LAST:event_combustivelBtnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bombaBtn;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JButton combustivelBtn;
    private javax.swing.JMenuItem combustivelMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
