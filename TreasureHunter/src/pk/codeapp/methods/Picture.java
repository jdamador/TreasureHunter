/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.awt.Color;
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
    
    public void drawPeric(Dupla pos, Graphics g){
        g.setColor(Color.red);
        g.fillRect((int)calculatePosition(pos).posX,(int)calculatePosition(pos).posY, size, size);    
    }
}
