/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.controllers;

import br.com.ifspsaocarlos.gastock.library.Frentista;
import br.com.ifspsaocarlos.gastock.models.MFrentista;
import java.util.List;
import br.com.ifspsaocarlos.gastock.models.IFrentista;
/**
 *
 * @author Alex
 */
public class Cfrentista {
    
  private static Cfrentista instancia;
    private IFrentista dao;

    private Cfrentista() {

        dao = new MFrentista();

    }

    public static Cfrentista getInstancia(){
        
        if( instancia == null){
          
            instancia = new Cfrentista();
        }
        return instancia;
    }
    
    
    public int adcionar(Frentista frentista) throws Exception {

        validar(frentista);

        return dao.adcionar(frentista);
    }

    public void modificar(Frentista frentista) throws Exception {
        validar(frentista);
        validar((int) frentista.getFrentistaId());
        dao.modificar(frentista);
    }

    public Frentista get(int frentista) throws Exception {
        validar(frentista);
        return dao.get(frentista);
    }

    public void excluir(int frentista) throws Exception {

        validar(frentista);
        dao.excluir(frentista);
    }

    public List<Frentista> listar() throws Exception {
        return dao.listar();
    }

    private void validar(int frentista) throws Exception {
        if (frentista < 0) {

            throw new Exception("O id do frentista deve ser maior que zero");

        }
    }

    private void validar(Frentista frentista) throws Exception {
        // Verifica se o combustivel é nulo
        if (frentista == null) {
            throw new Exception("O combustivel é null");
            // Verifica se o combustivel é nome é null    
        } else if (frentista.getNome() == null
                ? true
                : frentista.getNome().isEmpty()) {
            throw new Exception("O combustivel deve ter nome");
            // Verifica se o preço do combustiver for negativo   
        } else if (frentista.getSalario() < 0.0) {
            throw new Exception("O combustivel deve ter valor maior que zero");
        }
    }

}
