/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.controllers;

/**
 *
 * @author IFSP
 */
public class Bomba {

    private int numero;
    private String senha;
    private Combustivel[] combustivel = new Combustivel[4];
    public boolean autenticado;

    public Bomba(int num, String pass) {

        if (num == 5 && pass.equals("1234")) {
            autenticado = true;  
        } else {
            autenticado = false;
        }
    }

    public String getCombustivel(int num) {
        return this.combustivel[num-1].getNome();
    }
    
    public float getPreco(int num) {
        return this.combustivel[num-1].getPreco();
    }
    
    public void setCombustiveis(){
        this.combustivel[0] = new Combustivel(1,"Gasolina",3.769f);
        this.combustivel[1] = new Combustivel(2,"Gasolina Aditivada",3.899f);
        this.combustivel[2] = new Combustivel(3,"Etanol",2.769f);
        this.combustivel[3] = new Combustivel(4,"Diesel",2.999f);   
    }
}
