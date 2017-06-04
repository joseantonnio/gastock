/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Combustivel;
import java.util.List;
/**
 *
 * @author Alex
 */
public interface ICombustivel {
    
    public int adicionar (Combustivel combustivel) throws Exception; //
    public void modificar (Combustivel combustivel) throws Exception;
    public Combustivel get(int combustivelId) throws Exception;
    public void excluir(int combustivelId)throws Exception;
    public List<Combustivel>listar() throws Exception;    
}
