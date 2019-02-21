package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloConsultas;
import modelo.ModeloMedico;
import modelo.ModeloPaciente;

public class ControleConsultas {

    ConexaoBd conex = new ConexaoBd();
    ModeloConsultas mod = new ModeloConsultas();

    public void Salvar(ModeloConsultas mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("Insert into modeloconsultas(paciente,medico,data,hora,local) values (?,?,?,?,?)");
            pst.setInt(1, mod.getPaciente().getCodp());  
            pst.setInt(2, mod.getMedico().getCod_med());
            pst.setString(3, (CorretorData.ConverterParaSql(mod.getData())));
            pst.setString(4, mod.getHora());
            pst.setString(5, mod.getLocal());

            pst.execute();

            JOptionPane.showMessageDialog(null, "Dados inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!" + ex);
        }
        conex.desconecta();
    }

   
    public ModeloConsultas buscaConsulta(ModeloConsultas mod) {
        conex.conexao();
        conex.executaSql("select * from modeloconsultas where codc= " + mod.getPesquisa());
        try {
            conex.rs.first();
            mod.setCodc(conex.rs.getInt("codc"));

           
            ModeloPaciente p = new ModeloPaciente();
            p.setCodp(conex.rs.getInt("paciente"));

            ModeloMedico m = new ModeloMedico();
            m.setCod_med(conex.rs.getInt("medico"));

            mod.setData(CorretorData.ConverterParaJava(conex.rs.getString("data"))); 
            mod.setHora(conex.rs.getString("hora"));
            mod.setLocal(conex.rs.getString("local"));
            mod.setMedico(m);
            mod.setPaciente(p);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados!" + ex);
        }
        conex.desconecta();
        return mod;
    }

    
    public void Editar(ModeloConsultas mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update modeloconsultas set paciente=?, medico=?, data=?,hora=?, local=? where codc=?");

            pst.setInt(1, mod.getPaciente().getCodp());
            pst.setInt(2, mod.getMedico().getCod_med());
            pst.setString(3, (CorretorData.ConverterParaSql(mod.getData())));
            pst.setString(4, mod.getHora());
            pst.setString(5, mod.getLocal());
            
            pst.setInt(6, mod.getCodc());

            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!" + ex);
        }
        conex.desconecta();

    }
    
  
    public void Excluir(ModeloConsultas mod) {
        conex.conexao();

        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from modeloconsultas where codc=?");

            pst.setInt(1, mod.getCodc());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluídos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!" + ex);
        }

        conex.desconecta();
    }

   

}
