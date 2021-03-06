
package pk.codeapp.screen;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pk.codeapp.methods.Methods;
import pk.codeapp.model.User;
import static pk.codeapp.screen.MainApp.methods;

public class GameMasterInterface extends javax.swing.JFrame {

    private Methods methods = MainApp.methods;
    private JFrame beforeWindows; //Before Windows 

    /**
     * Creates new form GameMasterInterface
     */
    public GameMasterInterface() {
        initComponents();
        updateTokens();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {

                methods.writeUser();
                 methods.writeInTextFile(methods.getTokenFile(), methods.getTokens());
                System.exit(0);
            }
        });
       
    }
    /**
     * Give Image
     * @return 
     */
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("pk/codeapp/tools/treasurehunter.png"));
        return retValue;
    }
    /**
     * Methods to Open Windows 
     * @param afterWindows
     * @param methods 
     */
    public void openWindows(JFrame afterWindows, Methods methods) {

        this.setVisible(true);
        this.beforeWindows = afterWindows;
        afterWindows.setVisible(false);
        this.setLocationRelativeTo(afterWindows);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        showUsers = new javax.swing.JList<>();
        btnShowStart = new javax.swing.JButton();
        btnShowBack = new javax.swing.JButton();
        btnShowAhead = new javax.swing.JButton();
        btnShowEnd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAddFunction = new javax.swing.JButton();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFunction = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnCreateToken = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblToken3 = new javax.swing.JLabel();
        lblToken4 = new javax.swing.JLabel();
        lblToken2 = new javax.swing.JLabel();
        lblToken1 = new javax.swing.JLabel();
        rbnDelete2 = new javax.swing.JRadioButton();
        rbnDelete3 = new javax.swing.JRadioButton();
        rbnDelete4 = new javax.swing.JRadioButton();
        rbnDelete1 = new javax.swing.JRadioButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Master");
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1360, 694));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showUsers.setBackground(new java.awt.Color(38, 50, 56));
        showUsers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showUsers.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        showUsers.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(showUsers);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 280, 180));

        btnShowStart.setBackground(new java.awt.Color(0, 0, 0));
        btnShowStart.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnShowStart.setForeground(new java.awt.Color(255, 255, 255));
        btnShowStart.setText("Start");
        btnShowStart.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnShowStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 220, -1, -1));

        btnShowBack.setBackground(new java.awt.Color(0, 0, 0));
        btnShowBack.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnShowBack.setForeground(new java.awt.Color(255, 255, 255));
        btnShowBack.setText("<<");
        btnShowBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnShowBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, -1, -1));

        btnShowAhead.setBackground(new java.awt.Color(0, 0, 0));
        btnShowAhead.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnShowAhead.setForeground(new java.awt.Color(255, 255, 255));
        btnShowAhead.setText(">>");
        btnShowAhead.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnShowAheadActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowAhead, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 220, -1, -1));

        btnShowEnd.setBackground(new java.awt.Color(0, 0, 0));
        btnShowEnd.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnShowEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnShowEnd.setText("End");
        btnShowEnd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnShowEndActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddFunction.setBackground(new java.awt.Color(0, 0, 0));
        btnAddFunction.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddFunction.setForeground(new java.awt.Color(255, 255, 255));
        btnAddFunction.setText("Add Function");
        btnAddFunction.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddFunctionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        cmbColor.setBackground(new java.awt.Color(0, 0, 0));
        cmbColor.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        cmbColor.setForeground(new java.awt.Color(255, 255, 255));
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "blue", "red", "green", "yellow", "orange", "pink", "magenta", "cyan", " " }));
        jPanel1.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 260, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Color:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Function:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtFunction.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFunction.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, 40));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create Function");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 430, 340));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        btnEditUser.setBackground(new java.awt.Color(0, 0, 0));
        btnEditUser.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnEditUser.setForeground(new java.awt.Color(255, 255, 255));
        btnEditUser.setText("Edit User");
        btnEditUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 270, 60));

        btnDeleteUser.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteUser.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteUser.setText("Delete User");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 270, 60));

        btnCreateToken.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateToken.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        btnCreateToken.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateToken.setText("Create Token");
        btnCreateToken.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCreateTokenActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateToken, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 270, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToken3.setBackground(new java.awt.Color(0, 0, 0));
        lblToken3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(lblToken3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 70));

        lblToken4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(lblToken4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 70, 70));

        lblToken2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(lblToken2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 70));

        lblToken1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(lblToken1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        rbnDelete2.setBackground(new java.awt.Color(0, 0, 0));
        rbnDelete2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rbnDelete2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(rbnDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        rbnDelete3.setBackground(new java.awt.Color(0, 0, 0));
        rbnDelete3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rbnDelete3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(rbnDelete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        rbnDelete4.setBackground(new java.awt.Color(0, 0, 0));
        rbnDelete4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rbnDelete4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(rbnDelete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        rbnDelete1.setBackground(new java.awt.Color(0, 0, 0));
        rbnDelete1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rbnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(rbnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/newFont.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 310, 300, 270));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/GameBackGround.jpg"))); // NOI18N
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        beforeWindows.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnShowAheadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowAheadActionPerformed
    {//GEN-HEADEREND:event_btnShowAheadActionPerformed
        // TODO add your handling code here:
         showUsers.setModel(methods.printUser(4));
    }//GEN-LAST:event_btnShowAheadActionPerformed

    private void btnAddFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFunctionActionPerformed
        addFunction();
    }//GEN-LAST:event_btnAddFunctionActionPerformed
    /**
     * Methods to Delete User
     * @param evt 
     */
    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed

      
        Object data = JOptionPane.showInputDialog(rootPane, "Write the username", "Delete user", JOptionPane.INFORMATION_MESSAGE);
        if (data == null) {
            System.out.println("null");
        } else {
            methods.deleteUser((String) data);
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed
    /**
     * Methods to edit Users
     * @param evt 
     */
    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        // TODO add your handling code here:
        Object data = JOptionPane.showInputDialog(rootPane, "Write the username", "Edit User", JOptionPane.INFORMATION_MESSAGE);
        if (data == null) {
            System.out.println("null");
        } else {
            User user = methods.searchUser((String) data);
            if (user == null) {
                JOptionPane.showMessageDialog(rootPane, "User don't exists");
            } else {
                EditUser edit = new EditUser();
                edit.openWindows(this, methods, user);
            }
        }


    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnCreateTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTokenActionPerformed
        // TODO add your handling code here:
        CreateToken newToken= new CreateToken();
        newToken.openWindows(this);
    }//GEN-LAST:event_btnCreateTokenActionPerformed

    private void btnShowBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowBackActionPerformed
    {//GEN-HEADEREND:event_btnShowBackActionPerformed
        // TODO add your handling code here:
        showUsers.setModel(methods.printUser(3));
    }//GEN-LAST:event_btnShowBackActionPerformed

    private void btnShowStartActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowStartActionPerformed
    {//GEN-HEADEREND:event_btnShowStartActionPerformed
        // TODO add your handling code here:
        showUsers.setModel(methods.printUser(1));

    }//GEN-LAST:event_btnShowStartActionPerformed

    private void btnShowEndActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnShowEndActionPerformed
    {//GEN-HEADEREND:event_btnShowEndActionPerformed
        // TODO add your handling code here:
        showUsers.setModel(methods.printUser(2));
       
    }//GEN-LAST:event_btnShowEndActionPerformed
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        checkToken();
    }//GEN-LAST:event_btnDeleteActionPerformed
    /**
     * Methods to addFunctions
     */
    private void addFunction() {
        String colorFunction = (String) cmbColor.getSelectedItem();
        if (txtFunction.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Do not leave blanks !!! ");
        } else {
            String name = txtFunction.getText();
            System.out.println(name);
            System.out.println(colorFunction);
            if (methods.addFunction(name, colorFunction)) {
                JOptionPane.showMessageDialog(rootPane, "Be added successfully ");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error !!! ");
            }
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
            java.util.logging.Logger.getLogger(GameMasterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMasterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMasterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMasterInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameMasterInterface().setVisible(true);
            }
        });
    }
