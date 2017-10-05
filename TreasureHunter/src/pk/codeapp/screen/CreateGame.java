/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import pk.codeapp.methods.DrawSurface;
import pk.codeapp.methods.Methods;
import pk.codeapp.model.Board;
import pk.codeapp.model.Function;
import pk.codeapp.model.User;

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
    
    /**
     * Constructor of Game
     * @param nombre
     * @param afterWindows 
     */
    
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
     * Image of Game
     * @return Image
     */
    @Override
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("pk/codeapp/tools/treasurehunter.png"));
        return retValue;
    }

    
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
        setIconImage(getIconImage());
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
    /**
     * Diferents methods of mouse
     * @param evt 
     */
    
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
        running=false;
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
    
    /**
     * Update to Paint
     */
    public void update() { 
        drawSurface.paint();
    }
    /**
     *  Paint block with  position of mouse
     */
    public void paintFrame() { 
        if (posXMouse <= (drawSurface.getWidht()) - 20 && posYMouse <= (drawSurface.getHeight()) && posXMouse >= 0 && posYMouse >= 0) { //Check that the mouse is in the range to DS
            column = (posXMouse - xOffset) / SIDE; // get Column
            row = (posYMouse - yOffset) / SIDE; // get Row
            if (column >= 0 && row >= 0) { 
                jumpAuxConsult(); // Methods to Consult windows to fuctions
            }
        }
    }
    /**
     * Delete block with position of mouse 
     */
    public void deleteFrame(){ 
         if (posXMouse <= (drawSurface.getWidht()) - 20 && posYMouse <= (drawSurface.getHeight()) && posXMouse >= 0 && posYMouse >= 0) { //Check that the mouse is in the range to DS
            column = (posXMouse - xOffset) / SIDE;// get Column
            row = (posYMouse - yOffset) / SIDE;// get Row
            if (column >= 0 && row >= 0) {
                  deletePaintFrame(column,row);// Methods delete block
            }
         }
    }
    /**
     *  Methods to delete block with the column and row
     * @param column
     * @param row 
     */
    public void deletePaintFrame(int column,int row){ 
       drawSurface.deleteFrame(column, row);// call methods to clear paint to block
       deleteLinkening(column,row);// Delete linkening to next and before block
    }
    /**
     * Delete Linkening to blocks
     * @param column
     * @param row 
     */
    private void deleteLinkening(int column,int row){ 
        User actual = MainApp.methods.getActualUser();
        Board aux =actual.getGameSig(); // aux is the next to reco
        if(aux.getPosX()==column && aux.getPosY()==row){ // Checks first position
            if(aux==null)
                actual.setGameSig(null);
            else
                actual.setGameSig(aux);
        }
        while(aux!=null){
            if(aux.getPosX()==column && aux.getPosY()==row){
                if(aux.getSig()==null){ //Delete last position
                    aux.getAnt().setSig(null);
                }else{
                    aux.getAnt().setSig(aux.getSig());
                    aux.getSig().setAnt(aux.getAnt());
                }
            }aux = aux.getSig();
        }     
    }
    /**
     * Methods to Paint block with respective color
     */
    public void UpdatePaintFrame() { 
         
        if (MainApp.methods.getActivePaint()){ // Check to mouse is actived
            function=winAuxConsult.getPointerFunction();
            paintSpecialFunction(); // Checks to name of functions is Start or End 
            
            if( paintSpecialFunction()==false){
                numPosition+=1;
                MainApp.methods.addBoard(column, row,numPosition, function);
                columnAux = column;
                rowAux = row;
                Color color = MainApp.methods.getColor(function.getColor());
                drawSurface.paintFrame(column, row, color,numPosition);
                MainApp.methods.setActivePaint(false);
            }
        }MainApp.methods.setSpecialFunction("");
    }
    /**
     * Methods to check Special Function 
     * @return true if this
     */
    private boolean paintSpecialFunction(){ 
        switch(function.getFuction()){
            case "Start": MainApp.methods.addBoard(column, row,-1,function); UpdateSpecialFrame(-1);return true;
            case "End": MainApp.methods.addBoard(column, row,-2, function);UpdateSpecialFrame(-2); return true;
        }return false;
    }
    /**
     * Checks num of the function to complete action of paint
     * @param num 
     */
    private void UpdateSpecialFrame(int num){
        columnAux = column;
        rowAux = row;
        Color color = MainApp.methods.getColor(function.getColor());
        drawSurface.paintFrame(column, row, color,num);
         
         MainApp.methods.setActivePaint(false);
    }
    /**
     * Methods to open the auxiliary windows to know the fuctions of block
     */
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
    /**
     * Inicialization of variables to Thread
     */
    private void init() {
        drawSurface = new DrawSurface(widhtDS, heightSD);
        this.drawSurface = drawSurface;
        this.add(drawSurface);
        drawSurface.addMouseListener(this);
        addMouseListener(this);
        xOffset = (widhtDS - (COLUMNS * SIDE)) / 2;
        yOffset = (heightSD - (ROW * SIDE)) / 2;
        
    }
    /**
     * Updates Variables
     */
    private void tick() { 

    }
    /**
     * Updates Graphics
     */
    private void render() { 

        update();
        UpdatePaintFrame();
    }
    /**
     * Principal Loop
     */
    @Override
    public void run() {

        init();
        while (running) { // Main Loop

            tick();
            render();
        }
        stop();
    }
    /**
     * Inicialization of Thread
     */
    public synchronized void start() {
        System.out.println("Entro al start");
        if (running) {
            return;
        }
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    /**
     * Methods to stop Thread
     */
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
