package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.library.Tanque;
import br.com.ifspsaocarlos.gastock.models.MTanque;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class TanqueTabelaModel extends AbstractTableModel {

    private List<Tanque> lista;
    private String[] coluna;

    public TanqueTabelaModel() {
        
        try {
            this.lista = new MTanque().listar();
        } catch (Exception err) {
            System.out.println(err);
        }
        
        coluna = new String[3];// Três coluna
        coluna[0] = "Código";
        coluna[1] = "Combustível";
        coluna[2] = "Quantidade";
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

        Tanque c = lista.get(linha);

        if (c == null) {

            return null;
        }

        switch (coluna) {

            case 0:
                return c.getTanque();
            case 1:
                return c.getCombustivel();
            case 2:
                return c.getQuantidade();
            default:
                return null;
        }

    }

    public void adicionar(Tanque c) {
        lista.add(c);
        fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public void modificar(int linha, Tanque c) {
        lista.set(linha, c);
        fireTableRowsInserted(linha, linha);
    }

    public void excluir(int linha) {
        lista.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }

    public Tanque get(int linha) {
        return lista.get(linha);
    }

    public void setLista(List<Tanque> l) {
        lista.clear();

        if (l != null) {
            lista = l;
        }

        fireTableDataChanged(); // Avisa que houve modificação na tabela

    }

}
