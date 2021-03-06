package SubTelas.Agenda;

import Commun.TextPrompt;
import Dao.AgendaDao;
import Dao.FinaceiroDao;
import Dao.FuncionarioDao;
import Dao.PacienteDao;
import Pacotes.Agendar;
import Pacotes.Funcionario;
import Pacotes.Financeiro;
import java.awt.Insets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import telas.Agenda;

public class AgendarConsulta extends javax.swing.JFrame {
    
    //Declaração de metodos
    TextPrompt nomes;
    Agenda atl;
    FuncionarioDao funcionarioDao = new FuncionarioDao();
    AgendaDao agendaDao = new AgendaDao();
    MaskFormatter formatacao;
    
    public AgendarConsulta() {
        //SHIFT + F6 inicia Aqui
        initComponents();
        nomes = new TextPrompt("Descrição", txaDescricao);
        nomes = new TextPrompt("Cpf", txtCpf);
        nomes = new TextPrompt("Valor", txtValor);
        nomes = new TextPrompt("Desconto", txtDesconto);
        lblValor.setVisible(false);
        lblDesconto.setVisible(false);
        mostraDentistas();       
    }
    
    public AgendarConsulta(String text, Agenda atl){
        //Programa é chamado por aqui
        initComponents();
        nomes = new TextPrompt("Descrição", txaDescricao);
        nomes = new TextPrompt("CPF", txtCpf);
        nomes = new TextPrompt("Valor", txtValor);
        nomes = new TextPrompt("Desconto", txtDesconto);
        txtData.setText(text);
        lblValor.setVisible(false);
        lblDesconto.setVisible(false);
        this.atl = atl; //Passado a tela anterior para poder ser atualizada
        mostraDentistas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtData = new javax.swing.JTextField();
        cbxProcedimento = new javax.swing.JComboBox<>();
        BotaoCadrastar = new javax.swing.JButton();
        cbxDentista = new javax.swing.JComboBox<>();
        cbxPreferencia = new javax.swing.JComboBox<>();
        cbxDuracao = new javax.swing.JComboBox<>();
        lblDesconto = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        txtCpf = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JFormattedTextField();
        txtDesconto = new javax.swing.JFormattedTextField();
        lblAgendar = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        lblBranco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendar Consulta");
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        txtData.setBackground(new java.awt.Color(236, 236, 236));
        getContentPane().add(txtData);
        txtData.setBounds(100, 92, 170, 30);

        cbxProcedimento.setBackground(new java.awt.Color(236, 236, 236));
        cbxProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione-", "Colocação", "Manutenção", "Clareamento", "Cirugia", "Remoção", "Canal", "Outro" }));
        getContentPane().add(cbxProcedimento);
        cbxProcedimento.setBounds(100, 222, 410, 30);

        BotaoCadrastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeReagendar.png"))); // NOI18N
        BotaoCadrastar.setText("Agendar");
        BotaoCadrastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadrastarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCadrastar);
        BotaoCadrastar.setBounds(400, 440, 120, 40);

        cbxDentista.setBackground(new java.awt.Color(236, 236, 236));
        cbxDentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Dentista-" }));
        getContentPane().add(cbxDentista);
        cbxDentista.setBounds(100, 182, 410, 30);

        cbxPreferencia.setBackground(new java.awt.Color(236, 236, 236));
        cbxPreferencia.setEditable(true);
        cbxPreferencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Preferência-", "10:00", "11:00", "12:00", "13:00" }));
        getContentPane().add(cbxPreferencia);
        cbxPreferencia.setBounds(340, 92, 170, 30);

        cbxDuracao.setBackground(new java.awt.Color(236, 236, 236));
        cbxDuracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Duração-", "15min", "30min", "60min", "120min" }));
        getContentPane().add(cbxDuracao);
        cbxDuracao.setBounds(340, 142, 170, 30);

        lblDesconto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDesconto.setText("R$:");
        getContentPane().add(lblDesconto);
        lblDesconto.setBounds(350, 270, 160, 30);

        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblValor.setText("R$:");
        getContentPane().add(lblValor);
        lblValor.setBounds(107, 270, 160, 30);

        txaDescricao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txaDescricao.setLineWrap(true);
        txaDescricao.setTabSize(0);
        jScrollPane1.setViewportView(txaDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 320, 460, 110);

