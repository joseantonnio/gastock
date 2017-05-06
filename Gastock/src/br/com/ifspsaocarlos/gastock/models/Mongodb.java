/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import com.mongodb.DB;
import com.mongodb.MongoClient;

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
            db = mongoClient.getDB("gastock");

        } catch (Exception e) {
            System.out.println("Ocorreu um erro na conexão com o banco de dados");
        }

    }

}
