package SubTelas.Protuario;

import Commun.TextPrompt;
import Dao.ProntuarioDao;
import Pacotes.Prontuario;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import telas.TelaProtuario;

public class NovoProtuario extends javax.swing.JFrame {

    private String dente;
    private boolean cadastrado = false; 
    TelaProtuario tela;
    int valor = 0;
    TextPrompt txp;
    DefaultTableModel tableModel;

    public NovoProtuario() {
        initComponents();
    }
    
    public NovoProtuario(TelaProtuario tela) {
        initComponents();
        this.tela = tela;
        txp = new TextPrompt("Digite o CPF", txfCpf);
        txp = new TextPrompt("Digite o NOME", txtNome);
        txp = new TextPrompt("Digite o Celular/Telefone", txfContato);
        txp = new TextPrompt("Valor Total", txtValor);
        txp = new TextPrompt("Digite o Desconto", txtDesconto);
        txp = new TextPrompt("Observação", txaObs);
        lblRS.setVisible(false);
        btnSalvar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        mnuRemover = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaObs = new javax.swing.JTextArea();
        txfCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txfContato = new javax.swing.JFormattedTextField();
        lblRS = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JFormattedTextField();
        txtValor = new javax.swing.JFormattedTextField();
        txtEstimativa = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDente = new javax.swing.JTable();
        cbxProcedimento = new javax.swing.JComboBox<>();
        btnInserir = new javax.swing.JButton();
        btnDente18 = new javax.swing.JButton();
        btnDente17 = new javax.swing.JButton();
        btnDente16 = new javax.swing.JButton();
        btnDente15 = new javax.swing.JButton();
        btnDente14 = new javax.swing.JButton();
        btnDente13 = new javax.swing.JButton();
        btnDente12 = new javax.swing.JButton();
        btnDente21 = new javax.swing.JButton();
        btnDente11 = new javax.swing.JButton();
        btnDente22 = new javax.swing.JButton();
        btnDente23 = new javax.swing.JButton();
        btnDente24 = new javax.swing.JButton();
        btnDente25 = new javax.swing.JButton();
        btnDente26 = new javax.swing.JButton();
        btnDente27 = new javax.swing.JButton();
        btnDente28 = new javax.swing.JButton();
        btnDente48 = new javax.swing.JButton();
        btnDente47 = new javax.swing.JButton();
        btnDente46 = new javax.swing.JButton();
        btnDente45 = new javax.swing.JButton();
        btnDente44 = new javax.swing.JButton();
        btnDente43 = new javax.swing.JButton();
        btnDente42 = new javax.swing.JButton();
        btnDente41 = new javax.swing.JButton();
        btnDente31 = new javax.swing.JButton();
        btnDente32 = new javax.swing.JButton();
        btnDente33 = new javax.swing.JButton();
        btnDente34 = new javax.swing.JButton();
        btnDente35 = new javax.swing.JButton();
        btnDente36 = new javax.swing.JButton();
        btnDente37 = new javax.swing.JButton();
        btnDente38 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        imgTampao = new javax.swing.JLabel();
        imgDente = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        mnuRemover.setText("Remover Linha");
        mnuRemover.setToolTipText("");
        mnuRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRemoverActionPerformed(evt);
            }
        });
        jPopupMenu2.add(mnuRemover);

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Prontuário");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novo Protuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 60);

        txaObs.setColumns(20);
        txaObs.setRows(5);
        jScrollPane1.setViewportView(txaObs);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 370, 390, 140);

        try {
            txfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCpfFocusLost(evt);
            }
        });
        getContentPane().add(txfCpf);
        txfCpf.setBounds(8, 82, 190, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(210, 82, 380, 30);

        txfContato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfContatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfContatoFocusLost(evt);
            }
        });
        getContentPane().add(txfContato);
        txfContato.setBounds(610, 82, 210, 30);

        lblRS.setText("R$:");
        getContentPane().add(lblRS);
        lblRS.setBounds(250, 320, 37, 40);

        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });
        getContentPane().add(txtDesconto);
        txtDesconto.setBounds(240, 320, 170, 40);

        txtValor.setEnabled(false);
        getContentPane().add(txtValor);
        txtValor.setBounds(20, 320, 170, 40);

        txtEstimativa.setEditable(false);
        txtEstimativa.setText("R$: 0,00");
        txtEstimativa.setEnabled(false);
        getContentPane().add(txtEstimativa);
        txtEstimativa.setBounds(560, 150, 170, 40);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tblDente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Dente", "Operação", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblDente.getTableHeader().setResizingAllowed(false);
        tblDente.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblDente);
        if (tblDente.getColumnModel().getColumnCount() > 0) {
            tblDente.getColumnModel().getColumn(0).setResizable(false);
            tblDente.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblDente.getColumnModel().getColumn(1).setResizable(false);
            tblDente.getColumnModel().getColumn(1).setPreferredWidth(220);
            tblDente.getColumnModel().getColumn(2).setResizable(false);
            tblDente.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 170, 390, 130);

        cbxProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecione-", "Canal", "Clareamento a Lazer", "Instalação de Aparelho", "Extração de Dente", "Remoção de Cárie", "Remoção de Siso" }));
        cbxProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProcedimentoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProcedimento);
        cbxProcedimento.setBounds(20, 130, 250, 30);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserir);
        btnInserir.setBounds(280, 130, 65, 30);

        btnDente18.setToolTipText("");
        btnDente18.setBorder(null);
        btnDente18.setBorderPainted(false);
        btnDente18.setContentAreaFilled(false);
        btnDente18.setFocusPainted(false);
        btnDente18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente18);
        btnDente18.setBounds(495, 220, 20, 40);

        btnDente17.setToolTipText("");
        btnDente17.setBorder(null);
        btnDente17.setBorderPainted(false);
        btnDente17.setContentAreaFilled(false);
        btnDente17.setFocusPainted(false);
        btnDente17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente17);
        btnDente17.setBounds(520, 220, 15, 40);

        btnDente16.setToolTipText("");
        btnDente16.setBorder(null);
        btnDente16.setBorderPainted(false);
        btnDente16.setContentAreaFilled(false);
        btnDente16.setFocusPainted(false);
        btnDente16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente16);
        btnDente16.setBounds(545, 214, 15, 45);

        btnDente15.setToolTipText("");
        btnDente15.setBorder(null);
        btnDente15.setBorderPainted(false);
        btnDente15.setContentAreaFilled(false);
        btnDente15.setFocusPainted(false);
        btnDente15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente15);
        btnDente15.setBounds(567, 216, 10, 45);

        btnDente14.setToolTipText("");
        btnDente14.setBorder(null);
        btnDente14.setBorderPainted(false);
        btnDente14.setContentAreaFilled(false);
        btnDente14.setFocusPainted(false);
        btnDente14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente14);
        btnDente14.setBounds(585, 210, 10, 55);

        btnDente13.setToolTipText("");
        btnDente13.setBorder(null);
        btnDente13.setBorderPainted(false);
        btnDente13.setContentAreaFilled(false);
        btnDente13.setFocusPainted(false);
        btnDente13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente13);
        btnDente13.setBounds(600, 216, 10, 55);

        btnDente12.setToolTipText("");
        btnDente12.setBorder(null);
        btnDente12.setBorderPainted(false);
        btnDente12.setContentAreaFilled(false);
        btnDente12.setFocusPainted(false);
        btnDente12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente12);
        btnDente12.setBounds(618, 222, 10, 48);

        btnDente21.setBorder(null);
        btnDente21.setBorderPainted(false);
        btnDente21.setContentAreaFilled(false);
        btnDente21.setFocusPainted(false);
        btnDente21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente21);
        btnDente21.setBounds(650, 220, 11, 55);

        btnDente11.setBorder(null);
        btnDente11.setBorderPainted(false);
        btnDente11.setContentAreaFilled(false);
        btnDente11.setFocusPainted(false);
        btnDente11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente11);
        btnDente11.setBounds(634, 220, 10, 55);

        btnDente22.setBorder(null);
        btnDente22.setBorderPainted(false);
        btnDente22.setContentAreaFilled(false);
        btnDente22.setFocusPainted(false);
        btnDente22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente22);
        btnDente22.setBounds(668, 230, 10, 45);

        btnDente23.setBorder(null);
        btnDente23.setBorderPainted(false);
        btnDente23.setContentAreaFilled(false);
        btnDente23.setFocusPainted(false);
        btnDente23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente23);
        btnDente23.setBounds(683, 218, 10, 55);

        btnDente24.setBorder(null);
        btnDente24.setBorderPainted(false);
        btnDente24.setContentAreaFilled(false);
        btnDente24.setFocusPainted(false);
        btnDente24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente24);
        btnDente24.setBounds(700, 220, 10, 45);

        btnDente25.setBorder(null);
        btnDente25.setBorderPainted(false);
        btnDente25.setContentAreaFilled(false);
        btnDente25.setFocusPainted(false);
        btnDente25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente25ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente25);
        btnDente25.setBounds(715, 220, 15, 48);

        btnDente26.setBorder(null);
        btnDente26.setBorderPainted(false);
        btnDente26.setContentAreaFilled(false);
        btnDente26.setFocusPainted(false);
        btnDente26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente26ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente26);
        btnDente26.setBounds(735, 212, 19, 50);

        btnDente27.setBorder(null);
        btnDente27.setBorderPainted(false);
        btnDente27.setContentAreaFilled(false);
        btnDente27.setFocusPainted(false);
        btnDente27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente27ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente27);
        btnDente27.setBounds(760, 220, 15, 40);

        btnDente28.setBorder(null);
        btnDente28.setBorderPainted(false);
        btnDente28.setContentAreaFilled(false);
        btnDente28.setFocusPainted(false);
        btnDente28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente28ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente28);
        btnDente28.setBounds(781, 225, 19, 40);

        btnDente48.setBorder(null);
        btnDente48.setBorderPainted(false);
        btnDente48.setContentAreaFilled(false);
        btnDente48.setFocusPainted(false);
        btnDente48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente48ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente48);
        btnDente48.setBounds(498, 347, 15, 40);

        btnDente47.setBorder(null);
        btnDente47.setBorderPainted(false);
        btnDente47.setContentAreaFilled(false);
        btnDente47.setFocusPainted(false);
        btnDente47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente47ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente47);
        btnDente47.setBounds(520, 350, 18, 40);

        btnDente46.setBorder(null);
        btnDente46.setBorderPainted(false);
        btnDente46.setContentAreaFilled(false);
        btnDente46.setFocusPainted(false);
        btnDente46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente46ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente46);
        btnDente46.setBounds(545, 350, 15, 45);

        btnDente45.setBorder(null);
        btnDente45.setBorderPainted(false);
        btnDente45.setContentAreaFilled(false);
        btnDente45.setFocusPainted(false);
        btnDente45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente45ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente45);
        btnDente45.setBounds(570, 345, 10, 48);

        btnDente44.setBorder(null);
        btnDente44.setBorderPainted(false);
        btnDente44.setContentAreaFilled(false);
        btnDente44.setFocusPainted(false);
        btnDente44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente44ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente44);
        btnDente44.setBounds(588, 344, 8, 40);

        btnDente43.setBorder(null);
        btnDente43.setBorderPainted(false);
        btnDente43.setContentAreaFilled(false);
        btnDente43.setFocusPainted(false);
        btnDente43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente43ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente43);
        btnDente43.setBounds(605, 344, 10, 55);

        btnDente42.setBorder(null);
        btnDente42.setBorderPainted(false);
        btnDente42.setContentAreaFilled(false);
        btnDente42.setFocusPainted(false);
        btnDente42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente42ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente42);
        btnDente42.setBounds(620, 340, 10, 50);

        btnDente41.setBorder(null);
        btnDente41.setBorderPainted(false);
        btnDente41.setContentAreaFilled(false);
        btnDente41.setFocusPainted(false);
        btnDente41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente41ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente41);
        btnDente41.setBounds(635, 340, 9, 45);

        btnDente31.setBorder(null);
        btnDente31.setBorderPainted(false);
        btnDente31.setContentAreaFilled(false);
        btnDente31.setFocusPainted(false);
        btnDente31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente31ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente31);
        btnDente31.setBounds(650, 340, 10, 50);

        btnDente32.setBorder(null);
        btnDente32.setBorderPainted(false);
        btnDente32.setContentAreaFilled(false);
        btnDente32.setFocusPainted(false);
        btnDente32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente32ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente32);
        btnDente32.setBounds(664, 340, 10, 45);

        btnDente33.setBorder(null);
        btnDente33.setBorderPainted(false);
        btnDente33.setContentAreaFilled(false);
        btnDente33.setFocusPainted(false);
        btnDente33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente33ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente33);
        btnDente33.setBounds(680, 342, 10, 65);

        btnDente34.setBorder(null);
        btnDente34.setBorderPainted(false);
        btnDente34.setContentAreaFilled(false);
        btnDente34.setFocusPainted(false);
        btnDente34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente34ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente34);
        btnDente34.setBounds(697, 345, 10, 45);

        btnDente35.setBorder(null);
        btnDente35.setBorderPainted(false);
        btnDente35.setContentAreaFilled(false);
        btnDente35.setFocusPainted(false);
        btnDente35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente35ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente35);
        btnDente35.setBounds(715, 345, 10, 50);

        btnDente36.setBorder(null);
        btnDente36.setBorderPainted(false);
        btnDente36.setContentAreaFilled(false);
        btnDente36.setFocusPainted(false);
        btnDente36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente36ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente36);
        btnDente36.setBounds(730, 350, 20, 40);

        btnDente37.setBorder(null);
        btnDente37.setBorderPainted(false);
        btnDente37.setContentAreaFilled(false);
        btnDente37.setFocusPainted(false);
        btnDente37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente37ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente37);
        btnDente37.setBounds(753, 348, 20, 50);

        btnDente38.setBorder(null);
        btnDente38.setBorderPainted(false);
        btnDente38.setContentAreaFilled(false);
        btnDente38.setFocusPainted(false);
        btnDente38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDente38ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDente38);
        btnDente38.setBounds(781, 345, 15, 45);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(610, 470, 90, 30);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icons/iconeSalvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(720, 470, 110, 30);

        imgTampao.setBackground(new java.awt.Color(255, 255, 255));
        imgTampao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTampao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/tela_branca.png"))); // NOI18N
        getContentPane().add(imgTampao);
        imgTampao.setBounds(590, 420, 120, 30);

        imgDente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/FundoDente.png"))); // NOI18N
        getContentPane().add(imgDente);
        imgDente.setBounds(470, 190, 354, 270);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/fundoAzulPreto.png"))); // NOI18N
        lblFundo.setPreferredSize(new java.awt.Dimension(843, 514));
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 60, 843, 514);

        setSize(new java.awt.Dimension(859, 553));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDente18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente18ActionPerformed
        dente = "18";
    }//GEN-LAST:event_btnDente18ActionPerformed

    private void btnDente17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente17ActionPerformed
        dente = "17";
    }//GEN-LAST:event_btnDente17ActionPerformed

    private void btnDente16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente16ActionPerformed
        dente = "16";
    }//GEN-LAST:event_btnDente16ActionPerformed

    private void btnDente15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente15ActionPerformed
        dente = "15";
    }//GEN-LAST:event_btnDente15ActionPerformed

    private void btnDente14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente14ActionPerformed
         dente = "14";
    }//GEN-LAST:event_btnDente14ActionPerformed

    private void btnDente13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente13ActionPerformed
        dente = "13";
    }//GEN-LAST:event_btnDente13ActionPerformed

    private void btnDente12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente12ActionPerformed
        dente = "12";
    }//GEN-LAST:event_btnDente12ActionPerformed

    private void btnDente11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente11ActionPerformed
        dente = "11";
    }//GEN-LAST:event_btnDente11ActionPerformed

    private void btnDente21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente21ActionPerformed
        dente = "21";
    }//GEN-LAST:event_btnDente21ActionPerformed

    private void btnDente22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente22ActionPerformed
        dente = "22";
    }//GEN-LAST:event_btnDente22ActionPerformed

    private void btnDente23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente23ActionPerformed
        dente = "23";
    }//GEN-LAST:event_btnDente23ActionPerformed

    private void btnDente24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente24ActionPerformed
        dente = "24";
    }//GEN-LAST:event_btnDente24ActionPerformed

    private void btnDente25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente25ActionPerformed
        dente = "25";
    }//GEN-LAST:event_btnDente25ActionPerformed

    private void btnDente26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente26ActionPerformed
        dente = "26";
    }//GEN-LAST:event_btnDente26ActionPerformed

    private void btnDente27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente27ActionPerformed
        dente = "27";
    }//GEN-LAST:event_btnDente27ActionPerformed

    private void btnDente28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente28ActionPerformed
        dente = "28";
    }//GEN-LAST:event_btnDente28ActionPerformed

    private void btnDente48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente48ActionPerformed
        dente = "48";
    }//GEN-LAST:event_btnDente48ActionPerformed

    private void btnDente47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente47ActionPerformed
        dente = "47";
    }//GEN-LAST:event_btnDente47ActionPerformed

    private void btnDente46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente46ActionPerformed
        dente = "46";
    }//GEN-LAST:event_btnDente46ActionPerformed

    private void btnDente45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente45ActionPerformed
        dente = "45";
    }//GEN-LAST:event_btnDente45ActionPerformed

    private void btnDente44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente44ActionPerformed
        dente = "44";
    }//GEN-LAST:event_btnDente44ActionPerformed

    private void btnDente43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente43ActionPerformed
        dente = "43";
    }//GEN-LAST:event_btnDente43ActionPerformed

    private void btnDente42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente42ActionPerformed
        dente = "42";
    }//GEN-LAST:event_btnDente42ActionPerformed

    private void btnDente41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente41ActionPerformed
        dente = "41";
    }//GEN-LAST:event_btnDente41ActionPerformed

    private void btnDente31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente31ActionPerformed
        dente = "31";
    }//GEN-LAST:event_btnDente31ActionPerformed

    private void btnDente32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente32ActionPerformed
        dente = "32";
    }//GEN-LAST:event_btnDente32ActionPerformed

    private void btnDente33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente33ActionPerformed
       dente = "33";
    }//GEN-LAST:event_btnDente33ActionPerformed

    private void btnDente34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente34ActionPerformed
        dente = "34";
    }//GEN-LAST:event_btnDente34ActionPerformed

    private void btnDente35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente35ActionPerformed
        dente = "35";
    }//GEN-LAST:event_btnDente35ActionPerformed

    private void btnDente36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente36ActionPerformed
        dente = "36";
    }//GEN-LAST:event_btnDente36ActionPerformed

    private void btnDente37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente37ActionPerformed
        dente = "37";
    }//GEN-LAST:event_btnDente37ActionPerformed

    private void btnDente38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDente38ActionPerformed
        dente = "38";
    }//GEN-LAST:event_btnDente38ActionPerformed

    private void cbxProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProcedimentoActionPerformed
        if(cbxProcedimento.getSelectedIndex() == 1){
            txtEstimativa.setText("R$: 1000");
        }else if(cbxProcedimento.getSelectedIndex() == 2){
            txtEstimativa.setText("R$: 750");
        }else if(cbxProcedimento.getSelectedIndex() == 3){
            txtEstimativa.setText("R$: 250");
        }else if(cbxProcedimento.getSelectedIndex() == 4){
            txtEstimativa.setText("R$: 150");
        }else if(cbxProcedimento.getSelectedIndex() == 5){
            txtEstimativa.setText("R$: 200");
        }else if(cbxProcedimento.getSelectedIndex() == 6){
            txtEstimativa.setText("R$: 250");
        }else{
            txtEstimativa.setText("R$: 0,00");
        }
        
    }//GEN-LAST:event_cbxProcedimentoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        tableModel = (DefaultTableModel) tblDente.getModel();
        String dente;
        double desconto;
        
        if(txfCpf.getText().equalsIgnoreCase("")){ //Proibir de Mudar os dados pessoal
            JOptionPane.showMessageDialog(null, "Insira um cpf valido");
            return;
        }else if(txtNome.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Insira um Nome valido");
            return;
        }else if(txfContato.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Insira um contato valido");
            return;
        }
        txfCpf.setEditable(false);
        txtNome.setEditable(false);
        txfContato.setEditable(false);
        
        if(cbxProcedimento.getSelectedItem().equals("Clareamento a Lazer") | cbxProcedimento.getSelectedItem().equals("Instalação de Aparelho")){
                dente = "Todos";
            }else if(this.dente == null){
                JOptionPane.showMessageDialog(null, "Selecione um Dente antes");
                return;
            }else{
                dente = this.dente;
            } 
      
        if(tableModel.getRowCount() > 0){ //Verificar se ja foi realizado um procedimento GERAL , ou um dente ja tem um pendente
                for(int linha = 0; linha < tableModel.getRowCount() ; linha++){
                    if(tableModel.getValueAt(linha, 0).toString().equalsIgnoreCase(dente) && cbxProcedimento.getSelectedIndex() == 1 && cbxProcedimento.getSelectedIndex() == 2){
                        JOptionPane.showMessageDialog(null, "já ha um procedimento para esse dente");
                        return;
                    }else if(tableModel.getValueAt(linha, 1).toString().equalsIgnoreCase(cbxProcedimento.getSelectedItem().toString()) && tableModel.getValueAt(linha, 0).toString().equalsIgnoreCase(dente)){
                        JOptionPane.showMessageDialog(null, "Esse procedimento ja foi marcado");
                        return;
                    }
                }
            }   
        if(cbxProcedimento.getSelectedIndex() != 0){
            if(txtDesconto.getText().equalsIgnoreCase("")){
                desconto = 0;
            }else{
                desconto = Double.parseDouble(txtDesconto.getText());
                txtDesconto.setText("");
            }
            //Comparação e salvamento         
            tableModel.addRow(new Object[]{
                dente,
                cbxProcedimento.getSelectedItem().toString(),
                Integer.parseInt(txtEstimativa.getText().substring(4)) - desconto
            });          
            valor += Integer.parseInt(txtEstimativa.getText().replace("R$: ", "")) - desconto;
            txtValor.setText("R$: " + valor);
            cbxProcedimento.setSelectedIndex(0);
            btnSalvar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um procedimento valido");
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ProntuarioDao prontuarioDao = new ProntuarioDao();
        Prontuario prontuario = new Prontuario();
        tableModel = (DefaultTableModel) tblDente.getModel();
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja mesmo salvar o prontuario", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);
        if(resp == 0 | resp == 1){
            if(prontuarioDao.conectar()){
                if(resp == 1){
                    dispose();
                    return;
                }else if(resp == 0){
                    prontuarioDao.salvarPaciente(txfCpf.getText().replace(".", "").replace("-", ""), txtNome.getText(), txfContato.getText().replace("(", "").replace(")", ""), Double.parseDouble(txtValor.getText().replace("R$: ", "")));
                    for(int linha = 0; linha < tableModel.getRowCount(); linha++){
                        prontuario.setCpf(txfCpf.getText().replace(".", "").replace("-", ""));
                        prontuario.setDente(tableModel.getValueAt(linha, 0).toString());
                        prontuario.setProcedimento(tableModel.getValueAt(linha, 1).toString());
                        prontuario.setValor(Double.parseDouble(tableModel.getValueAt(linha, 2).toString()));
                        
                        if(txaObs.getText().equalsIgnoreCase("")){
                            prontuario.setAnotacao(null);                           
                        }else{
                            prontuario.setAnotacao(txaObs.getText());
                            txaObs.setText("");
                        }
                        
                        if(!prontuarioDao.salvar(prontuario)){
                            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados do prontuario");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Prontuario salvo com sucesso");
                    dispose();
                }              
                prontuarioDao.desconectar();                
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }      
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void mnuRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRemoverActionPerformed
         ProntuarioDao prontuarioDao = new ProntuarioDao();
        
        if(tblDente.getSelectedRow() == -1){
            return;
        }
        if(prontuarioDao.conectar()){
            tableModel = (DefaultTableModel) tblDente.getModel();
            prontuarioDao.apagar(txfCpf.getText().replace(".", "").replace("-", ""), tableModel.getValueAt(tblDente.getSelectedRow(), 0).toString(), tableModel.getValueAt(tblDente.getSelectedRow(), 1).toString());
            valor -= Double.parseDouble(tableModel.getValueAt(tblDente.getSelectedRow(), 2).toString().replace("R$: ", ""));
            tableModel.removeRow(tblDente.getSelectedRow());
            txtValor.setText("R$: " + valor);
            prontuarioDao.desconectar();
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mnuRemoverActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if(evt.isPopupTrigger()){
            mostraPop(evt);
        }
    }//GEN-LAST:event_formMouseReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair, as informação não serão salvas!", "Alerta", JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txfCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCpfFocusGained
        if(txfCpf.getText().equals("")){
            try {
                MaskFormatter cpf = new MaskFormatter("###.###.###-##");
                txfCpf.setFormatterFactory(new DefaultFormatterFactory(cpf));
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }        
        }
    }//GEN-LAST:event_txfCpfFocusGained

    private void txfCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCpfFocusLost
        if(txfCpf.getText().equals("") | txfCpf.getText().replace(" ", "").length() < 14){
            try {
                MaskFormatter limpar = new MaskFormatter("");
                txfCpf.setFormatterFactory(new DefaultFormatterFactory(limpar));
                txfCpf.setText("");
                txfCpf.setValue(null);
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }        
        }
    }//GEN-LAST:event_txfCpfFocusLost

    private void txfContatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfContatoFocusGained
         if(txfContato.getText().equals("")){
            try {
                MaskFormatter telefone = new MaskFormatter("(##) #####-####");
                txfContato.setFormatterFactory(new DefaultFormatterFactory(telefone));
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }        
        }
    }//GEN-LAST:event_txfContatoFocusGained

    private void txfContatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfContatoFocusLost
        if(txfContato.getText().equals("") | txfCpf.getText().replace(" ", "").length() < 14){
            try {
                MaskFormatter limpar = new MaskFormatter("");
                txfContato.setFormatterFactory(new DefaultFormatterFactory(limpar));
                txfContato.setText("");
                txfContato.setValue(null);
            } catch (ParseException ex) {
                System.err.println(ex.getMessage());
            }        
        }
    }//GEN-LAST:event_txfContatoFocusLost

    private void txtDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusGained
        if(txtDesconto.getText().equalsIgnoreCase("")){
            Insets margem = new Insets(2, 25, 2, 2);
            lblRS.setVisible(true);
            txtDesconto.setMargin(margem);
        }
    }//GEN-LAST:event_txtDescontoFocusGained

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        if(txtDesconto.getText().equalsIgnoreCase("")){
            Insets margem = new Insets(2, 2, 2, 2);
            lblRS.setVisible(false);
            txtDesconto.setMargin(margem);
        }
    }//GEN-LAST:event_txtDescontoFocusLost
  
    private void salvar(Prontuario prontuario){
        ProntuarioDao prontuarioDao = new ProntuarioDao();
        
        if(prontuarioDao.conectar()){
            if(!cadastrado){             
                cadastrado = prontuarioDao.salvarPaciente(prontuario.getCpf(), prontuario.getNome(), prontuario.getContato(), 0);
            }
            if(!prontuarioDao.salvar(prontuario)){
                JOptionPane.showMessageDialog(null, "Não foi possivel adicionar esse procedimento");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void mostraPop(MouseEvent evt){
        jPopupMenu2.show(this, evt.getX(), evt.getY());
    }
    
    public static void prontuario(String args[]) {
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
            java.util.logging.Logger.getLogger(NovoProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProtuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProtuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDente11;
    private javax.swing.JButton btnDente12;
    private javax.swing.JButton btnDente13;
    private javax.swing.JButton btnDente14;
    private javax.swing.JButton btnDente15;
    private javax.swing.JButton btnDente16;
    private javax.swing.JButton btnDente17;
    private javax.swing.JButton btnDente18;
    private javax.swing.JButton btnDente21;
    private javax.swing.JButton btnDente22;
    private javax.swing.JButton btnDente23;
    private javax.swing.JButton btnDente24;
    private javax.swing.JButton btnDente25;
    private javax.swing.JButton btnDente26;
    private javax.swing.JButton btnDente27;
    private javax.swing.JButton btnDente28;
    private javax.swing.JButton btnDente31;
    private javax.swing.JButton btnDente32;
    private javax.swing.JButton btnDente33;
    private javax.swing.JButton btnDente34;
    private javax.swing.JButton btnDente35;
    private javax.swing.JButton btnDente36;
    private javax.swing.JButton btnDente37;
    private javax.swing.JButton btnDente38;
    private javax.swing.JButton btnDente41;
    private javax.swing.JButton btnDente42;
    private javax.swing.JButton btnDente43;
    private javax.swing.JButton btnDente44;
    private javax.swing.JButton btnDente45;
    private javax.swing.JButton btnDente46;
    private javax.swing.JButton btnDente47;
    private javax.swing.JButton btnDente48;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxProcedimento;
    private javax.swing.JLabel imgDente;
    private javax.swing.JLabel imgTampao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblRS;
    private javax.swing.JMenuItem mnuRemover;
    private javax.swing.JTable tblDente;
    private javax.swing.JTextArea txaObs;
    private javax.swing.JFormattedTextField txfContato;
    private javax.swing.JFormattedTextField txfCpf;
    private javax.swing.JFormattedTextField txtDesconto;
    private javax.swing.JFormattedTextField txtEstimativa;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
