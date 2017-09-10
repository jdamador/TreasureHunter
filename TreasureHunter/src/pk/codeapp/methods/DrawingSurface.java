package pk.codeapp.methods;

import java.awt.Canvas;

import java.awt.Graphics;

import java.awt.image.BufferStrategy;


public class DrawingSurface extends Canvas
{

    private BufferStrategy buffer;
    private BufferStrategy bufferPaint;
    private Graphics g;
    private Graphics graphics;
    private int widht;
    private int height;
    Picture imagen;
    Table table;
  

    public DrawingSurface(int ancho, int alto)
    {
        this.widht=ancho;
        this.height=alto;
        this.setSize(widht, height);
        this.setLocation(0, 0);
        table = new Table(this);
        imagen = new Picture(this);
        
    }

    public void paint()
    {
        buffer = getBufferStrategy();

        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Paint Here
        table.paint(g);
        
        g.dispose();
        buffer.show();
    }
    public void paintFrame(int column,int row){
        bufferPaint = getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Paint Here
         imagen.drawPeric(new Dupla(column,row),g);
        
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