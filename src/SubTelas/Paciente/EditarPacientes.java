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

public class EditarPacientes extends javax.swing.JFrame {
    
    TextPrompt tx;
    String Cpf;
    int idEndereco;
    String Rg;
    TelaPaciente p;
    
    public EditarPacientes() {
        initComponents();
    }

    public EditarPacientes(Paciente pac, TelaPaciente tpac) {
        initComponents();
        
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
        
        this.Cpf = pac.getCpf();
        this.Rg = pac.getRg();
        
        mostrarUsuario(pac);
    }
    
    public EditarPacientes(Paciente pac) {
        initComponents();
        
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
        
        //Desativar
        cbEstadoCivil.setEnabled(false);
        lblDadosContato.setText("Visualizar par Contato");
        txtCidade.setEnabled(false); 
        txtRua.setEnabled(false); 
        txtBairro.setEnabled(false); 
        txtNumero.setEnabled(false);
        txtEmail.setEnabled(false); 
        jcNascimento.setEnabled(false); 
        lblDadosAdicionais.setText("Visualizar Dados Adicionais"); 
        txtPai.setEnabled(false);
        txtMae.setEnabled(false); 
        txtProfissao.setEnabled(false); 
        txtConjude.setEnabled(false); 
        txtComplemento.setText("Visualizar Dados Básicos"); 
        btnSalvar.setVisible(false); 
        txtEstado.setEnabled(false); 
        txtCep.setEnabled(false); 
        txtTelefone.setEnabled(false); 
        jLabel1.setEnabled(false);
        
        this.Cpf = pac.getCpf();
        this.Rg = pac.getRg();
        
        mostrarUsuario(pac);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDadosBasicos = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        cbEstadoCivil = new javax.swing.JComboBox<>();
        lblDadosContato = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jcNascimento = new com.toedter.calendar.JDateChooser();
        lblDadosAdicionais = new javax.swing.JLabel();
        txtPai = new javax.swing.JTextField();
        txtMae = new javax.swing.JTextField();
        txtProfissao = new javax.swing.JTextField();
        txtConjude = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnotacao = new javax.swing.JTextArea();
        txtEstado = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Paciente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDadosBasicos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosBasicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosBasicos.setText("Editar Dados Básicos");
        getContentPane().add(lblDadosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 37, 280, 33));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 280, 36));

        txtCpf.setEditable(false);
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 144, 280, 36));

        txtRg.setEditable(false);
        getContentPane().add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 36));

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gênero", "Masculino", "Feminino", "Outros" }));
        cbGenero.setPreferredSize(new java.awt.Dimension(7, 22));
        getContentPane().add(cbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 314, 280, 33));

        cbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil", "Solteiro(a)", "Casado(a)", "Viúvo(a)" }));
        cbEstadoCivil.setPreferredSize(new java.awt.Dimension(7, 22));
        getContentPane().add(cbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 366, 280, 33));

        lblDadosContato.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosContato.setText("Editar Dados para Contato");
        getContentPane().add(lblDadosContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 37, 278, 33));
        getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 130, 36));
        getContentPane().add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 142, 130, 36));
        getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 130, 36));
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 200, 130, 36));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pressed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 312, 280, 36));

        jcNascimento.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(jcNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 258, 280, 36));

        lblDadosAdicionais.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosAdicionais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosAdicionais.setText("Editar Dados Adicionais");
        getContentPane().add(lblDadosAdicionais, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 38, 312, 33));
        getContentPane().add(txtPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 83, 145, 36));
        getContentPane().add(txtMae, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 83, 145, 36));
        getContentPane().add(txtProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 142, 145, 36));
        getContentPane().add(txtConjude, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 142, 145, 36));
        getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 142, 130, 36));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeCadastrar.png"))); // NOI18N
        btnSalvar.setText(" Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 358, 170, 50));

        txtAnotacao.setColumns(20);
        txtAnotacao.setRows(5);
        jScrollPane1.setViewportView(txtAnotacao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 196, 319, 140));

        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstadoFocusLost(evt);
            }
        });
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 90, 130, 36));

        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        getContentPane().add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 256, 130, 36));

        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });
        getContentPane().add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 256, 130, 36));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPaciente.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void Pressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pressed

    }//GEN-LAST:event_Pressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Endereco e = new Endereco();
        Paciente p = new Paciente();
        String dataFormatada = "null";
        
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
        try{
        dataFormatada = formatacao.format(jcNascimento.getDate());
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Data não pode estar Vazia");
            return;
        }
        String enviar = dataFormatada.substring(6) + "-" +dataFormatada.substring(3, 5)+"-" + dataFormatada.substring(0, 2);
        
        if(txtNome.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Nome não pode estar Vazio");
            txtNome.requestFocus();
            return;
        }else{
            p.setNome(txtNome.getText());
        }
        
        p.setCpf(this.Cpf);
        p.setRg(this.Rg);
        
        if(txtTelefone.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Telefone não pode estar Vazio");
            txtTelefone.requestFocus();
            return;
        }p.setTelefone(isEmpty(txtTelefone.getText().replace("(", "").replace(")", "").replace("-", "")));
        
        p.setEmail(isEmpty(txtEmail.getText()));
        p.setPai(isEmpty(txtPai.getText()));
        p.setMae(isEmpty(txtMae.getText()));
        p.setConjude(isEmpty(txtConjude.getText()));
        p.setProfissao(isEmpty(txtProfissao.getText()));
        p.setAnotacao(isEmpty(txtAnotacao.getText()));
        
        try{
        if(jcNascimento.getDate() == null){
            JOptionPane.showMessageDialog(null, "Data não pode estar Vazia");
            return;
        }else{
            p.setData_nascimento(enviar);
            }
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Data não pode estar Vazia");
        }
        
        if(txtCidade.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Cidade não pode estar Vazia");
            txtCidade.requestFocus();
            return;
        }else{
            e.setCidade(txtCidade.getText());
        }
        
        if(txtEstado.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Estado não pode estar Vazio");
            txtEstado.requestFocus();
            return;
        }else{
            e.setEstado(txtEstado.getText().replace("(", "").replace(")", ""));
        }
        
        if(txtRua.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Rua não pode estar Vazia");
            txtRua.requestFocus();
            return;
        }else{
            e.setRua(txtRua.getText());
        }
        
        e.setComplemento(isEmpty(txtComplemento.getText()));
        e.setBairro(isEmpty(txtBairro.getText()));
        
        if(txtCep.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "CEP não pode estar Vazio");
            txtCep.requestFocus();
            return;
        }e.setCep(txtCep.getText().replace("-", ""));
        
        if(txtNumero.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Número não pode estar Vazio");
            txtNumero.requestFocus();
            return;
        }else{
            e.setNumero(Integer.parseInt(txtNumero.getText()));
        }
        
        //Verificando se o comboBox
        if(cbGenero.getSelectedItem().toString().equalsIgnoreCase("Gênero")){
           JOptionPane.showMessageDialog(null, "Gênero não pode estar vazio");
           return;
        }
        if(cbEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("Estado Civil")){
           JOptionPane.showMessageDialog(null, "Estado Civil não pode estar vazio");
           return;
        }
        
        p.setGenero(cbGenero.getSelectedItem().toString());
        p.setEstado_civil(cbEstadoCivil.getSelectedItem().toString());
        
        if(txtEmail.equals("")){
            p.setEmail("null");
        }
        if(txtPai.equals("")){
            p.setPai("null");
        }
        if(txtMae.equals("")){
            p.setMae("null");
        }
        if(txtConjude.equals("")){
            p.setConjude("null");
        }
        if(txtProfissao.equals("")){
            p.setProfissao("null");
        }
        if(txtAnotacao.equals("")){
            p.setAnotacao("null");
        }
        
        
        salvar(e, p);
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

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

            if(txtEstado.getText().equalsIgnoreCase("(  )") | txtEstado.getText().replace(" ", "").length() < 4){
                txtEstado.setValue(null);
                txtEstado.setFormatterFactory(new DefaultFormatterFactory(limpar));

            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_txtEstadoFocusLost

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

            if(txtCep.getText().equalsIgnoreCase("     -   ") | txtCep.getText().replace(" ", "").length() < 9){
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

            if(txtTelefone.getText().equalsIgnoreCase("(  )     -    ") | txtTelefone.getText().replace(" ", "").length() < 13){
                txtTelefone.setValue(null);
                txtTelefone.setFormatterFactory(new DefaultFormatterFactory(limpar));

            }
        } catch (ParseException ex) {

        }
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    
    private String isEmpty(String texto){
        
        if(texto.equalsIgnoreCase("null")){
            return "";
        }else{
            return texto;
        }
    }
    
    
    private void mostrarUsuario(Paciente paciente){
        try {
            //Importando as classe e modelos
            SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy");
            
            Endereco end;
            EnderecoDao ed = new EnderecoDao();
            Paciente pac = new Paciente();
            PacienteDao p = new PacienteDao();
            //Puxando os dados pessoais do funcionario e mostrando
            
            txtNome.setText(paciente.getNome());
            txtCpf.setText(paciente.getCpf());
            txtTelefone.setText(paciente.getTelefone());
            txtRg.setText(paciente.getRg());
            txtEmail.setText(isEmpty(paciente.getEmail()));
            jcNascimento.setDate(formatacao.parse(formatacao.format(paciente.getNascimento())));
            txtPai.setText(isEmpty(paciente.getPai()));
            txtMae.setText(isEmpty(paciente.getMae()));
            txtConjude.setText(isEmpty(paciente.getConjude()));
            txtProfissao.setText(isEmpty(paciente.getProfissao()));
            txtAnotacao.setText(isEmpty(paciente.getAnotacao()));
            cbGenero.setSelectedItem(paciente.getGenero());
            cbEstadoCivil.setSelectedItem(paciente.getEstado_civil());
            
            
            this.idEndereco = paciente.getidEndereco();
            if(ed.conectar()){
                end = ed.buscar(idEndereco);
                
                if(end != null){
                    
                    txtCidade.setText(end.getCidade());
                    txtEstado.setText(isEmpty(end.getEstado()));
                    txtRua.setText(end.getRua());
                    txtComplemento.setText(isEmpty(end.getComplemento()));
                    txtNumero.setText(String.valueOf(end.getNumero()));
                    txtBairro.setText(isEmpty(end.getBairro()));
                    txtCep.setText(isEmpty(end.getCep()));
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao buscar o endereco do paciente");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela endereço");
            }
        } catch (ParseException ex) {           
        }   
    }     
    
    private void salvar(Endereco endereco, Paciente paciente){
        
        PacienteDao cadastroDao = new PacienteDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        int resposta, respostaend;
        
        //iniciando a conexão com o banco de dados
        if(cadastroDao.conectar()){
            if(enderecoDao.conectar()){
                endereco.setIdEndereco(this.idEndereco);
                respostaend = enderecoDao.alterar(endereco); //salvando endereço e retornando o valor do IdEndereco            
                resposta = cadastroDao.alterar(paciente);
                
                if(respostaend == 1 && resposta == 1){
                    JOptionPane.showMessageDialog(null, "paciente atualizado com sucesso"); //Fim esperado
                    this.p.mostrar(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar o paciente");  
                }
                enderecoDao.desconectar();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados de endereço");
            }
            cadastroDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados de usuario");
        }
    }    
        
    
    
    
    
    public static void editarpaciente(String args[]) {
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
            java.util.logging.Logger.getLogger(EditarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbEstadoCivil;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jcNascimento;
    private javax.swing.JLabel lblDadosAdicionais;
    private javax.swing.JLabel lblDadosBasicos;
    private javax.swing.JLabel lblDadosContato;
    private javax.swing.JTextArea txtAnotacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtConjude;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtEstado;
    private javax.swing.JTextField txtMae;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPai;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
 
    }

