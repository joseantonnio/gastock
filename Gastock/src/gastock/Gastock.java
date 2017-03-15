package gastock;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Classe Principal
 *
 * @author José Silva
 */
public class Gastock {

    private static JFrame caixa = new JFrame("GASTOK Alpha 0.1");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        caixa.setSize(290, 150);
        caixa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        caixa.add(painel);
        placeComponents(painel);

        caixa.setVisible(true);
        caixa.setLocationRelativeTo(null);
    }

    private static void placeComponents(JPanel painel) {

        painel.setLayout(null);

        JLabel bombaLabel = new JLabel("Bomba");
        bombaLabel.setBounds(10, 10, 80, 25);
        painel.add(bombaLabel);

        JTextField bombaText = new JTextField(20);
        bombaText.setBounds(100, 10, 160, 25);
        painel.add(bombaText);

        JLabel senhaLabel = new JLabel("Senha");
        senhaLabel.setBounds(10, 40, 80, 25);
        painel.add(senhaLabel);

        JPasswordField senhaText = new JPasswordField(20);
        senhaText.setBounds(100, 40, 160, 25);
        painel.add(senhaText);

        JButton liberarButton = new JButton("Liberar");
        liberarButton.setBounds(10, 80, 80, 25);
        painel.add(liberarButton);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.setBounds(160, 80, 100, 25);
        painel.add(cancelarButton);

        liberarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Bomba b = new Bomba(Integer.parseInt(bombaText.getText()), senhaText.getText());
                
                System.out.println(bombaText.getText());
                System.out.println(senhaText.getText());
                
                JOptionPane.showMessageDialog(caixa, b.mensagem);
            }
        });
    }

}
