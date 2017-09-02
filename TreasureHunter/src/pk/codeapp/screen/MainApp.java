/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.Image;
import java.awt.Toolkit;
import pk.codeapp.screen.Register;
import pk.codeapp.methods.Methods;
/**
 *
 * @author Jose Pablo Brenes
 */
public class MainApp extends javax.swing.JFrame {
    Methods methods= new Methods();
    /**
     * Creates new form TH_Main
     */
    public MainApp() {
        initComponents();
       
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelUserName = new javax.swing.JLabel();
        labelLog = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 202, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 73, 171));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        labelUserName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(255, 255, 255));
        labelUserName.setText("User Name:");

        labelLog.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelLog.setForeground(new java.awt.Color(255, 255, 255));
        labelLog.setText("WELCOME!!!!!");

        txtUserName.setBackground(new java.awt.Color(0, 0, 0));
        txtUserName.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setToolTipText("Write your User Name here!");
        txtUserName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        labelPassword.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log In");
        btnLogin.setToolTipText("Click to Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(labelPassword)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLog)
                .addGap(181, 181, 181))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(labelLog)
                .addGap(55, 55, 55)
                .addComponent(labelUserName)
                .addGap(38, 38, 38)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addGap(35, 35, 35)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 550, 690));

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register! ");
        btnRegister.setToolTipText("Click to Login");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 650, 250, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/treasurehunter.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 690));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegisterActionPerformed
    {//GEN-HEADEREND:event_btnRegisterActionPerformed
        // TODO add your handling code here:
         Register registerWindows = new Register();
         registerWindows.openWindows(this, methods);
         
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelLog;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
