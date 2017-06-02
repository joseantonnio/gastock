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
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
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

        DBCursor cursor = collection.find().sort(new BasicDBObject("_id", 1));
        List<BasicDBObject> resultado = new ArrayList<BasicDBObject>();

        while (cursor.hasNext()) {
            resultado.add((BasicDBObject) cursor.next());
        }

        return resultado;
    }

    public List<BasicDBObject> cadastraItem() {

        BasicDBObject document = new BasicDBObject();
        document.put("database", "mkyongDB");
        document.put("table", "hosting");
    }

}
