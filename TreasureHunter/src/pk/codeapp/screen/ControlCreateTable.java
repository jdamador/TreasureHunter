package pk.codeapp.screen;

import javax.swing.JFrame;
import pk.codeapp.methods.Methods;

public class ControlCreateTable 
{

    private static JFrame beforeWindows;
    private static CreateGame window;
    public void beforeWindows(JFrame afterWindows){
        this.beforeWindows=afterWindows;
    }
    public  static void main(String args[])
    {
        window= new CreateGame("Create Map",beforeWindows);
    }
}
