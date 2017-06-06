/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Combustivel;
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
public class MCombustivel implements ICombustivel {

    private List<Combustivel> c = new ArrayList<>();
    Mongodb banco;

    public MCombustivel() {

        this.banco = new Mongodb();
        this.banco.setColecao("combustivel");
    }

    private void buscaCombustivel() {

        this.c = new ArrayList<>();

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) this.banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Combustivel curr = new Combustivel(
                    dados.get(i).getInt("cod"),
                    dados.get(i).get("nome").toString(),
                    Double.parseDouble(dados.get(i).get("preco").toString())
            );

            this.c.add(curr);

        }
    }

    @Override
    public int adicionar(Combustivel combustivel) {
        
        try {
            this.listar();
        } catch (Exception ex) {
            
        }
        
        int cod = c.get(c.size() - 1).getCombustivel() + 1;

        combustivel.setCombustivel(cod);

        c.add(combustivel);

        BasicDBObject insert = new BasicDBObject();

        insert.put("cod", combustivel.getCombustivel());
        insert.put("nome", combustivel.getNome());
        insert.put("preco", combustivel.getPreco());

        this.banco.cadastraItem(insert);

        return combustivel.getCombustivel();

    }

    @Override
    public void modificar(Combustivel combustivel) throws Exception {

        BasicDBObject set = new BasicDBObject();

        int codigo = combustivel.getCombustivel();
        
        set.put("nome", combustivel.getNome());
        set.put("preco", combustivel.getPreco());
        
        BasicDBObject update = new BasicDBObject("$set", set);

        this.banco.alterarItem(codigo, update);
    }

    @Override
    public Combustivel get(int combustivelId) throws Exception {
        
        DBObject dados = this.banco.buscaRegistro(new BasicDBObject("cod", combustivelId));
        
        Combustivel result = new Combustivel(
                    (int) dados.get("cod"),
                    dados.get("nome").toString(),
                    Double.parseDouble(dados.get("preco").toString())
            );
        
        return result;
    }

    @Override
    public void excluir(int combustivelId) throws Exception {

        BasicDBObject delete = new BasicDBObject();
        delete.put("cod", combustivelId);

        this.banco.excluirItem(delete);
    }

    @Override
    public List<Combustivel> listar() throws Exception {

        this.buscaCombustivel();
        return c;
    }

}
