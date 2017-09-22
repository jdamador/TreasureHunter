/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pk.codeapp.methods.Methods;
import pk.codeapp.model.User;

/**
 *
 * @author Daniel Amador
 */
public class GameMasterInterface extends javax.swing.JFrame {

    private Methods methods = MainApp.methods;
    private JFrame afterWindows;

    /**
     * Creates new form GameMasterInterface
     */
    public GameMasterInterface() {
        initComponents();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {

                methods.writeUser();
                System.exit(0);
            }
        });

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("pk/codeapp/tools/treasurehunter.png"));
        return retValue;
    }

    public void openWindows(JFrame afterWindows, Methods methods) {

        this.setVisible(true);
        this.afterWindows = afterWindows;
        afterWindows.setVisible(false);
        this.setLocationRelativeTo(afterWindows);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Users = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAddFunction = new javax.swing.JButton();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFunction = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Master");
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1360, 694));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(Users);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 280, 480));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(">>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 520, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("End");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 520, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddFunction.setBackground(new java.awt.Color(0, 0, 0));
        btnAddFunction.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddFunction.setForeground(new java.awt.Color(255, 255, 255));
        btnAddFunction.setText("Add Function");
        btnAddFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFunctionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        cmbColor.setBackground(new java.awt.Color(0, 0, 0));
        cmbColor.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        cmbColor.setForeground(new java.awt.Color(255, 255, 255));
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "blue", "red", "green", "yellow", "orange", "pink", "magenta", "cyan" }));
        jPanel1.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 260, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Color:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Function:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtFunction.setBackground(new java.awt.Color(255, 255, 255));
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
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Editar Usuario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 270, 60));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Eliminar Usuario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 270, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/GameBackGround.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBackActionPerformed
    {//GEN-HEADEREND:event_btnBackActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        afterWindows.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAddFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFunctionActionPerformed
        addFunction();
    }//GEN-LAST:event_btnAddFunctionActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//        Object[] possibleValues = {"First", "Second", "Third"};
//        Object selectedValue = JOptionPane.showInputDialog(null,
//                "Choose one", "Input",
//                JOptionPane.INFORMATION_MESSAGE, null,
//                possibleValues, possibleValues[0]);
      
        Object data = JOptionPane.showInputDialog(rootPane, "Write the username", "Delete user", JOptionPane.INFORMATION_MESSAGE);
        if (data == null) {
            System.out.println("null");
        } else {
            methods.deleteUser((String) data);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
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


    }//GEN-LAST:event_jButton5ActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Users;
    private javax.swing.JButton btnAddFunction;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFunction;
    // End of variables declaration//GEN-END:variables
}