/**
 * Methods to Updates Tokens
 */
public void updateTokens()
    {
        String[] tokens = MainApp.methods.getTokens();
        if (tokens[0] != null) {
            rbnDelete1.setVisible(true);
            lblToken1.setIcon(new ImageIcon(tokens[0]));
        } else {
            rbnDelete1.setVisible(false);
        }

        if (tokens[1] != null) {
            rbnDelete2.setVisible(true);
            lblToken2.setIcon(new ImageIcon(tokens[1]));
        } else {
            rbnDelete2.setVisible(false);
        }

        if (tokens[2] != null) {
            rbnDelete3.setVisible(true);
            lblToken3.setIcon(new ImageIcon(tokens[2]));
        } else {
            rbnDelete3.setVisible(false);
        }

        if (tokens[3] != null) {
            rbnDelete4.setVisible(true);
            lblToken4.setIcon(new ImageIcon(tokens[3]));
        } else {
            rbnDelete4.setVisible(false);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFunction;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateToken;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnShowAhead;
    private javax.swing.JButton btnShowBack;
    private javax.swing.JButton btnShowEnd;
    private javax.swing.JButton btnShowStart;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblToken1;
    private javax.swing.JLabel lblToken2;
    private javax.swing.JLabel lblToken3;
    private javax.swing.JLabel lblToken4;
    private javax.swing.JRadioButton rbnDelete1;
    private javax.swing.JRadioButton rbnDelete2;
    private javax.swing.JRadioButton rbnDelete3;
    private javax.swing.JRadioButton rbnDelete4;
    private javax.swing.JList<String> showUsers;
    private javax.swing.JTextField txtFunction;
    // End of variables declaration//GEN-END:variables
  /**
   * Methods to checks Tokens
   */
    private void checkToken()
    {
         String[] tokens = MainApp.methods.getTokens();
        if (rbnDelete1.isSelected() ) {
           tokens[0]=null;
            rbnDelete1.setVisible(false);
             lblToken1.setIcon(null);
        }
        if (rbnDelete2.isSelected() ) {
             tokens[1]=null;
               rbnDelete2.setVisible(false);
                lblToken2.setIcon(null);
        }
        if (rbnDelete3.isSelected() ) {
             tokens[2]=null;
               rbnDelete3.setVisible(false);
                lblToken3.setIcon(null);
        }
        if (rbnDelete4.isSelected()) {
             tokens[3]=null;
               rbnDelete4.setVisible(false);
                lblToken4.setIcon(null);
        }
       
    }
}
