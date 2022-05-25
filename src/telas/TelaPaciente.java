package telas;

import Commun.TextPrompt;
import Dao.EnderecoDao;
import Dao.PacienteDao;
import Pacotes.Paciente; 
import SubTelas.Paciente.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPaciente extends javax.swing.JFrame {
    
    String cargo;
    DefaultTableModel tableModel;
    
    public TelaPaciente(){
        initComponents();  
    }
    
    public TelaPaciente(String gestor) {
        initComponents();
        TextPrompt tx = new TextPrompt("Digite o nome do paciente", txtPesquisa);
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProntuario.setToolTipText("Prontuário");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");
        btnEditarPaciente.setEnabled(false);
        btnRemover.setEnabled(false);
        this.cargo = gestor;
        mostrar(true);
        
    }
    
    private final Color C1 = new Color(51,153,255), C2 = new Color(0,102,255);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnBuscarPaciente = new javax.swing.JButton();
        btnAdicionarPaciente = new javax.swing.JButton();
        btnEditarPaciente = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidentes");
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(51, 153, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeInicio.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 11, 108, 108));

        btnAgenda.setBackground(new java.awt.Color(51, 153, 255));
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeAgenda.png"))); // NOI18N
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, 108, 108));

        btnPaciente.setBackground(new java.awt.Color(0, 102, 255));
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconePaciente.png"))); // NOI18N
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 247, 108, 108));

        btnFinanceiro.setBackground(new java.awt.Color(51, 153, 255));
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeFinanceiro.png"))); // NOI18N
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 601, 108, 108));

        btnEstoque.setBackground(new java.awt.Color(51, 153, 255));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeEstoque.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 365, 108, 108));

        btnProntuario.setBackground(new java.awt.Color(51, 153, 255));
        btnProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeProntuario.png"))); // NOI18N
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProntuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 483, 108, 108));

        txtPesquisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 28, 400, 50));

        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 13, 90, 39));

        btnAdicionarPaciente.setText("Adicionar");
        btnAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 11, 90, 42));

        btnEditarPaciente.setText("Editar");
        btnEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 65, 90, 39));

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 65, 90, 39));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPaciente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblPaciente.getTableHeader().setResizingAllowed(false);
        tblPaciente.getTableHeader().setReorderingAllowed(false);
        tblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPaciente);
        if (tblPaciente.getColumnModel().getColumnCount() > 0) {
            tblPaciente.getColumnModel().getColumn(0).setResizable(false);
            tblPaciente.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblPaciente.getColumnModel().getColumn(1).setResizable(false);
            tblPaciente.getColumnModel().getColumn(1).setPreferredWidth(340);
            tblPaciente.getColumnModel().getColumn(2).setResizable(false);
            tblPaciente.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblPaciente.getColumnModel().getColumn(3).setResizable(false);
            tblPaciente.getColumnModel().getColumn(3).setPreferredWidth(310);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 110, 1050, 580));

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPricipal.jpg"))); // NOI18N
        getContentPane().add(imgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 720));

        setSize(new java.awt.Dimension(1214, 757));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        TelaInicial t = new TelaInicial(cargo);
        t.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        Estoque e = new Estoque(cargo);
        e.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        TelaFinanceiro financeiro = new TelaFinanceiro(cargo);
        financeiro.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        TelaProtuario prontuario = new TelaProtuario(cargo);
        prontuario.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        btnInicio.setBackground(C1);
        btnAgenda.setBackground(C1);
        btnPaciente.setBackground(C2);
        btnFinanceiro.setBackground(C1);
        btnEstoque.setBackground(C1);
        btnProntuario.setBackground(C1);
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        Agenda a = new Agenda(cargo);
        a.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarPacienteActionPerformed
        CadastroPacientes p = new CadastroPacientes(this);
        p.setVisible(true);       
        
    }//GEN-LAST:event_btnAdicionarPacienteActionPerformed

    private void btnEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacienteActionPerformed
        PacienteDao pacienteDao = new PacienteDao();
        Paciente pac;
        
        if(tblPaciente.getSelectedRow() > -1){
            if(pacienteDao.conectar()){    
                pac = pacienteDao.buscar(tableModel.getValueAt(tblPaciente.getSelectedRow(),0).toString());
                    EditarPacientes ep = new EditarPacientes(pac, this);
                    ep.setVisible(true);
                    btnEditarPaciente.setEnabled(false);
                    btnRemover.setEnabled(false);

            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione paciente antes");
        } 
    }//GEN-LAST:event_btnEditarPacienteActionPerformed

    private void tblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacienteMouseClicked
        //ativar botão editar
        if(tblPaciente.getSelectedRow() > -1){
            btnEditarPaciente.setEnabled(true);
            btnRemover.setEnabled(true);
        }
        
    }//GEN-LAST:event_tblPacienteMouseClicked

        
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
         //Importando as classe
        PacienteDao pacienteDao = new PacienteDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        int idEndereco;
        String Cpf;
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover esse paciente?", "Alerta", JOptionPane.YES_NO_OPTION); //Fazendo a confirmação       
        if(confirmacao == JOptionPane.YES_NO_OPTION){           
            if(pacienteDao.conectar()){ //Conectando a banco de dados
                if(enderecoDao.conectar()){  
                    //Passando os valores para serem usando como base para apagar
                    Cpf = tblPaciente.getValueAt(tblPaciente.getSelectedRow(), 0).toString();
                    //Tentando apagar
                    idEndereco = pacienteDao.retornarIdEndereco(Cpf);
                    if(pacienteDao.apagar(Cpf) != 1){
                        JOptionPane.showMessageDialog(null, "Não foi possivel dsad o paciente!");
                        return;
                    }
                    if(enderecoDao.apagar(idEndereco) == 1){
                        tableModel.setRowCount(0);
                        mostrar(true);
                        JOptionPane.showMessageDialog(null, "Paciente removido com sucesso"); //Apagado
                    }else{
                        JOptionPane.showMessageDialog(null, "Não foi possivel remover o paciente!"); //Não Apagadao
                    }
                //Erro de conexão com o banco de dados
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela endereço, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela paciente, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            //Fazer nada
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        // TODO add your handling code here:
        mostrar(false);
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    
    public final void mostrar(boolean tudo){       
        PacienteDao pacienteDao = new PacienteDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        ArrayList<Paciente> paciente;
        String rua = "ERRO";
        
        if(pacienteDao.conectar()){
            if(tudo){
                paciente = pacienteDao.listar();
            }else{
                paciente = pacienteDao.listar(txtPesquisa.getText(),"Tudo");
            }
            if(paciente != null){
                tableModel = (DefaultTableModel) tblPaciente.getModel();
                tableModel.setNumRows(0);
                for (Paciente valor : paciente) {
                    if(enderecoDao.conectar()){
                        rua = enderecoDao.buscarRua(valor.getidEndereco());
                        enderecoDao.desconectar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela endereço");
                    }
                    tableModel.addRow(new Object[]{
                        valor.getCpf(),
                        valor.getNome(),
                        valor.getTelefone(),
                        rua                     
                    });
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao buscar Pacientes, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            pacienteDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao buscar paciente, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void paciente(String args[]) {
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
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
   

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarPaciente;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnEditarPaciente;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaciente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
