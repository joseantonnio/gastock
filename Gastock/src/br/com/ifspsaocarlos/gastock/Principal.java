/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock;

import br.com.ifspsaocarlos.gastock.views.desktop.Login;
import br.com.ifspsaocarlos.gastock.views.embarcado.Painel;
import br.com.ifspsaocarlos.gastock.models.Mongodb;
import javax.swing.JOptionPane;

/**
 *
 * @author José Silva
 */
public class Principal {

    public static void main(String args[]) {
        
        Mongodb banco = new Mongodb();
        

        // Declara verificador de abertura
        boolean abriu = false;
        
        while (!abriu) {

            String opcao = JOptionPane.showInputDialog(null, "Selecione o sistema que deseja utilizar: \n(1) embarcado \n(2) desktop\n", "Escolha uma opção", JOptionPane.QUESTION_MESSAGE);
            
            switch (opcao) {
                case "embarcado":
                case "1":
                    System.out.println("Abrindo sistema embarcado...");
                    Painel embarcado = new Painel();
                    abriu = true;
                    embarcado.setVisible(true);
                    embarcado.toFront();
                    break;

                case "desktop":
                case "2":
                    System.out.println("Abrindo sistema administrativo...");
                    Login desktop = new Login();
                    abriu = true;
                    desktop.setVisible(true);
                    desktop.toFront();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma das opções: (1) embarcado ou (2) desktop!", "Escolha uma opção", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

}
