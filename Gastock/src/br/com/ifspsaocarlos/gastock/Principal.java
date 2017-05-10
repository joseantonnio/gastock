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

/**
 *
 * @author José Silva
 */
public class Principal {

    static SplashScreen mySplash;
    static Graphics2D splashGraphics;
    static Rectangle2D.Double splashTextArea;
    static Rectangle2D.Double splashProgressArea;
    static Font font;

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

        if (mySplash != null) {

            Dimension ssDim = mySplash.getSize();
            int height = ssDim.height;
            int width = ssDim.width;

            splashTextArea = new Rectangle2D.Double(15., height * 0.88, width * .45, 32.);
            splashProgressArea = new Rectangle2D.Double(width * .55, height * .92, width * .4, 12);

            splashGraphics = mySplash.createGraphics();
            font = new Font("Dialog", Font.PLAIN, 14);
            splashGraphics.setFont(font);

            splashText("Starting");
            splashProgress(0);
        }
    }

    public static void splashText(String str) {

        if (mySplash != null && mySplash.isVisible()) {

            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.fill(splashTextArea);

            splashGraphics.setPaint(Color.BLACK);
            splashGraphics.drawString(str, (int) (splashTextArea.getX() + 10), (int) (splashTextArea.getY() + 15));

            mySplash.update();
        }
    }

    public static void splashProgress(int pct) {

        if (mySplash != null && mySplash.isVisible()) {

            splashGraphics.setPaint(Color.LIGHT_GRAY);
            splashGraphics.fill(splashProgressArea);

            splashGraphics.setPaint(Color.BLUE);
            splashGraphics.draw(splashProgressArea);

            int x = (int) splashProgressArea.getMinX();
            int y = (int) splashProgressArea.getMinY();
            int wid = (int) splashProgressArea.getWidth();
            int hgt = (int) splashProgressArea.getHeight();

            int doneWidth = Math.round(pct * wid / 100.f);
            doneWidth = Math.max(0, Math.min(doneWidth, wid - 1));

            splashGraphics.setPaint(Color.BLUE);
            splashGraphics.fillRect(x, y + 1, doneWidth, hgt - 1);

            mySplash.update();
        }
    }

    private static void appInit() {

        for (int i = 1; i <= 10; i++) {

            int pctDone = i * 10;
            splashText("Carregando #" + i);
            splashProgress(pctDone);

            try {

                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException ex) {

                // ignore it
            }
        }
    }

}
