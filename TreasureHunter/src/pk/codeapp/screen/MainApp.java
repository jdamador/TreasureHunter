/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.applet.Applet;
import static java.applet.Applet.newAudioClip;
import java.applet.AudioClip;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import pk.codeapp.methods.Methods;
import pk.codeapp.model.User;

/**
 *
 * @author Jose Pablo Brenes
 */
public class MainApp extends javax.swing.JFrame
{

    AudioClip sound;
    File audio = new File("src/pk/codeapp/tools/auido theme.wav");
    static Methods methods = new Methods();
    boolean play;

    /**
     * Creates new form TH_Main
     */
    public MainApp()
    {

        initComponents();
        methods.addFunction("Start", "cyan");
        methods.addFunction("End", "magenta");
        methods.addFunction("Empty", "green");
        methods.chargeUsers();
        methods.readFromTextFile(methods.getTokenFile(), methods.getTokens());
        URL u = null;
        try {
            u = audio.toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        sound = Applet.newAudioClip(u);
        sound.play();
        sound.loop();
        play = true;

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent evt)
            {

                methods.writeUser();
                methods.writeInTextFile(methods.getTokenFile(), methods.getTokens());
                System.exit(0);
            }
        });
        for (int i = 0; i < methods.getTokens().length; i++) {
            System.out.println(methods.getTokens()[i]);

        }
    }

    @Override
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("pk/codeapp/tools/treasurehunter.png"));
        return retValue;
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
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnSound = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Treasure Hunter");
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
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtUserNameKeyPressed(evt);
            }
        });

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
        btnLogin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnLoginKeyPressed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(0, 0, 0));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword)
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
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/sound1 (2).png"))); // NOI18N
        btnSound.setOpaque(false);
        btnSound.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSoundActionPerformed(evt);
            }
        });
        jPanel1.add(btnSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/treasurehunter.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegisterActionPerformed
    {//GEN-HEADEREND:event_btnRegisterActionPerformed

        //Create the conection with  Register class 
        Register registerWindows = new Register();
        // Call the method that open the new windows and close this 
        registerWindows.openWindows(this, methods);

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtUserNameKeyPressed
    {//GEN-HEADEREND:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPasswordKeyPressed
    {//GEN-HEADEREND:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnLoginKeyPressed
    {//GEN-HEADEREND:event_btnLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_btnLoginKeyPressed

    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSoundActionPerformed
    {//GEN-HEADEREND:event_btnSoundActionPerformed
        // TODO add your handling code here:
        if (play) {
            btnSound.setIcon(new ImageIcon("src/pk/codeapp/tools/sound1 (1).png"));
            sound.stop();
            play=false;
        }
        else{
            sound.stop();
            btnSound.setIcon(new ImageIcon("src/pk/codeapp/tools/sound1 (2).png"));
            sound.play();
             sound.loop();
            play=true;
        }
    }//GEN-LAST:event_btnSoundActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainApp().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLog;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
public void login()
    {

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if (userName.equals("Gabe")) {
            if (password.equals("123")) {
                GameMasterInterface gm = new GameMasterInterface();
                gm.openWindows(this, methods);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Username don't exist!, try again...", "Password invalid", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            User askUser = methods.searchUser(userName);
            if (askUser != null) {

                if (askUser.getPassword().equals(password)) {
                    methods.setActualUser(askUser);

                    UserInterface ui = new UserInterface();
                    ui.openWindows(this, methods);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password invalid!, try again...", "Password invalid", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Username don't exist!, try again...", "Password invalid", JOptionPane.WARNING_MESSAGE);
            }

        }

    }

}
