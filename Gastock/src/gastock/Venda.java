/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastock;
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class Venda {

    private Bomba bomba;
    private Bico bico;
    private Frentista frentista;
    private Tanque combustivel;
    private double valorTotal;
    private Instant instante;
    ArrayList<Venda> arrayVendas = new ArrayList<Venda>();

    public void setBomba(Bomba bomba){
    this.bomba=bomba;
    }
    public Bomba getBomba(){
    return this.bomba;
    }
    public void setBico(Bico bico){
        this.bico=bico;
    }
    public Bico getBico(){
        return this.bico;
    }
    public void setFrentista(Frentista frentista){
        this.frentista=frentista;
    }
    public Frentista getFrentista(){
        return this.frentista;
    }
    public void setTanque(Tanque combustivel){
        this.combustivel=combustivel;
    }
    public Tanque getTanque(){
        return this.combustivel;
    }
    public void setValorTotal(double valorTotal){
        this.valorTotal=valorTotal;
    }
    public double getValorTotal(){
        return this.valorTotal;
    }
    public void setInstante(Instant instante){
        this.instante=instante;
    }
    public Instant getInstante(){
        return this.instante;
    }
   
    public Venda(){}
    
    public Venda(Bomba bomba,Bico bico,Frentista frentista,Tanque tanque,double valorTotal,Instant instante){
        this.bomba=bomba;
        this.bico=bico;
        this.combustivel=tanque;
        this.frentista=frentista;
        this.instante=instante;
        this.valorTotal=valorTotal;
        
    }
    public void efetuarVenda() {
      try{
           if(combustivel!=null){
               Venda venda= new Venda(getBomba(),getBico(),getFrentista(),getTanque(),getValorTotal(),getInstante());
               arrayVendas.add(venda);
           }
          
      }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, "Combustível não computado.");
       }
  }  
    
}
