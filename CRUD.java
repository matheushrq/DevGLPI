package devglpi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class CRUD extends AbstractTableModel{
    
    private List<DevGLPI> dados = new ArrayList<>();
    private String[] colunas = {"Código", "Data", "Descrição", "Usuário", "Prioridade", "Nível", "Status"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getCodigo();
            case 1:
                return dados.get(linha).getData();
            case 2:
                return dados.get(linha).getDescricao();
            case 3:
                return dados.get(linha).getUsuario();
            case 4:
                return dados.get(linha).getPrioridade();
            case 5:
                return dados.get(linha).getNivel();
            case 6:
                return dados.get(linha).getStatus();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch(coluna){
            case 0:
                dados.get(linha).setCodigo(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setData((String) valor);
                break;
            case 2:
                dados.get(linha).setDescricao((String) valor);
                break;
            case 3:
                dados.get(linha).setUsuario((String) valor);
                break;
            case 4:
                dados.get(linha).setPrioridade((String) valor);
                break;
            case 5:
                dados.get(linha).setNivel((String) valor);
                break;
            case 6:
                dados.get(linha).setStatus((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }
}
