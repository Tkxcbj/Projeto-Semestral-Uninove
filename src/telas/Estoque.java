package telas;

import Dao.EstoqueDao;
import Pacotes.Produto;
import java.awt.Color;
import SubTelas.Estoque.*;
import java.text.DateFormat;
import Commun.TextPrompt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class Estoque extends javax.swing.JFrame {

    String cargo;
    TextPrompt nome;
    DefaultTableModel tableModel;
    EstoqueDao produtoDao = new EstoqueDao();

    public Estoque() {
        initComponents();
        this.tableModel = (DefaultTableModel) tblEstoque.getModel();
    }

    public Estoque(String cargo) {
        initComponents();
        this.tableModel = (DefaultTableModel) tblEstoque.getModel();
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProtuario.setToolTipText("Prontuário");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");
        nome = new TextPrompt("Digite o nome do Produto", txtProduto);
        inicio();
        this.cargo = cargo;
    }

    private final Color C1 = new Color(51, 153, 255), C2 = new Color(0, 102, 255);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnProtuario = new javax.swing.JButton();
        txtProduto = new javax.swing.JTextField();
        btnPesquisaEstoque = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnAlterarQuantidade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        cbxModoPesquisa = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        imgFundo = new javax.swing.JLabel();

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
        btnFinanceiro.setBounds(6, 601, 108, 108);

        btnEstoque.setBackground(new java.awt.Color(0, 102, 255));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeEstoque.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstoque);
        btnEstoque.setBounds(6, 365, 108, 108);

        btnProtuario.setBackground(new java.awt.Color(51, 153, 255));
        btnProtuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeProntuario.png"))); // NOI18N
        btnProtuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProtuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProtuario);
        btnProtuario.setBounds(6, 483, 108, 108);

        txtProduto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(txtProduto);
        txtProduto.setBounds(322, 40, 400, 50);

        btnPesquisaEstoque.setText("Pesquisar");
        btnPesquisaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisaEstoque);
        btnPesquisaEstoque.setBounds(722, 40, 100, 50);

        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarProduto);
        btnAdicionarProduto.setBounds(922, 11, 100, 50);

        btnAlterarQuantidade.setText("Quantidade");
        btnAlterarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterarQuantidade);
        btnAlterarQuantidade.setBounds(922, 67, 100, 50);

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Validade"
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
        tblEstoque.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblEstoque.getTableHeader().setResizingAllowed(false);
        tblEstoque.getTableHeader().setReorderingAllowed(false);
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstoque);
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(190);
            tblEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(498);
            tblEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(160);
            tblEstoque.getColumnModel().getColumn(3).setResizable(false);
            tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(132, 137, 1050, 580);

        cbxModoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tudo", "Vencido", "Minimo" }));
        cbxModoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxModoPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(cbxModoPesquisa);
        cbxModoPesquisa.setBounds(1034, 67, 100, 50);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(1034, 11, 100, 50);

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPricipal.jpg"))); // NOI18N
        getContentPane().add(imgFundo);
        imgFundo.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1214, 727));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        TelaInicial t = new TelaInicial(cargo);
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        btnInicio.setBackground(C1);
        btnAgenda.setBackground(C1);
        btnPaciente.setBackground(C1);
        btnFinanceiro.setBackground(C1);
        btnEstoque.setBackground(C2);
        btnProtuario.setBackground(C1);
  }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        TelaFinanceiro f = new TelaFinanceiro(cargo);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProtuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProtuarioActionPerformed
        TelaProtuario d = new TelaProtuario(cargo);
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProtuarioActionPerformed

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

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        CadastrarProduto cadastroProd = new CadastrarProduto(btnPesquisaEstoque);
        cadastroProd.setVisible(true);
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnAlterarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarQuantidadeActionPerformed
        alterarQuatidade retirar = new alterarQuatidade(this, Integer.parseInt(String.valueOf((tableModel.getValueAt(tblEstoque.getSelectedRow(), 0)))));
        retirar.setVisible(true);
    }//GEN-LAST:event_btnAlterarQuantidadeActionPerformed

    private void btnPesquisaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaEstoqueActionPerformed
        atualizar();
    }//GEN-LAST:event_btnPesquisaEstoqueActionPerformed

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        if(evt.getClickCount() == 2){
            EditarProduto editar = new EditarProduto(Integer.parseInt((tableModel.getValueAt(tblEstoque.getSelectedRow(), 0).toString())));
            editar.setVisible(true);
        }
    }//GEN-LAST:event_tblEstoqueMouseClicked

    private void cbxModoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxModoPesquisaActionPerformed
        if(cbxModoPesquisa.getSelectedItem().toString().equalsIgnoreCase("vencido")){
            vencidos();
        }else if(cbxModoPesquisa.getSelectedItem().toString().equalsIgnoreCase("Minimo")){
            minimo();
        }else{
            atualizar();
        }
    }//GEN-LAST:event_cbxModoPesquisaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblEstoque.getSelectedRow() > -1){
            EditarProduto editar = new EditarProduto(this, Integer.parseInt(String.valueOf((tableModel.getValueAt(tblEstoque.getSelectedRow(), 0)))));
            editar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione uma produto antes");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void atualizar() {
        ArrayList<Produto> produto;
        
       if(!txtProduto.getText().equalsIgnoreCase("")){
            if(produtoDao.conectar()){
                produto = produtoDao.buscar(txtProduto.getText());
            if(produto != null){
                tableModel.setRowCount(0);
                cbxModoPesquisa.setSelectedIndex(0);
                for(Produto prod : produto){
                tableModel.addRow(new Object[]{               
                    prod.getIdProduto(),
                    prod.getNomeProduto(),
                    prod.getQuantidade(),
                    prod.getValorProduto()
                });
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum produto foi encotrado");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
       }else{
           tableModel.setNumRows(0);
           inicio();
       }
    }

    private void inicio() {
        String mostrarData;
        ArrayList<Produto> produto;
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        if (produtoDao.conectar()) {
            produto = produtoDao.listar();
            if (produto != null) {
                for (Produto prod : produto) {
                    try {
                        Date data = prod.getData();
                        if (data.before(formato.parse("02/01/1800"))) {
                            mostrarData = "Não Determinada";
                        } else {
                            formato.format(prod.getData());
                            mostrarData = formato.format(prod.getData());
                        }
                        tableModel.addRow(new Object[]{                           
                            prod.getIdProduto(),
                            prod.getNomeProduto(),
                            prod.getQuantidade(),
                            mostrarData
                        });
                    } catch (ParseException ex) {
                        System.out.println("erro conveter");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi encotrado nenhum produto", "Alerta", JOptionPane.PLAIN_MESSAGE);
            }
            produtoDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
        }
    }

    private void vencidos(){
        //Se isso ainda tiver aqui, isso vai mudar ta tudo baguçado por que eu estava aprendendo e testando mas vai ser melhorado
        String data;
        ArrayList<Produto> produto;
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataAtual = new Date();

        if (produtoDao.conectar()) {
            produto = produtoDao.listar();
            if (produto != null) {
                tableModel.setNumRows(0);
                for (Produto prod : produto) {
                    try{
                        data = formato.format(prod.getData());
                        if (prod.getData().before(dataAtual)) {
                        tableModel.addRow(new Object[]{                          
                            prod.getIdProduto(),
                            prod.getNomeProduto(),
                            prod.getQuantidade(),
                            data.replace("01/01/1800", "Não Determinada")
                        });
                        }
                        if(tableModel.getRowCount() == 0){
                            inicio();
                            cbxModoPesquisa.setSelectedItem("Tudo");
                            JOptionPane.showMessageDialog(null, "Nenhum Produto Vencido foi encotrado");
                        }  
                    }catch(NullPointerException ex){
                    }                 

                }
                if (tableModel.getRowCount() == 0) {
                    inicio();
                    JOptionPane.showMessageDialog(null, "Nenhum Produto Vencido foi encotrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum Produto Vencido foi encotrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao bnaco de dados");
        }
    }
    
    private void minimo(){
        String mostrarData;
        ArrayList<Produto> produto;
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        if (produtoDao.conectar()) {
            produto = produtoDao.listar();
            if (produto != null) {
                tableModel.setRowCount(0);
                for (Produto prod : produto) {
                    Date data = prod.getData();
                    if (data == null) {
                        mostrarData = "Não Determinada";
                    } else {
                        formato.format(prod.getData());
                        mostrarData = formato.format(prod.getData());
                    }
                    if(prod.getQuantidade() < prod.getQuantidadeIdeal()){
                        if(mostrarData.equalsIgnoreCase("01/01/1800")){
                            mostrarData = mostrarData.replace("01/01/1800", "Não Determinada");
                        }
                        tableModel.addRow(new Object[]{                     
                            prod.getIdProduto(),
                            prod.getNomeProduto(),
                            prod.getQuantidade(),
                            mostrarData
                        });
                    }
                }
                if(tableModel.getRowCount() == 0){
                    inicio();
                    cbxModoPesquisa.setSelectedItem("Tudo");
                    JOptionPane.showMessageDialog(null, "Não ha produtos abaixo do minimo");                    
                }

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao buscar os valores");
            }
            produtoDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void estoque(String args[]) {
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque("gestor").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAlterarQuantidade;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPesquisaEstoque;
    private javax.swing.JButton btnProtuario;
    private javax.swing.JComboBox<String> cbxModoPesquisa;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
