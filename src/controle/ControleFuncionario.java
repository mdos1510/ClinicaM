package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloFuncionario;

public class ControleFuncionario {

    ConexaoBd conex = new ConexaoBd();
    ModeloFuncionario mod = new ModeloFuncionario();

   
    public void Salvar(ModeloFuncionario mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modelofuncionario (nomef,endf,telf,cargof) values (?,?,?,?)");//codigo sql
           
            pst.setString(1, mod.getNomef());
            pst.setString(2, mod.getEndf());
            pst.setString(3, mod.getTelf());
            pst.setString(4, mod.getCargof());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
        }
        conex.desconecta();
    }

   
    public ModeloFuncionario buscaMedico(ModeloFuncionario mod) {
        conex.conexao();
        conex.executaSql("select * from modelofuncionario where codf= " + mod.getPesquisa());
        try {
            conex.rs.first();

            mod.setCodf(conex.rs.getInt("codf"));
            mod.setNomef(conex.rs.getString("nomef"));
            mod.setEndf(conex.rs.getString("endf"));
            mod.setTelf(conex.rs.getString("telf"));
            mod.setCargof(conex.rs.getString("cargof"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        conex.desconecta();
      
    }
          return mod;
    }
    
    public void Editar(ModeloFuncionario mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modelofuncionario set nomef=?,endf=?,telf=?, cargof=? where codf=?");

            pst.setString(1, mod.getNomef());
            pst.setString(2, mod.getEndf());
            pst.setString(3, mod.getTelf());
            pst.setString(4, mod.getCargof());
            pst.setInt(5, mod.getCodf());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }
    
    
    public void Excluir(ModeloFuncionario mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modelofuncionario where codf=?");

            pst.setInt(1, mod.getCodf());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }

}
