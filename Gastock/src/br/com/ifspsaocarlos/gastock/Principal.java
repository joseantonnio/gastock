/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock;

import br.com.ifspsaocarlos.gastock.views.splash.BemVindo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author José Silva
 */
public class Principal {

    static SplashScreen mySplash;
    static BufferedImage imagem;
    static Graphics2D splashGraphics;
    static Rectangle2D.Double splashTextArea;
    static Rectangle2D.Double splashProgressArea;
    static Font font;
    static Color transparente = new Color(255, 255, 255, 0);
    static Color branco = new Color(255, 255, 255);
    static Color azul = new Color(0, 119, 192);
    static Color amarelo = new Color(255, 213, 27);

    public static void main(String args[]) {

        splashInit();
        appInit();

        if (mySplash != null) {

            mySplash.close();
        }

        //Abertura por GUI
        BemVindo tela = new BemVindo();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }

    private static void splashInit() {

        mySplash = SplashScreen.getSplashScreen();
        
        try {
            imagem = imagem = ImageIO.read(new File("src/br/com/ifspsaocarlos/gastock/images/gordinho-splash.png"));
        } catch (IOException e) {
        }

        if (mySplash != null) {

            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;

            splashTextArea = new Rectangle2D.Double(15, 16, 340, 19);
            splashProgressArea = new Rectangle2D.Double(130, 340, 340, 12);

            splashGraphics = mySplash.createGraphics();
            font = new Font("default", Font.BOLD, 14);
            splashGraphics.setFont(font);

            splashText("Iniciando...");
            splashProgress(0);
        }
    }

    public static void splashText(String str) {

        if (mySplash != null && mySplash.isVisible()) {

            splashGraphics.drawImage(imagem.getSubimage(0, 0, 450, 50), 0, 0, null);
            splashGraphics.setPaint(amarelo);
            splashGraphics.drawString(str, (int) (splashTextArea.getX()), 30);

            mySplash.update();
        }
    }

    public static void splashProgress(int pct) {

        if (mySplash != null && mySplash.isVisible()) {

            splashGraphics.setPaint(transparente);
            splashGraphics.fill(splashProgressArea);

            splashGraphics.setPaint(amarelo);
            splashGraphics.draw(splashProgressArea);

            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();

            int doneWidth = Math.round(pct * wid / 100.f);
            doneWidth = Math.max(0, Math.min(doneWidth, wid - 1));

            splashGraphics.setPaint(amarelo);
            splashGraphics.fillRect(x, y + 1, doneWidth, hgt - 1);

            mySplash.update();
        }
    }

    private static void appInit() {

        for (int i = 0; i <= 5; i++) {

            int pctDone = i * 20;
            
            switch (i){
                case 0:
                    splashText("Inicializando componentes básicos.");
                    break;
                case 1:
                    splashText("Verificando conexão com AWS.");
                    break;
                case 2:
                    splashText("Testando integridade do banco de dados.");
                    break;
                case 3:
                    splashText("Verificando chave do produto.");
                    break;
                case 4:
                    splashText("Iniciando sistema...");
            }
            splashProgress(pctDone);

            try {

                Thread.sleep((long) (Math.random() * 200));
            } catch (InterruptedException ex) {

                // ignore it
            }
        }
    }

}
