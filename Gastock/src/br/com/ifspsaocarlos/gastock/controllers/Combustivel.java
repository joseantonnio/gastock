/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.controllers;

/**
 *
 * @author valdir.gomes
 */
public class Combustivel {
    private int combustivel;
    private String nome;
    private float precoL;
    
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
    
    public void setPreco(float preco) {
        this.precoL = preco;
    }
    
    public float getPreco() {
        return this.precoL;
    }
    
    public Combustivel(int num, String nome, float preco) {
        this.combustivel = num;
        this.nome = nome;
        this.precoL = preco;        
    }   
}
