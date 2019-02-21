
package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql. *; 
import javax.swing.JOptionPane;

public class ConexaoBd {
    
   public Statement stm; 
   public ResultSet rs; 
   private String driver ="org.gjt.mm.mysql.Driver"; 
   private String caminho ="jdbc:mysql://localhost:3306/clinicamedica";
   private String usuario ="root"; 
   private String senha ="";
   public Connection con;  
   
  private static final String driverr = "org.gjt.mm.mysql.Driver";
  private static final String caminhoo ="jdbc:mysql://localhost:3306/clinicamedica";
  private static final String usuarioo ="root";
  private static final String senhaa="";
  public static Connection conn;
  
 
  public void conexao() {
         try{
       System.setProperty("jdbc.Driver",driver);
       con = DriverManager.getConnection(caminho,usuario,senha);
     
       }catch(SQLException ex){
      
   }
    }  
   
   public static Connection getConnection(){
         
       System.setProperty("jdbc.Driver",driverr);
       try {
           conn = DriverManager.getConnection(caminhoo,usuarioo,senhaa);
           JOptionPane.showMessageDialog(null,"Conexão Efetuada com sucesso - relatorio");
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Erro de conexão com Banco de Dados do relatório"+ex.getMessage());
       }
     return conn;
   }
  public Connection conectar(){
       try{
       System.setProperty("jdbc.Driver",driver);
       con = DriverManager.getConnection(caminho,usuario,senha);
     
       }catch(SQLException ex){
     
   }  
      return con;
  
  }
  
  
   public void executaSql(String sql){
       try {
       stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
       rs = stm.executeQuery(sql);
   }catch(SQLException ex){
    
       }
   }
   
   
   public void desconecta(){
       try{
       con.close();
   
       }catch(SQLException ex){
    
       }
   }
  

}