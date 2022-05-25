package SubTelas.Funcionario;

import Commun.TextPrompt;
import Dao.EnderecoDao;
import Dao.FuncionarioDao;
import Pacotes.Funcionario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaFuncionarios extends javax.swing.JFrame {
        
    DefaultTableModel tableModel;
    
    public ListaFuncionarios() {
        initComponents();
        tableModel = (DefaultTableModel) tblFuncionario.getModel();
        mostrar(true);
        TextPrompt nome = new TextPrompt("Funcionario", txtFuncionario);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        txtFuncionario = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblFiltrar = new javax.swing.JLabel();
        cbxOrdem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Funcionários");
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblFuncionario.getTableHeader().setResizingAllowed(false);
        tblFuncionario.getTableHeader().setReorderingAllowed(false);
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionario);
        if (tblFuncionario.getColumnModel().getColumnCount() > 0) {
            tblFuncionario.getColumnModel().getColumn(0).setResizable(false);
            tblFuncionario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblFuncionario.getColumnModel().getColumn(1).setResizable(false);
            tblFuncionario.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblFuncionario.getColumnModel().getColumn(2).setResizable(false);
            tblFuncionario.getColumnModel().getColumn(2).setPreferredWidth(195);
            tblFuncionario.getColumnModel().getColumn(3).setResizable(false);
            tblFuncionario.getColumnModel().getColumn(3).setPreferredWidth(90);
            tblFuncionario.getColumnModel().getColumn(4).setResizable(false);
            tblFuncionario.getColumnModel().getColumn(4).setPreferredWidth(69);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 610, 360);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setHideActionText(true);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(520, 20, 90, 40);

        txtFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFuncionarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtFuncionario);
        txtFuncionario.setBounds(10, 20, 390, 40);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(520, 70, 90, 40);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(420, 20, 90, 40);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(420, 70, 90, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 113, 660, 10);

        lblFiltrar.setText("Filtrar");
        getContentPane().add(lblFiltrar);
        lblFiltrar.setBounds(10, 60, 60, 20);

        cbxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tudo", "Diretor", "Gestor", "Dentista", "Recepcionista" }));
        cbxOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdemActionPerformed(evt);
            }
        });
        getContentPane().add(cbxOrdem);
        cbxOrdem.setBounds(10, 80, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/6450jpg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 530);

        setSize(new java.awt.Dimension(650, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroFuncionarios cadastrarFuncionario = new CadastroFuncionarios(btnBuscar);
        cadastrarFuncionario.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
        if(evt.getClickCount() == 2){
            if(tblFuncionario.getSelectedRow() != -1){
                int idFuncionario = Integer.parseInt(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0).toString());
                EditarFuncionarios editarFuncionario = new EditarFuncionarios(idFuncionario);
                editarFuncionario.setVisible(true);
            }
        }
    }//GEN-LAST:event_tblFuncionarioMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblFuncionario.getSelectedRow() != -1){
                int idFuncionario = Integer.parseInt(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0).toString());
                EditarFuncionarios editarFuncionario = new EditarFuncionarios(idFuncionario, btnBuscar);
                editarFuncionario.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione o Funcionario Primeiro");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        //Importando as classe
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover esse usuario?", "Alerta", JOptionPane.YES_NO_OPTION); //Fazendo a confirmação
        
        if(confirmacao == JOptionPane.YES_NO_OPTION){           
            if(funcionarioDao.conectar()){ //Conectando a banco de dados
                if(enderecoDao.conectar()){  
                    //Passando os valores para serem usando como base para apagar
                    int idFunc = Integer.parseInt(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0).toString());
                    int idEnd = funcionarioDao.idEndereco(idFunc);
                    //Tentando apagar
                    if(funcionarioDao.apagar(idFunc) == 1&& enderecoDao.apagar(idEnd) == 1){
                        JOptionPane.showMessageDialog(null, "Usuario removido com sucesso"); //Apagado
                        tableModel.setRowCount(0);
                        mostrar(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Não foi possivel remover o usuario!"); //Não Apagadao
                    }
                //Erro de conexão com o banco de dados
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela endereço, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela funcionario, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            //Fazer nada
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       mostrar(false);          
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncionarioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            mostrar(false);
        }
    }//GEN-LAST:event_txtFuncionarioKeyPressed

    private void cbxOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdemActionPerformed
        mostrar(false);
    }//GEN-LAST:event_cbxOrdemActionPerformed

    private void mostrar(boolean tudo){       
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        ArrayList<Funcionario> func;
        String endereco;
        
        if(funcionarioDao.conectar()){
            if(tudo){
                func = funcionarioDao.listar();
            }else{
                func = funcionarioDao.listar(txtFuncionario.getText(), cbxOrdem.getSelectedItem().toString());
            }
            if(func != null){
                tableModel.setNumRows(0);
                for (Funcionario funcionario : func) {
                    if(enderecoDao.conectar()){
                        endereco = enderecoDao.buscarRua(funcionario.getIdEndereco());
                        funcionario.setEndereco(endereco);
                        enderecoDao.desconectar();
                    }else{
                        JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela endereço");
                    }
                    tableModel.addRow(new Object[]{
                        funcionario.getIdFuncionario(),
                        funcionario.getNome(),
                        funcionario.getEndereco(),
                        funcionario.getTelefone(),
                        funcionario.getCargo()
                    });
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao buscar funcionarios, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            funcionarioDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionarios, tente reniciar o programa", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void listaFuncionario(String args[]) {
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
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbxOrdem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtFuncionario;
    // End of variables declaration//GEN-END:variables
}
