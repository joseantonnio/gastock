/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.library;

/**
 *
 * @author Alex
 */
public class Tanque {

    private int tanque;
    private double quantidade;
    private double preco;
    private String combustivel;
    private boolean status;

    // Construtor
    public Tanque() {

    }

    public Tanque(int tanque, String combustivel, double quantidade, double preco) {
        this.tanque = tanque;
        this.combustivel = combustivel;
        this.quantidade = quantidade;
        this.preco = preco;
       

    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public int getTanque() {
        return this.tanque;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    // Métodos
    public boolean verificarQuantidade(double qtd) {
        
        System.out.println(qtd);
        // Verifica se possui a quantidade de combustivel pedida no tanque
        if (qtd > 10) // Se não tiver retorna falso
        {
            return false;
        } else // Se tiver retira do tanque a quantidade
        {
            this.quantidade = this.quantidade - qtd;
        }

        return true;

    }
}
