/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

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
    /**
     * Transform position in the matrix to X and Y
     * @param pos
     * @return 
     */
    public Dupla calculatePosition(Dupla pos){
        int x=(int)(pos.posX*size+tablePosition.posX);
        int y=(int)(pos.posY*size+tablePosition.posY);
        return new Dupla(x,y);
    }
    /**
     * Draw  and write number of the frame
     * @param numPosition
     * @param color
     * @param pos
     * @param g 
     */
    public void drawPeric(int numPosition,Color color,Dupla pos,Graphics g){
        System.out.println("Entro en Peric");
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
        System.out.println("Pinto");
    }
    /**
     * Clean frame 
     * @param pos
     * @param g 
     */
    void deletePeric(Dupla pos, Graphics g) {

        g.clearRect((int)calculatePosition(pos).posX,(int)calculatePosition(pos).posY, size, size);
    }
 
}
