package SubTelas.Paciente;

import Dao.PacienteDao;
import Dao.EnderecoDao;
import Pacotes.Paciente;
import Pacotes.Endereco;
import Commun.TextPrompt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import telas.TelaPaciente;

public class CadastroPacientes extends javax.swing.JFrame {

    Paciente paciente = new Paciente();
    TextPrompt tx;
    TelaPaciente p;

    public CadastroPacientes() {
        initComponents();
    }

    public CadastroPacientes(TelaPaciente tpac) {
        initComponents();
        p = tpac;
        // Dados Basicos
        tx = new TextPrompt("Nome", txtNome);
        tx = new TextPrompt("CPF", txtCpf);
        tx = new TextPrompt("RG", txtRg);
        // Dados para Contato
        tx = new TextPrompt("CEP", txtCep);
        tx = new TextPrompt("Estado", txtEstado);
        tx = new TextPrompt("Rua", txtRua);
        tx = new TextPrompt("Complemento*", txtComplemento);
        tx = new TextPrompt("Número", txtNumero);
        tx = new TextPrompt("Bairro*", txtBairro);
        tx = new TextPrompt("Telefone", txtTelefone);
        tx = new TextPrompt("Cidade", txtCidade);
        tx = new TextPrompt("Email*", txtEmail);
        // Dados Adicionais
        tx = new TextPrompt("Nome do Pai*", txtPai);
        tx = new TextPrompt("Nome da Mãe*", txtMae);
        tx = new TextPrompt("Nome do Conjude*", txtConjude);
        tx = new TextPrompt("Profissão*", txtProfissao);
        tx = new TextPrompt("Anotação*", txtAnotacao);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDadosBasicos = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        lblDadosContato = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jcNascimento = new com.toedter.calendar.JDateChooser();
        lblDadosContato1 = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        txtMae = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtProfissao = new javax.swing.JTextField();
        txtConjude = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();
        txtComplemento = new javax.swing.JTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtEstado = new javax.swing.JFormattedTextField();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Paciente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDadosBasicos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosBasicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosBasicos.setText("Dados Básicos");
        getContentPane().add(lblDadosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 37, 280, 33));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 88, 280, 36));

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gênero", "Masculino", "Feminino", "Outros" }));
        cbGenero.setPreferredSize(new java.awt.Dimension(7, 22));
        getContentPane().add(cbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 306, 280, 33));

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil", "Solteiro(a)", "Casado(a)", "Viúvo(a)" }));
        cbEstadoCivil.setPreferredSize(new java.awt.Dimension(7, 22));
        getContentPane().add(cbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 358, 280, 33));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeCadastrar.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 170, 50));

        lblDadosContato.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosContato.setText("Dados para Contato");
        getContentPane().add(lblDadosContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 37, 278, 33));
        getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 88, 130, 36));
        getContentPane().add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 142, 130, 36));
        getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 196, 130, 36));
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 196, 130, 36));

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pressed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 304, 280, 36));
        getContentPane().add(jcNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 250, 280, 36));

        lblDadosContato1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosContato1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosContato1.setText("Dados Adicionais");
        getContentPane().add(lblDadosContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 38, 312, 33));
        getContentPane().add(txtPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 83, 145, 36));
        getContentPane().add(txtMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 83, 145, 36));

        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 130, 36));
        getContentPane().add(txtProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 131, 145, 36));
        getContentPane().add(txtConjude, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 132, 145, 36));

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        jScrollPane1.setViewportView(txtAnotacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 196, 319, 140));
        getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 142, 130, 36));

        txtRg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRgFocusLost(evt);
            }
        });
        getContentPane().add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 196, 280, 36));

        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 36));

        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        getContentPane().add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, 36));

        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstadoFocusLost(evt);
            }
        });
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 130, 36));

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPaciente.jpg"))); // NOI18N
        getContentPane().add(imgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pressed

    }//GEN-LAST:event_Pressed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Endereco e = new Endereco();
        Paciente p = new Paciente();
        String dataFormatada = "null";
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataFormatada = formatacao.format(jcNascimento.getDate());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Data não pode estar Vazia");
            return;
        }
        String enviar = dataFormatada.substring(6) + "-" + dataFormatada.substring(3, 5) + "-" + dataFormatada.substring(0, 2);

        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Nome não pode estar Vazio");
            txtNome.requestFocus();
            return;
        }
        p.setNome(txtNome.getText());

        if (txtCpf.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "CPF não pode estar Vazio");
            txtCpf.requestFocus();
            return;
        }
        p.setCpf(txtCpf.getText().replace(".", "").replace("-", ""));

        if (txtRg.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "RG não pode estar Vazio");
            txtRg.requestFocus();
            return;
        }
        p.setRg(txtRg.getText().replace(".", "").replace("-", ""));

        p.setEmail(isEmpty(txtEmail.getText()));
        p.setPai(isEmpty(txtPai.getText()));
        p.setMae(isEmpty(txtMae.getText()));
        p.setConjude(isEmpty(txtConjude.getText()));
        p.setProfissao(isEmpty(txtProfissao.getText()));
        p.setAnotacao(isEmpty(txtAnotacao.getText()));

        try {
            if (jcNascimento.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Data não pode estar Vazia");
                return;
            }
            p.setData_nascimento(enviar);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Data não pode estar Vazia");
        }

        if (txtCidade.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Cidade não pode estar Vazia");
            txtCidade.requestFocus();
            return;
        }
        e.setCidade(txtCidade.getText());

        if (txtEstado.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Estado não pode estar Vazio");
            txtEstado.requestFocus();
            return;
        }
        e.setEstado(txtEstado.getText().replace("(", "").replace(")", ""));

        if (txtRua.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Rua não pode estar Vazia");
            txtRua.requestFocus();
            return;
        }
        e.setRua(txtRua.getText());

        e.setComplemento(isEmpty(txtComplemento.getText()));
        e.setBairro(isEmpty(txtBairro.getText()));

        if (txtCep.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "CEP não pode estar Vazio");
            txtCep.requestFocus();
            return;
        }
        e.setCep(txtCep.getText().replace("-", ""));

        if (txtNumero.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Número não pode estar Vazio");
            txtNumero.requestFocus();
            return;
        } else {
            e.setNumero(Integer.parseInt(txtNumero.getText()));
        }

        if (txtTelefone.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Telefone não pode estar Vazio");
            txtTelefone.requestFocus();
            return;
        }
        p.setTelefone(txtTelefone.getText().replace("(", "").replace(")", "").replace("-", ""));

        //Verificando se o comboBox
        if (cbGenero.getSelectedItem().toString().equalsIgnoreCase("Gênero")) {
            JOptionPane.showMessageDialog(null, "Gênero não pode estar vazio");
            return;
        }
        if (cbEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("Estado Civil")) {
            JOptionPane.showMessageDialog(null, "Estado Civil não pode estar vazio");
            return;
        }

        p.setGenero(cbGenero.getSelectedItem().toString());
        p.setEstado_civil(cbEstadoCivil.getSelectedItem().toString());

        if (txtEmail.equals("")) {
            p.setEmail("null");
        }
        if (txtPai.equals("")) {
            p.setPai("null");
        }
        if (txtMae.equals("")) {
            p.setMae("null");
        }
        if (txtConjude.equals("")) {
            p.setConjude("null");
        }
        if (txtProfissao.equals("")) {
            p.setProfissao("null");
        }
        if (txtAnotacao.equals("")) {
            p.setAnotacao("null");
        }

        salvar(e, p);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        // TODO add your handling code here:
        try {
            MaskFormatter cpf = new MaskFormatter("###.###.###-##");
            txtCpf.setFormatterFactory(new DefaultFormatterFactory(cpf));
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        // TODO add your handling code here:
        MaskFormatter limpar;
        try {
            limpar = new MaskFormatter("");

            if (txtCpf.getText().equalsIgnoreCase("   .   .   -  ") | txtCpf.getText().replace(" ", "").length() < 14) {
                txtCpf.setValue(null);
                txtCpf.setFormatterFactory(new DefaultFormatterFactory(limpar));

            }
        } catch (ParseException ex) {

        }


    }//GEN-LAST:event_txtCpfFocusLost

    private void txtRgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRgFocusGained
        // TODO add your handling code here:
        if (txtRg.getText().replace(" ", "").length() < 12) {
            try {
                MaskFormatter rg = new MaskFormatter("##.###.###-#");
                txtRg.setValue(null);
                txtRg.setFormatterFactory(new DefaultFormatterFactory(rg));
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_txtRgFocusGained

    private void txtRgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRgFocusLost
        MaskFormatter limpar;
        try {
            limpar = new MaskFormatter("");
            if (txtRg.getText().equalsIgnoreCase("")) {
                txtRg.setFormatterFactory(new DefaultFormatterFactory(limpar));
            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_txtRgFocusLost

    private void txtCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusGained
        // TODO add your handling code here:
        try {
            MaskFormatter cep = new MaskFormatter("#####-###");
            txtCep.setFormatterFactory(new DefaultFormatterFactory(cep));
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtCepFocusGained

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        // TODO add your handling code here:
        MaskFormatter limpar;
        try {
            limpar = new MaskFormatter("");

            if (txtCep.getText().equalsIgnoreCase("     -   ") | txtCep.getText().replace(" ", "").length() < 9) {
                txtCep.setValue(null);
                txtCep.setFormatterFactory(new DefaultFormatterFactory(limpar));

            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_txtCepFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        // TODO add your handling code here:
        try {
            MaskFormatter Tel = new MaskFormatter("(##)#####-####");
            txtTelefone.setFormatterFactory(new DefaultFormatterFactory(Tel));
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        // TODO add your handling code here:
        MaskFormatter limpar;
        try {
            limpar = new MaskFormatter("");

            if (txtTelefone.getText().equalsIgnoreCase("(  )     -    ") | txtTelefone.getText().replace(" ", "").length() < 13) {
                txtTelefone.setValue(null);
                txtTelefone.setFormatterFactory(new DefaultFormatterFactory(limpar));

            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusGained
        // TODO add your handling code here:
        try {
            MaskFormatter est = new MaskFormatter("(UU)");
            txtEstado.setFormatterFactory(new DefaultFormatterFactory(est));
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_txtEstadoFocusGained

    private void txtEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusLost
        // TODO add your handling code here:
        MaskFormatter limpar;
        try {
            limpar = new MaskFormatter("");

            if (txtEstado.getText().equalsIgnoreCase("(  )") | txtEstado.getText().replace(" ", "").length() < 4) {
                txtEstado.setValue(null);
                txtEstado.setFormatterFactory(new DefaultFormatterFactory(limpar));

            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_txtEstadoFocusLost

    private String isEmpty(String texto) {
        if (texto.equalsIgnoreCase("")) {
            return "null";
        } else {
            return texto;
        }
    }

    private void salvar(Endereco endereco, Paciente paciente) {

        PacienteDao cadastroDao = new PacienteDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        int resposta, respostap;

        //iniciando a conexão com o banco de dados
        if (cadastroDao.conectar()) {
            if (enderecoDao.conectar()) {
                resposta = enderecoDao.adicionarEndereco(endereco); //salvando endereço e retornando o valor do IdEndereco            
                if (resposta != -1) {
                    paciente.setidEndereco(resposta);
                    respostap = cadastroDao.salvar(paciente);
                    if (respostap == 1) {
                        JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso"); //Fim esperado
                        this.p.mostrar(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o Paciente");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar o endereço do paciente");
                }
                enderecoDao.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados de Endereço");
            }
            cadastroDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados Paciente");
        }

    }

    public static void cadastropaciente(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcNascimento;
    private javax.swing.JLabel lblDadosBasicos;
    private javax.swing.JLabel lblDadosContato;
    private javax.swing.JLabel lblDadosContato1;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtConjude;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtEstado;
    private javax.swing.JTextField txtMae;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
