package telas;

import java.awt.Color;
import java.text.SimpleDateFormat;
import Commun.TextPrompt;
import Dao.AgendaDao;
import Dao.FuncionarioDao;
import Dao.PacienteDao;
import Pacotes.Agendar;
import SubTelas.Agenda.EditarConsulta;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Agenda extends javax.swing.JFrame {

    String cargo;
    AgendaDao agendaDao = new AgendaDao();
    JTable tabela;
    DefaultTableModel tableModel;
    SimpleDateFormat formatacao;
    TextPrompt nome;

    public Agenda() {
        initComponents();
        nome = new TextPrompt("Nome do Paciente", txtNomePaciente);
        tableModel = (DefaultTableModel) tblConsultaDia.getModel();
        jScrollPane2.setVisible(false);
        atualizrBD();
        mostrarAgendamentos(true);
    }

    public Agenda(String cargo) {
        initComponents();
        tableModel = (DefaultTableModel) tblConsultaDia.getModel();
        nome = new TextPrompt("Nome do Paciente", txtNomePaciente);
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProntuario.setToolTipText("Prontuario");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");
        atualizrBD();
        mostrarAgendamentos(true);
        this.cargo = cargo;
    }

    private final Color C1 = new Color(51, 153, 255), C2 = new Color(0, 102, 255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        btnInicio = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnProntuario = new javax.swing.JButton();
        btnAgendar = new javax.swing.JButton();
        btnBuscarPeriodo = new javax.swing.JButton();
        btnRemarcar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultaDia = new javax.swing.JTable();
        jCalendar = new com.toedter.calendar.JCalendar();
        txtNomePaciente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        dcAte = new com.toedter.calendar.JDateChooser();
        dcDe = new com.toedter.calendar.JDateChooser();
        lblAte = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultaPeriodo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        btnAgenda.setBackground(new java.awt.Color(0, 102, 255));
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

        btnEstoque.setBackground(new java.awt.Color(51, 153, 255));
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeEstoque.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstoque);
        btnEstoque.setBounds(6, 365, 108, 108);

        btnProntuario.setBackground(new java.awt.Color(51, 153, 255));
        btnProntuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeProntuario.png"))); // NOI18N
        btnProntuario.setActionCommand("Análise \nde Dados");
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProntuario);
        btnProntuario.setBounds(6, 483, 108, 108);

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgendar);
        btnAgendar.setBounds(746, 435, 440, 50);

        btnBuscarPeriodo.setText("Buscar");
        btnBuscarPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarPeriodoMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscarPeriodo);
        btnBuscarPeriodo.setBounds(1085, 570, 100, 50);

        btnRemarcar.setText("Remarcar");
        btnRemarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemarcarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemarcar);
        btnRemarcar.setBounds(746, 503, 440, 50);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblConsultaDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horario", "Nome", "Doutor", "Procedimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultaDia.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblConsultaDia.setRowMargin(2);
        tblConsultaDia.getTableHeader().setResizingAllowed(false);
        tblConsultaDia.getTableHeader().setReorderingAllowed(false);
        tblConsultaDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultaDiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsultaDia);
        if (tblConsultaDia.getColumnModel().getColumnCount() > 0) {
            tblConsultaDia.getColumnModel().getColumn(0).setResizable(false);
            tblConsultaDia.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblConsultaDia.getColumnModel().getColumn(1).setResizable(false);
            tblConsultaDia.getColumnModel().getColumn(1).setPreferredWidth(250);
            tblConsultaDia.getColumnModel().getColumn(2).setResizable(false);
            tblConsultaDia.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblConsultaDia.getColumnModel().getColumn(3).setResizable(false);
            tblConsultaDia.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 100, 600, 610);

        jCalendar.setNullDateButtonText("");
        jCalendar.setWeekOfYearVisible(false);
        getContentPane().add(jCalendar);
        jCalendar.setBounds(744, 11, 450, 412);

        txtNomePaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomePacienteKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomePaciente);
        txtNomePaciente.setBounds(132, 26, 478, 46);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(628, 26, 104, 46);

        dcAte.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(dcAte);
        dcAte.setBounds(940, 570, 130, 50);

        dcDe.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(dcDe);
        dcDe.setBounds(750, 570, 140, 50);

        lblAte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAte.setText("Até");
        getContentPane().add(lblAte);
        lblAte.setBounds(890, 570, 50, 50);

        tblConsultaPeriodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Horario", "Nome", "Doutor", "Procedimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblConsultaPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultaPeriodoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblConsultaPeriodo);
        if (tblConsultaPeriodo.getColumnModel().getColumnCount() > 0) {
            tblConsultaPeriodo.getColumnModel().getColumn(0).setResizable(false);
            tblConsultaPeriodo.getColumnModel().getColumn(1).setResizable(false);
            tblConsultaPeriodo.getColumnModel().getColumn(2).setResizable(false);
            tblConsultaPeriodo.getColumnModel().getColumn(3).setResizable(false);
            tblConsultaPeriodo.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 100, 600, 610);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoPricipal.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 720);

        setSize(new java.awt.Dimension(1214, 727));
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

        TelaFinanceiro f = new TelaFinanceiro(cargo);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        TelaProtuario d = new TelaProtuario(cargo);
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed

        TelaPaciente p = new TelaPaciente(cargo);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        btnInicio.setBackground(C1);
        btnAgenda.setBackground(C2);
        btnPaciente.setBackground(C1);
        btnFinanceiro.setBackground(C1);
        btnEstoque.setBackground(C1);
        btnProntuario.setBackground(C1);
            }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        formatacao = new SimpleDateFormat("dd/MM/yyyy");
        Date dia = new Date(), dataAtual, dataEscolhida;
        
        try{
            dataAtual = formatacao.parse(formatacao.format(dia));
            dataEscolhida = formatacao.parse(formatacao.format(jCalendar.getDate()));
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "ERRO AO PROCESSAR A DATA", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(dataAtual.after(dataEscolhida)){
            JOptionPane.showMessageDialog(null, "A consulta não pode ser marcada para o Passado");
            return;
        }
        String dataFormatada = formatacao.format(jCalendar.getDate());
        SubTelas.Agenda.AgendarConsulta a = new SubTelas.Agenda.AgendarConsulta(dataFormatada, this);
        a.setVisible(true);

    }//GEN-LAST:event_btnAgendarActionPerformed

    private void tblConsultaDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultaDiaMouseClicked
        if (evt.getClickCount() == 2) {
            btnRemarcar.doClick();
        }
    }//GEN-LAST:event_tblConsultaDiaMouseClicked

    private void btnRemarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemarcarActionPerformed
        if (tblConsultaDia.getSelectedRow() > -1 | tblConsultaPeriodo.getSelectedRow() > -1) {
            JTable tabela = tblConsultaDia;
            PacienteDao pacienteDao = new PacienteDao();
            formatacao = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatacaoEua = new SimpleDateFormat("yyyy-MM-dd");

            Agendar agenda;
            Date data = new Date();
            int posNome, posHora;
            String cpf, dia = "null", diaConsulta;

            if (tblConsultaDia.getSelectedRow() > -1 && jScrollPane1.isVisible()) {
                tabela = tblConsultaDia;
                posNome = 1;
                posHora = 0;
                tableModel = (DefaultTableModel) tblConsultaDia.getModel();
                dia = formatacaoEua.format(data);
            } else if (tblConsultaPeriodo.getSelectedRow() > -1 && jScrollPane2.isVisible()) {
                tabela = tblConsultaPeriodo;
                tableModel = (DefaultTableModel) tblConsultaPeriodo.getModel();
                posNome = 2;
                posHora = 1;
                dia = agendaDao.formatar(tableModel.getValueAt(tblConsultaPeriodo.getSelectedRow(), 0).toString());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um consulta antes");
                return;
            }

            if (agendaDao.conectar()) {
                if (pacienteDao.conectar()) {
                    cpf = pacienteDao.retornarCpf(tableModel.getValueAt(tabela.getSelectedRow(), posNome).toString()); //Ideia se tiver mais de uma pessao com o mesmo nome abrir uma lista pra selecionar qual dos dois é
                    if (cpf != null) {
                        agenda = agendaDao.buscar(dia, cpf, tableModel.getValueAt(tabela.getSelectedRow(), posHora).toString() + ":00");
                        if (agenda != null) {
                            diaConsulta = formatacao.format(agenda.getData());
                            agenda.setDateStr(diaConsulta);
                            EditarConsulta editar = new EditarConsulta(cpf, agenda, this);
                            editar.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Agendamento não encotrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao buscar o CPF do paciente");
                    }
                    pacienteDao.desconectar();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
                }
                agendaDao.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um consulta antes");
        }
    }//GEN-LAST:event_btnRemarcarActionPerformed

    private void btnBuscarPeriodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarPeriodoMouseClicked
        if (jScrollPane1.isVisible()) {
            jScrollPane1.setVisible(false);
            jScrollPane2.setVisible(true);
            mostrarAgendamentos(false);
            btnBuscarPeriodo.setText("Limpar");
        } else if (jScrollPane2.isVisible()) {
            jScrollPane1.setVisible(true);
            jScrollPane2.setVisible(false);
            mostrarAgendamentos(true);
            dcDe.setDate(null);
            dcAte.setDate(null);
            btnBuscarPeriodo.setText("Buscar");
        }
    }//GEN-LAST:event_btnBuscarPeriodoMouseClicked

    private void tblConsultaPeriodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultaPeriodoMouseClicked
        if (evt.getClickCount() == 2) {
            btnRemarcar.doClick();
        }
    }//GEN-LAST:event_tblConsultaPeriodoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        formatacao = new SimpleDateFormat("dd/MM/yyyy");
        tableModel = (DefaultTableModel) tblConsultaDia.getModel();
        PacienteDao pacienteDao;
        FuncionarioDao funcionarioDao;
        Date data = new Date();
        Agendar agenda;
        String cpf;

        if (txtNomePaciente.getText().equalsIgnoreCase("")) {
            mostrarAgendamentos(true);
            return;
        }

        if (agendaDao.conectar()) {
            pacienteDao = new PacienteDao();
            if (pacienteDao.conectar()) {
                funcionarioDao = new FuncionarioDao();
                if (funcionarioDao.conectar()) {
                    cpf = pacienteDao.retornarCpf(txtNomePaciente.getText());
                    if (cpf != null) {
                        agenda = agendaDao.buscar(agendaDao.formatar(formatacao.format(data)), cpf);
                        try{
                            agenda.setNomeDentista(funcionarioDao.buscarDentista(agenda.getCro()));
                        }catch(NullPointerException ex){
                            JOptionPane.showMessageDialog(null, "Nenhum agendamento foi encotrado para esse paciente");
                            return;
                        }
                        tableModel.setNumRows(0);
                        if (agenda != null) {
                            tableModel.addRow(new Object[]{
                                agenda.getHora(),
                                pacienteDao.buscar(cpf),
                                agenda.getNomeDentista(),
                                agenda.getProcedimento()
                            });
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhum paciente foi encotrado");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "nenhum paciente foi encotrado com esse nome");
                    }

                    funcionarioDao.desconectar();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel acessar o banco de dados");
                }
                pacienteDao.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel acessar o banco de dados");
            }
            agendaDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel acessar o banco de dados");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNomePacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePacienteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_txtNomePacienteKeyPressed

    private void mostrarAgendamentos(boolean doDia) {
        //Estou vendo ainda como melhorara essa parte
        //Declaração de variaves
        PacienteDao pacienteDao = new PacienteDao();
        DefaultTableModel tableModelPeriodo = (DefaultTableModel) tblConsultaPeriodo.getModel();
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        formatacao = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        ArrayList<Agendar> valores;
        String diaAtual, diabanco; //Comparação de Dia
        String de, ate; //Comparação de periodo

        //Obtendo o dia e vendo de qual conjuto ele faz parte      
        diaAtual = formatacao.format(date);

        if (agendaDao.conectar()) {         //Conectando ao banco de dados   
            if (pacienteDao.conectar()) {   //Conectando ao banco de dados 
                if (funcionarioDao.conectar()) { //Conectando ao banco de dados 
                    if (doDia) { //Se quiser os dados apenas do dia atual
                        valores = agendaDao.listarTodos(); //passando valores da tabela agenda para uma Array
                        if (valores != null) {
                            tableModel.setNumRows(0);
                            for (Agendar age : valores) {
                                diabanco = formatacao.format(age.getData());
                                if (diabanco.equalsIgnoreCase(diaAtual)) { //Dia Atual
                                    tableModel.addRow(new Object[]{
                                        age.getHora(),
                                        pacienteDao.retornarNome(age.getCpf()),
                                        funcionarioDao.buscarDentista(age.getCro()),
                                        age.getProcedimento()
                                    });
                                } else {
                                }
                            } //Abaixo as messagem de erro disponiveis
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhuma Consulta foi Encotrada");
                        }

                    } else { //Se Quiser todos os dados de um periodo
                        de = agendaDao.formatar(formatacao.format(dcDe.getDate()));
                        ate = agendaDao.formatar(formatacao.format(dcAte.getDate()));
                        valores = agendaDao.buscarPeriodo(de, ate); //passando valores da tabela agenda para uma Array
                        if (valores != null) {
                            tableModelPeriodo.setNumRows(0);
                            for (Agendar age : valores) {
                                if (!doDia) { //Dia Atual
                                    tableModelPeriodo.addRow(new Object[]{
                                        formatacao.format(age.getData()), //DIA
                                        age.getHora(), //HORA
                                        pacienteDao.buscar(age.getCpf()), //Nome Paciente
                                        funcionarioDao.buscarDentista(age.getCro()), //Nome Medico
                                        age.getProcedimento() //Procedimento
                                    });
                                } else {
                                }
                            } //Abaixo as messagem de erro disponiveis
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhuma Consulta foi Encotrada");
                        }
                    }

                    funcionarioDao.desconectar();
                }
                pacienteDao.desconectar();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
            }
            agendaDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados");
        }

    }

    public void atualizar() {
        tableModel = (DefaultTableModel) tblConsultaDia.getModel();
        tableModel.setNumRows(0);
        mostrarAgendamentos(true);
    }

    
    private void atualizrBD(){
        agendaDao = new AgendaDao();
        int verificador;
        
        if(agendaDao.conectar()){
            verificador = agendaDao.apagarAntigos();
            if(verificador == -1){
                JOptionPane.showMessageDialog(null, "Nâo foi possivel apagar os agendamentos antigos");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectaro ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void agenda(String args[]) {
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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarPeriodo;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnRemarcar;
    private com.toedter.calendar.JDateChooser dcAte;
    private com.toedter.calendar.JDateChooser dcDe;
    private com.toedter.calendar.JCalendar jCalendar;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAte;
    private javax.swing.JTable tblConsultaDia;
    private javax.swing.JTable tblConsultaPeriodo;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}