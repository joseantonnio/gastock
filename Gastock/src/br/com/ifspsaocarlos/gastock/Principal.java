/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock;

import java.util.Scanner;
import br.com.ifspsaocarlos.gastock.views.desktop.Login;
import br.com.ifspsaocarlos.gastock.views.embarcado.Painel;
import br.com.ifspsaocarlos.gastock.views.splash.BemVindo;

/**
 *
 * @author José Silva
 */
public class Principal {

    public static void main(String args[]) {

        //Abertura por GUI
        BemVindo tela = new BemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        /*
        // Declara verificador de abertura
        boolean abriu = false;

        // Declara variavel de leitura
        Scanner in = new Scanner(System.in);

        while (!abriu) {

            System.out.println("Qual solução deseja executar? (embarcado|desktop)");
            String opcao = in.next();

            switch (opcao) {
                case "embarcado":
                case "1":
                    System.out.println("Abrindo sistema embarcado...");
                    Painel embarcado = new Painel();
                    abriu = true;
                    embarcado.setVisible(true);
                    break;

                case "desktop":
                case "2":
                    System.out.println("Abrindo sistema administrativo...");
                    Login desktop = new Login();
                    abriu = true;
                    desktop.setVisible(true);
                    break;

                default:
                    System.out.println("Escolha uma das opções: embarcado (1) ou desktop (2).");
                    break;
            }
        }*/
    }

}
