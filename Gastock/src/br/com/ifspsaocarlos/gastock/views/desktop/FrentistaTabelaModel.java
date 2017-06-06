package br.com.ifspsaocarlos.gastock.views.desktop;

import br.com.ifspsaocarlos.gastock.library.Frentista;
import br.com.ifspsaocarlos.gastock.models.MFrentista;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alex
 */
public class FrentistaTabelaModel extends AbstractTableModel {

    private List<Frentista> lista;
    private String[] coluna;

    public FrentistaTabelaModel() {

        try {
            this.lista = new MFrentista().listar();
        } catch (Exception err) {
            System.out.println(err);
        }

        coluna = new String[5];// Três coluna
        coluna[0] = "Código";
        coluna[1] = "Nome";
        coluna[2] = "Salario";
        coluna[3] = "Senha";
        coluna[4] = "Tipo";
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

        Frentista c = lista.get(linha);

        if (c == null) {

            return null;
        }

        switch (coluna) {

            case 0:
                return c.getFrentista();
            case 1:
                return c.getNome();
            case 2:
                return c.getSalario();
            case 3:
                return c.getSenha();
            case 4:
                return c.getTipo();
            default:
                return null;
        }

    }

    public void adicionar(Frentista c) {
        lista.add(c);
        fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public void modificar(int linha, Frentista c) {
        lista.set(linha, c);
        fireTableRowsInserted(linha, linha);
    }

    public void excluir(int linha) {
        lista.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }

    public Frentista get(int linha) {
        return lista.get(linha);
    }

    public void setLista(List<Frentista> l) {
        lista.clear();

        if (l != null) {
            lista = l;
        }

        fireTableDataChanged(); // Avisa que houve modificação na tabela

    }

}
