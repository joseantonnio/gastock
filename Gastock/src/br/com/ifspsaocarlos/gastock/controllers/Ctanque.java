/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.controllers;

import br.com.ifspsaocarlos.gastock.library.Tanque;
import br.com.ifspsaocarlos.gastock.models.MTanque;
import java.util.List;
import br.com.ifspsaocarlos.gastock.models.ITanque;

/**
 *
 * @author Alex
 */
public class Ctanque {

    private static Ctanque instancia;
    private ITanque dao;

    public Ctanque() {

        dao = new MTanque();

    }

    public static Ctanque getInstancia() {

        if (instancia == null) {

            instancia = new Ctanque();
        }
        return instancia;
    }

    public int adcionar(Tanque tanque) throws Exception {

        validar(tanque);

        return dao.adicionar(tanque);
    }

    public void modificar(Tanque tanque) throws Exception {
        validar(tanque);
        validar(tanque.getTanque());
        dao.modificar(tanque);
    }

    public Tanque get(int tanqueId) throws Exception {
        validar(tanqueId);
        return dao.get(tanqueId);
    }

    public void excluir(int tanqueId) throws Exception {

        validar(tanqueId);
        dao.excluir(tanqueId);
    }

    
    
        public void ModificaQtd(double qtd, int codigo) throws Exception {

        Tanque d = new Tanque();

        try {
            d = this.get(codigo);
        } catch (Exception err) {
            throw new Exception("Não foi possível encontrar o tanque solicitado");
        }

          d.setQuantidade(qtd);

    }
    
    
    
    
    
    
    
    
    
    
    
    public double buscaQuantidade(int codigo) throws Exception {

        Tanque d = new Tanque();

        try {
            d = this.get(codigo);
        } catch (Exception err) {
            throw new Exception("Não foi possível encontrar o tanque solicitado");
        }

        return d.getQuantidade();

    }

    public List<Tanque> listar() throws Exception {
        return dao.listar();
    }

    private void validar(int tanqueId) throws Exception {
        if (tanqueId < 0) {

            throw new Exception("O id do tanque deve ser maior que zero");

        }
    }

    private void validar(Tanque tanque) throws Exception {
        // Verifica se o tanque é nulo
        if (tanque == null) {
            throw new Exception("O tanque é null");
            // Verifica se o combustivel é nome é null    
        } else if (tanque.getCombustivel() == null
                ? true
                : tanque.getCombustivel().isEmpty()) {
            throw new Exception("O combustivel deve ter nome");
            // Verifica se o preço do combustiver for negativo   
        } else if (tanque.getQuantidade() < 0.0) {
            throw new Exception("O tanque deve ter valor maior que zero");
        }
    }

}
