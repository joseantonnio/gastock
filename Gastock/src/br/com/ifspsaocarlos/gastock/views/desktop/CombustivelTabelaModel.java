package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.library.Combustivel;
import br.com.ifspsaocarlos.gastock.models.MCombustivel;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class CombustivelTabelaModel extends AbstractTableModel {

    private List<Combustivel> lista;
    private String[] coluna;

    public CombustivelTabelaModel() {
        
        try {
            this.lista = new MCombustivel().listar();
        } catch (Exception err) {
            System.out.println(err);
        }
        
        coluna = new String[3];// Três coluna
        coluna[0] = "Código";
        coluna[1] = "Combustível";
        coluna[2] = "Preço (R$)";
    }

    @Override
    public int getRowCount() {

        return lista.size(); // Controla a atd de registro
    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    @Override
    public String getColumnName(int index) {

        return coluna[index];
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        Combustivel c = lista.get(linha);

        if (c == null) {

            return null;
        }

        switch (coluna) {

            case 0:
                return c.getCombustivel();
            case 1:
                return c.getNome();
            case 2:
                return c.getPreco();
            default:
                return null;
        }

    }

    public void adicionar(Combustivel c) {
        lista.add(c);
        fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public void modificar(int linha, Combustivel c) {
        lista.set(linha, c);
        fireTableRowsInserted(linha, linha);
    }

    public void excluir(int linha) {
        lista.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }

    public Combustivel get(int linha) {
        return lista.get(linha);
    }

    public void setLista(List<Combustivel> l) {
        lista.clear();

        if (l != null) {
            lista = l;
        }

        fireTableDataChanged(); // Avisa que houve modificação na tabela

    }

}
