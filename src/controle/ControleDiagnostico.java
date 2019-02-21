package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloDiagnostico;
import modelo.ModeloExame;
import modelo.ModeloPaciente;

public class ControleDiagnostico {

    ConexaoBd conex = new ConexaoBd();

    public void Salvar(ModeloDiagnostico mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modelodiagnostico(paciente,exame,resultado) values (?,?,?)");

            pst.setInt(1, mod.getPaciente().getCodp());
            pst.setInt(2, mod.getExame().getCode());
            pst.setString(3, mod.getResultado());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
        }
        conex.desconecta();
    }

   
    public ModeloDiagnostico busca(ModeloDiagnostico mod) {
        conex.conexao();
        conex.executaSql("select * from modelodiagnostico where codd= " + mod.getPesquisa());
        try {
            conex.rs.first();
            mod.setCodd(conex.rs.getInt("codd"));

            ModeloPaciente p = new ModeloPaciente();
            p.setCodp(conex.rs.getInt("paciente"));

            ModeloExame e = new ModeloExame();
            e.setCode(conex.rs.getInt("exame"));

            mod.setResultado(conex.rs.getString("resultado"));

            mod.setPaciente(p);
            mod.setExame(e);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        }
        conex.desconecta();
        return mod;
    }

    
    public void Editar(ModeloDiagnostico mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modelodiagnostico set paciente=?, exame=?, resultado=?  where codd=?");

            pst.setInt(1, mod.getPaciente().getCodp());
            pst.setInt(2, mod.getExame().getCode());
            pst.setString(3, mod.getResultado());

            pst.setInt(4, mod.getCodd());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }

    public void Excluir(ModeloDiagnostico mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modelodiagnostico where codd=?");

            pst.setInt(1, mod.getCodd());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }

}
