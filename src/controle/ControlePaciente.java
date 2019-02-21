package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloPaciente;

public class ControlePaciente {

    ConexaoBd conex = new ConexaoBd();
    ModeloPaciente mod = new ModeloPaciente();

    
    public void Salvar(ModeloPaciente mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modelopaciente (nomep,endp,telp) values (?,?,?)");//codigo sql
           
            pst.setString(1, mod.getNomep());
            pst.setString(2, mod.getEndp());
            pst.setString(3, mod.getTelp());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
        }
        conex.desconecta();
    }
   
    
    public ModeloPaciente buscaMedico(ModeloPaciente mod) {
        conex.conexao();
        conex.executaSql("select * from modelopaciente where codp= " + mod.getPesquisa());
        try {
            conex.rs.first();
            mod.setCodp(conex.rs.getInt("codp"));
            mod.setNomep(conex.rs.getString("nomep"));  
            mod.setEndp(conex.rs.getString("endp"));
            mod.setTelp(conex.rs.getString("telp"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        }
        conex.desconecta();
        return mod;
    }

   
    public void Editar(ModeloPaciente mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modelopaciente set nomep=?,endp=?,telp=? where codp=?");

            pst.setString(1, mod.getNomep());
            pst.setString(2, mod.getEndp());
            pst.setString(3, mod.getTelp());

            pst.setInt(4, mod.getCodp());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }

    public void Excluir(ModeloPaciente mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modelopaciente where codp=?");

            pst.setInt(1, mod.getCodp());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }

}
