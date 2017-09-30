package pk.codeapp.screen;

import javax.swing.JFrame;
import pk.codeapp.methods.Methods;

public class ControlCreateTable // Controller to Open the Create Game
{

    private static JFrame beforeWindows;
    private static CreateGame window;
    public void beforeWindows(JFrame afterWindows){ //Give the before windows 
        this.beforeWindows=afterWindows;
    }
    public  static void main(String args[])
    {
        window= new CreateGame("Create Map",beforeWindows); //Start Windows Create Game
    }
}
