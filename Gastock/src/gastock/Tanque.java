/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastock;

/**
 *
 * @author Alex
 */
public class Tanque {
    
    private double quantidade = 1000;
    private Combustivel combustivel;
    private boolean status;
    
public boolean verificarQuantidade(double qtd){
    
   this.quantidade = this.quantidade - qtd;
   
   if (this.quantidade <= 100){
       
       //System.out.println("Nivel de estoque baixo");
       return status = false;
   }
   
   return status = true;
   
}
    
}
