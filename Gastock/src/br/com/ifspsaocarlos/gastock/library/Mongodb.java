/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.library;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteResult;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jasj_
 */
public class Mongodb {

    private MongoClient mongoClient;
    private DB db;
    private DBCollection collection;

    public Mongodb() {

        try {

            mongoClient = new MongoClient(new MongoClientURI("mongodb://ifspsaocarlos:147258369@52.67.101.151/gastock"));
            db = mongoClient.getDB("gastock");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na conexão com o banco de dados");
        }

    }

    public DBCollection setColecao(String nome) {

        return this.collection = this.db.getCollection(nome);
    }

    public List<BasicDBObject> buscaGeral() {

        DBCursor cursor = collection.find().sort(new BasicDBObject("cod", 1));
        List<BasicDBObject> resultado = new ArrayList<>();

        while (cursor.hasNext()) {
            resultado.add((BasicDBObject) cursor.next());
        }

        return resultado;
    }
    
    public DBObject buscaRegistro(BasicDBObject busca) {

        DBObject resultado = collection.findOne(busca);
        
        return resultado;
    }

    public boolean cadastraItem(BasicDBObject item) {

        try {
            this.collection.save(item);
        } catch (Exception ex) {
            return false;
        }

        return true;
    }
    
    public boolean alterarItem(int codigo, BasicDBObject item) {
        
        BasicDBObject query = new BasicDBObject("cod", codigo);

        try {
            this.collection.update(query, item);
        } catch (Exception ex) {
            return false;
        }

        return true;
    }
    
    public boolean excluirItem(BasicDBObject query) {
        
        // invoke findOne so that the first document is fetched
        DBObject doc = this.collection.findOne(query);

        try {
            this.collection.remove(doc);
        } catch (Exception ex) {
            return false;
        }

        return true;
    }

}
