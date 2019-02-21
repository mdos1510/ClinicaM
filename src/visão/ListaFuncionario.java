
package visão;

import controle.ConexaoBd;
import controle.ControleFuncionario;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import modelo.ModeloFuncionario;
import modelo.ModeloTabela;

public class ListaFuncionario extends javax.swing.JFrame {

      
   ModeloFuncionario mod = new ModeloFuncionario();
    ControleFuncionario control = new ControleFuncionario();
   ConexaoBd conex = new ConexaoBd();
    public ListaFuncionario() {
        initComponents();
      
         preencherTabelaf("select *from modelofuncionario order by nomef");
         
          
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());
         
    }

         
    public void preencherTabelaf(String Sql){
        
         conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código","Nome","Endereço","Telefone","Cargo"};
       
        conex.executaSql(Sql);
        
           try {
               conex.rs.first();
               do{
                                     dados.add(new Object[]{conex.rs.getInt("codf"),
                                         conex.rs.getString("nomef"),
                                         
                                         conex.rs.getString("endf"),
                                         conex.rs.getString("telf"),
                                         conex.rs.getString("cargof")});
                  
               }while(conex.rs.next());
           } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao preencher tabela!"+ex);
           }
                
       ModeloTabela modelo = new ModeloTabela(dados, colunas);
          tbf.setModel(modelo);
      
     
         tbf.getColumnModel().getColumn(0).setPreferredWidth(50);
         tbf.getColumnModel().getColumn(1).setPreferredWidth(180);
         tbf.getColumnModel().getColumn(2).setPreferredWidth(60);
         tbf.getColumnModel().getColumn(3).setPreferredWidth(100);
         tbf.getColumnModel().getColumn(4).setPreferredWidth(100);
         
    
   
        tbf.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//usuario pode selecionar um campo po vez
        Border border = tbf.getBorder();
        
        conex.desconecta();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbf = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bnnCadastrarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Funcionários");

        tbf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbf);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Funcionario");

        bnnCadastrarFuncionario.setText("Cadastrar");
        bnnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnnCadastrarFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bnnCadastrarFuncionario))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnnCadastrarFuncionarioActionPerformed
        FormularioFuncionario tela = new FormularioFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_bnnCadastrarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(ListaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnnCadastrarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbf;
    // End of variables declaration//GEN-END:variables
}
