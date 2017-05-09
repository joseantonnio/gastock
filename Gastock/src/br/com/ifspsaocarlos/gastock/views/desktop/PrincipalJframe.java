
package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.bemVindo.bemVindo;
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

        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        combustivelMenu = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gastock - Modulo de Gerenciamento");

        cadastroMenu.setText("Cadastro");

        combustivelMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        combustivelMenu.setText("Combustível");
        combustivelMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustivelMenuActionPerformed(evt);
            }
        });
        cadastroMenu.add(combustivelMenu);

        jMenuBar1.add(cadastroMenu);

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
            .addGap(0, 546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
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
        bemVindo tela= new bemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuSairMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JMenuItem combustivelMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables
}
