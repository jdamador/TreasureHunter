/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Board {
    private int posX;
    private int posY;
    // missing functions
    private Board sig, ant;
    
    public Board(int posX,int posY){
        this.posX=posX;
        this.posY=posY;
        sig=ant=null;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Board getSig() {
        return sig;
    }

    public void setSig(Board sig) {
        this.sig = sig;
    }

    public Board getAnt() {
        return ant;
    }

    public void setAnt(Board ant) {
        this.ant = ant;
    }
    
}
