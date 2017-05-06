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
    public double abastecido;
    private String senha;
    private Combustivel[] combustivel = new Combustivel[4];
    public boolean autenticado;
    private Tanque tanque = new Tanque();

    // Construtor
    public Bomba(int num, String pass) {

        if (num == 5 && pass.equals("1234")) {
            autenticado = true;
        } else {
            autenticado = false;
        }
    }

    // Métodos
    public boolean verificaTanque(double abastecer, int numCombustivel) {
        // Verifica se possui a quantidade no tanque
        if (tanque.verificarQuantidade(abastecido)) {
            return true;
        } else {
            return false;
        }
    }
    
    public double[] abastece(double abastecido, int numCombustivel) {

        // Cria uma array de retorno com as informações
        double[] retorno = new double[3];

        // Verifica se está abastecendo
        boolean abastecendo = true;

        // Faltando 5% para o final, abastece mais devagar    
        if (abastecido <= (0.95 * abastecido)) {
            abastecido += 0.1;
        } else {
            abastecido += 0.01;
        }

        // Define a array de retorno
        retorno[0] = abastecido * this.getPreco(numCombustivel);
        retorno[1] = abastecido;

        // Retorna o resultado
        return retorno;

    }

    // Getters e Setters
    public String getCombustivel(int num) {
        return this.combustivel[num - 1].getNome();
    }

    public double getPreco(int num) {
        return this.combustivel[num - 1].getPreco();
    }

    public double setAbastecido(double quantidade) {
        return this.abastecido = quantidade;
    }

    public void setCombustiveis() {
        this.combustivel[0] = new Combustivel(1, "Gasolina", 3.769);
        this.combustivel[1] = new Combustivel(2, "Gasolina Aditivada", 3.899);
        this.combustivel[2] = new Combustivel(3, "Etanol", 2.769);
        this.combustivel[3] = new Combustivel(4, "Diesel", 2.999);
    }
}
