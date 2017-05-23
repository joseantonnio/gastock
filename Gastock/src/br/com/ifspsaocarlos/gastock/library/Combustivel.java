/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.library;

/**
 *
 * @author valdir.gomes
 */
public class Combustivel {

    private int combustivelId;
    private int combustivel;
    private String nome;
    private double precoL;

    public Combustivel() {

    }

    public Combustivel(int num, String nome, double preco) {
        
        this.combustivel = num;
        this.nome = nome;
        this.precoL = preco;
    }

    public int getCombustivelId() {
        return combustivelId;
    }

    public void setCombustivelId(int num) {
        this.combustivelId = num;
    }

    public void setCombustivel(int num) {
        this.combustivel = num;
    }

    public int getCombustivel() {
        return this.combustivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.precoL = preco;
    }

    public double getPreco() {
        return this.precoL;
    }
}
