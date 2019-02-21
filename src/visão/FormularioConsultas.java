package visão;

import controle.ConexaoBd;
import controle.ControleConsultas;
import controle.CorretorData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import modelo.ModeloConsultas;
import modelo.ModeloMedico;
import modelo.ModeloPaciente;
import modelo.ModeloTabela;

public class FormularioConsultas extends javax.swing.JFrame {

    ModeloConsultas mod = new ModeloConsultas();
    ControleConsultas control = new ControleConsultas();
    ConexaoBd conex = new ConexaoBd();

    public FormularioConsultas() {
        initComponents();
        preencherTabelac("select c.codc,c.paciente,p.nomep,c.medico,m.nome_med,m.especialidade_med,c.data,c.hora,c.local from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp left outer join modelomedico m on c.medico = m.cod_med order by c.codc");

       
       ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());
        
    }

    public void limpar() {
        txpaciente.setText("");
        txcodc.setText("");
        txmedico.setText("");
        txhora.setText("");
        txdata.setText("");
        txpesquisa.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txpaciente = new javax.swing.JTextField();
        txmedico = new javax.swing.JTextField();
        txdata = new javax.swing.JTextField();
        txhora = new javax.swing.JTextField();
        txpesquisa = new javax.swing.JTextField();
        bnpesquisa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txcodc = new javax.swing.JTextField();
        txlocal = new javax.swing.JTextField();
        bnConsultarPaciente = new javax.swing.JButton();
        bnConsultarMédico = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bnNovo = new javax.swing.JButton();
        bnSalvar = new javax.swing.JButton();
        bnEditar = new javax.swing.JButton();
        bnExcluir = new javax.swing.JButton();
        bnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendar Consultas");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Codigo do Paciente");

        jLabel3.setText("Codigo do Médico");

        jLabel5.setText("Data");

        jLabel6.setText("Hora");

        txpaciente.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        bnpesquisa.setText("Pesquisar");
        bnpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpesquisaActionPerformed(evt);
            }
        });

        jLabel8.setText("Local");

        jLabel7.setText("Codigo");

        txcodc.setEditable(false);
        txcodc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcodcActionPerformed(evt);
            }
        });

        bnConsultarPaciente.setText("Consultar Paciente");
        bnConsultarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnConsultarPacienteActionPerformed(evt);
            }
        });

        bnConsultarMédico.setText("Consultar Médico");
        bnConsultarMédico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnConsultarMédicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txlocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txdata, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txhora, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnConsultarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txcodc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnpesquisa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txmedico, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnConsultarMédico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txcodc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnpesquisa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(bnConsultarPaciente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txmedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnConsultarMédico)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txlocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235))
        );

        tbc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbc);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Agendar Consultas");

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

        bnExcluir.setText("Excluir");
        bnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnExcluirActionPerformed(evt);
            }
        });

        bnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bnNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bnNovo)
                .addGap(18, 18, 18)
                .addComponent(bnSalvar)
                .addGap(18, 18, 18)
                .addComponent(bnEditar)
                .addGap(18, 18, 18)
                .addComponent(bnExcluir)
                .addGap(18, 18, 18)
                .addComponent(bnCancelar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1054, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed

        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "deseja realmente excluir?");
        if (resposta == JOptionPane.YES_OPTION) {
            mod.setCodc(Integer.parseInt(txcodc.getText()));
            control.Excluir(mod);
           
            preencherTabelac("select c.codc,c.paciente,p.nomep,c.medico,m.nome_med,m.especialidade_med,c.data,c.hora,c.local from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp left outer join modelomedico m on c.medico = m.cod_med order by c.codc");

            limpar();

    }//GEN-LAST:event_bnExcluirActionPerformed
    }


    private void bnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnSalvarActionPerformed

        ModeloMedico m = new ModeloMedico();
        m.setCod_med(Integer.parseInt(txmedico.getText()));
        mod.setMedico(m);

        ModeloPaciente p = new ModeloPaciente();
        p.setCodp(Integer.parseInt(txpaciente.getText()));
        mod.setPaciente(p);

        mod.setData(txdata.getText());
        mod.setHora(txhora.getText());
        mod.setLocal(txlocal.getText());

        control.Salvar(mod);

        limpar();

        preencherTabelac("select c.codc,c.paciente,p.nomep,c.medico,m.nome_med,m.especialidade_med,c.data,c.hora,c.local from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp left outer join modelomedico m on c.medico = m.cod_med order by c.codc");

    }//GEN-LAST:event_bnSalvarActionPerformed

    private void bnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEditarActionPerformed

        mod.setCodc(Integer.parseInt(txcodc.getText()));

        ModeloMedico m = new ModeloMedico();
        m.setCod_med(Integer.parseInt(txmedico.getText()));
        mod.setMedico(m);

        ModeloPaciente p = new ModeloPaciente();
        p.setCodp(Integer.parseInt(txpaciente.getText()));
        mod.setPaciente(p);

        mod.setData(txdata.getText());
        mod.setHora(txhora.getText());
        mod.setLocal(txlocal.getText());

        control.Editar(mod);

        limpar();

          
        preencherTabelac("select c.codc,c.paciente,p.nomep,c.medico,m.nome_med,m.especialidade_med,c.data,c.hora,c.local from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp left outer join modelomedico m on c.medico = m.cod_med order by c.codc");

    }//GEN-LAST:event_bnEditarActionPerformed


    private void bnpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpesquisaActionPerformed

        mod.setPesquisa(txpesquisa.getText());
        ModeloConsultas model = control.buscaConsulta(mod);

        txcodc.setText(String.valueOf(model.getCodc()));

        txpaciente.setText(String.valueOf(model.getPaciente().getCodp()));
        txmedico.setText(String.valueOf(model.getMedico().getCod_med()));

        txdata.setText(model.getData());
        txhora.setText(model.getHora());
        txlocal.setText(model.getLocal());

    }//GEN-LAST:event_bnpesquisaActionPerformed

    private void bnConsultarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnConsultarPacienteActionPerformed
        FormularioPaciente tela = new FormularioPaciente();
        tela.setVisible(true);
        
    }//GEN-LAST:event_bnConsultarPacienteActionPerformed

    private void bnConsultarMédicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnConsultarMédicoActionPerformed
        FormularioMedico tela = new FormularioMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_bnConsultarMédicoActionPerformed

    private void txcodcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcodcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcodcActionPerformed

   
    public void preencherTabelac(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Data", "ID Pac", "Paciente", "ID Med", "Médico", "Especialidade", "Hora", "Local"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{
                    conex.rs.getInt("c.codc"),
                    CorretorData.ConverterParaJava(conex.rs.getString("c.data")),
                    conex.rs.getString("c.paciente"),
                    conex.rs.getString("p.nomep"),
                    conex.rs.getString("c.medico"),
                    conex.rs.getString("m.nome_med"),
                    conex.rs.getString("m.especialidade_med"),
                    conex.rs.getString("c.hora"),
                    conex.rs.getString("c.local")
                });

            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela!" + ex);
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tbc.setModel(modelo);

       
        tbc.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbc.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbc.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbc.getColumnModel().getColumn(3).setPreferredWidth(120);
        tbc.getColumnModel().getColumn(4).setPreferredWidth(50);
        tbc.getColumnModel().getColumn(5).setPreferredWidth(120);
        tbc.getColumnModel().getColumn(6).setPreferredWidth(90);
        tbc.getColumnModel().getColumn(7).setPreferredWidth(60);
        tbc.getColumnModel().getColumn(8).setPreferredWidth(70);
        
        tbc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbc.getBorder();

        conex.desconecta();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCancelar;
    private javax.swing.JButton bnConsultarMédico;
    private javax.swing.JButton bnConsultarPaciente;
    private javax.swing.JButton bnEditar;
    private javax.swing.JButton bnExcluir;
    private javax.swing.JButton bnNovo;
    private javax.swing.JButton bnSalvar;
    private javax.swing.JButton bnpesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbc;
    private javax.swing.JTextField txcodc;
    private javax.swing.JTextField txdata;
    private javax.swing.JTextField txhora;
    private javax.swing.JTextField txlocal;
    private javax.swing.JTextField txmedico;
    private javax.swing.JTextField txpaciente;
    private javax.swing.JTextField txpesquisa;
    // End of variables declaration//GEN-END:variables
}
