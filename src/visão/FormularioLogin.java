package visão;

import controle.ConexaoBd;
import controle.Controlelogin;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import modelo.ModeloLogin;
import modelo.ModeloTabela;

public class FormularioLogin extends javax.swing.JFrame {

    ModeloLogin mod = new ModeloLogin();
    Controlelogin control = new Controlelogin();
    ConexaoBd conex = new ConexaoBd();

    public FormularioLogin() {
        initComponents();

        preencherTabelaL("select *from modelologin acesso");
    }

    public void limpar() {
        txcodl.setText("");
        txusuario.setText("");
        txsenha.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txusuario = new javax.swing.JTextField();
        txsenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbestatus = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButtonNovoMed1 = new javax.swing.JButton();
        jButtonSalvarMed1 = new javax.swing.JButton();
        jButtonEditarMed1 = new javax.swing.JButton();
        jButtonCancelarMed1 = new javax.swing.JButton();
        jButtonExcluirMed1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txcodl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbp = new javax.swing.JTable();
        txpesquisa = new javax.swing.JTextField();
        bnpesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuário");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome do usuário");

        jLabel3.setText("Senha");

        jLabel4.setText("Acesso");

        cbestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepção", "Médico(a)", "Enfermeiro(a)" }));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonNovoMed1.setText("Novo");
        jButtonNovoMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoMed1ActionPerformed(evt);
            }
        });

        jButtonSalvarMed1.setText("Salvar");
        jButtonSalvarMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarMed1ActionPerformed(evt);
            }
        });

        jButtonEditarMed1.setText("Editar");
        jButtonEditarMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarMed1ActionPerformed(evt);
            }
        });

        jButtonCancelarMed1.setText("Cancelar");
        jButtonCancelarMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMed1ActionPerformed(evt);
            }
        });

        jButtonExcluirMed1.setText("Excluir");
        jButtonExcluirMed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirMed1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonNovoMed1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvarMed1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarMed1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarMed1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluirMed1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovoMed1)
                    .addComponent(jButtonSalvarMed1)
                    .addComponent(jButtonEditarMed1)
                    .addComponent(jButtonCancelarMed1)
                    .addComponent(jButtonExcluirMed1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txusuario)
                                    .addComponent(txsenha)
                                    .addComponent(cbestatus, 0, 235, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txcodl, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addComponent(txcodl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cadastrar Usuário");

        tbp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbp);

        bnpesquisa.setText("Pesquisa");
        bnpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnpesquisa)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnpesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoMed1ActionPerformed

        limpar();

    }//GEN-LAST:event_jButtonNovoMed1ActionPerformed

    private void jButtonSalvarMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarMed1ActionPerformed

       
        mod.setUsuario(txusuario.getText());
        mod.setSenha(txsenha.getText());
        mod.setAcesso((String) cbestatus.getSelectedItem());

        control.Salvar(mod);

        limpar();
        preencherTabelaL("select *from modelologin acesso");

    }//GEN-LAST:event_jButtonSalvarMed1ActionPerformed

    private void jButtonEditarMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarMed1ActionPerformed

        mod.setCodl(Integer.parseInt(txcodl.getText()));
        mod.setUsuario(txusuario.getText());
        mod.setSenha(txsenha.getText());
        mod.setAcesso((String) cbestatus.getSelectedItem());

        control.Editar(mod); 
        limpar();
        preencherTabelaL("select *from modelologin order by acesso");
    }//GEN-LAST:event_jButtonEditarMed1ActionPerformed

    private void jButtonCancelarMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMed1ActionPerformed

        limpar();
    }//GEN-LAST:event_jButtonCancelarMed1ActionPerformed

    private void jButtonExcluirMed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirMed1ActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCodl(Integer.parseInt(txcodl.getText()));

            control.Excluir(mod);

            limpar();
            preencherTabelaL("select *from modelologin order by acesso");
        }
    }//GEN-LAST:event_jButtonExcluirMed1ActionPerformed

    private void bnpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpesquisaActionPerformed
        mod.setPesquisa(txpesquisa.getText());
        ModeloLogin model = control.busca(mod);
        txcodl.setText(String.valueOf(model.getCodl()));
        txusuario.setText(model.getUsuario());
        txsenha.setText(model.getSenha());
        cbestatus.setSelectedItem(model.getAcesso());
    }//GEN-LAST:event_bnpesquisaActionPerformed

    
    public void preencherTabelaL(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Usuario", "Senha", "Acesso"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{
                    conex.rs.getInt("codl"),
                    conex.rs.getString("usuario"),
                    conex.rs.getString("senha"),
                    conex.rs.getString("acesso")
                });

            } while (conex.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!" + ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tbp.setModel(modelo);

        tbp.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbp.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbp.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbp.getColumnModel().getColumn(3).setPreferredWidth(50);

        tbp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbp.getBorder();

        conex.desconecta();

    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnpesquisa;
    private javax.swing.JComboBox<String> cbestatus;
    private javax.swing.JButton jButtonCancelarMed1;
    private javax.swing.JButton jButtonEditarMed1;
    private javax.swing.JButton jButtonExcluirMed1;
    private javax.swing.JButton jButtonNovoMed1;
    private javax.swing.JButton jButtonSalvarMed1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbp;
    private javax.swing.JTextField txcodl;
    private javax.swing.JTextField txpesquisa;
    private javax.swing.JTextField txsenha;
    private javax.swing.JTextField txusuario;
    // End of variables declaration//GEN-END:variables
}
