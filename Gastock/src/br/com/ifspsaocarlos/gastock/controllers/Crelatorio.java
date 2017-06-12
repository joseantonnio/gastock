/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.controllers;

import br.com.ifspsaocarlos.gastock.library.Relatorio;
import br.com.ifspsaocarlos.gastock.models.MRelatorio;
import java.util.List;
import br.com.ifspsaocarlos.gastock.models.IRelatorio;

/**
 *
 * @author Alex
 */
public class Crelatorio {

    private static Crelatorio instancia;
    private IRelatorio dao;

    public Crelatorio() {

        dao = new MRelatorio();

    }

    public static Crelatorio getInstancia() {

        if (instancia == null) {

            instancia = new Crelatorio();
        }
        return instancia;
    }

    public int adcionar(Relatorio relatorio) throws Exception {

        validar(relatorio);

        return dao.adicionar(relatorio);
    }

    public void modificar(Relatorio relatorio) throws Exception {
        validar(relatorio);
        validar(relatorio.getRelatorio());
        dao.modificar(relatorio);
    }

    public Relatorio get(int relatorioId) throws Exception {
        validar(relatorioId);
        return dao.get(relatorioId);
    }

    public void excluir(int relatorioId) throws Exception {

        validar(relatorioId);
        dao.excluir(relatorioId);
    }

 
    public List<Relatorio> listar() throws Exception {
        return dao.listar();
    }

    private void validar(int relatorioId) throws Exception {
        if (relatorioId < 0) {

            throw new Exception("O id do tanque deve ser maior que zero");

        }
    }

    private void validar(Relatorio relatorio) throws Exception {
        // Verifica se o tanque é nulo
        if (relatorio == null) {
            throw new Exception("O tanque é null");
            // Verifica se o combustivel é nome é null    
        } else if (relatorio.getCombustivel() == null
                ? true
                : relatorio.getCombustivel().isEmpty()) {
            throw new Exception("O combustivel deve ter nome");
            // Verifica se o preço do combustiver for negativo   
        } else if (relatorio.getQuantidade() < 0.0) {
            throw new Exception("O tanque deve ter valor maior que zero");
        }
    }

}
