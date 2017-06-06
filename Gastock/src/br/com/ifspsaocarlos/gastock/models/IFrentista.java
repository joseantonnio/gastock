/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.library.Frentista;
import java.util.List;
/**
 *
 * @author Alex
 */
public interface IFrentista {
    
    public int adicionar (Frentista frentista) throws Exception; //
    public void modificar (Frentista frentista) throws Exception;
    public Frentista get(int frentistaId) throws Exception;
    public void excluir(int frentistaId)throws Exception;
    public List<Frentista>listar() throws Exception;    
}
