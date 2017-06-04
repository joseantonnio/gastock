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
    private String combustivel;
    private boolean status;

    // Construtor
    public Tanque() {

    }

    public Tanque(int tanque, String combustivel, double quantidade, boolean status) {
        this.tanque = tanque;
        this.combustivel = combustivel;
        this.quantidade = quantidade;
        this.status = status;

    }

    public void setTanqueId(int tanque) {
        this.tanque = tanque;
    }

    public int getTanqueId() {
        return this.tanque;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
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

        // Verifica se possui a quantidade de combustivel pedida no tanque
        if (qtd > this.quantidade) // Se não tiver retorna falso
        {
            return false;
        } else // Se tiver retira do tanque a quantidade
        {
            this.quantidade = this.quantidade - qtd;
        }

        return true;

    }
}
