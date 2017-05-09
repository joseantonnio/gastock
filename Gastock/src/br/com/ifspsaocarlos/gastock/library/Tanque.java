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

    private double quantidade = 100;
    private Combustivel combustivel;
    private boolean status;

    // Construtor
    public Tanque() {

    }

    // Métodos
    public boolean verificarQuantidade(double qtd) {

        // Verifica se possui a quantidade de combustivel pedida no tanque
        if (qtd > this.quantidade)
            
            // Se não tiver retorna falso
            return false;
        else
            // Se tiver retira do tanque a quantidade
            this.quantidade = this.quantidade - qtd;

        return true;

    }

    // Getters e Setters
    public double getQuantidade() {
        return this.quantidade;
    }

}
