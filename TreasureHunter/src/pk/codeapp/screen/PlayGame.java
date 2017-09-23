/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.TransferHandler;
import pk.codeapp.methods.DrawSurface;
import pk.codeapp.model.Board;
import pk.codeapp.model.Function;

/**
 *
 * @author Jose Pablo Brenes
 */
public class PlayGame extends javax.swing.JFrame implements Runnable
{

    /**
     * Creates new form PlayGame
     */
    //Variables
    private boolean running; // Running the loop
    private Thread thread; //Main thread
    private JFrame beforeWindows;
    private DrawSurface drawSurface;
    private int xOffset; // Size to out DS in x
    private int yOffset; // Size to out DS in x
    private int widhtDS = 800; // Widht draw surface
    private int heightSD = 800; // Height draw surface
    private int COLUMNS = 10, ROW = 10, SIDE = 80;
    private int x, y;
    private boolean firstPaintBlocks = true;
    private Board block;
    private Function function;
    //End Variables
    
    //some variables
    private Point position = new Point(0, 0);
    private Point startLog;
    private Point startDrag;
    private Point offset;
    private int newY = 1;
    private int newX = 1;

    // Variables to Dice
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

    public PlayGame(String name, JFrame beforeWindows)
    {
        initComponents();
        
        String tokens[] = SelectToken.tokens;
        if (tokens[0] != null) {
            lblToken1.setIcon(new ImageIcon(MainApp.methods.getTokens()[0]));
        }
        if (tokens[1] != null) {
            lblToken2.setIcon(new ImageIcon(MainApp.methods.getTokens()[1]));
        }
        if (tokens[2] != null) {
            lblToken3.setIcon(new ImageIcon(MainApp.methods.getTokens()[2]));
        }
        if (tokens[3] != null) {
            lblToken4.setIcon(new ImageIcon(MainApp.methods.getTokens()[3]));
        }
        MouseListener listener = new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                JComponent comp = (JComponent) me.getSource();
                TransferHandler handler = comp.getTransferHandler();
                handler.exportAsDrag(comp, me, TransferHandler.COPY);
      }
    };
        lblToken1.addMouseListener(listener);
        this.block = MainApp.methods.getMapSelected();
        this.beforeWindows = beforeWindows;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(name);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblToken1 = new javax.swing.JLabel();
        jPanel = new javax.swing.JPanel();
        lblToken4 = new javax.swing.JLabel();
        lblToken3 = new javax.swing.JLabel();
        lblToken2 = new javax.swing.JLabel();
        lblActualPlayer = new javax.swing.JLabel();
        lblTurn = new javax.swing.JLabel();
        Dice = new javax.swing.JLabel();
        lblNameDice = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToken1.setBorder(new javax.swing.border.MatteBorder(null));
        lblToken1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblToken1MouseDragged(evt);
            }
        });
        lblToken1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblToken1MousePressed(evt);
            }
        });
        getContentPane().add(lblToken1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 80, 80));

        jPanel.setBackground(new java.awt.Color(0, 191, 165));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblToken4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel.add(lblToken4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 80, 80));

        lblToken3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel.add(lblToken3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 80));

        lblToken2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel.add(lblToken2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 80, 80));

        lblActualPlayer.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblActualPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblActualPlayer.setText("Player 1");
        jPanel.add(lblActualPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 74, -1, -1));

        lblTurn.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTurn.setForeground(new java.awt.Color(255, 255, 255));
        lblTurn.setText("Turn :");
        jPanel.add(lblTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 21, -1, -1));

        Dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/Dice/1c.png"))); // NOI18N
        jPanel.add(Dice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        lblNameDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/Dice/Dicepjc.png"))); // NOI18N
        jPanel.add(lblNameDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

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
        jPanel.add(btnRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 710, 147, 60));

        jLabel1.setText("Player #4");
        jPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jLabel2.setText("Player #1");
        jPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel3.setText("Player #2");
        jPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel4.setText("Player #3");
        jPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 450, 860));

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

    private void lblToken1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken1MousePressed
    {//GEN-HEADEREND:event_lblToken1MousePressed
        // TODO add your handling code here:
        this.startDrag = getScreenLocation(evt);
        this.startLog = lblToken1.getLocation();
    }//GEN-LAST:event_lblToken1MousePressed

    private void lblToken1MouseDragged(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblToken1MouseDragged
    {//GEN-HEADEREND:event_lblToken1MouseDragged
        // TODO add your handling code here:
        Point current = this.getScreenLocation(evt);
        offset = new Point((int) current.getX() - (int) startDrag.getX(), (int) current.getY() - (int) startDrag.getY());
        Point newLocation = new Point((int) (this.startLog.getX() + offset.getX()), (int) (this.startLog.getY() + offset.getY()));
        lblToken1.setLocation(newLocation);
    }//GEN-LAST:event_lblToken1MouseDragged
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

    public void update()
    { // Update to paint 
        drawSurface.paint();

    }

    public void UpdatePaintFrame()
    { //Methods to paint block
        if (firstPaintBlocks) {
            Board reco = block;
            while (reco != null) {
                paintSpecialFunction(reco); // Checks to name of functions is Start or End 
                if (paintSpecialFunction(reco) == false) {
                    Color color = MainApp.methods.getColor(reco.getFunction().getColor());
                    paintBlock(reco, color);
                }
                reco = reco.getSig();
            }
            firstPaintBlocks = false;
        }

    }

    private void paintBlock(Board reco, Color color)
    { // Paints blocks
        drawSurface.paintToPLay(reco.getPosX(), reco.getPosY(), color, reco.getNumPosicion());
    }

    private boolean paintSpecialFunction(Board reco)
    { //Methods to check Special Function and paint if is true

        switch (reco.getFunction().getFuction()) {
            case "Start":
                Color color = MainApp.methods.getColor(reco.getFunction().getColor());
                drawSurface.paintToPLay(reco.getPosX(), reco.getPosY(), color, -1);
                return true;
            case "End":
                Color colorAux = MainApp.methods.getColor(reco.getFunction().getColor());
                drawSurface.paintToPLay(reco.getPosX(), reco.getPosY(), colorAux, -2);
                return true;
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dice;
    private javax.swing.JButton btnRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblActualPlayer;
    private javax.swing.JLabel lblNameDice;
    private javax.swing.JLabel lblToken1;
    private javax.swing.JLabel lblToken2;
    private javax.swing.JLabel lblToken3;
    private javax.swing.JLabel lblToken4;
    private javax.swing.JLabel lblTurn;
    // End of variables declaration//GEN-END:variables
    private void init()
    { // variable initiator
        drawSurface = new DrawSurface(widhtDS, heightSD);
        this.drawSurface = drawSurface;
        this.add(drawSurface);
        xOffset = (widhtDS - (COLUMNS * SIDE)) / 2;
        yOffset = (heightSD - (ROW * SIDE)) / 2;
        drawSurface.paintToPlay();

    }

    private void tick()
    { // Variables

    }

    private void render()
    { // Graphics

        update();
        UpdatePaintFrame();

    }

    @Override
    public void run()
    { // Main Loop in the Game 
        init();
        while (running) { //Main Loop
            tick();
            render();

        }
        stop();
    }

    public synchronized void start()
    { //Start to synchronized main thread with Jframe
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this); // Create new Thread
        thread.start();
    }

    public synchronized void stop()
    {//Stop to synchronized main thread with Jframe
        if (!running) {
            return;
        }
        running = false;
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(CreateGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private Point getScreenLocation(MouseEvent e)
    {
        Point cursor = e.getPoint();
        
        return cursor;
    }
}
