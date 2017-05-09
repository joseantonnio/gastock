/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.controllers;

import br.com.ifspsaocarlos.gastock.library.Combustivel;
import br.com.ifspsaocarlos.gastock.models.MCombustivel;
import java.util.List;
import br.com.ifspsaocarlos.gastock.models.ICombustivel;

/**
 *
 * @author Alex
 */
public class Ccombustivel {
    
    private static Ccombustivel instancia;
    private ICombustivel dao;

    private Ccombustivel() {

        dao = new MCombustivel();

    }

    public static Ccombustivel getInstancia(){
        
        if( instancia == null){
          
            instancia = new Ccombustivel();
        }
        return instancia;
    }
    
    
    public int adcionar(Combustivel combustivel) throws Exception {

        validar(combustivel);

        return dao.adcionar(combustivel);
    }

    public void modificar(Combustivel combustivel) throws Exception {
        validar(combustivel);
        validar(combustivel.getCombustivelId());
        dao.modificar(combustivel);
    }

    public Combustivel get(int combustivelId) throws Exception {
        validar(combustivelId);
        return dao.get(combustivelId);
    }

    public void excluir(int combustivelId) throws Exception {

        validar(combustivelId);
        dao.excluir(combustivelId);
    }

    public List<Combustivel> listar() throws Exception {
        return dao.listar();
    }

    private void validar(int combustivelId) throws Exception {
        if (combustivelId < 0) {

            throw new Exception("O id do combustivel deve ser maior que zero");

        }
    }

    private void validar(Combustivel combustivel) throws Exception {
        // Verifica se o combustivel é nulo
        if (combustivel == null) {
            throw new Exception("O combustivel é null");
            // Verifica se o combustivel é nome é null    
        } else if (combustivel.getNome() == null
                ? true
                : combustivel.getNome().isEmpty()) {
            throw new Exception("O combustivel deve ter nome");
            // Verifica se o preço do combustiver for negativo   
        } else if (combustivel.getPreco() < 0.0) {
            throw new Exception("O combustivel deve ter valor maior que zero");
        }
    }

}