        txtCpf.setBackground(new java.awt.Color(236, 236, 236));
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });
        getContentPane().add(txtCpf);
        txtCpf.setBounds(100, 142, 170, 30);

        txtValor.setBackground(new java.awt.Color(236, 236, 236));
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(100, 270, 170, 30);

        txtDesconto.setBackground(new java.awt.Color(236, 236, 236));
        txtDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });
        getContentPane().add(txtDesconto);
        txtDesconto.setBounds(340, 270, 170, 30);

        lblAgendar.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        lblAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendar.setText("Agendar Consulta");
        getContentPane().add(lblAgendar);
        lblAgendar.setBounds(0, 2, 600, 60);

        lblFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundo2.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, -40, 904, 565);

        lblBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tela_branca.png"))); // NOI18N
        getContentPane().add(lblBranco);
        lblBranco.setBounds(-10, 63, 610, 310);

        setSize(new java.awt.Dimension(614, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadrastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadrastarActionPerformed
        //Essa parte pega todos os valores da tela TRATA e manda para a função salvar
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dia = new Date(), dataAtual, dataEscolhida;
        Agendar agenda = new Agendar();
        Financeiro finaceiro;
        String data;
        
        try{
            dataAtual = format.parse(format.format(dia));
            dataEscolhida = format.parse(txtData.getText());
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "ERRO AO PROCESSAR A DATA", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        if(txtData.getText().equalsIgnoreCase("") | dataAtual.after(dataEscolhida)){
            JOptionPane.showMessageDialog(null, "Insira uma data valida");
            return;
        }
        data = txtData.getText();
        agenda.setDateStr(data.substring(6) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2));
        
        if(txtCpf.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Digite um Cpf valido!");
            return;
        }
        agenda.setCpf(txtCpf.getText().replace(".", "").replace("-", ""));
       
        if(cbxPreferencia.getSelectedItem().toString().equalsIgnoreCase("-Preferência-")){
            JOptionPane.showMessageDialog(null, "Selecione um valor valído para Preferência de Horario");
            return;
        }
        agenda.setHora(cbxPreferencia.getSelectedItem().toString() + ":00");
        
        if(cbxDuracao.getSelectedItem().toString().equalsIgnoreCase("-Duração-")){
            JOptionPane.showMessageDialog(null, "Selecione um valor valído para Duração da consulta");
            return;
        }else if(cbxDuracao.getSelectedItem().toString().equalsIgnoreCase("60min")){
            agenda.setDuracao("01:" + "00" + ":00");
        }else if(cbxDuracao.getSelectedItem().toString().equalsIgnoreCase("120min")){
            agenda.setDuracao("01:" + "20" + ":00");
        }else{
            agenda.setDuracao("00:" + cbxDuracao.getSelectedItem().toString().replace("min", "") + ":00");
        }
        
        if(txaDescricao.getText().equalsIgnoreCase("")){
            agenda.setAnotacao(null);
        }else{
             agenda.setAnotacao(txaDescricao.getText());
        }
        
        if(cbxDentista.getSelectedItem().toString().equalsIgnoreCase("-Dentista-")){
            JOptionPane.showMessageDialog(null, "Selecione um valor valído para Dentista");
            return;
        }
        String[] divString = cbxDentista.getSelectedItem().toString().split("CRO: ");
        agenda.setCro(divString[1].replace(")", ""));
        
        if(cbxProcedimento.getSelectedItem().toString().equalsIgnoreCase("-Selecione-")){
            JOptionPane.showMessageDialog(null, "Selecione um valor valído para Procedimento");
            return;
        }
        agenda.setProcedimento(cbxProcedimento.getSelectedItem().toString());
        
        //Finaceiro ↓
       try{
            finaceiro = new Financeiro();
            if(txtValor.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Digite um valor para o campo Valor");
                return;
            }
            finaceiro.setValor(Double.parseDouble(txtValor.getText().replace(",", ".")));
            
            if(txtDesconto.getText().equalsIgnoreCase("")){
                finaceiro.setDesconto(0);
            }else{
                finaceiro.setDesconto(Double.parseDouble(txtDesconto.getText().replace(",", ".")));
            }           
       }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas nuemero nos campos valor e desconto");
            return;
       }
       finaceiro.setEnviarData(txtData.getText());
       finaceiro.setDentista(cbxDentista.getSelectedItem().toString());
       
        salvar(agenda, finaceiro);
    }//GEN-LAST:event_BotaoCadrastarActionPerformed

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        //Faz aparecer a formatação do CPF
        if(txtCpf.getText().equalsIgnoreCase("   .   .   -  ") | txtCpf.getText().replace(" ", "").length() < 14){
            try {
                formatacao = new MaskFormatter("");
                txtCpf.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        //Faz desaparecer a formatação do CPF
        if(txtCpf.getText().equalsIgnoreCase("")){
            try{
                formatacao = new MaskFormatter("###.###.###-##");
                txtCpf.setValue(null);
                txtCpf.setFormatterFactory(new DefaultFormatterFactory(formatacao));
            }catch(ParseException ex){
                 System.err.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusGained
        Insets formato = new Insets(2, 25, 2, 2);
        txtValor.setMargin(formato);
        lblValor.setVisible(true);
    }//GEN-LAST:event_txtValorFocusGained

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        if(txtValor.getText().equalsIgnoreCase("")){
            lblValor.setVisible(false);
            Insets formato = new Insets(2, 2, 2, 2);
            txtValor.setMargin(formato);
            txtValor.setValue(null);
        }
    }//GEN-LAST:event_txtValorFocusLost

    private void txtDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusGained
        Insets formato = new Insets(2, 25, 2, 2);
        txtDesconto.setMargin(formato);
        lblDesconto.setVisible(true);
    }//GEN-LAST:event_txtDescontoFocusGained

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        if(txtDesconto.getText().equalsIgnoreCase("")){
            lblDesconto.setVisible(false);
            Insets formato = new Insets(2, 2, 2, 2);
            txtDesconto.setMargin(formato);
        }
    }//GEN-LAST:event_txtDescontoFocusLost
        
    
    private void salvar(Agendar agenda, Financeiro finaceiro){
        //Declaração de variaveis
        PacienteDao pacienteDao;
        FinaceiroDao finaceiroDao;
        String cpfTratado = txtCpf.getText().replace(".", "").replace("-", "");
        int resultado;
        
        if(agendaDao.conectar()){ //Iniciando conexão com o banco de dados
            pacienteDao = new PacienteDao();
            
            if(pacienteDao.conectar()){   //Iniciando conexão com o banco de dados          
                finaceiroDao = new FinaceiroDao();
                
                if(finaceiroDao.conectar()){
                    if(pacienteDao.retornarNome(cpfTratado) != null){
                        resultado = finaceiroDao.salvar(finaceiro);
                        agenda.setIdFinaceiro(resultado);
                        if(resultado != -1){
                            resultado = agendaDao.salvar(agenda); //Salvando em uma variavel INT o resultado da operação
                            if(resultado == 1){ //Esperado
                                JOptionPane.showMessageDialog(null, "Consulta marcada com sucesso");
                                this.atl.atualizar();
                                dispose();
                            }else{ //Todos os erros possivel está abaixo
                                JOptionPane.showMessageDialog(null, "Não foi possivel marcar a consulta");
                            }
                        }else{
                             JOptionPane.showMessageDialog(null, "Não foi possivel marcar a consulta");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Paciente não foi previamente cadastrado");
                    }
                   finaceiroDao.desconectar();
                   
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possivel Conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                pacienteDao.desconectar();
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel Conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            agendaDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel Conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void mostraDentistas(){
        //Mostrar a lista de dentista na comboBox
        ArrayList<Funcionario> dentista;
        
        if(funcionarioDao.conectar()){
            dentista = funcionarioDao.buscarDentista();
            if(dentista != null){
                for(Funcionario den : dentista){
                    cbxDentista.addItem(den.getNome() + " (CRO: " + den.getCro() + ")");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao conectar a tabela funcionario", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } 
    
    public static void agendar(String args[]) {
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
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarConsulta().setVisible(true);
            }
        });
    }

    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadrastar;
    private javax.swing.JComboBox<String> cbxDentista;
    private javax.swing.JComboBox<String> cbxDuracao;
    private javax.swing.JComboBox<String> cbxPreferencia;
    private javax.swing.JComboBox<String> cbxProcedimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgendar;
    private javax.swing.JLabel lblBranco;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtData;
    private javax.swing.JFormattedTextField txtDesconto;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
