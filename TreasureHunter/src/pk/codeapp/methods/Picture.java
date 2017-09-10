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
   DrawingSurface drawingSurface;
    Dupla tablePosicion;
    int side;
    
    public Picture(DrawingSurface drawingSurface)
    {
        this.drawingSurface = drawingSurface;
        tablePosicion= drawingSurface.table.posicion;
        side = drawingSurface.table.SIDE;
    }

   
     
    public Dupla calculatePosicion(Dupla pos){
        int x=(int)(pos.posX*side+tablePosicion.posX);
        int y=(int)(pos.posY*side+tablePosicion.posY);
        return new Dupla(x,y);
    }
    
    public void drawPeric(Dupla pos, Graphics g){
        g.setColor(Color.red);
        g.fillRect((int)calculatePosicion(pos).posX,(int)calculatePosicion(pos).posY, side, side);    
    }
}
