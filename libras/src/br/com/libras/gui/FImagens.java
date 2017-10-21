/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.libras.gui;

import java.sql.Blob;
import java.sql.ResultSet;

import javax.swing.ImageIcon;

import br.com.libras.bo.AddImagem;
import br.com.libras.dao.ConectaJDBC;

/**
 *
 * @author wev
 */
public class FImagens extends javax.swing.JFrame {

    /**
     * Creates new form FImagens
     */
	
	private String ativo;
			
	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public FImagens() {
        initComponents();
        ativaBotton();
        setLocationRelativeTo(null);
    }
	
	public FImagens(String ativo) {
		setAtivo(ativo);
		initComponents();
        ativaBotton();
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jPanelImagem = new javax.swing.JPanel();
        jLabelImagem = new javax.swing.JLabel();
        jPanelVideo = new javax.swing.JPanel();
        jLabelVideo = new javax.swing.JLabel();
        jPanelPesquisa = new javax.swing.JPanel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jButtonInicia = new javax.swing.JButton();
        jButtonRecarregar = new javax.swing.JButton();
        jPanelAddImagem = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jButtonSobre = new javax.swing.JButton();
        jButtonAddImagens = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanelImagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem"));
        jPanelImagem.setPreferredSize(new java.awt.Dimension(151, 153));

        javax.swing.GroupLayout jPanelImagemLayout = new javax.swing.GroupLayout(jPanelImagem);
        jPanelImagem.setLayout(jPanelImagemLayout);
        jPanelImagemLayout.setHorizontalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabelImagem)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanelImagemLayout.setVerticalGroup(
            jPanelImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabelImagem)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel5.add(jPanelImagem, gridBagConstraints);

        jPanelVideo.setBorder(javax.swing.BorderFactory.createTitledBorder("Video"));
        jPanelVideo.setPreferredSize(new java.awt.Dimension(151, 153));

        javax.swing.GroupLayout jPanelVideoLayout = new javax.swing.GroupLayout(jPanelVideo);
        jPanelVideo.setLayout(jPanelVideoLayout);
        jPanelVideoLayout.setHorizontalGroup(
            jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVideoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabelVideo)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanelVideoLayout.setVerticalGroup(
            jPanelVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVideoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabelVideo)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 40.0;
        gridBagConstraints.weighty = 100.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel5.add(jPanelVideo, gridBagConstraints);

        jPanelPesquisa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelPesquisa.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 212;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelPesquisa.add(jTextFieldDescricao, gridBagConstraints);

        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/search.png"))); // NOI18N
        jButtonPesquisa.setMnemonic('p');
        jButtonPesquisa.setText("Pesqisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });
        jPanelPesquisa.add(jButtonPesquisa, new java.awt.GridBagConstraints());

        jButtonInicia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/play_20x20.png"))); // NOI18N
        jButtonInicia.setMnemonic('i');
        jButtonInicia.setText("Iniciar");
        jButtonInicia.setMaximumSize(new java.awt.Dimension(137, 20));
        jButtonInicia.setMinimumSize(new java.awt.Dimension(137, 20));
        jButtonInicia.setPreferredSize(new java.awt.Dimension(137, 30));
        jButtonInicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciaActionPerformed(evt);
            }
        });
        jPanelPesquisa.add(jButtonInicia, new java.awt.GridBagConstraints());

        jButtonRecarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/reload_20x20.png"))); // NOI18N
        jButtonRecarregar.setMnemonic('r');
        jButtonRecarregar.setText("Recarregar");
        jPanelPesquisa.add(jButtonRecarregar, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel5.add(jPanelPesquisa, gridBagConstraints);

        jPanelAddImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelAddImagem.setLayout(new java.awt.GridBagLayout());

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/errors_20x20.png"))); // NOI18N
        jButtonSair.setMnemonic('s');
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelAddImagem.add(jButtonSair, gridBagConstraints);

        jButtonSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/exclamacoa_20x20.png"))); // NOI18N
        jButtonSobre.setText("Sobre");
        jButtonSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSobreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelAddImagem.add(jButtonSobre, gridBagConstraints);

        jButtonAddImagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/libras/resources/add-icon.png"))); // NOI18N
        jButtonAddImagens.setText("Add Imagens");
        jButtonAddImagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddImagensActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelAddImagem.add(jButtonAddImagens, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel5.add(jPanelAddImagem, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        // TODO add your handling code here:
    	Blob image = null;
    	byte[] imagemByte;
    	try {
    		String query = "select imagem from imagem where descricao = '" + jTextFieldDescricao.getText() + "'";
    		System.out.println(query);
    		ResultSet retorno = ConectaJDBC.Conecta(query);
    		if (retorno.next()) {
    			image = retorno.getBlob("imagem");
    			imagemByte = image.getBytes(1, (int) image.length());
    			ImageIcon icon =  new ImageIcon(imagemByte);
    			System.out.println("teste" + imagemByte);
    		}
    		
		} catch (Exception e) {
			// TODO: handle exception
		}
    	

    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButtonIniciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAddImagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddImagensActionPerformed
        // TODO add your handling code here:
    	FAddImagem addImagem = new FAddImagem(null, rootPaneCheckingEnabled);
    	addImagem.setVisible(true);
    }//GEN-LAST:event_jButtonAddImagensActionPerformed

    private void jButtonSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSobreActionPerformed
    
    public void ativaBotton() {
    	if (getAtivo().equals("A")) {
    		jButtonAddImagens.setEnabled(true);
    	}else {
    		jButtonAddImagens.setEnabled(false);
    	}
    }

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
            java.util.logging.Logger.getLogger(FImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FImagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FImagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddImagens;
    private javax.swing.JButton jButtonInicia;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonRecarregar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSobre;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelVideo;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAddImagem;
    private javax.swing.JPanel jPanelImagem;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelVideo;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
}
