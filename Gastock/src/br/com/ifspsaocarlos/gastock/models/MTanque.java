/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Tanque;
import br.com.ifspsaocarlos.gastock.library.Mongodb;
import com.mongodb.BasicDBObject;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alex
 */
public class MTanque implements ITanque {

    private List<Tanque> c = new ArrayList<>();

    public MTanque() {

        Mongodb banco = new Mongodb();
        banco.setColecao("tanque");

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Tanque curr = new Tanque(
                    dados.get(i).getInt("_id"), 
                    (String) dados.get(i).get("combustivel"),
                    Double.parseDouble(dados.get(i).get("quantidade").toString()),
                    dados.get(i).getBoolean("status")
            );
            
            c.add(curr);

        }
    }

    @Override
    public int adcionar(Tanque tanque) {

        //combustivel.setCombustivelId(contador++);
        //mapa.put(combustivel.getCombustivelId(), combustivel);

        return  tanque.getTanqueId();

    }

    @Override
    public void modificar(Tanque tanque) throws Exception {

        //mapa.put(combustivel.getCombustivelId(), combustivel);
    }

    @Override
    public Tanque get(int tanque) throws Exception {
        return null;
        //return mapa.get(frentista);
    }

    @Override
    public void excluir(int tanque) throws Exception {

        //mapa.remove(combustivelId);
    }

    @Override
    public List<Tanque> listar() throws Exception {

        return c;
    }

}
