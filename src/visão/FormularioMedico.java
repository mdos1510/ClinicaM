package visão;


import controle.ConexaoBd;
import controle.ControleMedico;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import modelo.ModeloMedico;
import modelo.ModeloTabela;




public class FormularioMedico extends javax.swing.JFrame {

   
    ModeloMedico mod = new ModeloMedico();
    ControleMedico control = new ControleMedico();
    ConexaoBd conex = new ConexaoBd();

    public FormularioMedico() { 
        initComponents();

        preencherTabela("select *from modelomedico order by especialidade_med");//ordenar tabela por especialidade medica 

         
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());
    }

    public void limpar() {
          
        jTextFieldCodMed.setText("");
        jTextFieldNomeMed.setText("");
        jTextFieldCrm.setText("");
        jTextFieldEndMed.setText("");
        jTextFieldTelMed.setText("");
        jTextFieldPesquiMed.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelFormularioMedico = new javax.swing.JPanel();
        jLabelNomeMed = new javax.swing.JLabel();
        jTextFieldNomeMed = new javax.swing.JTextField();
        jTextFieldCrm = new javax.swing.JTextField();
        jLabelCRM = new javax.swing.JLabel();
        jLabelEndMed = new javax.swing.JLabel();
        jTextFieldEndMed = new javax.swing.JTextField();
        jLabelEspecialidadeMed = new javax.swing.JLabel();
        jComboBoxEspeMed = new javax.swing.JComboBox<>();
        jLabelTelMed = new javax.swing.JLabel();
        jTextFieldTelMed = new javax.swing.JTextField();
        jTextFieldPesquiMed = new javax.swing.JTextField();
        jButtonPesquiMed = new javax.swing.JButton();
        jLabelcodMed = new javax.swing.JLabel();
        jTextFieldCodMed = new javax.swing.JTextField();
        jLabelTituloFormMedico = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMed = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovoMed = new javax.swing.JButton();
        jButtonSalvarMed = new javax.swing.JButton();
        jButtonEditarMed = new javax.swing.JButton();
        jButtonCancelarMed = new javax.swing.JButton();
        jButtonExcluirMed = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Médicos");
        setResizable(false);

        jPanelFormularioMedico.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNomeMed.setText("Nome:");

        jTextFieldNomeMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelCRM.setText("CRM");

        jLabelEndMed.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEndMed.setText("Endereço:");

        jTextFieldEndMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEndMedActionPerformed(evt);
            }
        });

        jLabelEspecialidadeMed.setText("Especialidade:");

        jComboBoxEspeMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologista", "Pediatra", "Dermatologista", "Ginecologista", "Endocrinologista", "Psiquiatra", "Ortopedista", "Neurologista", "Urologista", "Gastrologista", "Otorrnoloringologista", "Pneumologista", "Alergologista", "Nefrologista", "Clínico Geral", "Psicologo", " ", " " }));
        jComboBoxEspeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspeMedActionPerformed(evt);
            }
        });

        jLabelTelMed.setText("Telefone");

        jTextFieldTelMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelMedActionPerformed(evt);
            }
        });

        jTextFieldPesquiMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquiMedActionPerformed(evt);
            }
        });

        jButtonPesquiMed.setText("Pesquisar");
        jButtonPesquiMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquiMedActionPerformed(evt);
            }
        });

        jLabelcodMed.setText("Código");

        jTextFieldCodMed.setEditable(false);

        javax.swing.GroupLayout jPanelFormularioMedicoLayout = new javax.swing.GroupLayout(jPanelFormularioMedico);
        jPanelFormularioMedico.setLayout(jPanelFormularioMedicoLayout);
        jPanelFormularioMedicoLayout.setHorizontalGroup(
            jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                        .addComponent(jLabelEndMed, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndMed))
                    .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcodMed)
                            .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelCRM)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                                .addComponent(jTextFieldCodMed, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldPesquiMed, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquiMed, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                                .addComponent(jTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabelEspecialidadeMed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxEspeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldNomeMed)))
                    .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                        .addComponent(jLabelTelMed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTelMed, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormularioMedicoLayout.setVerticalGroup(
            jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioMedicoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcodMed)
                    .addComponent(jTextFieldCodMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPesquiMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquiMed))
                .addGap(21, 21, 21)
                .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeMed)
                    .addComponent(jTextFieldNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCRM)
                    .addComponent(jTextFieldCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEspecialidadeMed)
                    .addComponent(jComboBoxEspeMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndMed)
                    .addComponent(jTextFieldEndMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelMed)
                    .addComponent(jTextFieldTelMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabelTituloFormMedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloFormMedico.setText("Cadastrar Médico");

        tbMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbMed);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonNovoMed.setText("Novo");
        jButtonNovoMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoMedActionPerformed(evt);
            }
        });

        jButtonSalvarMed.setText("Salvar");
        jButtonSalvarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarMedActionPerformed(evt);
            }
        });

        jButtonEditarMed.setText("Editar");
        jButtonEditarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarMedActionPerformed(evt);
            }
        });

        jButtonCancelarMed.setText("Cancelar");
        jButtonCancelarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarMedActionPerformed(evt);
            }
        });

        jButtonExcluirMed.setText("Excluir");
        jButtonExcluirMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelarMed)
                    .addComponent(jButtonNovoMed, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonEditarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jButtonExcluirMed, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonNovoMed)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvarMed)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarMed)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarMed)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluirMed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelFormularioMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabelTituloFormMedico)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTituloFormMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFormularioMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(858, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTelMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelMedActionPerformed

    private void jTextFieldEndMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEndMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEndMedActionPerformed

//botao excluir
    private void jButtonExcluirMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirMedActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {

            mod.setCod_med(Integer.parseInt(jTextFieldCodMed.getText()));

            control.Excluir(mod);

            limpar();

            preencherTabela("select *from modelomedico order by especialidade_med");

        }
    }//GEN-LAST:event_jButtonExcluirMedActionPerformed

    
    private void jButtonPesquiMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquiMedActionPerformed

        mod.setPesqui_med(jTextFieldPesquiMed.getText());
        ModeloMedico model = control.buscaMedico(mod);

        jTextFieldCodMed.setText(String.valueOf(model.getCod_med()));
        jTextFieldNomeMed.setText(model.getNome_med());
        jComboBoxEspeMed.setSelectedItem(model.getEspecialidade_med());
        jTextFieldCrm.setText(String.valueOf(model.getCrm_med()));
        jTextFieldEndMed.setText(model.getEnd_med());
        jTextFieldTelMed.setText(model.getTel_med());

    }//GEN-LAST:event_jButtonPesquiMedActionPerformed

    private void jTextFieldPesquiMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquiMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquiMedActionPerformed


    private void jButtonSalvarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarMedActionPerformed

        
        mod.setNome_med(jTextFieldNomeMed.getText());
        mod.setCrm_med(Integer.parseInt(jTextFieldCrm.getText()));
        mod.setEspecialidade_med((String) jComboBoxEspeMed.getSelectedItem());
        mod.setEnd_med(jTextFieldEndMed.getText());
        mod.setTel_med(jTextFieldTelMed.getText());

        control.Salvar(mod); 

        limpar();

        preencherTabela("select *from modelomedico order by especialidade_med");

    }//GEN-LAST:event_jButtonSalvarMedActionPerformed


    private void jButtonNovoMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoMedActionPerformed

        limpar();
       
    }//GEN-LAST:event_jButtonNovoMedActionPerformed

    
    private void jButtonCancelarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarMedActionPerformed

        limpar();

    }//GEN-LAST:event_jButtonCancelarMedActionPerformed


    private void jButtonEditarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarMedActionPerformed

        mod.setCod_med(Integer.parseInt(jTextFieldCodMed.getText()));
        mod.setNome_med(jTextFieldNomeMed.getText());
        mod.setCrm_med(Integer.parseInt(jTextFieldCrm.getText()));
        mod.setEspecialidade_med((String) jComboBoxEspeMed.getSelectedItem());
        mod.setEnd_med(jTextFieldEndMed.getText());
        mod.setTel_med(jTextFieldTelMed.getText());

        control.Editar(mod); //chamando método editar
        limpar();
        preencherTabela("select *from modelomedico order by especialidade_med");

    }//GEN-LAST:event_jButtonEditarMedActionPerformed

 
    public void preencherTabela(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Nome", "CRM", "Especialidade", "Endereço", "Telefone"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {
               
                dados.add(new Object[]{conex.rs.getInt("cod_med"),
                    conex.rs.getString("nome_med"),
                    conex.rs.getInt("crm_med"),
                    conex.rs.getString("especialidade_med"),
                    conex.rs.getString("end_med"),
                    conex.rs.getString("tel_med")});

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!" + ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tbMed.setModel(modelo);

      
        tbMed.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbMed.getColumnModel().getColumn(1).setPreferredWidth(180);
        tbMed.getColumnModel().getColumn(2).setPreferredWidth(60);
        tbMed.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbMed.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbMed.getColumnModel().getColumn(5).setPreferredWidth(80);

       
        tbMed.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbMed.getBorder();

        conex.desconecta();

    }

    private void jComboBoxEspeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspeMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspeMedActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelarMed;
    private javax.swing.JButton jButtonEditarMed;
    private javax.swing.JButton jButtonExcluirMed;
    private javax.swing.JButton jButtonNovoMed;
    private javax.swing.JButton jButtonPesquiMed;
    private javax.swing.JButton jButtonSalvarMed;
    private javax.swing.JComboBox<String> jComboBoxEspeMed;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelEndMed;
    private javax.swing.JLabel jLabelEspecialidadeMed;
    private javax.swing.JLabel jLabelNomeMed;
    private javax.swing.JLabel jLabelTelMed;
    private javax.swing.JLabel jLabelTituloFormMedico;
    private javax.swing.JLabel jLabelcodMed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormularioMedico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCodMed;
    private javax.swing.JTextField jTextFieldCrm;
    private javax.swing.JTextField jTextFieldEndMed;
    private javax.swing.JTextField jTextFieldNomeMed;
    private javax.swing.JTextField jTextFieldPesquiMed;
    private javax.swing.JTextField jTextFieldTelMed;
    private javax.swing.JTable tbMed;
    // End of variables declaration//GEN-END:variables
}
