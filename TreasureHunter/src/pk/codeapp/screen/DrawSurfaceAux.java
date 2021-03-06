
package pk.codeapp.screen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import pk.codeapp.methods.Dupla;
import pk.codeapp.model.Board;
import pk.codeapp.screen.MainApp;
import pk.codeapp.screen.SelectToken;
/**
 * Draw Surface to View Blocks in the Play Game
 */
public class DrawSurfaceAux extends JPanel
{
    
    String stringPosition; 
    private int size = 80;
    String tokens[] = SelectToken.getTokens(); //List of all tokens
    
    public DrawSurfaceAux()
    {
        this.setBounds(0, 0, 800, 800);
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
       
    }
    public DrawSurfaceAux(int size){
        this.size=size;
      
         this.setBounds(0, 40,643, 643);
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
    }
    
    
    /**
     * Principal methods to Paint blocks
     * @param g 
     */
    public void paint(Graphics g)
    {
        
        Board reco = MainApp.methods.getMapSelected();
        super.paint(g);
        while (reco != null) {

            if (reco.getNumPosicion() == -1) {
                stringPosition = "Start";
            } else if (reco.getNumPosicion() == -2) {
                stringPosition = "End";
            } else {
                stringPosition = "" + reco.getNumPosicion();
            }
            java.awt.Color color = MainApp.methods.getColor(reco.getFunction().getColor());
          
            g.setColor(color);
            Dupla pos = new Dupla(reco.getPosX(), reco.getPosY());
            g.fillRect((int) calculatePosition(pos).getPosX(), (int) calculatePosition(pos).getPosY(), size, size);
            g.setColor(java.awt.Color.BLACK);
            g.drawRect((int) calculatePosition(pos).getPosX(), (int) calculatePosition(pos).getPosY(), size, size);
            g.setFont(new Font("Vendara", Font.PLAIN, 15));
            g.drawString(stringPosition + "", (int) calculatePosition(pos).getPosX() + 3, (int) calculatePosition(pos).getPosY() + 12);

            reco = reco.getSig();
        }  
    }
    /**
     * Calculate dupla to change number of matrix in x and y
     * @param pos
     * @return Dupla
     */
    public Dupla calculatePosition(Dupla pos)
    {
        int x = (int) (pos.getPosX() * size + 0.0);
        int y = (int) (pos.getPosY() * size + 0.0);
        return new Dupla(x, y);
    }
}
