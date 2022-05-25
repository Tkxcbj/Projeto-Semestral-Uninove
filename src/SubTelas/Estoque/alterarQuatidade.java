package SubTelas.Estoque;

import Dao.EstoqueDao;
import Pacotes.Produto;
import javax.swing.JOptionPane;
import telas.Estoque;

public class alterarQuatidade extends javax.swing.JFrame {
    
    EstoqueDao produtoDao;
    Estoque atl;
    private int cod;
    
    public alterarQuatidade() {
        initComponents();
    }

    public alterarQuatidade(Estoque tela, int codigo){
        initComponents();
        atl = tela;
        cod = codigo;
        mostrarValor();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblQuant = new javax.swing.JLabel();
        btnMenos = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        txtQuant = new javax.swing.JTextField();
        bntCancelar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnMenos10 = new javax.swing.JButton();
        btnAdd10 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Quantidade");
        setResizable(false);
        getContentPane().setLayout(null);

        lblQuant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuant.setText("Escolha a quantidade de produtos");
        getContentPane().add(lblQuant);
        lblQuant.setBounds(-3, 20, 390, 44);

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenos);
        btnMenos.setBounds(70, 70, 50, 40);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(260, 70, 50, 40);

        txtQuant.setEditable(false);
        txtQuant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuant.setText("1");
        getContentPane().add(txtQuant);
        txtQuant.setBounds(130, 70, 120, 40);

        bntCancelar.setText("Cancelar");
        bntCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bntCancelar);
        bntCancelar.setBounds(210, 130, 160, 40);

        btnRemover.setText("Remover Produto");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemover);
        btnRemover.setBounds(30, 130, 160, 40);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeSalvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(30, 180, 340, 40);

        btnMenos10.setText("-10");
        btnMenos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenos10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenos10);
        btnMenos10.setBounds(0, 70, 60, 40);

        btnAdd10.setText("+10");
        btnAdd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd10);
        btnAdd10.setBounds(320, 70, 60, 40);

        setSize(new java.awt.Dimension(407, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtQuant.setText(String.valueOf(Integer.parseInt(txtQuant.getText()) + 1));
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if(Integer.parseInt(txtQuant.getText()) > 0){
            txtQuant.setText(String.valueOf(Integer.parseInt(txtQuant.getText()) - 1));
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja confirmar as alteração?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_NO_OPTION){
            alterar(Integer.parseInt(txtQuant.getText()));
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnMenos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenos10ActionPerformed
        if(Integer.parseInt(txtQuant.getText()) >= 10){
            txtQuant.setText(String.valueOf(Integer.parseInt(txtQuant.getText()) - 10));
        }
    }//GEN-LAST:event_btnMenos10ActionPerformed

    private void btnAdd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd10ActionPerformed
        txtQuant.setText(String.valueOf(Integer.parseInt(txtQuant.getText()) + 10));
    }//GEN-LAST:event_btnAdd10ActionPerformed

    private void bntCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bntCancelarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir o produto, Essa alteração não pode ser desfeita", "Alerta", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_NO_OPTION){
            remover();
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void mostrarValor(){
        produtoDao = new EstoqueDao();
        Produto estoque;
        
        if(produtoDao.conectar()){
            estoque = produtoDao.buscar(cod);
            if(estoque != null){
                txtQuant.setText(String.valueOf(estoque.getQuantidade()));
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel carregar a quantidade de produtos", "Erro", JOptionPane.ERROR_MESSAGE);
                dispose();
            }
            produtoDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
    }
    
    
    private void alterar(int novaQuantidade){
        produtoDao = new EstoqueDao();
        boolean verificar;
        
        if(produtoDao.conectar()){
            verificar = produtoDao.alterarQuantidade(novaQuantidade, cod);
            if(verificar){
                JOptionPane.showMessageDialog(null, "Quantidade alterada com Sucesso!");
                atl.atualizar();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel alterar a quantidade de produtos");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void remover(){
        produtoDao = new EstoqueDao();
        
        if(produtoDao.conectar()){
            if(produtoDao.apagar(cod)){
                JOptionPane.showMessageDialog(null, "Produto excluido com Sucesso");
                atl.atualizar();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel apagar esse produto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void remover(String args[]) {
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
            java.util.logging.Logger.getLogger(alterarQuatidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterarQuatidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterarQuatidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterarQuatidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterarQuatidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCancelar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd10;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMenos10;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
