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
public class Frentista {

    private int frentista;
    private String nome;
    private String senha;
    private String tipo;
    private double salario;

    public Frentista() {

    }

    public Frentista(int frentista, String nome,  String senha, String tipo, double salario) {
        this.frentista = frentista;
        this.tipo = tipo;
        this.senha = senha;
        this.nome = nome;
        this.salario = salario;
    }

    public void setFrentista(int frentista) {
        this.frentista = frentista;
    }

    public int getFrentista() {
        return this.frentista;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

}
