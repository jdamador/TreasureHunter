/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pk.codeapp.methods.Dupla;
import pk.codeapp.model.Board;
import pk.codeapp.model.Tokens;

/**
 *
 * @author amador
 */
public class PlayGame extends javax.swing.JFrame
{

    private DrawSurfaceAux drawSurface;
    //Variables of Dice
    private final String animationPath = "src/pk/codeapp/tools/Dice/rollDice.gif";//Animation of Dice
    private final String[] imgs = { // String of directions images of dices
        "src/pk/codeapp/tools/Dice/1c.png",
        "src/pk/codeapp/tools/Dice/2-border.png",
        "src/pk/codeapp/tools/Dice/3c.png",
        "src/pk/codeapp/tools/Dice/4c.png",
        "src/pk/codeapp/tools/Dice/5c.png",
        "src/pk/codeapp/tools/Dice/6c.png"
    };
    private final int[] faces = {1, 2, 3, 4, 5, 6};
    private boolean changeOptionDice = true;

    /**
     * Creates new form PlayGameAux
     */
    public PlayGame()
    {
        initComponents();
        drawSurface = new DrawSurfaceAux();
        this.add(drawSurface);
        chargeImage();
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

        paneMarkeup = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Dice = new javax.swing.JLabel();
        lblNameDice = new javax.swing.JLabel();
        lblTurn = new javax.swing.JLabel();
        lblActualPlayer = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneMarkeup.setOpaque(false);
        paneMarkeup.setPreferredSize(new java.awt.Dimension(800, 800));
        paneMarkeup.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 191, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/Dice/1c.png"))); // NOI18N
        jPanel1.add(Dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 425, -1, -1));

        lblNameDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/Dice/Dicepjc.png"))); // NOI18N
        jPanel1.add(lblNameDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 363, -1, -1));

        lblTurn.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTurn.setForeground(new java.awt.Color(255, 255, 255));
        lblTurn.setText("Turn :");
        jPanel1.add(lblTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 49, -1, -1));

        lblActualPlayer.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblActualPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblActualPlayer.setText("Player 1");
        jPanel1.add(lblActualPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 126, -1, -1));

        btnRoll.setBackground(new java.awt.Color(0, 0, 0));
        btnRoll.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRoll.setForeground(new java.awt.Color(255, 255, 255));
        btnRoll.setText("Roll !!");
        btnRoll.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnRollMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnRollMouseExited(evt);
            }
        });
        btnRoll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRollActionPerformed(evt);
            }
        });
        jPanel1.add(btnRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 626, 147, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(paneMarkeup, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
            .addComponent(paneMarkeup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRollMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRollMouseEntered
        btnRoll.setBackground(Color.white);
        btnRoll.setForeground(Color.black);
    }//GEN-LAST:event_btnRollMouseEntered

    private void btnRollMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRollMouseExited
        btnRoll.setBackground(Color.BLACK);
        btnRoll.setForeground(Color.white);
    }//GEN-LAST:event_btnRollMouseExited

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        if (changeOptionDice && btnRoll.getText().equals("Roll !!")) {
            btnRoll.setText("Stop !!");
            spin(); //Methods to spin dice and obtain a ramdom number(1 - 6)
        } else {
            obtainResult();
            btnRoll.setText("Roll !!");
        }

    }//GEN-LAST:event_btnRollActionPerformed
    public void spin()
    { // View the animation of dice
        //Stting spin animation
        Dice.setIcon(new ImageIcon(animationPath));
    }

    private void obtainResult()
    { // Obtain result of spin
        Random r = new Random();

        int guess = faces[r.nextInt(faces.length)];
        String getImage = imgs[guess - 1];
        Dice.setIcon(new ImageIcon(getImage));
    }

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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PlayGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dice;
    private javax.swing.JButton btnRoll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblActualPlayer;
    private javax.swing.JLabel lblNameDice;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JPanel paneMarkeup;
    // End of variables declaration//GEN-END:variables

    public void runForPaint()
    {

    }

    public void open(SelectToken select)
    {
        this.setVisible(true);
        select.setVisible(false);
        runForPaint();
    }

    public void chargeImage()
    {
        String tokens[] = SelectToken.getTokens();
        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i]!=null){
                Tokens tk = new Tokens("src/pk/codeapp/tools/tokens/bluecrown.png", "nada", this);
                tk.setLocation(i*80+10, 700);
                paneMarkeup.add(tk);
            }
        }
        
        
    }
}
