/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SubTelas;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class Suporte extends javax.swing.JFrame {

    /**
     * Creates new form Suporte
     */
    public Suporte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JTextField();
        btnRecuperar = new javax.swing.JButton();
        lblimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Suporte");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Digite seu Usuário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 220, -1));

        lblUsuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 200, -1));

        btnRecuperar.setBackground(new java.awt.Color(0, 102, 204));
        btnRecuperar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecuperar.setText("Recuperar");
        btnRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 200, -1));

        lblimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Suporte.png"))); // NOI18N
        getContentPane().add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        setSize(new java.awt.Dimension(514, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUsuarioActionPerformed

    private void btnRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarActionPerformed
        JOptionPane.showMessageDialog(null, "Solicitação realizada com sucesso!");
        dispose();
    }//GEN-LAST:event_btnRecuperarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Suporte(String args[]) {
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
            java.util.logging.Logger.getLogger(Suporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lblUsuario;
    private javax.swing.JLabel lblimg;
    // End of variables declaration//GEN-END:variables
}
