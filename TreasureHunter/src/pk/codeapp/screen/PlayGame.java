/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import pk.codeapp.model.Board;

public class PlayGame extends javax.swing.JFrame
{

    String tokens[] = SelectToken.getTokens();
    private JFrame beforeFrame;
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
    private Point starDrag;
    private Point posicition = new Point(0, 0);
    private Dimension d = new Dimension(70, 70);
    private Point startLoc;
    private Board board = MainApp.methods.getMapSelected();
    private int COLUMNS = 10, ROW = 10, SIDE = 80;
    private int xOffset = (800 - (COLUMNS * SIDE)) / 2;
    private int yOffset = (800 - (ROW * SIDE)) / 2;
    private int column;
    private int row;
    private Point offset;
    private int newY;
    private int newX;
    ImageIcon icon = new ImageIcon("src/pk/codeapp/tools/brujula.gif");
    ImageIcon icon2 = new ImageIcon("src/pk/codeapp/tools/winner.jpg");

    /**
     * Creates new form PlayGameAux
     */
    public PlayGame()
    {
        initComponents();
        drawSurface = new DrawSurfaceAux(); //Draw Surface to Play
        this.add(drawSurface);
        chargeImage(); //Charge Tokens

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent evt)
            {

                MainApp.methods.writeUser();
                MainApp.methods.writeInTextFile(MainApp.methods.getTokenFile(), MainApp.methods.getTokens());
                System.exit(0);
            }
        });

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
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Dice = new javax.swing.JLabel();
        lblNameDice = new javax.swing.JLabel();
        lblTurn = new javax.swing.JLabel();
        lblActualPlayer = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        paneMarkeup = new javax.swing.JPanel();
        lblToken2 = new javax.swing.JLabel();
        lblToken4 = new javax.swing.JLabel();
        lblToken1 = new javax.swing.JLabel();
        lblToken3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 191, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/Dice/1c.png"))); // NOI18N
        jPanel1.add(Dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 425, -1, -1));

        lblNameDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/Dice/Dicepjc.png"))); // NOI18N
        jPanel1.add(lblNameDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 363, -1, -1));

        lblTurn.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTurn.setForeground(new java.awt.Color(255, 255, 255));
        lblTurn.setText("Turn :");
        jPanel1.add(lblTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblActualPlayer.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblActualPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblActualPlayer.setText("Player 1");
        jPanel1.add(lblActualPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        btnRoll.setBackground(new java.awt.Color(0, 0, 0));
        btnRoll.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRoll.setForeground(new java.awt.Color(255, 255, 255));
        btnRoll.setText("Roll !!");
        btnRoll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRollMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRollMouseExited(evt);
            }
        });
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });
        jPanel1.add(btnRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 626, 147, 60));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        paneMarkeup.setBackground(new java.awt.Color(102, 255, 204));
        paneMarkeup.setForeground(new java.awt.Color(255, 255, 255));
        paneMarkeup.setToolTipText("");
        paneMarkeup.setOpaque(false);
        paneMarkeup.setPreferredSize(new java.awt.Dimension(800, 800));
        paneMarkeup.setLayout(null);

        lblToken2.setForeground(new java.awt.Color(255, 255, 255));
        lblToken2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToken2.setText("Player2");
        lblToken2.setToolTipText("Player2");
        lblToken2.setBorder(new javax.swing.border.MatteBorder(null));
        lblToken2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblToken2MouseDragged(evt);
            }
        });
        lblToken2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblToken2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblToken2MouseReleased(evt);
            }
        });
        paneMarkeup.add(lblToken2);
        lblToken2.setBounds(120, 630, 70, 70);

        lblToken4.setForeground(new java.awt.Color(255, 255, 255));
        lblToken4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToken4.setText("Player4");
        lblToken4.setToolTipText("Player4");
        lblToken4.setBorder(new javax.swing.border.MatteBorder(null));
        lblToken4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblToken4MouseDragged(evt);
            }
        });
        lblToken4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblToken4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblToken4MouseReleased(evt);
            }
        });
        paneMarkeup.add(lblToken4);
        lblToken4.setBounds(280, 630, 70, 70);

        lblToken1.setForeground(new java.awt.Color(255, 255, 255));
        lblToken1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/tokens/bluecrown.png"))); // NOI18N
        lblToken1.setText("Player1");
        lblToken1.setToolTipText("Player");
        lblToken1.setBorder(new javax.swing.border.MatteBorder(null));
        lblToken1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblToken1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblToken1MouseDragged(evt);
            }
        });
        lblToken1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblToken1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblToken1MouseReleased(evt);
            }
        });
        paneMarkeup.add(lblToken1);
        lblToken1.setBounds(30, 630, 70, 70);

        lblToken3.setForeground(new java.awt.Color(255, 255, 255));
        lblToken3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblToken3.setText("Player3");
        lblToken3.setToolTipText("Player3");
        lblToken3.setBorder(new javax.swing.border.MatteBorder(null));
        lblToken3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblToken3MouseDragged(evt);
            }
        });
        lblToken3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblToken3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblToken3MouseReleased(evt);
            }
        });
        paneMarkeup.add(lblToken3);
        lblToken3.setBounds(200, 630, 70, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneMarkeup, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneMarkeup, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        beforeFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblToken1MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken1MouseDragged
    {//GEN-HEADEREND:event_lblToken1MouseDragged
        this.pointMouse(lblToken1);


    }//GEN-LAST:event_lblToken1MouseDragged

    private void lblToken1MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken1MouseReleased
    {//GEN-HEADEREND:event_lblToken1MouseReleased
        Point point = MouseInfo.getPointerInfo().getLocation();
        checkFunction(point.x, point.y);
        if (tokens[1] == null) {
            lblActualPlayer.setText("Player 1");
        } else {
            lblActualPlayer.setText("Player 2");
        }


    }//GEN-LAST:event_lblToken1MouseReleased

    private void lblToken1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken1MousePressed
    {//GEN-HEADEREND:event_lblToken1MousePressed
        this.eventMouse(evt);
    }//GEN-LAST:event_lblToken1MousePressed

    private void lblToken2MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken2MousePressed
    {//GEN-HEADEREND:event_lblToken2MousePressed
        // TODO add your handling code here:

        this.eventMouse(evt);
    }//GEN-LAST:event_lblToken2MousePressed

    private void lblToken2MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken2MouseReleased
    {//GEN-HEADEREND:event_lblToken2MouseReleased
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        checkFunction(point.x, point.y);
        if (tokens[2] == null) {
            lblActualPlayer.setText("Player 1");
        } else {
            lblActualPlayer.setText("Player 3");
        }
    }//GEN-LAST:event_lblToken2MouseReleased

    private void lblToken2MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken2MouseDragged
    {//GEN-HEADEREND:event_lblToken2MouseDragged
        // TODO add your handling code here:
        this.pointMouse(lblToken2);
    }//GEN-LAST:event_lblToken2MouseDragged

    private void lblToken3MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken3MouseDragged
    {//GEN-HEADEREND:event_lblToken3MouseDragged
        // TODO add your handling code here:
        this.pointMouse(lblToken3);
    }//GEN-LAST:event_lblToken3MouseDragged

    private void lblToken3MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken3MousePressed
    {//GEN-HEADEREND:event_lblToken3MousePressed
        // TODO add your handling code here:
        this.eventMouse(evt);
    }//GEN-LAST:event_lblToken3MousePressed

    private void lblToken3MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken3MouseReleased
    {//GEN-HEADEREND:event_lblToken3MouseReleased
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        checkFunction(point.x, point.y);
        if (tokens[3] == null) {
            lblActualPlayer.setText("Player 1");
        } else {
            lblActualPlayer.setText("Player 3");
        }
    }//GEN-LAST:event_lblToken3MouseReleased

    private void lblToken4MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken4MousePressed
    {//GEN-HEADEREND:event_lblToken4MousePressed
        // TODO add your handling code here:
        this.eventMouse(evt);
    }//GEN-LAST:event_lblToken4MousePressed

    private void lblToken4MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken4MouseReleased
    {//GEN-HEADEREND:event_lblToken4MouseReleased
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation();
        checkFunction(point.x, point.y);
        lblActualPlayer.setText("Player 1");

    }//GEN-LAST:event_lblToken4MouseReleased

    private void lblToken4MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken4MouseDragged
    {//GEN-HEADEREND:event_lblToken4MouseDragged
        // TODO add your handling code here:
        this.pointMouse(lblToken4);
    }//GEN-LAST:event_lblToken4MouseDragged
    /**
     * Methods to Spin Dice
     */
    public void spin()
    { // View the animation of dice
        //Stting spin animation
        Dice.setIcon(new ImageIcon(animationPath));
    }

    /**
     * Obtain Result of Spin Dice
     */
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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRoll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblActualPlayer;
    private javax.swing.JLabel lblNameDice;
    private javax.swing.JLabel lblToken1;
    private javax.swing.JLabel lblToken2;
    private javax.swing.JLabel lblToken3;
    private javax.swing.JLabel lblToken4;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JPanel paneMarkeup;
    // End of variables declaration//GEN-END:variables
    /**
     * Give the before Windows
     *
     * @param select
     */
    public void open(SelectToken select)
    {
        this.beforeFrame = select;
        this.setVisible(true);
        select.setVisible(false);

    }

    /**
     * Charge Image Tokens in Game
     */
    public void chargeImage()
    {

        if (tokens[0] != null) {
             lblToken1.setVisible(true);
            lblToken1.setIcon(new ImageIcon(tokens[0]));
        } else {
            lblToken1.setVisible(false);
        }
        if (tokens[1] != null) {
                lblToken2.setVisible(true);
            lblToken2.setIcon(new ImageIcon(tokens[1]));
        } else {
            lblToken2.setVisible(false);
        }
        if (tokens[2] != null) {
             lblToken3.setVisible(true);
            lblToken3.setIcon(new ImageIcon(tokens[2]));
        } else {
            lblToken3.setVisible(false);
        }
        if (tokens[3] != null) {
            lblToken4.setVisible(true);
            lblToken4.setIcon(new ImageIcon(tokens[3]));
        } else {
            lblToken4.setVisible(false);
        }

    }

    /**
     * Checks the Functions in the Block
     *
     * @param posX
     * @param posY
     */
    private void checkFunction(int posX, int posY)
    {
        Board reco = board;

        System.out.println("Posicion Mouse X: " + posX);
        System.out.println("Posicion Mouse Y: " + posY);
        column = ((posX - xOffset) / 80); // get Column
        row = ((posY - (yOffset)) / 80); // get Row

        System.out.println("Columna: " + column);
        System.out.println("Fila: " + row);
        while (reco != null) {
            if (reco.getPosX() == column && reco.getPosY() == row) {
                if (reco.getFunction().getFuction().equals("End")) {
                    JOptionPane.showMessageDialog(null, null, "!!! YOU WIN !!!", JOptionPane.INFORMATION_MESSAGE, icon2);
                } else if (!reco.getFunction().getFuction().equals("Start") && !reco.getFunction().getFuction().equals("Empty")) {
                    JOptionPane.showMessageDialog(null, reco.getFunction().getFuction(), "Function", JOptionPane.INFORMATION_MESSAGE, icon);
                }
            }
            reco = reco.getSig();
        }
    }

    /**
     * Obtain Point of Mouse in the Screen
     *
     * @param label
     */
    public void pointMouse(JLabel label)
    {
        Point point = MouseInfo.getPointerInfo().getLocation();
        System.out.println(point);
        label.setLocation(point.x - newX, point.y - newY);

    }

    /**
     * Obtain X and Y of Mouse
     *
     * @param e
     */
    public void eventMouse(MouseEvent e)
    {
        newX = e.getX();
        newY = e.getY();
    }

}
