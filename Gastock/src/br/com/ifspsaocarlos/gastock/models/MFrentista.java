/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Frentista;
import br.com.ifspsaocarlos.gastock.library.Mongodb;
import com.mongodb.BasicDBObject;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Alex
 */
public class MFrentista implements IFrentista {

    private List<Frentista> c = new ArrayList<>();

    public MFrentista() {

        Mongodb banco = new Mongodb();
        banco.setColecao("frentista");

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Frentista curr = new Frentista(
                    dados.get(i).getInt("_id"),
                    dados.get(i).get("nome").toString(),
                    dados.get(i).get("senha").toString(),
                    Double.parseDouble(dados.get(i).get("salario").toString())
            );
            
            c.add(curr);

        }
    }

    @Override
    public int adcionar(Frentista frentista) {

        //combustivel.setCombustivelId(contador++);
        //mapa.put(combustivel.getCombustivelId(), combustivel);

        return  frentista.getFrentistaId();

    }

    @Override
    public void modificar(Frentista frentista) throws Exception {

        //mapa.put(combustivel.getCombustivelId(), combustivel);
    }

    @Override
    public Frentista get(int frentista) throws Exception {
        return null;
        //return mapa.get(frentista);
    }

    @Override
    public void excluir(int frentista) throws Exception {

        //mapa.remove(combustivelId);
    }

    @Override
    public List<Frentista> listar() throws Exception {

        return c;
    }

}
