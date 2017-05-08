
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.views.desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.Timer;

public class ClockLabel extends JLabel implements ActionListener {

  public ClockLabel() {
    Timer t = new Timer(1000, this);
    t.start();
    setText(getDateTime());
  }

  private String getDateTime() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEEE  dd/MM/yyyy HH:mm:ss"));
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    setText(getDateTime());
  }
}