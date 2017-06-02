/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Combustivel;
import br.com.ifspsaocarlos.gastock.library.Mongodb;
import com.mongodb.BasicDBObject;
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

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) this.banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Combustivel curr = new Combustivel(
                    dados.get(i).getInt("_id"),
                    dados.get(i).get("nome").toString(),
                    Double.parseDouble(dados.get(i).get("preco").toString())
            );
            
            this.c.add(curr);

        }
    }

    @Override
    public int adcionar(Combustivel combustivel) {

        combustivel.setCombustivel(c.get(c.size() - 1).getCombustivel() + 1);
        this.c.add(combustivel);
        
        combustivel.toJson()

        return combustivel.getCombustivel();

    }

    @Override
    public void modificar(Combustivel combustivel) throws Exception {

        //mapa.put(combustivel.getCombustivel(), combustivel);
    }

    @Override
    public Combustivel get(int combustivelId) throws Exception {
        //return mapa.get(combustivelId);
    }

    @Override
    public void excluir(int combustivelId) throws Exception {

        //mapa.remove(combustivelId);
    }

    @Override
    public List<Combustivel> listar() throws Exception {

        return c;
    }

}
