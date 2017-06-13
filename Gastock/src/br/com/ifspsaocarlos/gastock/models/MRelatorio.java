/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Relatorio;
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
public class MRelatorio implements IRelatorio {

    private List<Relatorio> c = new ArrayList<>();
    Mongodb banco;

    public MRelatorio() {

        this.banco = new Mongodb();
        this.banco.setColecao("relatorio");
    }

    private void buscaCombustivel() {

        this.c = new ArrayList<>();

        ArrayList<BasicDBObject> dados = (ArrayList<BasicDBObject>) this.banco.buscaGeral();

        for (int i = 0; i < dados.size(); i++) {

            Relatorio curr = new Relatorio(
                    dados.get(i).getInt("cod"),
                    dados.get(i).get("dataAtual").toString(),
                    dados.get(i).get("combustivel").toString(),
                    dados.get(i).getInt("bomba"),
                    Double.parseDouble(dados.get(i).get("quantidade").toString()),
                    Double.parseDouble(dados.get(i).get("precoTotal").toString())
            );

            this.c.add(curr);

        }
    }
    
     public void adicionarVenda(int codigo, String dataAtual, String combustivel, int bomba, double quantidade, double precoTotal) throws Exception {

        try {
            this.listar();
        } catch (Exception ex) {

        }

        
        int cod = c.get(c.size() - 1).getRelatorio() + 1;

        //System.out.println(cod);
        //relatorio.setRelatorio(cod);

        //c.add(relatorio);

        BasicDBObject insert = new BasicDBObject();

        insert.put("cod", codigo); // tem que arrumar , pegar o codigo do bd e somar +1
        insert.put("dataAtual", dataAtual);
        insert.put("combustivel", combustivel);
        insert.put("bomba", bomba);
        insert.put("quantidade", quantidade);
        insert.put("precoTotal", precoTotal);

        this.banco.cadastraItem(insert);

       /// return relatorio.getRelatorio();
    }
    
    

    @Override
    public int adicionar(Relatorio relatorio) {

        try {
            this.listar();
        } catch (Exception ex) {

        }

        int cod = c.get(c.size() - 1).getRelatorio() + 1;

        relatorio.setRelatorio(cod);

        c.add(relatorio);

        BasicDBObject insert = new BasicDBObject();

        insert.put("cod", relatorio.getRelatorio());
        insert.put("dataAtual", relatorio.getDataAtual());
        insert.put("combustivel", relatorio.getCombustivel());
        insert.put("bomba", relatorio.getBomba());
        insert.put("quantidade", relatorio.getQuantidade());
        insert.put("precoTotal", relatorio.getPrecoTotal());

        this.banco.cadastraItem(insert);

        return relatorio.getRelatorio();

    }
    
    @Override
    public void modificar(Relatorio relatorio) throws Exception {

        BasicDBObject set = new BasicDBObject();

        int codigo = relatorio.getRelatorio();
        set.put("dataAtual", relatorio.getDataAtual());
        set.put("combustivel", relatorio.getCombustivel());
        set.put("quantidade", relatorio.getQuantidade());
        set.put("bomba", relatorio.getBomba());
        set.put("precoTotal", relatorio.getPrecoTotal());

        BasicDBObject update = new BasicDBObject("$set", set);

        this.banco.alterarItem(codigo, update);
    }

    @Override
    public Relatorio get(int relatorioId) throws Exception {

        DBObject dados = this.banco.buscaRegistro(new BasicDBObject("cod", relatorioId));

        Relatorio result = new Relatorio(
                (int) dados.get("cod"),
                dados.get("dataAtual").toString(),
                dados.get("combustivel").toString(),
                (int) dados.get("bomba"),
                Double.parseDouble(dados.get("quantidade").toString()),
                Double.parseDouble(dados.get("precoTotal").toString())
        );

        return result;
    }

    @Override
    public void excluir(int relatorioId) throws Exception {

        BasicDBObject delete = new BasicDBObject();
        delete.put("cod", relatorioId);

        this.banco.excluirItem(delete);
    }

    @Override
    public List<Relatorio> listar() throws Exception {

        this.buscaCombustivel();
        return c;
    }

}
