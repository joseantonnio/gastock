/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author jasj_
 */
public class Mongodb {

    private MongoClient mongoClient;
    private DB db;

    public Mongodb() {

        try {

            mongoClient = new MongoClient("52.67.101.151", 27017);
            MongoDatabase database = mongoClient.getDatabase("gastock");
            
            //db = mongoClient.getDB("gastock");
            //MongoCollection<Document> collection = database.getCollection("combustivel");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na conexão com o banco de dados");
        }
     
    }

}
