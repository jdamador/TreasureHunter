package pk.codeapp.methods;

import pk.codeapp.screen.CreateGame;

public class ControlCreateTable 
{
    private static CreateGame window;
    public  static void main(String args[])
    {
        startGame();
    }
    public static void startGame()
    {
        createWindow("Title");
    }
    public static void createWindow(String name)
    {
        window =new CreateGame(name);
    }
}
