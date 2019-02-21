package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloEnfermeiro;

public class ControleEnfermeiro {

    ConexaoBd conex = new ConexaoBd();
    ModeloEnfermeiro mod = new ModeloEnfermeiro();

    
    public void Salvar(ModeloEnfermeiro mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modeloenfermeiro (nomee,ende,tele) values (?,?,?)");//codigo sql

            pst.setString(1, mod.getNomee());
            pst.setString(2, mod.getEnde());
            pst.setString(3, mod.getTele());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
        }
        conex.desconecta();
    }

   
    public ModeloEnfermeiro busca(ModeloEnfermeiro mod) {
        conex.conexao();
        conex.executaSql("select * from modeloenfermeiro where code= " + mod.getPesquisa());
        try {
            conex.rs.first();
            mod.setCode(conex.rs.getInt("code"));
            mod.setNomee(conex.rs.getString("nomee"));

            mod.setEnde(conex.rs.getString("ende"));
            mod.setTele(conex.rs.getString("tele"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        }
        conex.desconecta();
        return mod;
    }

   
    public void Editar(ModeloEnfermeiro mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modeloenfermeiro set nomee=?,ende=?,tele=? where code=?");

            pst.setString(1, mod.getNomee());
            pst.setString(2, mod.getEnde());
            pst.setString(3, mod.getTele());
            pst.setInt(4, mod.getCode());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }

    public void Excluir(ModeloEnfermeiro mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modeloenfermeiro where code=?");

            pst.setInt(1, mod.getCode());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }

}
