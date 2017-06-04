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
    
    public int adcionar (Frentista frentista) throws Exception; 
    public void modificar (Frentista frentista) throws Exception;
    public Frentista get(int frentista) throws Exception;
    public void excluir(int frentista)throws Exception;
    public List<Frentista>listar() throws Exception; 
}
