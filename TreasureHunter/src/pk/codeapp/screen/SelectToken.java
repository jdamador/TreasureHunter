/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Pablo Brenes
 */
public class SelectToken extends javax.swing.JFrame {

    /**
     * Creates new form SelectToken
     */
    private String[] tokens = new String[4];
    private String token;

    public SelectToken() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnToken2 = new javax.swing.JRadioButton();
        btnToken1 = new javax.swing.JRadioButton();
        btnToken3 = new javax.swing.JRadioButton();
        btnToken4 = new javax.swing.JRadioButton();
        btnPlayer1 = new javax.swing.JButton();
        btnPlayer2 = new javax.swing.JButton();
        btnPlayer3 = new javax.swing.JButton();
        btnPlayer4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnStartGame = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 191, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select the Tokens to play ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        btnToken2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnToken2);
        btnToken2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnToken2.setForeground(new java.awt.Color(255, 255, 255));
        btnToken2.setText("Token 2");
        jPanel1.add(btnToken2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        btnToken1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnToken1);
        btnToken1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnToken1.setForeground(new java.awt.Color(255, 255, 255));
        btnToken1.setText("Token 1");
        jPanel1.add(btnToken1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        btnToken3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnToken3);
        btnToken3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnToken3.setForeground(new java.awt.Color(255, 255, 255));
        btnToken3.setText("Token 3");
        jPanel1.add(btnToken3, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 290, -1, -1));

        btnToken4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(btnToken4);
        btnToken4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnToken4.setForeground(new java.awt.Color(255, 255, 255));
        btnToken4.setText("Token 4");
        jPanel1.add(btnToken4, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 290, -1, -1));

        btnPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        btnPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayer1.setText("Player 1");
        btnPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 188, 120, 50));

        btnPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        btnPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayer2.setText("Player 2");
        btnPlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 265, 120, 50));

        btnPlayer3.setBackground(new java.awt.Color(0, 0, 0));
        btnPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayer3.setText("Player 3");
        btnPlayer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 340, 120, 50));

        btnPlayer4.setBackground(new java.awt.Color(0, 0, 0));
        btnPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayer4.setText("Player 4");
        btnPlayer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1035, 414, 120, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Instruction: First choose the token you want to play ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("and then select the player who wants to play with the selected token");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 637, 120, 51));

        btnStartGame.setBackground(new java.awt.Color(0, 0, 0));
        btnStartGame.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnStartGame.setForeground(new java.awt.Color(255, 255, 255));
        btnStartGame.setText("Play !!! ");
        btnStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartGameActionPerformed(evt);
            }
        });
        jPanel1.add(btnStartGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 296, 83));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 188, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/GameBackGround.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1ActionPerformed
        token = checkToken(); // Check to which token is selected
        if (token != null) {
            if(checkDuplicateToken(token))
                tokens[0] = token; // Add in position 0 because is the player 1
            else
                JOptionPane.showMessageDialog(rootPane, "Can not be repeated Token");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select Token !!! ");
        }
    }//GEN-LAST:event_btnPlayer1ActionPerformed
    private boolean checkDuplicateToken(String token){ // Checks to not replicated the same token
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i]==token)
                return false;
        }
        return true;
    }
    private void btnPlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2ActionPerformed
        token = checkToken(); // Check to which token is selected
        if (token != null) {
            if(checkDuplicateToken(token))
                tokens[1] = token; // Add in position 1 because is the player 2
             else
                JOptionPane.showMessageDialog(rootPane, "Can not be repeated Token");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select Token !!! ");
        }
    }//GEN-LAST:event_btnPlayer2ActionPerformed

    private void btnPlayer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer3ActionPerformed
       token = checkToken(); // Check to which token is selected
        if (token != null) {
            if(checkDuplicateToken(token))
                tokens[2] = token; // Add in position 2 because is the player 3
            else
                JOptionPane.showMessageDialog(rootPane, "Can not be repeated Token");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select Token !!! ");
        }  
    }//GEN-LAST:event_btnPlayer3ActionPerformed

    private void btnPlayer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer4ActionPerformed
        token = checkToken(); // Check to which token is selected
        if (token != null) {
            if(checkDuplicateToken(token))
                tokens[3] = token; // Add in position 3 because is the player 4
            else
                JOptionPane.showMessageDialog(rootPane, "Can not be repeated Token");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Select Token !!! ");
        }
    }//GEN-LAST:event_btnPlayer4ActionPerformed

    private void btnStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartGameActionPerformed
        if(checknumPlayers()){
           
        }else
            JOptionPane.showMessageDialog(rootPane,"Do you need one or more players !!!");
            
    }//GEN-LAST:event_btnStartGameActionPerformed
    private boolean checknumPlayers(){ // Check to has more than zero players
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i]!=null)
                return true;
        }return false;
    }
    private String checkToken() {
        if (btnToken1.isSelected() == true) {
            return "token1";
        }
        if (btnToken2.isSelected() == true) {
            return "token2";
        }
        if (btnToken3.isSelected() == true) {
            return "token3";
        }
        if (btnToken4.isSelected() == true) {
            return "token4";
        }
        return "";
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
            java.util.logging.Logger.getLogger(SelectToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectToken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlayer1;
    private javax.swing.JButton btnPlayer2;
    private javax.swing.JButton btnPlayer3;
    private javax.swing.JButton btnPlayer4;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JRadioButton btnToken1;
    private javax.swing.JRadioButton btnToken2;
    private javax.swing.JRadioButton btnToken3;
    private javax.swing.JRadioButton btnToken4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
