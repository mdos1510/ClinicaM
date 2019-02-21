
package visão;
import controle.ConexaoBd;
import controle.ControlePaciente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import modelo.ModeloPaciente;
import modelo.ModeloTabela;
public class ListaPaciente extends javax.swing.JFrame {

   ModeloPaciente mod = new ModeloPaciente();
   ControlePaciente control = new ControlePaciente();
   ConexaoBd conex = new ConexaoBd();
   
    public ListaPaciente() {
        initComponents();
      
         preencherTabelap("select *from modelopaciente order by nomep");
         
        
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());
         
    }

      
    public void preencherTabelap(String Sql){
        
         conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código","Nome","Endereço","Telefone"};
       
        conex.executaSql(Sql);
        
           try {
               conex.rs.first();
               do{
                   
                  dados.add(new Object[]{conex.rs.getInt("codp"),
                                         conex.rs.getString("nomep"),
                                         
                                         conex.rs.getString("endp"),
                                         conex.rs.getString("telp") });
                  
               }while(conex.rs.next());
           } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao preencher tabela!"+ex);
           }
                
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
          tbp.setModel(modelo);
       
        
     
         tbp.getColumnModel().getColumn(0).setPreferredWidth(50);
         tbp.getColumnModel().getColumn(1).setPreferredWidth(180);
         tbp.getColumnModel().getColumn(2).setPreferredWidth(100);
         tbp.getColumnModel().getColumn(3).setPreferredWidth(80);
        
         
     
        tbp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbp.getBorder();
        
        conex.desconecta();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bnCadastrarPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Paciente");
        setAlwaysOnTop(true);

        tbp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbp);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Pacientes");

        bnCadastrarPaciente.setText("Cadastrar");
        bnCadastrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCadastrarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnCadastrarPaciente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bnCadastrarPaciente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnCadastrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCadastrarPacienteActionPerformed
       FormularioPaciente tela = new FormularioPaciente();
        tela.setVisible(true);
        
    }//GEN-LAST:event_bnCadastrarPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCadastrarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbp;
    // End of variables declaration//GEN-END:variables
}
