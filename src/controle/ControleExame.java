package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloExame;
import modelo.ModeloPaciente;

public class ControleExame {

    ConexaoBd conex = new ConexaoBd();

    public void Salvar(ModeloExame mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modeloexame(paciente,tipoexame,data,hora,local) values (?,?,?,?,?)");//codigo sql

            pst.setInt(1, mod.getPaciente().getCodp());
            pst.setString(2, mod.getTipoexame());
            pst.setString(3, (CorretorData.ConverterParaSql(mod.getData())));
            pst.setString(4, mod.getHora());
            pst.setString(5, mod.getLocal());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);// ex é para e le fale qual foi o erro
        }
        conex.desconecta();
    }

    
    public ModeloExame busca(ModeloExame mod) {
        conex.conexao();
        conex.executaSql("select * from modeloexame where code= " + mod.getPesquisa());
        try {
            conex.rs.first();
            mod.setCode(conex.rs.getInt("code"));

            ModeloPaciente p = new ModeloPaciente();
            p.setCodp(conex.rs.getInt("paciente"));

            mod.setTipoexame(conex.rs.getString("tipoexame"));
            mod.setData(CorretorData.ConverterParaJava(conex.rs.getString("data")));
            mod.setHora(conex.rs.getString("hora"));
            mod.setLocal(conex.rs.getString("local"));

            mod.setPaciente(p);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        }
        conex.desconecta();
        return mod;
    }

    
    public void Editar(ModeloExame mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modeloexame set paciente=?, tipoexame=?, data=?, hora=?, local=? where code=?");

            pst.setInt(1, mod.getPaciente().getCodp());
            pst.setString(2, mod.getTipoexame());
            pst.setString(3, (CorretorData.ConverterParaSql(mod.getData())));
            pst.setString(4, mod.getHora());
            pst.setString(5, mod.getLocal());

            pst.setInt(6, mod.getCode());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }

    public void Excluir(ModeloExame mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modeloexame where code=?");

            pst.setInt(1, mod.getCode());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }

}
