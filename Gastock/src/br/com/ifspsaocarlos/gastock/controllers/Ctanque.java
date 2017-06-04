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

    private Ctanque() {

        dao = new MTanque();

    }

    public static Ctanque getInstancia(){
        
        if( instancia == null){
          
            instancia = new Ctanque();
        }
        return instancia;
    }
    
    
    public int adcionar(Tanque tanque) throws Exception {

        validar(tanque);

        return dao.adcionar(tanque);
    }

    public void modificar(Tanque tanque) throws Exception {
        validar(tanque);
        validar((int) tanque.getTanqueId());
        dao.modificar(tanque);
    }

    public Tanque get(int tanque) throws Exception {
        validar(tanque);
        return dao.get(tanque);
    }

    public void excluir(int tanque) throws Exception {

        validar(tanque);
        dao.excluir(tanque);
    }

    public List<Tanque> listar() throws Exception {
        return dao.listar();
    }

    private void validar(int frentista) throws Exception {
        if (frentista < 0) {

            throw new Exception("O id do frentista deve ser maior que zero");

        }
    }

    private void validar(Tanque tanque) throws Exception {
        // Verifica se o combustivel é nulo
        if (tanque == null) {
            throw new Exception("O combustivel é null");
            // Verifica se o combustivel é nome é null    
        } 
    }

}
