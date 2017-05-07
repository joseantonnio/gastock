
package br.com.ifspsaocarlos.gastock.views.desktop;

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
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        combustivelMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        combustivelBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alex\\Desktop\\icon-combust.png")); // NOI18N
        combustivelBtn.setText("Combustível");
        combustivelBtn.setFocusable(false);
        combustivelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        combustivelBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        combustivelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustivelBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(combustivelBtn);

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

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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
                .addGap(0, 344, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combustivelMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustivelMenuActionPerformed
       
        CombustivelListarDialog dialog = new CombustivelListarDialog(this);
        dialog.setVisible(true);
        dialog.dispose();
        
        dialog = null;
    }//GEN-LAST:event_combustivelMenuActionPerformed

    private void combustivelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustivelBtnActionPerformed
        combustivelMenuActionPerformed(evt);
    }//GEN-LAST:event_combustivelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JButton combustivelBtn;
    private javax.swing.JMenuItem combustivelMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
