/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import pk.codeapp.methods.DrawSurface;
import pk.codeapp.model.Board;
import pk.codeapp.model.Function;

/**
 *
 * @author Jose Pablo Brenes
 */
public class PlayGame extends javax.swing.JFrame implements Runnable {

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
    private int numPosition = 0; // Num position of Block or Frame
    private Board block; 
    private Function function;
    //End Variables

    public PlayGame(String name, JFrame beforeWindows) {
        initComponents();
        this.block=MainApp.methods.getRootBoard();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 788));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void update() { // Update to paint 
        drawSurface.paint();
    }

    public void UpdatePaintFrame() { //
            Board reco = block;
            while(reco!=null){
            paintSpecialFunction(reco); // Checks to name of functions is Start or End 

            if (paintSpecialFunction(reco) == false) {
                numPosition += 1;
                Color color = MainApp.methods.getColor(reco.getFunction().getColor());
                drawSurface.paintFrame(block.getPosX(),reco.getPosY(), color, numPosition);
                MainApp.methods.setActivePaint(false);
                 }
            }
    }

    private boolean paintSpecialFunction(Board reco) { //Methods to check Special Function and paint if is true
        switch (reco.getFunction().getFuction()) {
            case "Start":
                Color color = MainApp.methods.getColor(reco.getFunction().getColor());
                drawSurface.paintFrame(reco.getPosX(),reco.getPosY(), color, -1);
                return true;
            case "End":
                Color colorAux = MainApp.methods.getColor(reco.getFunction().getColor());
                drawSurface.paintFrame(reco.getPosX(),reco.getPosY(), colorAux, -2);
                return true;
        }
        return false;
    }

    private void init() { // variable initiator
        drawSurface = new DrawSurface(widhtDS, heightSD);
        this.drawSurface = drawSurface;
        this.add(drawSurface);
        xOffset = (widhtDS - (COLUMNS * SIDE)) / 2;
        yOffset = (heightSD - (ROW * SIDE)) / 2;
    }

    private void tick() { // Variables

    }

    private void render() { // Graphics
        update();
        UpdatePaintFrame();
    }

    @Override
    public void run() { // Main Loop in the Game 
        init();
        while (running) { //Main Loop
            tick();
            render();
        }
        stop();
    }

    public synchronized void start() { //Start to synchronized main thread with Jframe
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this); // Create new Thread
        thread.start();
    }

    public synchronized void stop() {//Stop to synchronized main thread with Jframe
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
