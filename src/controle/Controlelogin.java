package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;

public class Controlelogin {

    ConexaoBd conex = new ConexaoBd();
    ModeloLogin mod = new ModeloLogin();

    
    public void Salvar(ModeloLogin mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modelologin (usuario,senha,acesso) values (?,?,?)");
            pst.setString(1, mod.getUsuario());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getAcesso());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
        }
        conex.desconecta();
    }


    public ModeloLogin busca(ModeloLogin mod) {
        conex.conexao();
        conex.executaSql("select * from modelologin where codl= " + mod.getPesquisa());
        try {
            conex.rs.first();
            mod.setCodl(conex.rs.getInt("codl"));
            mod.setUsuario(conex.rs.getString("usuario"));
            mod.setSenha(conex.rs.getString("senha"));
            mod.setAcesso(conex.rs.getString("acesso"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        }
        conex.desconecta();
        return mod;
    }

   
    public void Editar(ModeloLogin mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modelologin set usuario=?,senha=?,acesso=? where codl=?");

            pst.setString(1, mod.getUsuario());
            pst.setString(2, mod.getSenha());
            pst.setString(3, mod.getAcesso());

            pst.setInt(4, mod.getCodl());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }

    public void Excluir(ModeloLogin mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modelologin where codl=?");

            pst.setInt(1, mod.getCodl());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }
    
   

}
