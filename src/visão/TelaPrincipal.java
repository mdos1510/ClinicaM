package visão;

import javax.swing.JFrame;
import controle.ConexaoBd;
import controle.Controlelogin;
import javax.swing.ImageIcon;
import modelo.ModeloLogin;

public class TelaPrincipal extends javax.swing.JFrame {


    ConexaoBd conecta = new ConexaoBd();
    ModeloLogin mod = new ModeloLogin();
  
    Controlelogin control = new Controlelogin();
   
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());

           
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternel = new javax.swing.JPanel();
        bnEnfermeiro = new javax.swing.JButton();
        bnFuncionario = new javax.swing.JButton();
        bnPaciente = new javax.swing.JButton();
        bnMedico = new javax.swing.JButton();
        bnConsultas = new javax.swing.JButton();
        jLabelPaciente11 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelEnfermeiro11 = new javax.swing.JLabel();
        jLabelAgenda11 = new javax.swing.JLabel();
        jLabelMedico11 = new javax.swing.JLabel();
        jLabelPanelfundo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelGSistem = new javax.swing.JLabel();
        lbAcesso = new javax.swing.JLabel();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        formMenu = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuItemMedico = new javax.swing.JMenuItem();
        jMenuItemPaciente = new javax.swing.JMenuItem();
        jMenuItemEnfermeiro = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAgendarConsultas = new javax.swing.JMenuItem();
        jMenuAgendarExames = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuDiagnótico = new javax.swing.JMenuItem();
        jMenuBemVindo = new javax.swing.JMenu();
        jMenuItemChamaTelaBemVindo = new javax.swing.JMenuItem();
        menulogin = new javax.swing.JMenu();
        MenuCadastrarUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Medsa");
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setClosable(true);
        jInternalFrameBemVindo.setTitle("Bem Vindo");
        jInternalFrameBemVindo.setVisible(true);

        jPanelInternel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternel.setLayout(null);

        bnEnfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/enfermeiro11.png"))); // NOI18N
        bnEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEnfermeiroActionPerformed(evt);
            }
        });
        jPanelInternel.add(bnEnfermeiro);
        bnEnfermeiro.setBounds(150, 40, 97, 70);

        bnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/usuario11.png"))); // NOI18N
        bnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnFuncionarioActionPerformed(evt);
            }
        });
        jPanelInternel.add(bnFuncionario);
        bnFuncionario.setBounds(40, 190, 97, 70);

        bnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/paciente11.png"))); // NOI18N
        bnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPacienteActionPerformed(evt);
            }
        });
        jPanelInternel.add(bnPaciente);
        bnPaciente.setBounds(270, 40, 97, 70);

        bnMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Medico11.png"))); // NOI18N
        bnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMedicoActionPerformed(evt);
            }
        });
        jPanelInternel.add(bnMedico);
        bnMedico.setBounds(30, 40, 97, 70);

        bnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/agenda11.png"))); // NOI18N
        bnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnConsultasActionPerformed(evt);
            }
        });
        jPanelInternel.add(bnConsultas);
        bnConsultas.setBounds(180, 190, 73, 70);

        jLabelPaciente11.setText("Pacientes");
        jPanelInternel.add(jLabelPaciente11);
        jLabelPaciente11.setBounds(290, 120, 60, 14);

        jLabelUsuario.setText("Funcionários");
        jPanelInternel.add(jLabelUsuario);
        jLabelUsuario.setBounds(60, 270, 80, 14);

        jLabelEnfermeiro11.setText("Enfermeiros");
        jPanelInternel.add(jLabelEnfermeiro11);
        jLabelEnfermeiro11.setBounds(170, 114, 70, 20);

        jLabelAgenda11.setText("Consultas - Agenda");
        jPanelInternel.add(jLabelAgenda11);
        jLabelAgenda11.setBounds(170, 270, 110, 14);

        jLabelMedico11.setText("Médicos");
        jPanelInternel.add(jLabelMedico11);
        jLabelMedico11.setBounds(60, 120, 60, 14);

        jLabelPanelfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/internalframe.png"))); // NOI18N
        jPanelInternel.add(jLabelPanelfundo);
        jLabelPanelfundo.setBounds(0, 0, 1247, 625);

        jButton1.setText("jButton1");
        jPanelInternel.add(jButton1);
        jButton1.setBounds(290, 190, 100, 70);

        jLabelGSistem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelGSistem.setText("Gerenciamento de Sistema");

        javax.swing.GroupLayout jInternalFrameBemVindoLayout = new javax.swing.GroupLayout(jInternalFrameBemVindo.getContentPane());
        jInternalFrameBemVindo.getContentPane().setLayout(jInternalFrameBemVindoLayout);
        jInternalFrameBemVindoLayout.setHorizontalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addGroup(jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanelInternel, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelGSistem, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameBemVindoLayout.setVerticalGroup(
            jInternalFrameBemVindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameBemVindoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGSistem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelInternel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(60, 40, 820, 460);
        getContentPane().add(lbAcesso);
        lbAcesso.setBounds(770, 10, 110, 20);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/FundoTelaPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 1600, 1200);

        jMenuCadastrar.setText("Cadastrar");

        jMenuItemMedico.setText("Médico");
        jMenuItemMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMedicoActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemMedico);

        jMenuItemPaciente.setText("Paciente");
        jMenuItemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacienteActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemPaciente);

        jMenuItemEnfermeiro.setText("Enfermeiro");
        jMenuItemEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnfermeiroActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemEnfermeiro);

        jMenuItemUsuario.setText("Funcionario");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuItemUsuario);

        formMenu.add(jMenuCadastrar);

        jMenu2.setText("Agenda");

        jMenuAgendarConsultas.setText("Agendar consulta");
        jMenuAgendarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendarConsultasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAgendarConsultas);

        jMenuAgendarExames.setText("Agendar exame");
        jMenuAgendarExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgendarExamesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAgendarExames);

        formMenu.add(jMenu2);

        jMenu1.setText("Diagnóstico");

        jMenuDiagnótico.setText("Resultado de Exames");
        jMenuDiagnótico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDiagnóticoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuDiagnótico);

        formMenu.add(jMenu1);

        jMenuBemVindo.setText("Ferramentas");

        jMenuItemChamaTelaBemVindo.setText("Bem-Vindo");
        jMenuItemChamaTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChamaTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuBemVindo.add(jMenuItemChamaTelaBemVindo);

        formMenu.add(jMenuBemVindo);

        menulogin.setText("Login");

        MenuCadastrarUsuario.setText("Cadastrar Usuário");
        MenuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarUsuarioActionPerformed(evt);
            }
        });
        menulogin.add(MenuCadastrarUsuario);

        formMenu.add(menulogin);

        jMenu4.setText("Sair");

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuSair);

        formMenu.add(jMenu4);

        setJMenuBar(formMenu);

        setSize(new java.awt.Dimension(944, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void bnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMedicoActionPerformed
        ListaDeMedicos tela = new ListaDeMedicos();

        tela.setVisible(true);

    }//GEN-LAST:event_bnMedicoActionPerformed
   
    private void bnEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEnfermeiroActionPerformed
        ListaEnfermeiros tela = new ListaEnfermeiros();
        tela.setVisible(true);
    }//GEN-LAST:event_bnEnfermeiroActionPerformed
    
    private void bnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPacienteActionPerformed
        ListaPaciente tela = new ListaPaciente();
        tela.setVisible(true);
    }//GEN-LAST:event_bnPacienteActionPerformed
    
    private void bnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnFuncionarioActionPerformed
        ListaFuncionario tela = new ListaFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_bnFuncionarioActionPerformed
    
    private void jMenuItemChamaTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChamaTelaBemVindoActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItemChamaTelaBemVindoActionPerformed

    
    private void jMenuItemMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMedicoActionPerformed
        FormularioMedico tela = new FormularioMedico();
        tela.setVisible(true);


    }//GEN-LAST:event_jMenuItemMedicoActionPerformed
   
    private void jMenuItemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacienteActionPerformed
        FormularioPaciente tela = new FormularioPaciente();
        tela.setVisible(true);

    }//GEN-LAST:event_jMenuItemPacienteActionPerformed
    
    private void jMenuItemEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnfermeiroActionPerformed
        FormularioEnfermeiro tela = new FormularioEnfermeiro();
        tela.setVisible(true);

    }//GEN-LAST:event_jMenuItemEnfermeiroActionPerformed
    
    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        FormularioFuncionario tela = new FormularioFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed
    
    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        conecta.desconecta();
        System.exit(0);

    }//GEN-LAST:event_jMenuSairActionPerformed

    private void bnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnConsultasActionPerformed
        ListaConsultas tela = new ListaConsultas();
        tela.setVisible(true);

    }//GEN-LAST:event_bnConsultasActionPerformed

    private void jMenuAgendarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendarConsultasActionPerformed
        FormularioConsultas tela = new FormularioConsultas();
        tela.setVisible(true);


    }//GEN-LAST:event_jMenuAgendarConsultasActionPerformed

    private void jMenuAgendarExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgendarExamesActionPerformed
        FormularioExames tela = new FormularioExames();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuAgendarExamesActionPerformed

    private void jMenuDiagnóticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDiagnóticoActionPerformed
        FormularioDiagnostico tela = new FormularioDiagnostico();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuDiagnóticoActionPerformed

    private void MenuCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarUsuarioActionPerformed
        FormularioLogin tela = new FormularioLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_MenuCadastrarUsuarioActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadastrarUsuario;
    private javax.swing.JButton bnConsultas;
    private javax.swing.JButton bnEnfermeiro;
    private javax.swing.JButton bnFuncionario;
    private javax.swing.JButton bnMedico;
    private javax.swing.JButton bnPaciente;
    private javax.swing.JMenuBar formMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelAgenda11;
    private javax.swing.JLabel jLabelEnfermeiro11;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelGSistem;
    private javax.swing.JLabel jLabelMedico11;
    private javax.swing.JLabel jLabelPaciente11;
    private javax.swing.JLabel jLabelPanelfundo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuAgendarConsultas;
    private javax.swing.JMenuItem jMenuAgendarExames;
    private javax.swing.JMenu jMenuBemVindo;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuDiagnótico;
    private javax.swing.JMenuItem jMenuItemChamaTelaBemVindo;
    private javax.swing.JMenuItem jMenuItemEnfermeiro;
    private javax.swing.JMenuItem jMenuItemMedico;
    private javax.swing.JMenuItem jMenuItemPaciente;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JPanel jPanelInternel;
    public static javax.swing.JLabel lbAcesso;
    public static javax.swing.JMenu menulogin;
    // End of variables declaration//GEN-END:variables
}
