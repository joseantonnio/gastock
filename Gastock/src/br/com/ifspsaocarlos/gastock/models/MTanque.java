/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Tanque;
import br.com.ifspsaocarlos.gastock.library.Mongodb;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface
 *
 * @author Alex
 */
public class MTanque implements ITanque {

    private List<Tanque> c = new ArrayList<>();
    Mongodb banco;

    public MTanque() {

        this.banco = new Mongodb();
        this.banco.setColecao("tanque");
    }

    private void buscaCombustivel() {

        this.c = new ArrayList<>();

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) this.banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Tanque curr = new Tanque(
                    dados.get(i).getInt("cod"),
                    dados.get(i).get("combustivel").toString(),
                    Double.parseDouble(dados.get(i).get("quantidade").toString())
            );

            this.c.add(curr);

        }
    }

    @Override
    public int adicionar(Tanque tanque) {
        
        try {
            this.listar();
        } catch (Exception ex) {
            
        }
        
        int cod = c.get(c.size() - 1).getTanque() + 1;

        tanque.setTanque(cod);

        c.add(tanque);

        BasicDBObject insert = new BasicDBObject();

        insert.put("cod", tanque.getTanque());
        insert.put("combustivel", tanque.getCombustivel());
        insert.put("quantidade", tanque.getQuantidade());

        this.banco.cadastraItem(insert);

        return tanque.getTanque();

    }

    @Override
    public void modificar(Tanque tanque) throws Exception {

        BasicDBObject set = new BasicDBObject();

        int codigo = tanque.getTanque();
        
        set.put("combustivel", tanque.getCombustivel());
        set.put("quantidade", tanque.getQuantidade());
        
        BasicDBObject update = new BasicDBObject("$set", set);

        this.banco.alterarItem(codigo, update);
    }

    @Override
    public Tanque get(int tanqueId) throws Exception {
        
        DBObject dados = this.banco.buscaRegistro("cod", Integer.toString(tanqueId));
        
        Tanque result = new Tanque(
                    (int) dados.get("cod"),
                    dados.get("combustivel").toString(),
                    Double.parseDouble(dados.get("quantidade").toString())
            );
        
        return result;
    }

    @Override
    public void excluir(int tanqueId) throws Exception {

        BasicDBObject delete = new BasicDBObject();
        delete.put("cod", tanqueId);

        this.banco.excluirItem(delete);
    }

    @Override
    public List<Tanque> listar() throws Exception {

        this.buscaCombustivel();
        return c;
    }

}
