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

public class FormularioPaciente extends javax.swing.JFrame {

    ModeloPaciente mod = new ModeloPaciente();
    ControlePaciente control = new ControlePaciente();
    ConexaoBd conex = new ConexaoBd();

    public FormularioPaciente() {
        initComponents();

        preencherTabelap("select *from modelopaciente order by nomep");
        
    
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());

    }

    public void limpar() {
        txnomep.setText("");
        txendp.setText("");
        txtelp.setText("");
        txpesquisa.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormPaciente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txcodp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txnomep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txendp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtelp = new javax.swing.JTextField();
        txpesquisa = new javax.swing.JTextField();
        bnpesquisa = new javax.swing.JButton();
        jLabelPaciente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bnNovo = new javax.swing.JButton();
        bnSalvar = new javax.swing.JButton();
        bnCancelar = new javax.swing.JButton();
        bnExcluir = new javax.swing.JButton();
        bnEditar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Paciente");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelFormPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código");

        txcodp.setEditable(false);

        jLabel2.setText("Nome:");

        txnomep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnomepActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço:");

        jLabel4.setText("Telefone:");

        txpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txpesquisaActionPerformed(evt);
            }
        });

        bnpesquisa.setText("Pesquisa");
        bnpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormPacienteLayout = new javax.swing.GroupLayout(jPanelFormPaciente);
        jPanelFormPaciente.setLayout(jPanelFormPacienteLayout);
        jPanelFormPacienteLayout.setHorizontalGroup(
            jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormPacienteLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txnomep)
                        .addComponent(txendp, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                        .addComponent(txtelp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormPacienteLayout.createSequentialGroup()
                        .addComponent(txcodp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnpesquisa)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanelFormPacienteLayout.setVerticalGroup(
            jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormPacienteLayout.createSequentialGroup()
                .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormPacienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txcodp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormPacienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnpesquisa))))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txnomep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txendp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelFormPaciente);
        jPanelFormPaciente.setBounds(30, 50, 710, 190);

        jLabelPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPaciente.setText("Cadastrar Paciente");
        getContentPane().add(jLabelPaciente);
        jLabelPaciente.setBounds(340, 20, 210, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bnNovo.setText("Novo");

        bnSalvar.setText("Salvar");
        bnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnSalvarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnCancelar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(760, 50, 100, 190);

        tbp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbp);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 250, 830, 230);

        setSize(new java.awt.Dimension(923, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txnomepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnomepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnomepActionPerformed

    private void txpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txpesquisaActionPerformed


    private void bnpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpesquisaActionPerformed
        mod.setPesquisa(txpesquisa.getText());
        ModeloPaciente model = control.buscaMedico(mod);
        txcodp.setText(String.valueOf(model.getCodp()));
        txnomep.setText(model.getNomep());
        txendp.setText(model.getEndp());
        txtelp.setText(model.getTelp());

    }//GEN-LAST:event_bnpesquisaActionPerformed

    private void bnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEditarActionPerformed
        mod.setCodp(Integer.parseInt(txcodp.getText()));
        mod.setNomep(txnomep.getText());
        mod.setEndp(txendp.getText());
        mod.setTelp(txtelp.getText());

        control.Editar(mod); 

        limpar();

        preencherTabelap("select *from modelopaciente order by nomep");

    }//GEN-LAST:event_bnEditarActionPerformed

    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCodp(Integer.parseInt(txcodp.getText()));

            control.Excluir(mod);

            limpar();

            preencherTabelap("select *from modelopaciente order by nomep");

        }
    }//GEN-LAST:event_bnExcluirActionPerformed

    private void bnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSalvarActionPerformed
        //  mod.setcodp (Integer.parseInt(txcodp.getText()));
        mod.setNomep(txnomep.getText());
        mod.setEndp(txendp.getText());
        mod.setTelp(txtelp.getText());

        control.Salvar(mod);
        limpar();

        preencherTabelap("select *from modelopaciente order by nomep");

    }//GEN-LAST:event_bnSalvarActionPerformed

   
    public void preencherTabelap(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Nome", "Endereço", "Telefone"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{
                    conex.rs.getInt("codp"),
                    conex.rs.getString("nomep"),
                    conex.rs.getString("endp"),
                    conex.rs.getString("telp")
                });

            } while (conex.rs.next());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!" + ex);
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
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPaciente().setVisible(true);
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
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormPaciente;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbp;
    private javax.swing.JTextField txcodp;
    private javax.swing.JTextField txendp;
    private javax.swing.JTextField txnomep;
    private javax.swing.JTextField txpesquisa;
    private javax.swing.JTextField txtelp;
    // End of variables declaration//GEN-END:variables
}
