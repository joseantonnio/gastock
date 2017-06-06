package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.controllers.Ctanque;
import br.com.ifspsaocarlos.gastock.library.Tanque;
import br.com.ifspsaocarlos.gastock.views.splash.BemVindo;
import eu.hansolo.steelseries.tools.LedColor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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

        try {
            lista = new Ctanque().listar();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }

        for (int i = 0; i < lista.size(); i++) {
            jComboBox1.addItem(Integer.toString(lista.get(i).getTanque()));
        }

        new Thread(verificaTanque).start();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        combustivelBtn = new javax.swing.JButton();
        bombaBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        linear2 = new eu.hansolo.steelseries.gauges.Linear();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        combustivelMenu = new javax.swing.JMenuItem();
        TanqueMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        frentistalMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gastock - Modulo de Gerenciamento");
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setAutoscrolls(true);

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

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o tanque: ");

        linear2.setLedBlinking(true);
        linear2.setLedColor(eu.hansolo.steelseries.tools.LedColor.GREEN_LED);
        linear2.setLedVisible(true);
        linear2.setMaxValue(450.0);
        linear2.setThreshold(0.0);
        linear2.setTickLabelPeriod(25);
        linear2.setTitle("Selecione um tanque...");
        linear2.setTrackRange(450.0);
        linear2.setTrackSection(0.0);
        linear2.setTrackStartColor(new java.awt.Color(255, 0, 0));
        linear2.setTrackStopColor(new java.awt.Color(0, 255, 0));
        linear2.setUnitString("Litros x100");

        cadastroMenu.setText("Cadastro");

        combustivelMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        combustivelMenu.setText("Combustível");
        combustivelMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustivelMenuActionPerformed(evt);
            }
        });
        cadastroMenu.add(combustivelMenu);

        TanqueMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        TanqueMenu.setText("Tanque");
        TanqueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanqueMenuActionPerformed(evt);
            }
        });
        cadastroMenu.add(TanqueMenu);

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

        frentistalMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        frentistalMenu.setText("Frentista");
        frentistalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frentistalMenuActionPerformed(evt);
            }
        });
        cadastroMenu.add(frentistalMenu);

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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(linear2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linear2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36))
        );

        getAccessibleContext().setAccessibleName("form");

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
        BemVindo tela = new BemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuSairMouseClicked

    private void combustivelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustivelBtnActionPerformed
        combustivelMenuActionPerformed(evt);
    }//GEN-LAST:event_combustivelBtnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void TanqueMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanqueMenuActionPerformed
        TanqueListarDialog dialog = new TanqueListarDialog(this);
        dialog.setVisible(true);
        dialog.dispose();

        dialog = null;
    }//GEN-LAST:event_TanqueMenuActionPerformed

    private void frentistalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frentistalMenuActionPerformed
        FrentistaListarDialog dialog = new FrentistaListarDialog(this);
        dialog.setVisible(true);
        dialog.dispose();

        dialog = null;
    }//GEN-LAST:event_frentistalMenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private Runnable verificaTanque = new Runnable() {
        public void run() {

            while (true) {

                double tanque = 0.0;
                int id = Integer.parseInt(jComboBox1.getSelectedItem().toString());

                try {
                    tanque = new Ctanque().buscaQuantidade(id) / 100.0;
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, err);
                }

                linear2.setTitle("Tanque #" + Integer.toString(id));
                linear2.setValueAnimated(tanque);

                if (tanque <= 50.0) {
                    linear2.setLedColor(LedColor.RED_LED);
                } else {
                    linear2.setLedColor(LedColor.GREEN_LED);
                }

                try {

                    Thread.sleep(3000);
                } catch (InterruptedException ex) {

                }
            }

        }
    };

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        new Thread(verificaTanque).interrupt();
        new Thread(verificaTanque).start();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void radial4Lcd1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_radial4Lcd1CaretPositionChanged

    }//GEN-LAST:event_radial4Lcd1CaretPositionChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TanqueMenu;
    private javax.swing.JButton bombaBtn;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JButton combustivelBtn;
    private javax.swing.JMenuItem combustivelMenu;
    private javax.swing.JMenuItem frentistalMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar jToolBar1;
    private eu.hansolo.steelseries.gauges.Linear linear2;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

    List<Tanque> lista = new ArrayList<>();
}
