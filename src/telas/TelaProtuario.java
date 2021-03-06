package telas;
import Commun.TextPrompt;
import Dao.ProntuarioDao;
import Pacotes.Prontuario;
import SubTelas.Protuario.EditarProtuario;
import SubTelas.Protuario.NovoProtuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaProtuario extends javax.swing.JFrame {

    String cargo;
    TextPrompt txp;
    ProntuarioDao prontuarioDao;
    DefaultTableModel tableModel;
    
    public TelaProtuario(){
        initComponents();
    }
    
    public TelaProtuario(String cargo) {
        //Tela
        initComponents();
        this.cargo = cargo;
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProntuario.setToolTipText("Prontuário");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");
        txp = new TextPrompt("Digite o nome", txtPesquisar);
        //Variaveis de inicializar
        btnExcluir.setVisible(false);
        btnEditar.setVisible(false);
        mostrarDados();
    }
    
    private final Color C1 = new Color(51,153,255), C2 = new Color(0,102,255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProtuario = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblTampaLogo2 = new javax.swing.JLabel();
        lblTampaLogo1 = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidentes");
        setMinimumSize(new java.awt.Dimension(1200, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(null);

        btnInicio.setBackground(new java.awt.Color(51, 153, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeInicio.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio);
        btnInicio.setBounds(6, 11, 108, 108);

        btnAgenda.setBackground(new java.awt.Color(51, 153, 255));
        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeAgenda.png"))); // NOI18N
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgenda);
        btnAgenda.setBounds(6, 129, 108, 108);

        btnPaciente.setBackground(new java.awt.Color(51, 153, 255));
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconePaciente.png"))); // NOI18N
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaciente);
        btnPaciente.setBounds(6, 247, 108, 108);

        btnFinanceiro.setBackground(new java.awt.Color(51, 153, 255));
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeFinanceiro.png"))); // NOI18N
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro);
        btnFinanceiro.setBounds(6, 605, 108, 108);

        btnEstoque.setBackground(new java.awt.Color(51, 153, 255));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeEstoque.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstoque);
        btnEstoque.setBounds(6, 365, 108, 108);

        btnProntuario.setBackground(new java.awt.Color(0, 102, 255));
        btnProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeProntuario.png"))); // NOI18N
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProntuario);
        btnProntuario.setBounds(6, 480, 108, 108);

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(220, 30, 610, 50);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(840, 30, 130, 50);

        tblProtuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Contato", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProtuario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblProtuario.getTableHeader().setResizingAllowed(false);
        tblProtuario.getTableHeader().setReorderingAllowed(false);
        tblProtuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProtuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProtuario);
        if (tblProtuario.getColumnModel().getColumnCount() > 0) {
            tblProtuario.getColumnModel().getColumn(0).setResizable(false);
            tblProtuario.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblProtuario.getColumnModel().getColumn(1).setResizable(false);
            tblProtuario.getColumnModel().getColumn(1).setPreferredWidth(370);
            tblProtuario.getColumnModel().getColumn(2).setResizable(false);
            tblProtuario.getColumnModel().getColumn(2).setPreferredWidth(170);
            tblProtuario.getColumnModel().getColumn(3).setResizable(false);
            tblProtuario.getColumnModel().getColumn(3).setPreferredWidth(170);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 160, 920, 550);

        btnNovo.setText("Novo Protuario");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo);
        btnNovo.setBounds(220, 110, 200, 30);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(440, 110, 180, 30);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(640, 110, 210, 30);

        lblTampaLogo2.setBackground(new java.awt.Color(44, 129, 183));
        lblTampaLogo2.setOpaque(true);
        getContentPane().add(lblTampaLogo2);
        lblTampaLogo2.setBounds(1150, 20, 50, 40);

        lblTampaLogo1.setBackground(new java.awt.Color(46, 136, 189));
        lblTampaLogo1.setOpaque(true);
        getContentPane().add(lblTampaLogo1);
        lblTampaLogo1.setBounds(1110, 0, 40, 50);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPricipal.jpg"))); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1216, 759));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        TelaInicial inicial = new TelaInicial(cargo);
        inicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        Estoque estoque = new Estoque(cargo);
        estoque.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        TelaFinanceiro financeiro = new TelaFinanceiro(cargo);
        financeiro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        btnInicio.setBackground(C1);
        btnAgenda.setBackground(C1);
        btnPaciente.setBackground(C1);
        btnFinanceiro.setBackground(C1);
        btnEstoque.setBackground(C1);
        btnProntuario.setBackground(C2);
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        TelaPaciente paciente = new TelaPaciente(cargo);
        paciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        Agenda agenda = new Agenda(cargo);
        agenda.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovoProtuario newPront = new NovoProtuario(this);
        newPront.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tblProtuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProtuarioMouseClicked
        tableModel = (DefaultTableModel) tblProtuario.getModel();
        if(evt.getClickCount() == 2){
            EditarProtuario editar = new EditarProtuario(tableModel.getValueAt(tblProtuario.getSelectedRow(), 0).toString());
            editar.setVisible(true);
        }else if(tblProtuario.getSelectedRow() > -1){
            btnEditar.setVisible(true);
            btnExcluir.setVisible(true);
        }
    }//GEN-LAST:event_tblProtuarioMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        tableModel = tableModel = (DefaultTableModel) tblProtuario.getModel();
        
        EditarProtuario editPront = new EditarProtuario(this, tableModel.getValueAt(tblProtuario.getSelectedRow(), 0).toString());
        editPront.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        prontuarioDao = new ProntuarioDao();
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir o prontuario?\n Essa operação não pode ser desfeita", "Erro", JOptionPane.ERROR_MESSAGE);
        if(resp == 0){
            if(prontuarioDao.conectar()){
                prontuarioDao.apagar(tableModel.getValueAt(tblProtuario.getSelectedRow(), 0).toString());
                tableModel.removeRow(tblProtuario.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Prontuario apagado com sucesso");
                btnExcluir.setVisible(false);
                btnEditar.setVisible(false);
                prontuarioDao.desconectar();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        prontuarioDao = new ProntuarioDao();
        ArrayList<Prontuario> prontuario;
        
        if(txtPesquisar.getText().equals("")){
            mostrarDados();
        }else{
            if(prontuarioDao.conectar()){
                prontuario = prontuarioDao.buscar(txtPesquisar.getText());
                if(prontuario == null){
                    JOptionPane.showMessageDialog(null, "Nenhum prontuario encotrado com esse nome");
                    return;
                }
                tableModel = (DefaultTableModel) tblProtuario.getModel();
                tableModel.setNumRows(0);
                for(Prontuario pront : prontuario){
                    tableModel.addRow(new Object[]{
                        pront.getCpf(),
                        pront.getNome(),
                        pront.getContato(),
                        pront.getValor()
                    });
                }
                prontuarioDao.desconectar();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnPesquisar.doClick();
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    public final void mostrarDados(){
        prontuarioDao = new ProntuarioDao();
        ArrayList<Prontuario> prontuario;
        tableModel = tableModel = (DefaultTableModel) tblProtuario.getModel();
        
        if(prontuarioDao.conectar()){
            prontuario = prontuarioDao.lista();
            if(prontuario == null){
                JOptionPane.showMessageDialog(null, "Não ha prontuario para ser exibidos");
            }else{
                tableModel.setNumRows(0);
                for(Prontuario valor : prontuario)
                    tableModel.addRow(new Object[]{
                        valor.getCpf(),
                        valor.getNome(),
                        valor.getContato(),
                        valor.getValor()
                    });                    
            }
            prontuarioDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void prontuario(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProtuario("gestor").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTampaLogo1;
    private javax.swing.JLabel lblTampaLogo2;
    private javax.swing.JTable tblProtuario;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
