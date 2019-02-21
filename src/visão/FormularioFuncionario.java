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

public class FormularioFuncionario extends javax.swing.JFrame {

    ModeloFuncionario mod = new ModeloFuncionario();
    ControleFuncionario control = new ControleFuncionario();
    ConexaoBd conex = new ConexaoBd();

    public FormularioFuncionario() {
        initComponents();
        
        preencherTabelaf("select *from modelofuncionario order by nomef");
        
        
       ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
       setIconImage(icone.getImage());
    }

    public void limpar() {
        txnomef.setText("");
        txendf.setText("");
        txtelf.setText("");
        txpesquisa.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txcodf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txnomef = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txendf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtelf = new javax.swing.JTextField();
        txpesquisa = new javax.swing.JTextField();
        bnpesquisa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txcargof = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbf = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        bnCancelar = new javax.swing.JButton();
        bnExcluir = new javax.swing.JButton();
        bnEditar = new javax.swing.JButton();
        bnSalvar = new javax.swing.JButton();
        bnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Funcionários");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Funcionário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 240, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código");

        txcodf.setEditable(false);

        jLabel3.setText("Nome:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        txtelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelfActionPerformed(evt);
            }
        });

        bnpesquisa.setText("Pesquisar");
        bnpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpesquisaActionPerformed(evt);
            }
        });

        jLabel6.setText("Cargo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txendf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txcodf, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bnpesquisa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txnomef, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtelf, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txcargof, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txcodf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnpesquisa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txnomef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txendf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txcargof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 70, 710, 280);

        tbf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbf);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(40, 370, 710, 150);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bnCancelar.setText("Cancelar");

        bnExcluir.setText("Excluir");
        bnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnExcluirActionPerformed(evt);
            }
        });

        bnEditar.setText("Editar");
        bnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEditarActionPerformed(evt);
            }
        });

        bnSalvar.setText("Salvar");
        bnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSalvarActionPerformed(evt);
            }
        });

        bnNovo.setText("Novo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(bnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnCancelar)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(770, 70, 120, 200);

        setSize(new java.awt.Dimension(930, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void bnpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpesquisaActionPerformed
        mod.setPesquisa(txpesquisa.getText());
        ModeloFuncionario model = control.buscaMedico(mod);

        txcodf.setText(String.valueOf(model.getCodf()));
        txnomef.setText(model.getNomef());
        txendf.setText(model.getEndf());
        txtelf.setText(model.getTelf());
        txcargof.setText(model.getCargof());

    }//GEN-LAST:event_bnpesquisaActionPerformed

    private void txtelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtelfActionPerformed

    
    private void bnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEditarActionPerformed

        mod.setCodf(Integer.parseInt(txcodf.getText()));
        mod.setNomef(txnomef.getText());
        mod.setEndf(txendf.getText());
        mod.setTelf(txtelf.getText());
        mod.setCargof(txcargof.getText());

        control.Editar(mod); 

        limpar();

        preencherTabelaf("select *from modelofuncionario order by nomef");

    }//GEN-LAST:event_bnEditarActionPerformed

   
    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCodf(Integer.parseInt(txcodf.getText()));

            control.Excluir(mod);
            limpar();

            preencherTabelaf("select *from modelofuncionario order by nomef");

        }
    }//GEN-LAST:event_bnExcluirActionPerformed

   
    private void bnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSalvarActionPerformed
       
        mod.setNomef(txnomef.getText());
        mod.setEndf(txendf.getText());
        mod.setTelf(txtelf.getText());
        mod.setCargof(txcargof.getText());

        limpar();

        control.Salvar(mod); //chamando método salvar

        preencherTabelaf("select *from modelofuncionario order by nomef");

    }//GEN-LAST:event_bnSalvarActionPerformed

   
    public void preencherTabelaf(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Nome", "Endereço", "Telefone", "Cargo"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{conex.rs.getInt("codf"),
                    conex.rs.getString("nomef"),
                    conex.rs.getString("endf"),
                    conex.rs.getString("telf"),
                    conex.rs.getString("cargof")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!" + ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tbf.setModel(modelo);

        tbf.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbf.getColumnModel().getColumn(1).setPreferredWidth(180);
        tbf.getColumnModel().getColumn(2).setPreferredWidth(60);
        tbf.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbf.getColumnModel().getColumn(4).setPreferredWidth(100);

        tbf.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbf.getBorder();

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
            java.util.logging.Logger.getLogger(FormularioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioFuncionario().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbf;
    private javax.swing.JTextField txcargof;
    private javax.swing.JTextField txcodf;
    private javax.swing.JTextField txendf;
    private javax.swing.JTextField txnomef;
    private javax.swing.JTextField txpesquisa;
    private javax.swing.JTextField txtelf;
    // End of variables declaration//GEN-END:variables
}
