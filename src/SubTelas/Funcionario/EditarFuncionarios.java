package SubTelas.Funcionario;

import Commun.TextPrompt;
import Dao.FuncionarioDao;
import Dao.EnderecoDao;
import Pacotes.Funcionario;
import Pacotes.Endereco;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class EditarFuncionarios extends javax.swing.JFrame {
    
    TextPrompt nomes;
    JButton atuliazar;
    MaskFormatter formatacao;
    int idFuncionario;
    int idEndereco;
    
    public EditarFuncionarios(){
        //Para Testes
        initComponents();
    }
    
    public EditarFuncionarios(int idFuncionario, JButton atl) {
        //Mostra Pronto para a edição
        initComponents();
        nomes = new TextPrompt("Nome", txtNome);
        nomes = new TextPrompt("CPF", txfCpf);
        nomes = new TextPrompt("Usuario", txtUsuario);
        nomes = new TextPrompt("Senha", txfSenha);
        nomes = new TextPrompt("CRO*", txfCro);
        nomes = new TextPrompt("Repasse(%)", txtRepasse);
        nomes = new TextPrompt("Telefone", txfTelefone);        
        nomes = new TextPrompt("Rua", txtEndereco);
        nomes = new TextPrompt("Cidade", txtCidade);
        nomes = new TextPrompt("CEP", txfCep);
        nomes = new TextPrompt("Número", txtNumero);
        nomes = new TextPrompt("Complemento", txtComplemento);
        nomes = new TextPrompt("Estado", txfEstado);
        nomes = new TextPrompt("Bairro", txtBairro);
        this.atuliazar = atl;
        this.idFuncionario = idFuncionario;
        txfCpf.setEnabled(false);
        txfCro.setEnabled(false);
        mostrarUsuario(idFuncionario);
    }
    
    public EditarFuncionarios(int idFuncionario) {
        //Mostra Apenas para a visualização
        initComponents();
        this.setTitle("Visualização de Funcionarios");
        lblTitulo.setText("Visualização de Funcionarios");
        txtNome.setEditable(false);
        txfCep.setEditable(false);
        txtUsuario.setEditable(false);
        txfSenha.setEditable(false);
        txfCro.setEditable(false);
        txfTelefone.setEditable(false);     
        txtRepasse.setEditable(false); 
        txtEndereco.setEditable(false); 
        txtCidade.setEditable(false); 
        txfCpf.setEditable(false); 
        txtNumero.setEditable(false); 
        txtComplemento.setEditable(false); 
        txfEstado.setEditable(false); 
        txtBairro.setEditable(false); 
        cbxCargo.setEnabled(false);
        btnSalvar.setVisible(false);
        nomes = new TextPrompt("Repasse(%)", txtRepasse);            
        nomes = new TextPrompt("Rua", txtEndereco);
        nomes = new TextPrompt("Cidade", txtCidade);
        nomes = new TextPrompt("CEP", txfCep);
        nomes = new TextPrompt("Número", txtNumero);
        nomes = new TextPrompt("Complemento", txtComplemento);
        nomes = new TextPrompt("Estado", txfEstado);
        nomes = new TextPrompt("Bairro", txtBairro);
        this.idFuncionario = idFuncionario;
        mostrarUsuario(idFuncionario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtRepasse = new javax.swing.JTextField();
        cbxCargo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtBairro1 = new javax.swing.JTextField();
        txfSenha = new javax.swing.JFormattedTextField();
        txfCpf = new javax.swing.JFormattedTextField();
        txfCro = new javax.swing.JFormattedTextField();
        txfTelefone = new javax.swing.JFormattedTextField();
        txfCep = new javax.swing.JFormattedTextField();
        txfEstado = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Funcionário");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Edição de Funcionário");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 10, 800, 40));

        txtNome.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, -1));

        txtUsuario.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, -1));

        txtRepasse.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtRepasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, -1));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Cargo-", "Diretor", "Gestor", "Dentista", "Recepcionista" }));
        getContentPane().add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 180, -1));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeSalvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 40));

        txtEndereco.setBackground(new java.awt.Color(236, 236, 236));
        txtEndereco.setCaretColor(new java.awt.Color(0, 43, 151));
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 380, -1));

        txtCidade.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 380, -1));

        txtNumero.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 115, -1));

        txtComplemento.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 120, -1));

        txtBairro.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 380, -1));

        txtBairro1.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtBairro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 380, -1));

        txfSenha.setBackground(new java.awt.Color(236, 236, 236));
        txfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfSenhaFocusLost(evt);
            }
        });
        getContentPane().add(txfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, -1));

        txfCpf.setBackground(new java.awt.Color(236, 236, 236));
        txfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCpfFocusLost(evt);
            }
        });
        getContentPane().add(txfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, -1));

        txfCro.setBackground(new java.awt.Color(236, 236, 236));
        txfCro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCroFocusLost(evt);
            }
        });
        getContentPane().add(txfCro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        txfTelefone.setBackground(new java.awt.Color(236, 236, 236));
        txfTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfTelefoneFocusLost(evt);
            }
        });
        getContentPane().add(txfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 180, -1));

        txfCep.setBackground(new java.awt.Color(236, 236, 236));
        txfCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCepFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCepFocusLost(evt);
            }
        });
        getContentPane().add(txfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 115, -1));

        txfEstado.setBackground(new java.awt.Color(236, 236, 236));
        txfEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfEstadoFocusLost(evt);
            }
        });
        getContentPane().add(txfEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 380, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        Fundo.setBackground(new java.awt.Color(255, 255, 255));
        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tela_branca.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 930, 540));

        setSize(new java.awt.Dimension(814, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Chamando As capsulas
        Endereco endereco = new Endereco();
        Funcionario cadastro = new Funcionario();
        String estados = "AC, AL, AP, AM, BA, CE, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO, DF";

        //Encapsulando os dados
        if(txtNome.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo NOME não pode está vazio");
            return;
        }
        cadastro.setNome(txtNome.getText());
        
        if(txfCpf.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo CPF não pode está vazio");
            return;
        }
        cadastro.setCpf(txfCpf.getText());
        
        if(txfTelefone.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo TELEFONE não pode está vazio");
            return;
        }
        cadastro.setTelefone(txfTelefone.getText());
        
        if(txfCro.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo CRO não pode está vazio");
            return;
        }
        cadastro.setCro(txfCro.getText());
        
        if(txtUsuario.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo USUARIO não pode está vazio");
            return;
        }
        cadastro.setUsuario(txtUsuario.getText());
        
        if(txfSenha.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo SENHA pode está vazio");
            return;
        }
        cadastro.setSenha(txfSenha.getText());
        
        if(txtEndereco.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo ENDEREÇO pode está vazio");
            return;
        }
        endereco.setRua(txtEndereco.getText());
        
        if(txfEstado.getText().equalsIgnoreCase("") | !estados.contains(txfEstado.getText())){
            JOptionPane.showMessageDialog(null, "O campo ESTADO está incorreto");
            return;
        }
        endereco.setEstado(txfEstado.getText());
        
        if(txfCep.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo CEP não pode está vazio");
            return;
        }
        endereco.setCep(txfCep.getText());
        endereco.setComplemento(isEmpty(txtComplemento.getText()));
        
        if(txtCidade.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo CIDADE não pode está vazio");
            return;
        }
        endereco.setCidade(txtCidade.getText());
        endereco.setBairro(isEmpty(txtBairro.getText()));
        if(txtRepasse.getText().equalsIgnoreCase("")){
            cadastro.setRepasse(0);
        }else{
            cadastro.setRepasse(Double.parseDouble(txtRepasse.getText()));
        }
        if(txtNumero.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Digite um numero valido");
            return;
        }
        endereco.setNumero(Integer.parseInt(txtNumero.getText()));       
        
        //Verificando se o comboBox foi alterado para um cargo valido
        if(cbxCargo.getSelectedItem().toString().equalsIgnoreCase("-Cargo-")){
           JOptionPane.showMessageDialog(null, "O cargo não pode está vazio");
           return;
        }
        cadastro.setCargo(cbxCargo.getSelectedItem().toString());
        
        salvar(endereco, cadastro);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txfCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCpfFocusGained
        if(txfCpf.getText().equalsIgnoreCase("") && txfCpf.isEditable()){
            try{
                formatacao = new MaskFormatter("###.###.###-##");
                txfCpf.setValue(null);
                txfCpf.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfCpfFocusGained

    private void txfCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCpfFocusLost
        if(txfCpf.getText().replace(" ", "").length() < 14 && txfCpf.isEditable()){
            try {
                formatacao = new MaskFormatter("");
                txfCpf.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_txfCpfFocusLost

    private void txfTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfTelefoneFocusGained
        if(txfTelefone.getText().equalsIgnoreCase("") && txfTelefone.isEditable()){
            try{
                formatacao = new MaskFormatter("(##) #####-####");
                txfTelefone.setValue(null);
                txfTelefone.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfTelefoneFocusGained

    private void txfTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfTelefoneFocusLost
        if(txfTelefone.getText().replace(" ", "").length() < 13 && txfTelefone.isEditable()){
            try{
                formatacao = new MaskFormatter("");
                txfTelefone.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfTelefoneFocusLost

    private void txfCepFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCepFocusGained
        if(txfCep.getText().equalsIgnoreCase("") && txfCep.isEditable()){
            try{
                formatacao = new MaskFormatter("#####-###");
                txfCep.setValue(null);
                txfCep.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfCepFocusGained

    private void txfCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCepFocusLost
        if(txfCep.getText().replace(" ", "").length() < 9 && txfCep.isEditable()){
            try{
                formatacao = new MaskFormatter("");
                txfCep.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfCepFocusLost

    private void txfEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfEstadoFocusGained
        if(txfEstado.getText().equalsIgnoreCase("") && txfEstado.isEditable()){
            try{
                formatacao = new MaskFormatter("UU");
                txfEstado.setValue(null);
                txfEstado.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfEstadoFocusGained

    private void txfEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfEstadoFocusLost
        if(txfEstado.getText().replace(" ", "").length() < 2 && txfEstado.isEditable()){
            try{
                formatacao = new MaskFormatter("");
                txfEstado.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfEstadoFocusLost

    private void txfCroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCroFocusGained
        if(txfCro.getText().equalsIgnoreCase("") && txfCro.isEditable()){
            try{
                formatacao = new MaskFormatter("#######");
                txfCro.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfCroFocusGained

    private void txfCroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCroFocusLost
        if(txfCro.getText().replace(" ", "").length() < 7 && txfCro.isEditable()){
            try {
                formatacao = new MaskFormatter("");
                txfCro.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            } catch (ParseException ex) {
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfCroFocusLost

    private void txfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfSenhaFocusGained
        if(txfSenha.getText().equalsIgnoreCase("")){
            try{
                formatacao = new MaskFormatter("*********");
                txfSenha.setValue(null);
                txfSenha.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfSenhaFocusGained

    private void txfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfSenhaFocusLost
        if(txfSenha.getText().replace(" ", "").length() < 9){
            try{
                formatacao = new MaskFormatter("");
                txfSenha.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                System.err.println("Erro na mascara");
            }
        }
    }//GEN-LAST:event_txfSenhaFocusLost

    private String isEmpty(String texto){
        if(texto.equalsIgnoreCase("null")){
            return "";
        }else{
            return texto;
        }
    }
    
    private void mostrarUsuario(int idFuncionario){
        //Importando as classe e modelos
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        Funcionario funcionario = new Funcionario();
        Endereco end;
        
        //Puxando os dados pessoais do funcionario e mostrando
        if(funcionarioDao.conectar()){
            funcionario = funcionarioDao.buscar(idFuncionario);
            if(funcionario != null){
                txtNome.setText(funcionario.getNome());
                txfCpf.setText(funcionario.getCpf());
                txfTelefone.setText(funcionario.getTelefone());
                txfCro.setText(funcionario.getCro());               
                txtUsuario.setText(funcionario.getUsuario());
                txfSenha.setText(funcionario.getSenha());                
                cbxCargo.setSelectedItem(funcionario.getCargo());
                if(funcionario.getRepasse() == 0){
                    txtRepasse.setText("");
                }else{
                    txtRepasse.setText(String.valueOf(funcionario.getRepasse()));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario não está cadastrado");
            }
            funcionarioDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela funcionario;");
        }
        
        //Puxando as iformação do funcionario tratando e mostrando
        this.idEndereco = funcionario.getIdEndereco();
        if(enderecoDao.conectar()){
            end = enderecoDao.buscar(funcionario.getIdEndereco());
            if(end != null){
                txtEndereco.setText(isEmpty(end.getRua()));
                txfEstado.setText(isEmpty(end.getEstado()));
                txfCep.setText(isEmpty(end.getCep()));                
                txtComplemento.setText(isEmpty(end.getComplemento()));
                txtCidade.setText(isEmpty(end.getCidade()));
                txtBairro.setText(isEmpty(end.getBairro()));
                if(end.getNumero() == 0){
                    txtNumero.setText("");
                }else{
                    txtNumero.setText(isEmpty(String.valueOf(end.getNumero())));
                }
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao buscar o endereco do usuario");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela endereço");
        }
    }      
    
    //Salvando as alteração feitas
    private void salvar(Endereco endereco, Funcionario cadastro){
        FuncionarioDao cadastroDao = new FuncionarioDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        int respostaEnd, respostaFunc;
        
        //iniciando a conexão com o banco de dados
        if(cadastroDao.conectar()){
            if(enderecoDao.conectar()){
                endereco.setIdEndereco(idEndereco);
                cadastro.setIdFuncionario(idFuncionario);
                respostaEnd = enderecoDao.alterar(endereco); //salvando endereço e retornando o valor do IdEndereco            
                respostaFunc = cadastroDao.alterar(cadastro);
                if(respostaEnd == 1 && respostaFunc == 1){
                    JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso"); //Fim esperado
                    this.atuliazar.doClick();
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar o usuário");  
                }
                enderecoDao.desconectar();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            cadastroDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }    
        
    public static void editarFuncionario(String args[]) {
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
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txfCep;
    private javax.swing.JFormattedTextField txfCpf;
    private javax.swing.JFormattedTextField txfCro;
    private javax.swing.JFormattedTextField txfEstado;
    private javax.swing.JFormattedTextField txfSenha;
    private javax.swing.JFormattedTextField txfTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairro1;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRepasse;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
