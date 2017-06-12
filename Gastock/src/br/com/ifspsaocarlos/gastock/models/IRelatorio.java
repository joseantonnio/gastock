/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Relatorio;
import java.util.List;
/**
 *
 * @author Alex
 */
public interface IRelatorio {
    
    public int adicionar (Relatorio relatorio) throws Exception; //
    public void modificar (Relatorio relatorio) throws Exception;
    public Relatorio get(int relatorioId) throws Exception;
    public void excluir(int relatorioId)throws Exception;
    public List<Relatorio>listar() throws Exception;    
}
