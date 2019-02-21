package visão;

import controle.ConexaoBd;
import controle.ControleConsultas;
import controle.CorretorData;
import java.sql.Connection;
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

public class ListaConsultas extends javax.swing.JFrame {

    ControleConsultas control = new ControleConsultas();
    ModeloPaciente p = new ModeloPaciente();
    ModeloConsultas mod = new ModeloConsultas();
    ModeloMedico m = new ModeloMedico();
    ConexaoBd conex = new ConexaoBd();

    public ListaConsultas() {
        initComponents();
       
        preencherTabelac1("select c.codc,c.paciente,p.nomep,c.medico,m.nome_med,m.especialidade_med,c.data,c.hora,c.local from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp left outer join modelomedico m on c.medico = m.cod_med order by c.codc");

        
       ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
       setIconImage(icone.getImage());
        
    }

    
    public void preencherTabelac1(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Data", "Paciente", "Médico", "Especialidade", "Hora", "Local"};

        conex.executaSql(Sql);

        try {
            conex.rs.first();
            do {

                dados.add(new Object[]{
                    conex.rs.getInt("c.codc"),
                    CorretorData.ConverterParaJava(conex.rs.getString("c.data")),
                    conex.rs.getString("p.nomep"),
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
        tbc.getColumnModel().getColumn(1).setPreferredWidth(80);
        tbc.getColumnModel().getColumn(2).setPreferredWidth(180);
        tbc.getColumnModel().getColumn(3).setPreferredWidth(180);
        tbc.getColumnModel().getColumn(3).setPreferredWidth(180);
        tbc.getColumnModel().getColumn(4).setPreferredWidth(80);
        tbc.getColumnModel().getColumn(5).setPreferredWidth(80);

        tbc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//usuario pode selecionar um campo por vez
        Border border = tbc.getBorder();

        conex.desconecta();

    }

    
    public void preencherTabelac2(String Sql) {

        conex.conexao();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Código", "Data", "Paciente", "Médico", "Especialidade", "Hora", "Local"};

        conex.executaSql(Sql);

        mod.setPesquisames1(CorretorData.ConverterParaSql(txmes1.getText()));
        mod.setPesquisames2(CorretorData.ConverterParaSql(txmes2.getText()));

        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{
                    conex.rs.getInt("c.codc"),
                    CorretorData.ConverterParaJava(conex.rs.getString("c.data")),
                    conex.rs.getString("p.nomep"),
                    conex.rs.getString("m.nome_med"),
                    conex.rs.getString("m.especialidade_med"),
                    conex.rs.getString("c.hora"),
                    conex.rs.getString("c.local")
                });

            } while (conex.rs.next());
        } catch (SQLException ex) {
          
        }

        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        tbc.setModel(modelo);

        tbc.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbc.getColumnModel().getColumn(2).setPreferredWidth(180);
        tbc.getColumnModel().getColumn(3).setPreferredWidth(180);
        tbc.getColumnModel().getColumn(3).setPreferredWidth(180);
        tbc.getColumnModel().getColumn(4).setPreferredWidth(80);
        tbc.getColumnModel().getColumn(5).setPreferredWidth(80);

        tbc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Border border = tbc.getBorder();

        conex.desconecta();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bnPesquisar = new javax.swing.JButton();
        txmes1 = new javax.swing.JTextField();
        txmes2 = new javax.swing.JTextField();
        bnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbc = new javax.swing.JTable();
        bnMarcarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Consultas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Data inicial");

        jLabel3.setText("Data final");

        bnPesquisar.setText("Pesquisar");
        bnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPesquisarActionPerformed(evt);
            }
        });

        bnVoltar.setText("Voltar");
        bnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txmes1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txmes2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bnPesquisar)
                    .addComponent(jLabel3)
                    .addComponent(txmes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txmes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnVoltar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Lista de Consultas");

        tbc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbc);

        bnMarcarConsulta.setText("Agendar Consulta");
        bnMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnMarcarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(449, 449, 449)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(bnMarcarConsulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bnMarcarConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPesquisarActionPerformed
       
        preencherTabelac2("Select c.codc,p.nomep,m.nome_med,m.especialidade_med,c.data,c.hora,c.local"
                + " from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp "
                + "left outer join modelomedico m on c.medico = m.cod_med"
                + " WHERE c.data  BETWEEN  '" + mod.getPesquisames1() + "' AND '" + mod.getPesquisames2() + "' order by c.data "); 

        preencherTabelac2("Select c.codc,p.nomep,m.nome_med,m.especialidade_med,c.data,c.hora,c.local"
                + " from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp "
                + "left outer join modelomedico m on c.medico = m.cod_med"
                + " WHERE c.data  BETWEEN  '" + mod.getPesquisames1() + "' AND '" + mod.getPesquisames2() + "' order by c.data");


    }//GEN-LAST:event_bnPesquisarActionPerformed

    private void bnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnVoltarActionPerformed
        preencherTabelac1("select c.codc,c.paciente,p.nomep,c.medico,m.nome_med,m.especialidade_med,c.data,c.hora,c.local from modeloconsultas c left outer join modelopaciente p on c.paciente = p.codp left outer join modelomedico m on c.medico = m.cod_med order by c.codc");
    }//GEN-LAST:event_bnVoltarActionPerformed

    private void bnMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnMarcarConsultaActionPerformed
        FormularioConsultas tela = new FormularioConsultas();
        tela.setVisible(true);
        
    }//GEN-LAST:event_bnMarcarConsultaActionPerformed
  private Connection cone = new ConexaoBd().conectar();
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
            java.util.logging.Logger.getLogger(ListaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnMarcarConsulta;
    private javax.swing.JButton bnPesquisar;
    private javax.swing.JButton bnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbc;
    private javax.swing.JTextField txmes1;
    private javax.swing.JTextField txmes2;
    // End of variables declaration//GEN-END:variables
}
