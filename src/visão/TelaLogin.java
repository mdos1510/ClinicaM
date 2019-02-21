package visão;

import controle.ConexaoBd;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;
import controle.Controlelogin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLogin extends javax.swing.JFrame {

    ModeloLogin mod = new ModeloLogin();    
    ConexaoBd conex = new ConexaoBd();
    Controlelogin control = new Controlelogin();

    public TelaLogin() {
        initComponents();

        
        ImageIcon icone = new ImageIcon("src/imagem/titulo.png");
        setIconImage(icone.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        txUsuario = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        txSenha = new javax.swing.JPasswordField();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        lbFundoVerde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUsuario.setText("Usuário");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(260, 140, 70, 30);
        getContentPane().add(txUsuario);
        txUsuario.setBounds(330, 140, 170, 30);

        lbSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSenha.setText("Senha");
        getContentPane().add(lbSenha);
        lbSenha.setBounds(260, 200, 60, 30);
        getContentPane().add(txSenha);
        txSenha.setBounds(330, 200, 170, 30);

        jButtonAcessar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(310, 260, 80, 30);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(420, 260, 80, 30);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/logo.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(20, 10, 270, 80);

        lbFundoVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Fundologin.jpg"))); // NOI18N
        getContentPane().add(lbFundoVerde);
        lbFundoVerde.setBounds(0, 0, 3840, 2160);

        setSize(new java.awt.Dimension(582, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed

    
        
         
       conex.conexao();
       String sql = "Select usuario,senha from modelologin where usuario=? and senha=?";
       try {
           PreparedStatement st = conex.con.prepareCall(sql);
           st.setString(1,txUsuario.getText());
           st.setString(2,txSenha.getText());
           conex.rs = st.executeQuery();
           if(conex.rs.next()){
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            tela.toBack();
            dispose();   
           
           }else{
                JOptionPane.showMessageDialog(rootPane,"Usuário ou Senha Inválida");
           }
       } catch (SQLException ex) {
           Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
       }
       
        
   
       
      

    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel lbFundoVerde;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField txSenha;
    private javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
