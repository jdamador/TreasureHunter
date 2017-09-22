/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import javax.swing.JFrame;

/**
 *
 * @author amador
 */
public class CreateToken extends javax.swing.JFrame {
        JFrame frame;
    /**
     * Creates new form CreateToken
     */
    public CreateToken() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        rbnRed = new javax.swing.JRadioButton();
        rbnBlue = new javax.swing.JRadioButton();
        rbnGreen = new javax.swing.JRadioButton();
        rbnYellow = new javax.swing.JRadioButton();
        chkCrown = new javax.swing.JCheckBox();
        chkHeart = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        rbnRed.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbnRed);
        rbnRed.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        rbnRed.setForeground(new java.awt.Color(255, 255, 255));
        rbnRed.setText("Red");

        rbnBlue.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbnBlue);
        rbnBlue.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        rbnBlue.setForeground(new java.awt.Color(255, 255, 255));
        rbnBlue.setText("Blue");

        rbnGreen.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbnGreen);
        rbnGreen.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        rbnGreen.setForeground(new java.awt.Color(255, 255, 255));
        rbnGreen.setText("Green");

        rbnYellow.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rbnYellow);
        rbnYellow.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        rbnYellow.setForeground(new java.awt.Color(255, 255, 255));
        rbnYellow.setText("Yellow");

        chkCrown.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(chkCrown);
        chkCrown.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        chkCrown.setForeground(new java.awt.Color(255, 255, 255));
        chkCrown.setText("Crown");
        chkCrown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCrownActionPerformed(evt);
            }
        });

        chkHeart.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(chkHeart);
        chkHeart.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        chkHeart.setForeground(new java.awt.Color(255, 255, 255));
        chkHeart.setText("Heart");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Token");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbnYellow)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbnBlue)
                                .addComponent(rbnGreen)
                                .addComponent(rbnRed)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCrown)
                            .addComponent(chkHeart)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnRed)
                    .addComponent(chkCrown))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnBlue)
                    .addComponent(chkHeart))
                .addGap(22, 22, 22)
                .addComponent(rbnGreen)
                .addGap(18, 18, 18)
                .addComponent(rbnYellow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkCrownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCrownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCrownActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        frame.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateToken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateToken().setVisible(true);
            }
        });
    }
    public void openWindows(JFrame frame){
        this.frame=frame;
        frame.setEnabled(false);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkCrown;
    private javax.swing.JCheckBox chkHeart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton rbnBlue;
    private javax.swing.JRadioButton rbnGreen;
    private javax.swing.JRadioButton rbnRed;
    private javax.swing.JRadioButton rbnYellow;
    // End of variables declaration//GEN-END:variables
}
