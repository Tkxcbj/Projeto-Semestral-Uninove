package telas;

import SubTelas.Funcionario.ListaFuncionarios;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor
 */
public class TelaInicial extends javax.swing.JFrame {
    
    String cargo;
    
    public TelaInicial() {
        initComponents();
        btnFuncionarios.setVisible(false);
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFuncionarios.setToolTipText("Funcionarios");
        btnSair.setToolTipText("Sair");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProntuario.setToolTipText("Prontuario");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");  
        this.cargo = "gestor";
        nvAcesso(cargo);
    }
    
    public TelaInicial(String cargo){
        System.out.println(cargo);
        initComponents();
        btnFuncionarios.setVisible(false);
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFuncionarios.setToolTipText("Funcionarios");
        btnSair.setToolTipText("Sair");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProntuario.setToolTipText("Prontuario");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");  
        this.cargo = cargo;
        nvAcesso(cargo);
    }
    
    private final Color C1 = new Color(51,153,255), C2 = new Color(0,102,255);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSair = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidentes");
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(null);

        btnSair.setBackground(new java.awt.Color(51, 153, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconelogoff.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(590, 490, 200, 120);

        btnFuncionarios.setBackground(new java.awt.Color(51, 153, 255));
        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeFuncionarios.png"))); // NOI18N
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnFuncionarios);
        btnFuncionarios.setBounds(490, 340, 200, 120);

        btnInicio.setBackground(new java.awt.Color(0, 102, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeInicio.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio);
        btnInicio.setBounds(260, 190, 200, 120);

        btnAgenda.setBackground(new java.awt.Color(51, 153, 255));
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeAgenda.png"))); // NOI18N
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgenda);
        btnAgenda.setBounds(490, 190, 200, 120);

        btnPaciente.setBackground(new java.awt.Color(51, 153, 255));
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconePaciente.png"))); // NOI18N
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaciente);
        btnPaciente.setBounds(720, 190, 200, 120);

        btnFinanceiro.setBackground(new java.awt.Color(51, 153, 255));
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeFinanceiro.png"))); // NOI18N
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro);
        btnFinanceiro.setBounds(260, 340, 200, 120);

        btnEstoque.setBackground(new java.awt.Color(51, 153, 255));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeEstoque.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstoque);
        btnEstoque.setBounds(720, 340, 200, 120);

        btnProntuario.setBackground(new java.awt.Color(51, 153, 255));
        btnProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeProntuario.png"))); // NOI18N
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProntuario);
        btnProntuario.setBounds(350, 490, 200, 120);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tela Principal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 70, 1200, 98);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPricipal.jpg"))); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1216, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        btnInicio.setBackground(C2);
        btnAgenda.setBackground(C1);
        btnPaciente.setBackground(C1);
        btnFinanceiro.setBackground(C1);
        btnEstoque.setBackground(C1);
        btnProntuario.setBackground(C1);
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed

        
        Estoque e = new Estoque(cargo);
        e.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed

        
        TelaFinanceiro f = new TelaFinanceiro(cargo);
        f.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed

        
        TelaProtuario d = new TelaProtuario(cargo);
        d.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        TelaPaciente p = new TelaPaciente(cargo);
        p.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        Agenda a = new Agenda(cargo);
        a.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        ListaFuncionarios listaFuncionarios = new ListaFuncionarios();
        listaFuncionarios.setVisible(true);      
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja mesmo se desconectar?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void nvAcesso(String cargo){
        if(cargo.equalsIgnoreCase("Gestor") | cargo.equalsIgnoreCase("Diretor")){
            btnFuncionarios.setVisible(true);
        }
    }
    
    public static void telaInicial(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
