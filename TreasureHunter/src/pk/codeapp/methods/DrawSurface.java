package pk.codeapp.methods;

import java.awt.Canvas;
import java.awt.Color;

import java.awt.Graphics;

import java.awt.image.BufferStrategy;


public class DrawSurface extends Canvas
{

    private BufferStrategy buffer;
    private BufferStrategy bufferPaint;
    private Graphics g;
    private Graphics graphics;
    private int widht;
    private int height;
    Picture picture;
    Table table;
  

    public DrawSurface(int widht, int height)
    {
        this.widht=widht;
        this.height=height;
        this.setSize(widht, height);
        this.setLocation(0, 0);
        table = new Table(this);
        picture = new Picture(this);
        
    }

    public void paint()
    {
        buffer = getBufferStrategy();

        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Dibujar Aqui
        table.paint(g);
        
        g.dispose();
        buffer.show();
    }
    public void paintFrame(int column,int row,Color color){
        bufferPaint = getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Dibujar Aquiw
        Dupla newDupla= new Dupla(column,row);
         picture.drawPeric(color,newDupla,g);
        
        g.dispose();
        buffer.show();
       
    }
    
    public int getWidht() {
        return widht;
    }

    public int getHeight() {
        return height;
    }
    
  
    

}
