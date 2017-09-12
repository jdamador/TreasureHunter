package pk.codeapp.screen;

import pk.codeapp.methods.Methods;

public class ControlCreateTable 
{
    private static Methods methods;
    private static CreateGame window;
    public void addMethod(Methods met){
        this.methods=met;
    }
    public  static void main(String args[])
    {
        window= new CreateGame("Create Map",methods);
    }
}
