package telas;

import Commun.TextPrompt;
import Dao.FinaceiroDao;
import Pacotes.Financeiro;
import SubTelas.Finaceiro.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaFinanceiro extends javax.swing.JFrame {

    String cargo;
    FinaceiroDao financeiroDao;
    DefaultTableModel tableModel;

    public TelaFinanceiro() {
        initComponents();
    }

    public TelaFinanceiro(String cargo) {
        initComponents();
        TextPrompt txp = new TextPrompt("Digite o nome do Dentista", txtPesquisar);
        btnLimpar.setVisible(false);
        btnInicio.setToolTipText("Tela Inicial");
        btnEstoque.setToolTipText("Estoque");
        btnFinanceiro.setToolTipText("Financeiro");
        btnProntuario.setToolTipText("Prontuário");
        btnPaciente.setToolTipText("Paciente");
        btnAgenda.setToolTipText("Agenda");
        this.cargo = cargo;
        bruto();
        periodo();
        mostrarDados();
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
        btnProntuario = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        dcDe = new com.toedter.calendar.JDateChooser();
        lblAte = new javax.swing.JLabel();
        dcAte = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRelatorio = new javax.swing.JTable();
        lblgraficoPeriodos = new javax.swing.JLabel();
        lblgraficoBruto = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
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

        btnFinanceiro.setBackground(new java.awt.Color(0, 102, 255));
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeFinanceiro.png"))); // NOI18N
        btnFinanceiro.setToolTipText("");
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinanceiro);
        btnFinanceiro.setBounds(6, 603, 108, 108);

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
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnProntuario);
        btnProntuario.setBounds(6, 485, 108, 108);

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcurar);
        btnProcurar.setBounds(540, 30, 170, 40);

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });
        getContentPane().add(txtPesquisar);
        txtPesquisar.setBounds(160, 30, 360, 40);

        dcDe.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(dcDe);
        dcDe.setBounds(168, 80, 120, 40);

        lblAte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAte.setText("Até");
        getContentPane().add(lblAte);
        lblAte.setBounds(290, 80, 60, 40);

        dcAte.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(dcAte);
        dcAte.setBounds(350, 80, 120, 40);

        tblRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Dentista", "Descontos", "Valor", "Lucro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRelatorio.getTableHeader().setResizingAllowed(false);
        tblRelatorio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblRelatorio);
        if (tblRelatorio.getColumnModel().getColumnCount() > 0) {
            tblRelatorio.getColumnModel().getColumn(0).setResizable(false);
            tblRelatorio.getColumnModel().getColumn(1).setResizable(false);
            tblRelatorio.getColumnModel().getColumn(1).setPreferredWidth(233);
            tblRelatorio.getColumnModel().getColumn(2).setResizable(false);
            tblRelatorio.getColumnModel().getColumn(3).setResizable(false);
            tblRelatorio.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 140, 610, 540);

        lblgraficoPeriodos.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(lblgraficoPeriodos);
        lblgraficoPeriodos.setBounds(770, 460, 420, 230);

        lblgraficoBruto.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(lblgraficoBruto);
        lblgraficoBruto.setBounds(770, 230, 420, 230);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(480, 100, 80, 20);

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
        btnInicio.setBackground(C1);
        btnAgenda.setBackground(C1);
        btnPaciente.setBackground(C1);
        btnFinanceiro.setBackground(C2);
        btnEstoque.setBackground(C1);
        btnProntuario.setBackground(C1);
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        TelaProtuario prontuario = new TelaProtuario(cargo);
        prontuario.setVisible(true);
        dispose();
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

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // Declaração
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Financeiro> financeiro = null;
        tableModel = (DefaultTableModel) tblRelatorio.getModel();
        financeiroDao = new FinaceiroDao();

        try {
            Date inicial = formato.parse("00/00/0000"); //Apenas uma data para comparação               
            //If usada para realizar uma busca no banco de dados e retorna os valores para a data correspodente
            if (financeiroDao.conectar()) {
                
                //IFs de pesquisa Dupla
                if (!txtPesquisar.getText().equalsIgnoreCase("")) {
                    btnLimpar.setVisible(true);
                    financeiro = financeiroDao.buscarReceita(txtPesquisar.getText());
                } else if (txtPesquisar.getText().equalsIgnoreCase("") && dcDe.getDate() == null) {
                    tableModel.setRowCount(0);
                    mostrarDados();
                    return;
                } else {
                    if (dcDe.getDate().after(inicial) && dcAte.getDate().after(inicial)) { //Verificação para saber se as duas datas estão preenchidas
                        if (dcDe.getDate().before(dcAte.getDate())) { //Verificação para saber se a data inicial e menor que a data final
                            btnLimpar.setVisible(true);
                            financeiro = financeiroDao.buscar(financeiroDao.coverterBD(dcDe.getDate()), financeiroDao.coverterBD(dcAte.getDate())); // Passando valores para fazer a pesquisa
                        }
                    }else if(dcDe.getDate() == null && dcAte.getDate() == null){
                        tableModel.setRowCount(0);
                        mostrarDados();
                        return;
                    }
                }
                //FIM
                
                if (financeiro != null) {//Se ele n estiver vazio                   
                    tableModel.setRowCount(0);
                    for (Financeiro valor : financeiro) { //Para cada valor dentro da capsula de finaceiro dentro do vetor
                        tableModel.addRow(new Object[]{// Passando valores para um novo objeto e adionando esse objeto em uma nova linha
                            formato.format(valor.getData()),
                            valor.getDentista(),
                            ("R$: " + valor.getDesconto()),
                            ("R$: " + valor.getValor()),
                            ("R$: " + (valor.getValor() - valor.getDesconto()))
                        });
                    }
                } else { //se ele estiver vazio
                    JOptionPane.showMessageDialog(null, "Não ha valores para o periodo procurado");
                }
                financeiroDao.desconectar();
            } else { //Não foi possivel conectar ao banco de dados
                JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            //Fim do uso do banco de dados        
        } catch (ParseException | NullPointerException ex) { //Uma das caixas estão vazias, OU foi digitado um valor errado
            JOptionPane.showMessageDialog(null, "Digite as duas datas para comparação");
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        dcDe.setDate(null);
        dcAte.setDate(null);
        txtPesquisar.setText("");
        btnLimpar.setVisible(false);
        btnProcurar.doClick();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnProcurar.doClick();
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void mostrarDados() {
        financeiroDao = new FinaceiroDao();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Financeiro> dados;

        if (financeiroDao.conectar()) {
            dados = financeiroDao.buscar();
            if (dados != null) {
                tableModel = (DefaultTableModel) tblRelatorio.getModel();
                for (Financeiro valor : dados) {
                    if (valor.getDesconto() < 0) {
                        tableModel.addRow(new Object[]{
                            formato.format(valor.getData()),
                            valor.getDentista(),
                            "R$: 0,00",
                            ("R$: " + valor.getValor()).replace(".", ","),
                            ("R$: " + valor.getValor()).replace(".", ",")
                        });
                    } else {
                        tableModel.addRow(new Object[]{
                            formato.format(valor.getData()),
                            valor.getDentista(),
                            ("R$: " + valor.getDesconto()).replace(".", ","),
                            ("R$: " + valor.getValor()).replace(".", ","),
                            ("R$: " + (valor.getValor() - valor.getDesconto())).replace(".", ",")
                        });
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum valor foi encotrado");
            }
            financeiroDao.desconectar();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void redimensionaGrafico(String nome, JLabel local) {
        ImageIcon icon = new ImageIcon("src\\view\\" + nome + ".png");
        icon.setImage(icon.getImage().getScaledInstance(local.getWidth(), local.getHeight(), 1));
        local.setIcon(icon);
    }

    private void bruto() {
        GraficoBruto bruto = new GraficoBruto();
        redimensionaGrafico("bruto", lblgraficoBruto);
        bruto.dispose();
    }

    private void periodo() {
        GraficoPeriodo periodo = new GraficoPeriodo();
        redimensionaGrafico("periodos", lblgraficoPeriodos);
        periodo.dispose();
    }

    public static void financeiro(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFinanceiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnProntuario;
    private com.toedter.calendar.JDateChooser dcAte;
    private com.toedter.calendar.JDateChooser dcDe;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAte;
    private javax.swing.JLabel lblgraficoBruto;
    private javax.swing.JLabel lblgraficoPeriodos;
    private javax.swing.JTable tblRelatorio;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
