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

public class FormularioEnfermeiro extends javax.swing.JFrame {

    ModeloEnfermeiro mod = new ModeloEnfermeiro();
    ControleEnfermeiro control = new ControleEnfermeiro();
    ConexaoBd conex = new ConexaoBd();

    public FormularioEnfermeiro() {
        initComponents();
        preencherTabelae("select *from modeloenfermeiro order by nomee");

        
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());

    }

    public void limpar() {
        txcode.setText("");
        txnomee.setText("");
        txende.setText("");
        txtele.setText("");
        txpesquisa.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txnomee = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txende = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtele = new javax.swing.JTextField();
        bnpesquisa = new javax.swing.JButton();
        txpesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbe = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        bnNovo = new javax.swing.JButton();
        bnSalvar = new javax.swing.JButton();
        bnEditar = new javax.swing.JButton();
        bnCancelar = new javax.swing.JButton();
        bnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Enfermeiros");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código");

        txcode.setEditable(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        txtele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteleActionPerformed(evt);
            }
        });

        bnpesquisa.setText("Pesquisa");
        bnpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpesquisaActionPerformed(evt);
            }
        });

        txpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txnomee, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txcode, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bnpesquisa))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txende, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtele, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnpesquisa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txnomee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 50, 700, 220);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Enfermeiro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 240, 30);

        tbe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbe);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 280, 840, 170);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bnNovo.setText("Novo");

        bnSalvar.setText("Salvar");
        bnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSalvarActionPerformed(evt);
            }
        });

        bnEditar.setText("Editar");
        bnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEditarActionPerformed(evt);
            }
        });

        bnCancelar.setText("Cancelar");

        bnExcluir.setText("Excluir");
        bnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnExcluir)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(760, 50, 122, 220);

        setSize(new java.awt.Dimension(946, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteleActionPerformed

    private void txpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpesquisaActionPerformed
//botao pesquisa
    private void bnpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpesquisaActionPerformed
        mod.setPesquisa(txpesquisa.getText());
        ModeloEnfermeiro model = control.busca(mod);

        txcode.setText(String.valueOf(model.getCode()));
        txnomee.setText(model.getNomee());
        txende.setText(model.getEnde());
        txtele.setText(model.getTele());
        txcode.setEnabled(false);

    }//GEN-LAST:event_bnpesquisaActionPerformed


    private void bnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEditarActionPerformed
        mod.setCode(Integer.parseInt(txcode.getText()));
        mod.setNomee(txnomee.getText());
        mod.setEnde(txende.getText());
        mod.setTele(txtele.getText());

        control.Editar(mod); 

        limpar();

        preencherTabelae("select *from modeloenfermeiro order by nomee");

    }//GEN-LAST:event_bnEditarActionPerformed


    private void bnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSalvarActionPerformed
       
        mod.setNomee(txnomee.getText());

        mod.setEnde(txende.getText());
        mod.setTele(txtele.getText());

        control.Salvar(mod); 

        limpar();

        preencherTabelae("select *from modeloenfermeiro order by nomee");

    }//GEN-LAST:event_bnSalvarActionPerformed

    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCode(Integer.parseInt(txcode.getText()));
            control.Excluir(mod);

            limpar();

            preencherTabelae("select *from modeloenfermeiro order by nomee");

        }
    }//GEN-LAST:event_bnExcluirActionPerformed

   
    public void preencherTabelae(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Nome", "Endereço", "Telefone"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
                
                dados.add(new Object[]{conex.rs.getInt("code"),
                    conex.rs.getString("nomee"),
                    conex.rs.getString("ende"),
                    conex.rs.getString("tele")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!" + ex);
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
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEnfermeiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEnfermeiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCancelar;
    private javax.swing.JButton bnEditar;
    private javax.swing.JButton bnExcluir;
    private javax.swing.JButton bnNovo;
    private javax.swing.JButton bnSalvar;
    private javax.swing.JButton bnpesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbe;
    private javax.swing.JTextField txcode;
    private javax.swing.JTextField txende;
    private javax.swing.JTextField txnomee;
    private javax.swing.JTextField txpesquisa;
    private javax.swing.JTextField txtele;
    // End of variables declaration//GEN-END:variables
}
