package pk.codeapp.methods;

import java.awt.Canvas;
import java.awt.Color;

import java.awt.Graphics;

import java.awt.image.BufferStrategy;

public class DrawSurface extends Canvas {

    private BufferStrategy buffer;
    private BufferStrategy buffertToCreateMap;

    private Graphics g;
    private Graphics graphics;
    private int widht;
    private int height;

    Picture picture;
    Picture auxPicture;
    Table table;

    public DrawSurface(int widht, int height) {
        this.widht = widht;
        this.height = height;
        this.setSize(widht, height);
        this.setLocation(0, 0);
        table = new Table(this);
        picture = new Picture(this);

    }

    public void paint() {
        buffer = getBufferStrategy();

        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Paint here
        table.paint(g);

        g.dispose();
        buffer.show();
    }

    public void paintFrame(int column, int row, Color color, int numPosition) {
        buffertToCreateMap = getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Paint here
        Dupla newDupla = new Dupla(column, row);
        picture.drawPeric(numPosition, color, newDupla, g);
        g.dispose();
        buffer.show();

    }
 
    
    public void deleteFrame(int column, int row) {
        buffertToCreateMap = getBufferStrategy();
        if (buffer == null) {
            createBufferStrategy(2);
            return;
        }

        g = buffer.getDrawGraphics();
        //Paint here
        Dupla newDupla = new Dupla(column, row);
        picture.deletePeric(newDupla, g);
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
