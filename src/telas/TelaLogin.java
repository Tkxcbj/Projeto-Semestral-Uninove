package telas;

import Dao.LoginDao;
import Pacotes.Login;
import SubTelas.Suporte;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    
    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUnidentes = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnEsqueceu = new javax.swing.JButton();
        lblUsuario1 = new javax.swing.JLabel();
        imgUnidentes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidentes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUnidentes.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        txtUnidentes.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidentes.setText("UNIDENTES");
        getContentPane().add(txtUnidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 270, -1));

        lblSenha.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        pswSenha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pswSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pswSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(pswSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 270, -1));

        btnEntrar.setBackground(new java.awt.Color(153, 153, 153));
        btnEntrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 180, 30));

        btnEsqueceu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEsqueceu.setForeground(new java.awt.Color(255, 255, 255));
        btnEsqueceu.setText("Esqueceu a Senha?");
        btnEsqueceu.setBorder(null);
        btnEsqueceu.setBorderPainted(false);
        btnEsqueceu.setContentAreaFilled(false);
        btnEsqueceu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuActionPerformed(evt);
            }
        });
        getContentPane().add(btnEsqueceu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        lblUsuario1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("Usuário");
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, -1));

        imgUnidentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Login.png"))); // NOI18N
        getContentPane().add(imgUnidentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        setSize(new java.awt.Dimension(914, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEsqueceuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuActionPerformed
        JOptionPane.showMessageDialog(null, "Você será encaminhado para a tela de suporte");
        SubTelas.Suporte s = new SubTelas.Suporte();
        s.setVisible(true);
    }//GEN-LAST:event_btnEsqueceuActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
         //Chamando Função
        LoginDao loginDao = new LoginDao();
        Login login = new Login();
        
        //Pegando os valores da Tela
        if(txtUsuario.getText().equalsIgnoreCase("") && pswSenha.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo usuario ou senha não pode está vazio");
            return;
        }
        login.setUsuario(txtUsuario.getText());
        login.setSenha(pswSenha.getText());
        
        //Fazendo a conexão com o banco de dados e verificando a auteticidade do usuário
        if(loginDao.conectar()){
            login = loginDao.verificarUsuario(login);
            if(login != null){
                TelaInicial tela = new TelaInicial(login.getCargo());
                tela.setVisible(true);       
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorreto");
                return;
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        //Fazendo o Enter entrar no banco de dados
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEsqueceu;
    private javax.swing.JLabel imgUnidentes;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JLabel txtUnidentes;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
