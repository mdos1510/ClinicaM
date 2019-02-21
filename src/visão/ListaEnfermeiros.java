
package visão;

import controle.ConexaoBd;
import controle.ControleEnfermeiro;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import modelo.ModeloEnfermeiro;
import modelo.ModeloTabela;

public class ListaEnfermeiros extends javax.swing.JFrame {

    ModeloEnfermeiro mod = new ModeloEnfermeiro();
   ControleEnfermeiro control = new ControleEnfermeiro();
   ConexaoBd conex = new ConexaoBd();
    public ListaEnfermeiros() {
        initComponents();
      
        preencherTabelae("select *from modeloenfermeiro order by nomee");
        
        
       ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
       setIconImage(icone.getImage());
        
    }

    
    public void preencherTabelae(String Sql){
        
         conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código","Nome","Endereço","Telefone"};
       
        conex.executaSql(Sql);
        
           try {
               conex.rs.first();
               do{
                  
                  dados.add(new Object[]{conex.rs.getInt("code"),
                                         conex.rs.getString("nomee"),
                                         
                                         conex.rs.getString("ende"),
                                         conex.rs.getString("tele") });
                  
               }while(conex.rs.next());
           } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao preencher tabela!"+ex);
           }
                
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
          tbe.setModel(modelo);
       
        
     
         tbe.getColumnModel().getColumn(0).setPreferredWidth(50);
         tbe.getColumnModel().getColumn(1).setPreferredWidth(180);
         tbe.getColumnModel().getColumn(2).setPreferredWidth(100);
         tbe.getColumnModel().getColumn(3).setPreferredWidth(80);
        
         
     
   
        tbe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbe.getBorder();
        
        conex.desconecta();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bnCadastrarEnfermeiro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Enfermeiros ");

        tbe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbe);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Enfermeiros");

        bnCadastrarEnfermeiro.setText("Cadastrar");
        bnCadastrarEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCadastrarEnfermeiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bnCadastrarEnfermeiro)
                .addContainerGap(727, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bnCadastrarEnfermeiro))
                .addContainerGap(507, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGap(37, 37, 37)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnCadastrarEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCadastrarEnfermeiroActionPerformed
        FormularioEnfermeiro tela = new FormularioEnfermeiro();
        tela.setVisible(true);
    }//GEN-LAST:event_bnCadastrarEnfermeiroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermeiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaEnfermeiros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCadastrarEnfermeiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbe;
    // End of variables declaration//GEN-END:variables
}
