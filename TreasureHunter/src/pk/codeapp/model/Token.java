/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

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

/**
 *
 * @author amador
 */
public class Token extends JLabel implements MouseListener, MouseMotionListener {

    private String key = "";
    private Point posicition = new Point(0,0);
    private Dimension d = new Dimension(124,150);
    private Point startLoc;
    private Point starDrag;
    private Point offset;
    private int newY=1;
    private int newX=1;
    public void Token(String icon, String key){
        this.key=key;
        this.setToolTipText(key);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setSize(d);
        this.setIcon(new ImageIcon(icon));
        this.setText("");
        this.setVisible(true);
        this.setLocation(posicition);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.starDrag = getScreenLocation(e);
        this.startLoc= this.getLocation();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        newX= (this.getLocation().x);
         newY= (this.getLocation().y);
         this.setLocation(newX, newY);
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
       Point cursor = e.getPoint();
       Point targetLocation = this.getLocationOnScreen();
       return new Point((int)(targetLocation.getX()+cursor.getX()),(int)(targetLocation.getY()+cursor.getY()));
    }

}
