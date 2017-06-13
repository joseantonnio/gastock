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
public class Relatorio {

    private int relatorio;
    private String combustivel;
    private String dataAtual;
    private int bomba;
    private double quantidade;
    private double precoTotal;

    // Construtor
    public Relatorio() {

    }

    public Relatorio(int relatorio, String dataAtual, String combustivel, int bomba, double quantidade, double precoTotal) {
        this.relatorio = relatorio;
        this.dataAtual = dataAtual;
        this.combustivel = combustivel;
        this.bomba = bomba;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;

    }

    public void setRelatorio(int relatorio) {
        this.relatorio = relatorio;
    }

    public int getRelatorio() {
        return this.relatorio;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getPrecoTotal() {
        return this.precoTotal;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public void setDataAtual(String dataAtual) {
        this.dataAtual = dataAtual;
    }

    public String getDataAtual() {
        return this.dataAtual;
    }

    public void setBomba(int bomba) {
        this.precoTotal = precoTotal;
    }

    public int getBomba() {
        return this.bomba;
    }

}
