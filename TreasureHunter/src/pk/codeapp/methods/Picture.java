/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Daniel Amador
 */
public class Picture
{
   DrawSurface drawSurface;
    Dupla tablePosition;
    int size;
    private String stringPosition;
    public Picture(DrawSurface drawSurface)
    {
        this.drawSurface = drawSurface;
        tablePosition= drawSurface.table.position;
        size = drawSurface.table.SIDE;
    }
    public Dupla calculatePosition(Dupla pos){
        int x=(int)(pos.posX*size+tablePosition.posX);
        int y=(int)(pos.posY*size+tablePosition.posY);
        return new Dupla(x,y);
    }
    public void drawPeric(int numPosition,Color color,Dupla pos,Graphics g){
        System.out.println("Posicion num: "+numPosition);
        if(numPosition == -1)
            stringPosition="Start";
        else if(numPosition == -2){
            stringPosition="End";
        }
        else{
            stringPosition=""+numPosition;
        }
        g.setColor(color);
        g.fillRect((int)calculatePosition(pos).posX,(int)calculatePosition(pos).posY, size, size);
        g.setColor(Color.black);
        g.drawRect((int)calculatePosition(pos).posX,(int)calculatePosition(pos).posY, size, size);
        g.setFont(new Font("Vendara",Font.PLAIN,15));
        g.drawString(stringPosition+"",(int)calculatePosition(pos).posX+3,(int)calculatePosition(pos).posY+12);
     
    }

    void deletePeric(Dupla pos, Graphics g) {
//        Color newColor = new Color(207, 216, 220);
//        g.setColor(newColor);
        g.clearRect((int)calculatePosition(pos).posX,(int)calculatePosition(pos).posY, size, size);
    }
 
}
