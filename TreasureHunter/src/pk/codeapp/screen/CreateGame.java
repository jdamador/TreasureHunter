/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import pk.codeapp.methods.DrawSurface;
import pk.codeapp.methods.Methods;
import pk.codeapp.model.Board;
import pk.codeapp.model.Function;

/**
 *
 * @author Jose Pablo Brenes
 */
public class CreateGame extends javax.swing.JFrame implements MouseListener, Runnable { 

    /**
     * Creates new form Pantalla
     */
    private boolean running; // Running the loop
    private Thread thread; //Main thread
    private  DrawSurface drawSurface;
    private  int posXMouse; // Position to mouse in x
    private  int posYMouse; // Position to mouse in y
    private  int xOffset; // Size to out DS in x
    private  int yOffset; // Size to out DS in x
    private  int widhtDS = 800; // Widht draw surface
    private  int heightSD = 800; // Height draw surface
    private  int COLUMNS = 10, ROW = 10, SIDE = 80;
    private  int column;
    private  int row;
    private int columnAux = -1;// Before Column
    private int rowAux = -1; //  Before Row
    private boolean activateMouse; // Boolean to know mouse actived
    private  String nameMethod; // Save the nameMethods to know action to perform 
    private Methods methods = MainApp.methods;// Get methods
    private int numPosition=0; // Num position of Block or Frame
    private Function function;
    private windowsAuxConsult winAuxConsult;
    private JFrame beforeWindows; 
    
    public CreateGame(String nombre,JFrame afterWindows) { 
        initComponents();
        this.beforeWindows=afterWindows;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(nombre); 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDraw = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnDeleteFrame = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 800));

        jPanel1.setBackground(new java.awt.Color(92, 107, 192));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Choose the option you want to use");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Create Map");

        btnDraw.setBackground(new java.awt.Color(0, 0, 0));
        btnDraw.setForeground(new java.awt.Color(0, 0, 0));
        btnDraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/paint.png"))); // NOI18N
        btnDraw.setToolTipText("Click to create pictures in the matrix ");
        btnDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDrawMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delete Picture");

        btnDeleteFrame.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pk/codeapp/tools/delete.png"))); // NOI18N
        btnDeleteFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteFrameMouseClicked(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(btnDeleteFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 808, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDrawMouseClicked
        // Button to draw maps
        activateMouse = true;
        nameMethod = "paint";

    }//GEN-LAST:event_btnDrawMouseClicked

    private void btnDeleteFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteFrameMouseClicked
        //Button to delete blocks
        activateMouse = true;
        nameMethod = "delete";
    }//GEN-LAST:event_btnDeleteFrameMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       // Back 
        this.dispose(); // Delete actual windows
        beforeWindows.setVisible(true); 
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    @Override
    public void mouseClicked(MouseEvent e) { // Mouse clicked in the drawSurface
        if (activateMouse) {
            //Register Position of mouse
            this.posXMouse = e.getX();
            this.posYMouse = e.getY();
            if (posXMouse <= (drawSurface.getWidht()) - 20 && posYMouse <= (drawSurface.getHeight()) && posXMouse >= 0 && posYMouse >= 0) { // verify that the mouse is inside the superficie
                //Checks name of Method to perform action 
                if (nameMethod.equals("paint")) { 
                    paintFrame(); 
                }else if(nameMethod.equals("delete")){
                    deleteFrame();
                }
            }
        }
    }
//<editor-fold defaultstate="collapsed" desc="Abstract methods of Mouse">
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
//</editor-fold>
    
    public void update() { // Update to paint 
        drawSurface.paint();
    }

    public void paintFrame() { // Paint block with  position of mouse
        if (posXMouse <= (drawSurface.getWidht()) - 20 && posYMouse <= (drawSurface.getHeight()) && posXMouse >= 0 && posYMouse >= 0) { //Check that the mouse is in the range to DS
            column = (posXMouse - xOffset) / SIDE; // get Column
            row = (posYMouse - yOffset) / SIDE; // get Row
            if (column >= 0 && row >= 0) { 
                jumpAuxConsult(); // Methods to Consult windows to fuctions
            }
        }
    }
    public void deleteFrame(){ // Delete block with position of mouse 
         if (posXMouse <= (drawSurface.getWidht()) - 20 && posYMouse <= (drawSurface.getHeight()) && posXMouse >= 0 && posYMouse >= 0) { //Check that the mouse is in the range to DS
            column = (posXMouse - xOffset) / SIDE;// get Column
            row = (posYMouse - yOffset) / SIDE;// get Row
            if (column >= 0 && row >= 0) {
                  deletePaintFrame(column,row);// Methods delete block
            }
         }
    }
    public void deletePaintFrame(int column,int row){ // Methods to delete block with the column and row
       drawSurface.deleteFrame(column, row);// call methods to clear paint to block
       deleteLinkening(column,row);// Delete linkening to next and before block
    }
    private void deleteLinkening(int column,int row){ // Delete Linkening to blocks
        Board reco = MainApp.methods.getRootBoard();
        Board aux = reco.getSig(); // aux is the next to reco 
        if(reco.getPosX()==column && reco.getPosY()==row){ // Check the first position
            MainApp.methods.setRootBoard(aux); // Move the rootBoard
            reco = null;
        }
        while(reco.getSig()!=null){    
            if(reco.getPosX()==column && reco.getPosY()==row){ // if is the position move the sig and ant
                reco.getAnt().setSig(aux);
                aux.setAnt(reco.getAnt());
                reco=null; // Actual is delete
            } // else move reco to the next position, same to aux
            reco = reco.getSig(); 
            aux = aux.getSig();
        }
    }
    public void UpdatePaintFrame() { //
         
        if (MainApp.methods.getActivePaint()){ // Check to mouse is actived
            function=winAuxConsult.getPointerFunction();
            paintSpecialFunction(); // Checks to name of functions is Start or End 
            
            if( paintSpecialFunction()==false){
                numPosition+=1;
                MainApp.methods.addBoard(column, ROW,numPosition, function);
                columnAux = column;
                rowAux = row;
                Color color = MainApp.methods.getColor(function.getColor());
                drawSurface.paintFrame(column, row, color,numPosition);
                MainApp.methods.setActivePaint(false);
            }
        }MainApp.methods.setSpecialFunction("");
    }
    private boolean paintSpecialFunction(){ //Methods to check Special Function and return true if this
        switch(function.getFuction()){
            case "Start": MainApp.methods.addBoard(column, ROW,-1,function); UpdateSpecialFrame(-1);return true;
            case "End": MainApp.methods.addBoard(column, ROW,-2, function);UpdateSpecialFrame(-2); return true;
        }return false;
    }
    private void UpdateSpecialFrame(int num){
        columnAux = column;
        rowAux = row;
        Color color = MainApp.methods.getColor(function.getColor());
        drawSurface.paintFrame(column, row, color,num);
         
         MainApp.methods.setActivePaint(false);
    }
    private void jumpAuxConsult() {
        this.enable(false);
         winAuxConsult = new windowsAuxConsult();
        winAuxConsult.beforeWindows(this);
        winAuxConsult.setLocationRelativeTo(null);
        winAuxConsult.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteFrame;
    private javax.swing.JButton btnDraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private void init() {
        drawSurface = new DrawSurface(widhtDS, heightSD);
        this.drawSurface = drawSurface;
        this.add(drawSurface);
        drawSurface.addMouseListener(this);
        addMouseListener(this);
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
    public void run() {

        init();
        while (running) {

            tick();
            render();
        }
        stop();
    }
    public synchronized void start() {
        System.out.println("Entro al start");
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
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
}
