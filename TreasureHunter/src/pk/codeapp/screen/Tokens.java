/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pk.codeapp.model.Board;
import pk.codeapp.screen.PlayGame;

/**
 *
 * @author amador
 */
public class Tokens extends JLabel implements MouseListener, MouseMotionListener {

    private String key = "";
    private Point posicition = new Point(0,0);
    private Dimension d = new Dimension(70,70);
    private Point startLoc;
    private Point starDrag;
    private Point offset;
    private int newY=1;
    private int newX=1;
    private PlayGame aux;
    private Board board=MainApp.methods.getMapSelected();
    private  int COLUMNS = 10, ROW = 10, SIDE = 80;
    private int xOffset = (800 - (COLUMNS * SIDE)) / 2; 
    private int yOffset = (800 - (ROW * SIDE)) / 2;
    private int column;
    private int row;
    public Tokens(String icon, String key,PlayGame aux,JPanel pane){
        this.key=key;
        this.setToolTipText(key);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setSize(d);
        this.setIcon(new ImageIcon(icon));
        this.setText("");
        this.setVisible(true);
        this.setLocation(posicition);
        
        this.aux=aux;
        pane.add(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.starDrag = getScreenLocation(e);
        this.startLoc= this.getLocationOnScreen();
        aux.paint(this.getGraphics());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        newX= (this.getLocationOnScreen().x);
        newY= (this.getLocationOnScreen().y);    
//         this.setLocation(newX, newY);
         Point point = getScreenLocation(e);
         checkFunction(point.x,point.y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(Color.blue));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point current = this.getScreenLocation(e);
        offset= new Point((int)current.getX()-(int)starDrag.getX(), (int)current.getY()-(int)starDrag.getY());
        Point newLocation = new Point((int)(this.startLoc.getX()+offset.getX()),(int)(this.startLoc.getY()+offset.getY()));
       
        
         this.setLocation(newLocation);
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
    }

    private Point getScreenLocation(MouseEvent e) {
       Point cursor = e.getLocationOnScreen();
       Point targetLocation = this.getLocationOnScreen();
       return new Point((int)(targetLocation.getX()+cursor.getX()),(int)(targetLocation.getY()+cursor.getY()));
    }
    private void checkFunction(int posX,int posY){
        Board reco = board;
        System.out.println("Posicion Mouse X: "+posX);
        System.out.println("Posicion Mouse Y: "+posY);
        column = ((posX - xOffset) / 80); // get Column
        row = ((posY - (yOffset-14)) / 80); // get Row
        System.out.println("Columna: "+column);
        System.out.println("Fila: "+row);
        while(reco!=null){
            if(reco.getPosX()==column && reco.getPosY()==row)
                JOptionPane.showMessageDialog(null,reco.getFunction().getFuction(),"Function",JOptionPane.INFORMATION_MESSAGE);
            reco=reco.getSig();
          }
    }
    
}
