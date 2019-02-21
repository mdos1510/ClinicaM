
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import modelo.ModeloMedico;



public class ControleMedico {
    
   ConexaoBd conex = new ConexaoBd();
   ModeloMedico mod = new ModeloMedico();
   
 
   
   public void Salvar(ModeloMedico mod){
       conex.conexao();
        
     try{
      PreparedStatement pst = conex.con.prepareStatement("Insert into modelomedico (nome_med,crm_med,especialidade_med,end_med,tel_med) values (?,?,?,?,?)");
  

      pst.setString(1, mod.getNome_med());
      pst.setInt(2, mod.getCrm_med());
      pst.setString(3,mod.getEspecialidade_med());
      pst.setString(4, mod.getEnd_med());
      pst.setString(5,mod.getTel_med());
      
      pst.execute(); 
      
      JOptionPane.showMessageDialog(null,"Dados inserido com sucesso!");
  
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"Erro ao inserir dados!"+ex);
     }
      conex.desconecta();
   }
   
   
   public ModeloMedico buscaMedico(ModeloMedico mod){
       conex.conexao();
       conex.executaSql("select * from modelomedico where cod_med= "+mod.getPesqui_med());
       
      try{
          
          conex.rs.first();
          mod.setCod_med(conex.rs.getInt("cod_med"));
          mod.setNome_med(conex.rs.getString("nome_med"));  
          mod.setCrm_med(conex.rs.getInt("crm_med"));
          mod.setEspecialidade_med(conex.rs.getString("especialidade_med"));
          mod.setEnd_med(conex.rs.getString("end_med"));
          mod.setTel_med(conex.rs.getString("tel_med"));
             
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Erro ao buscar dados!"+ex);
       }
       conex.desconecta();
       return mod;
   }
   
   
   public void Editar(ModeloMedico mod){
       conex.conexao();
       try {
           PreparedStatement pst= conex.con.prepareStatement("update modelomedico set nome_med=?, crm_med=?, especialidade_med=?,end_med=?,tel_med=? where cod_med=?");
           
           
      pst.setString(1, mod.getNome_med());
      pst.setInt(2, mod.getCrm_med());
      pst.setString(3,mod.getEspecialidade_med());
      pst.setString(4, mod.getEnd_med());
      pst.setString(5,mod.getTel_med());
      pst.setInt(6, mod.getCod_med());
      
      pst.execute();
       JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao alterar dados!"+ex);
       }
       conex.desconecta();
       
   }
   
   public void Excluir(ModeloMedico mod){
       conex.conexao();
       
       try {
           PreparedStatement pst = conex.con.prepareStatement("delete from modelomedico where cod_med=?");
           
      pst.setInt(1, mod.getCod_med());
      
      pst.execute();
      
           JOptionPane.showMessageDialog(null,"Dados excluídos com sucesso!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao excluir dados!"+ex);
       }
       
       
       conex.desconecta();
   }
  
       
   }
   