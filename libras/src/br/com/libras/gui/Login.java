/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.libras.gui;

/**
 *
 * @author wev
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome :");
        jPanel1.add(jLabelNome);
        jLabelNome.setBounds(90, 280, 49, 15);

        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha :");
        jPanel1.add(jLabelSenha);
        jLabelSenha.setBounds(90, 320, 54, 15);
        jPanel1.add(jTextFieldNome);
        jTextFieldNome.setBounds(160, 280, 150, 19);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(160, 320, 150, 19);

        jButtonEntrar.setText("Entrar");
        jPanel1.add(jButtonEntrar);
        jButtonEntrar.setBounds(100, 370, 78, 25);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(230, 370, 62, 25);

        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/bandeira-do-pará.jpg"))); // NOI18N
        jPanel1.add(jLabelImagen);
        jLabelImagen.setBounds(0, 0, 800, 445);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}