package SubTelas.Estoque;

import Commun.TextPrompt;
import Dao.EstoqueDao;
import Pacotes.Produto;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CadastrarProduto extends javax.swing.JFrame {

    TextPrompt nomes;
    EstoqueDao produtoDao = new EstoqueDao();
    JButton atualizar;

    public CadastrarProduto() {
        initComponents();
        nomes = new TextPrompt("Nome", txtNome);
        nomes = new TextPrompt("Código", txtCodigo);
        nomes = new TextPrompt("Data de Vencimento", txtVencimento);
        nomes = new TextPrompt("Quantidade", txtQuantidade);
        nomes = new TextPrompt("Quantidade Ideal", txtMinimo);
        nomes = new TextPrompt("Valor", txtValor);
        txtVencimento.setVisible(false);
    }

    public CadastrarProduto(JButton atualizar) {
        initComponents();
        nomes = new TextPrompt("Nome", txtNome);
        nomes = new TextPrompt("Código", txtCodigo);
        nomes = new TextPrompt("Data de Vencimento", txtVencimento);
        nomes = new TextPrompt("Quantidade", txtQuantidade);
        nomes = new TextPrompt("Quantidade Ideal", txtMinimo);
        nomes = new TextPrompt("Valor", txtValor);
        this.atualizar = atualizar;
        txtVencimento.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigo = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        CheckPerecivel = new javax.swing.JCheckBox();
        btnCadrastar = new javax.swing.JButton();
        txtVencimento = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtMinimo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        FundoAzul = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBackground(new java.awt.Color(236, 236, 236));
        txtCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 190, -1));

        Titulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Titulo.setText("Cadastrar Produtos");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 40));

        txtNome.setBackground(new java.awt.Color(236, 236, 236));
        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 420, -1));

        CheckPerecivel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CheckPerecivel.setText("Perecível?");
        CheckPerecivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckPerecivelMouseClicked(evt);
            }
        });
        getContentPane().add(CheckPerecivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        btnCadrastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeSalvar.png"))); // NOI18N
        btnCadrastar.setText("Salvar");
        btnCadrastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadrastarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadrastar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 120, 40));

        txtVencimento.setBackground(new java.awt.Color(236, 236, 236));
        try {
            txtVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtVencimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVencimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVencimentoFocusLost(evt);
            }
        });
        getContentPane().add(txtVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 190, 25));

        txtQuantidade.setBackground(new java.awt.Color(236, 236, 236));
        txtQuantidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 190, -1));

        txtMinimo.setBackground(new java.awt.Color(236, 236, 236));
        txtMinimo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 190, -1));

        txtValor.setBackground(new java.awt.Color(236, 236, 236));
        txtValor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 190, -1));

        FundoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundo2.png"))); // NOI18N
        getContentPane().add(FundoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        Fundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tela_branca.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 600, 380));

        setSize(new java.awt.Dimension(614, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadrastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadrastarActionPerformed
        Produto prod = new Produto();
        
        if (!txtNome.getText().equalsIgnoreCase("")) {
            prod.setNomeProduto(txtNome.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O campo Nome não pode está vazio");
            return;
        }
        
        try {
            if (!txtCodigo.getText().equalsIgnoreCase("")) {
                prod.setIdProduto(Integer.parseInt(txtCodigo.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "O campo Codigo não pode está vazio");
                return;
            }
            if (!txtQuantidade.getText().equalsIgnoreCase("")) {
                prod.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "O campo Quantidade não pode está vazio");
                return;
            }
            if (!txtMinimo.getText().equalsIgnoreCase("")) {
                prod.setQuantidadeIdeal(Integer.parseInt(txtMinimo.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "O campo Quantidade ideal não pode está vazio");
                return;
            }
            if (!txtValor.getText().equalsIgnoreCase("")){
                prod.setValorProduto(Double.parseDouble(txtValor.getText()));
            } else {
                JOptionPane.showMessageDialog(null, "O campo valor não pode está vazio");
                return;
            }         
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "A campos numericom com letra");
        }     
        if (txtVencimento.getValue() != null) {
            prod.setDataStr(txtVencimento.getText().substring(6) + "-" + txtVencimento.getText().substring(3, 5) + "-" + txtVencimento.getText().substring(0, 2));
        } else{
            prod.setDataStr("1800-01-01");  
        }
      
       Salvar(prod);
    }//GEN-LAST:event_btnCadrastarActionPerformed

    private void CheckPerecivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckPerecivelMouseClicked
        if (CheckPerecivel.isSelected()) {
            txtVencimento.setVisible(true);
        } else {
            txtVencimento.setVisible(false);
        }
    }//GEN-LAST:event_CheckPerecivelMouseClicked

    private void txtVencimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVencimentoFocusGained
        try{
            MaskFormatter vencimento = new MaskFormatter("##/##/####");
            txtVencimento.setFormatterFactory(new DefaultFormatterFactory(vencimento));
        }catch(ParseException ex){
            System.out.println("Erro na mascara do vencimento");
        }
    }//GEN-LAST:event_txtVencimentoFocusGained

    private void txtVencimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVencimentoFocusLost
        try{
            MaskFormatter vazio = new MaskFormatter("");
            if(txtVencimento.getText().equalsIgnoreCase("  /  /    ") | txtVencimento.getText().replace(" ", "").replace("/", "").length() < 8){
                txtVencimento.setFormatterFactory(new DefaultFormatterFactory(vazio));
            }
        }catch(ParseException ex){
            System.out.println("Erro na mascara do vencimento");
        }
    }//GEN-LAST:event_txtVencimentoFocusLost

    private void Salvar(Produto produto) {
        if (produtoDao.conectar()) {
            int resultado = produtoDao.salvar(produto);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
                this.atualizar.doClick();;
                dispose();
            } else if (resultado == 1062) {
                JOptionPane.showMessageDialog(null, "Esse codigo de produto já foi cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel salvar o produto");
            }
                produtoDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static void cadastrarProduto(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckPerecivel;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel FundoAzul;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnCadrastar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMinimo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    private javax.swing.JFormattedTextField txtVencimento;
    // End of variables declaration//GEN-END:variables
}
