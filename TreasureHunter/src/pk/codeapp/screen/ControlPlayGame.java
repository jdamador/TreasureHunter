/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.screen;

import javax.swing.JFrame;

/**
 *
 * @author Jose Pablo Brenes
 */
public class ControlPlayGame {
     private static JFrame beforeWindows;
    private static PlayGame window;
    public void beforeWindows(JFrame afterWindows){
        this.beforeWindows=afterWindows;
    }
    public  static void main(String args[])
    {
        window= new PlayGame("Play Map",beforeWindows);
    }
}
