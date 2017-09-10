package pk.codeapp.methods; 
 
import java.awt.Color; 
import java.awt.Font; 
import java.awt.Graphics; 
import javax.swing.JPanel; 
 
public class Table { 
     
    final int COLUMN = 10, ROW = 10, SIDE = 80; 
    String table[][]; 
    DrawingSurface drawingSurface; 
    Dupla posicion; 
    int widhtDS ; 
    int heightDS ; 
 
    public Table(DrawingSurface drawingSurface) 
    { 
        this.drawingSurface = drawingSurface; 
         
        calculatePosition(); 
        table= new String[COLUMN][ROW]; 
        emptyBoxes(); 
    } 
    public void paint(Graphics g){ 
         for (int Y = 0; Y < ROW; Y++) { 
            for (int X = 0; X < COLUMN; X++) { 
                Dupla posTemp= new Dupla(X*SIDE+posicion.posX,Y*SIDE+posicion.posY); 
                //dibujar casilla 
                g.setColor(Color.white); 
                g.drawRect((int)posTemp.posX,(int)posTemp.posY, SIDE, SIDE); 
            } 
        } 
    } 
    public void emptyBoxes(){ 
        for (int Y = 0; Y < ROW; Y++) { 
            for (int X = 0; X < COLUMN; X++) { 
                table[X][Y]=""; 
            } 
        } 
    } 
    public void calculatePosition(){ 
        widhtDS=drawingSurface.getWidth(); 
        heightDS= drawingSurface.getHeight(); 
        posicion=new Dupla((widhtDS-COLUMN*SIDE)/2,(heightDS-ROW*SIDE)/2); 
    } 
     
 
} 