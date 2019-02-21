
package modelo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel {
    
     private ArrayList linhas = null;
     private String[] colunas = null;

    public ModeloTabela(ArrayList lin, String[] col) {
        setLinhas(lin);
        setColunas(col);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public ArrayList getLinhas() {
        return linhas;
    }

  
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

   
    public String[] getColunas() {
        return colunas;
    }

   
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
//@Override
    public int getRowCount() {
       
        return linhas.size();
    }

    //Override
    public int getColumnCount() {
        
        return colunas.length;
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }

    //@Override
    public Object getValueAt(int numLin, int numCol) {
         Object[] linha = (Object[] )getLinhas().get(numLin);    
         return linha[numCol];
       
    }

    
    
    
    
    

    
}
