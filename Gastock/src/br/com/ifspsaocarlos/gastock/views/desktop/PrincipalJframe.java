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
        this.verificaTanque = new Runnable() {
            public void run() {
                
                while (true) {
                    
                    double tanque1 = 0.0;
                    double tanque2 = 0.0;
                    double tanque3 = 0.0;
                    double tanque4 = 0.0;
                    //int id = Integer.parseInt(jComboBox1.getSelectedItem().toString());
                    
                    try {
                        tanque1 = new Ctanque().buscaQuantidade(1) / 100;
                        tanque2 = new Ctanque().buscaQuantidade(2) / 100;
                        tanque3 = new Ctanque().buscaQuantidade(3) / 100;
                        tanque4 = new Ctanque().buscaQuantidade(4) / 100;
                    } catch (Exception err) {
                        JOptionPane.showMessageDialog(null, err);
                    }
                    
                    nivel1.setTitle("Tanque #" + Integer.toString(1));
                    nivel1.setValueAnimated(tanque1);
                    
                    nivel2.setTitle("Tanque #" + Integer.toString(2));
                    nivel2.setValueAnimated(tanque2);
                    
                    nivel3.setTitle("Tanque #" + Integer.toString(3));
                    nivel3.setValueAnimated(tanque3);
                    
                    nivel4.setTitle("Tanque #" + Integer.toString(4));
                    nivel4.setValueAnimated(tanque4);
                    
                    if (tanque1 <= 10.0) {
                        nivel1.setLedColor(LedColor.RED_LED);
                    } else {
                        nivel1.setLedColor(LedColor.GREEN_LED);
                    }
                    if (tanque2 <= 10.0) {
                        nivel2.setLedColor(LedColor.RED_LED);
                        
                    } else {
                        nivel2.setLedColor(LedColor.GREEN_LED);
                    }
                    
                    if (tanque3 <= 10.0) {
                        nivel3.setLedColor(LedColor.RED_LED);
                        
                    } else {
                        nivel3.setLedColor(LedColor.GREEN_LED);
                    }
                    
                    if (tanque4 <= 10.0) {
                        nivel3.setLedColor(LedColor.RED_LED);
                        
                    } else {
                        nivel4.setLedColor(LedColor.GREEN_LED);
                    }
                    try {
                        
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
                
            }
        };
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

//        try {
//            lista = new Ctanque().listar();
//        } catch (Exception err) {
//            JOptionPane.showMessageDialog(null, err);
//        }
//
//        for (int i = 0; i < lista.size(); i++) {
//            jComboBox1.addItem(Integer.toString(lista.get(i).getTanque()));
//        }

        new Thread(verificaTanque).start();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        combustivelBtn = new javax.swing.JButton();
        btnFrentista = new javax.swing.JButton();
        btnTanque = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        nivel1 = new eu.hansolo.steelseries.gauges.Linear();
        nivel2 = new eu.hansolo.steelseries.gauges.Linear();
        nivel3 = new eu.hansolo.steelseries.gauges.Linear();
        nivel4 = new eu.hansolo.steelseries.gauges.Linear();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastroMenu = new javax.swing.JMenu();
        combustivelMenu = new javax.swing.JMenuItem();
        TanqueMenu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        frentistalMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        VendasMenu = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gastock - Modulo de Gerenciamento");
        setPreferredSize(new java.awt.Dimension(900, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setAutoscrolls(true);

        combustivelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/icon-combust.png"))); // NOI18N
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

        btnFrentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/frentista.png"))); // NOI18N
        btnFrentista.setText("Frentista");
        btnFrentista.setFocusable(false);
        btnFrentista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrentista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFrentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrentistaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFrentista);

        btnTanque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/tanque.png"))); // NOI18N
        btnTanque.setText("Tanque");
        btnTanque.setFocusable(false);
        btnTanque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTanque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTanque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanqueActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTanque);

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifspsaocarlos/gastock/images/relatorio.png"))); // NOI18N
        btnRelatorio.setText("Relatório");
        btnRelatorio.setFocusable(false);
        btnRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRelatorio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRelatorio);

        nivel1.setLedBlinking(true);
        nivel1.setLedColor(eu.hansolo.steelseries.tools.LedColor.GREEN_LED);
        nivel1.setMaxValue(450.0);
        nivel1.setThreshold(0.0);
        nivel1.setTickLabelPeriod(25);
        nivel1.setTitle("Selecione um tanque...");
        nivel1.setTrackRange(450.0);
        nivel1.setTrackSection(0.0);
        nivel1.setTrackStartColor(new java.awt.Color(255, 0, 0));
        nivel1.setTrackStopColor(new java.awt.Color(0, 255, 0));
        nivel1.setUnitString("Litros x100");

        nivel2.setLedBlinking(true);
        nivel2.setLedColor(eu.hansolo.steelseries.tools.LedColor.GREEN_LED);
        nivel2.setMaxValue(450.0);
        nivel2.setThreshold(0.0);
        nivel2.setTickLabelPeriod(25);
        nivel2.setTitle("Selecione um tanque...");
        nivel2.setTrackRange(450.0);
        nivel2.setTrackSection(0.0);
        nivel2.setTrackStartColor(new java.awt.Color(255, 0, 0));
        nivel2.setTrackStopColor(new java.awt.Color(0, 255, 0));
        nivel2.setUnitString("Litros x100");

        nivel3.setLedBlinking(true);
        nivel3.setLedColor(eu.hansolo.steelseries.tools.LedColor.GREEN_LED);
        nivel3.setMaxValue(450.0);
        nivel3.setThreshold(0.0);
        nivel3.setTickLabelPeriod(25);
        nivel3.setTitle("Selecione um tanque...");
        nivel3.setTrackRange(450.0);
        nivel3.setTrackSection(0.0);
        nivel3.setTrackStartColor(new java.awt.Color(255, 0, 0));
        nivel3.setTrackStopColor(new java.awt.Color(0, 255, 0));
        nivel3.setUnitString("Litros x100");

        nivel4.setLedBlinking(true);
        nivel4.setLedColor(eu.hansolo.steelseries.tools.LedColor.GREEN_LED);
        nivel4.setMaxValue(450.0);
        nivel4.setThreshold(0.0);
        nivel4.setTickLabelPeriod(25);
        nivel4.setTitle("Selecione um tanque...");
        nivel4.setTrackRange(450.0);
        nivel4.setTrackSection(0.0);
        nivel4.setTrackStartColor(new java.awt.Color(255, 0, 0));
        nivel4.setTrackStopColor(new java.awt.Color(0, 255, 0));
        nivel4.setUnitString("Litros x100");

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

        VendasMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        VendasMenu.setText("Vendas");
        VendasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasMenuActionPerformed(evt);
            }
        });
        jMenu1.add(VendasMenu);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(nivel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nivel2, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addComponent(nivel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nivel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nivel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private Runnable verificaTanque;

    private void radial4Lcd1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_radial4Lcd1CaretPositionChanged

    }//GEN-LAST:event_radial4Lcd1CaretPositionChanged

    private void VendasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasMenuActionPerformed
        RelatorioListarDialog dialog = new RelatorioListarDialog(this);
        dialog.setVisible(true);
        dialog.dispose();

        dialog = null;
    }//GEN-LAST:event_VendasMenuActionPerformed

    private void btnFrentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrentistaActionPerformed
        frentistalMenuActionPerformed(evt);
    }//GEN-LAST:event_btnFrentistaActionPerformed

    private void btnTanqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanqueActionPerformed
       TanqueMenuActionPerformed(evt);
    }//GEN-LAST:event_btnTanqueActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        VendasMenuActionPerformed(evt);
    }//GEN-LAST:event_btnRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TanqueMenu;
    private javax.swing.JMenuItem VendasMenu;
    private javax.swing.JButton btnFrentista;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnTanque;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JButton combustivelBtn;
    private javax.swing.JMenuItem combustivelMenu;
    private javax.swing.JMenuItem frentistalMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu menuSair;
    private eu.hansolo.steelseries.gauges.Linear nivel1;
    private eu.hansolo.steelseries.gauges.Linear nivel2;
    private eu.hansolo.steelseries.gauges.Linear nivel3;
    private eu.hansolo.steelseries.gauges.Linear nivel4;
    // End of variables declaration//GEN-END:variables

    List<Tanque> lista = new ArrayList<>();
}
