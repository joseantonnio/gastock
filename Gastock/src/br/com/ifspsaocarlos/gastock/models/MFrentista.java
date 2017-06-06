/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Frentista;
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
public class MFrentista implements IFrentista {

    private List<Frentista> c = new ArrayList<>();
    Mongodb banco;

    public MFrentista() {

        this.banco = new Mongodb();
        this.banco.setColecao("frentista");
    }

    private void buscaFrentista() {

        this.c = new ArrayList<>();

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) this.banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Frentista curr = new Frentista(
                    dados.get(i).getInt("cod"),
                    dados.get(i).get("nome").toString(),
                    dados.get(i).get("senha").toString(),
                    Double.parseDouble(dados.get(i).get("salario").toString())
            );

            this.c.add(curr);

        }
    }

    @Override
    public int adicionar(Frentista frentista) {

        try {
            this.listar();
        } catch (Exception ex) {

        }

        int cod = c.get(c.size() - 1).getFrentista() + 1;

        frentista.setFrentista(cod);

        c.add(frentista);

        BasicDBObject insert = new BasicDBObject();

        insert.put("cod", frentista.getFrentista());
        insert.put("nome", frentista.getNome());
        insert.put("senha", frentista.getSenha());
        insert.put("salario", frentista.getSalario());

        this.banco.cadastraItem(insert);

        return frentista.getFrentista();

    }

    @Override
    public void modificar(Frentista frentista) throws Exception {

        BasicDBObject set = new BasicDBObject();

        int codigo = frentista.getFrentista();

        set.put("nome", frentista.getNome());
        set.put("senha", frentista.getSenha());
        set.put("salario", frentista.getSalario());

        BasicDBObject update = new BasicDBObject("$set", set);

        this.banco.alterarItem(codigo, update);
    }

    @Override
    public Frentista get(int frentistaId) throws Exception {

        DBObject dados = this.banco.buscaRegistro("cod", Integer.toString(frentistaId));

        Frentista result = new Frentista(
                (int) dados.get("cod"),
                dados.get("nome").toString(),
                dados.get("senha").toString(),
                Double.parseDouble(dados.get("salario").toString())
        );

        return result;
    }

    @Override
    public void excluir(int frentistaId) throws Exception {

        BasicDBObject delete = new BasicDBObject();
        delete.put("cod", frentistaId);

        this.banco.excluirItem(delete);
    }

    @Override
    public List<Frentista> listar() throws Exception {

        this.buscaFrentista();
        return c;
    }

}
