/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.library;

import br.com.ifspsaocarlos.gastock.models.MTanque;
import br.com.ifspsaocarlos.gastock.library.Tanque;

import br.com.ifspsaocarlos.gastock.models.MRelatorio;
import br.com.ifspsaocarlos.gastock.library.Relatorio;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import java.util.List;

/**
 *
 * @author IFSP
 */
public class Bomba {

    private int numero;
    public double abastecido;
    private String senha;
    private Tanque[] combustivel = new Tanque[4];
    public boolean autenticado;
    private Tanque tanque = new Tanque();
    private int codigo;

    private List<Tanque> lista;
    private List<Relatorio> listaRelatorio;

    // Construtor
    public Bomba(int num, String pass) {

        try {
            this.lista = new MTanque().listar();
        } catch (Exception err) {

        }

        try {
            this.listaRelatorio = new MRelatorio().listar();
        } catch (Exception err) {

        }

        if (num == 5 && pass.equals("1234")) {
            autenticado = true;
        } else {
            autenticado = false;
        }
    }

    // Métodos
    public boolean verificaTanque(double qtd, int codCombistivel) {

        Tanque c = lista.get(codCombistivel - 1);

        if (qtd < c.getQuantidade()) {

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
        return this.combustivel[num - 1].getCombustivel();
    }

    public double getPreco(int num) {
        return this.combustivel[num - 1].getPreco();
    }

    public double setAbastecido(double quantidade) {
        return this.abastecido = quantidade;
    }

    public void diminuiQtd(double qtd, int codCombistivel) throws Exception {
        MTanque alteraqtd = new MTanque();
        MRelatorio insertVenda = new MRelatorio();
        Tanque c = lista.get(codCombistivel - 1);
        double qtdTotal = c.getQuantidade() - qtd;

        double valorTotal = qtd * c.getPreco();

        for (int i = 0; i < listaRelatorio.size(); i++) {
            Relatorio r = listaRelatorio.get(i);

            this.codigo = r.getRelatorio();
        }

       
        System.out.println("Data" + getDateTime()+ "Codigo: " + this.codigo + "Combustive: " + c.getCombustivel() + "Quantidade: " + qtd + "Valor total: " + valorTotal);

        insertVenda.adicionarVenda(this.codigo + 1, getDateTime(), c.getCombustivel(), 5, qtd, valorTotal);

        alteraqtd.modificarQuantidade(codCombistivel, qtdTotal);
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void setCombustiveis() {

        for (int i = 0; i < lista.size(); i++) {
            Tanque c = lista.get(i);

            combustivel[i] = new Tanque(c.getTanque(), c.getCombustivel(), c.getQuantidade(), c.getPreco());
        }

    }
}
