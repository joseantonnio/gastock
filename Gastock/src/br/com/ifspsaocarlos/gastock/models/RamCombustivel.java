/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifspsaocarlos.gastock.models;

import br.com.ifspsaocarlos.gastock.controllers.Combustivel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Interface
 *
 * @author Alex
 */
public class RamCombustivel implements Combustiveldb {

    private Map<Integer, Combustivel> mapa;
    private int contador;

    public RamCombustivel() {
        mapa = new HashMap<>();
        contador = 1;
    }

    @Override
    public int adcionar(Combustivel combustivel) {

        combustivel.setCombustivelId(contador++);
        mapa.put(combustivel.getCombustivelId(), combustivel);

        return combustivel.getCombustivelId();

    }

    @Override
    public void modificar(Combustivel combustivel) throws Exception {

        mapa.put(combustivel.getCombustivelId(), combustivel);
    }

    @Override
    public Combustivel get(int combustivelId) throws Exception {
        return mapa.get(combustivelId);
    }

    @Override
    public void excluir(int combustivelId) throws Exception {

        mapa.remove(combustivelId);

    }

    @Override
    public List<Combustivel> listar() throws Exception {

        return new ArrayList<>(mapa.values());
    }

}
