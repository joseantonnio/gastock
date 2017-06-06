/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Tanque;
import java.util.List;
/**
 *
 * @author Alex
 */
public interface ITanque {
    
    public int adicionar (Tanque tanque) throws Exception; //
    public void modificar (Tanque tanque) throws Exception;
    public Tanque get(int tanqueId) throws Exception;
    public void excluir(int tanqueId)throws Exception;
    public List<Tanque>listar() throws Exception;    
}
