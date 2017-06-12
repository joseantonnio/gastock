package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.library.Relatorio;
import br.com.ifspsaocarlos.gastock.models.MRelatorio;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class RelatorioTabelaModel extends AbstractTableModel {

    private List<Relatorio> lista;
    private String[] coluna;

    public RelatorioTabelaModel() {

        try {
            this.lista = new MRelatorio().listar();
        } catch (Exception err) {
            System.out.println(err);
        }

        coluna = new String[5];// Três coluna
        coluna[0] = "Código";
        coluna[1] = "Combustível";
        coluna[2] = "Bomba";
        coluna[3] = "Quantidade";
        coluna[4] = "Preço Total";
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

        Relatorio c = lista.get(linha);

        if (c == null) {

            return null;
        }

        switch (coluna) {

            case 0:
                return c.getRelatorio();
            case 1:
                return c.getCombustivel();
            case 2:
                return c.getBomba();
            case 3:
                return c.getQuantidade();
            case 4:
                return c.getPrecoTotal();
            default:
                return null;
        }

    }

    public void adicionar(Relatorio c) {
        lista.add(c);
        fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public void modificar(int linha, Relatorio c) {
        lista.set(linha, c);
        fireTableRowsInserted(linha, linha);
    }

    public void excluir(int linha) {
        lista.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }

    public Relatorio get(int linha) {
        return lista.get(linha);
    }

    public void setLista(List<Relatorio> l) {
        lista.clear();

        if (l != null) {
            lista = l;
        }

        fireTableDataChanged(); // Avisa que houve modificação na tabela

    }

}
