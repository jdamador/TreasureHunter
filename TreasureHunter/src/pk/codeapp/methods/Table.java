package pk.codeapp.methods;

import java.awt.Color;
import java.awt.Graphics;

public class Table {
    
    final int COLUMNS=10,ROW =10, SIDE =80;
    String[][] table;
    DrawSurface drawSurface;
    Dupla position;
    int widthDS,heightDS;

    public Table(DrawSurface drawSurface)
    {
        this.drawSurface = drawSurface;
        
        calculatePosition();
        table= new String[COLUMNS][ROW];
        emptyBox();
    }
    public void paint(Graphics g){
         for (int Y = 0; Y < ROW; Y++) {
            for (int X = 0; X < COLUMNS; X++) {
                Dupla posTemp= new Dupla(X*SIDE+position.posX,Y*SIDE+position.posY);
                //Draw Box
                g.setColor(Color.white);
                g.drawRect((int)posTemp.posX,(int)posTemp.posY, SIDE, SIDE);
            }
        }
    }
    public void emptyBox(){
        for (int Y = 0; Y < ROW; Y++) {
            for (int X = 0; X < COLUMNS; X++) {
                table[X][Y]="";
            }
        }
    }
    public void calculatePosition(){
        widthDS=drawSurface.getWidth();
        heightDS= drawSurface.getHeight();
        position=new Dupla((widthDS-COLUMNS*SIDE)/2,(heightDS-ROW*SIDE)/2);
    }
    

}
