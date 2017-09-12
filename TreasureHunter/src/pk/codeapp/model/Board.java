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
    private Function function;
    // missing functions
    private Board sig, ant;
    
    public Board(int posX,int posY,Function function){
        this.posX=posX;
        this.posY=posY;
        this.function=function;
        sig=ant=null;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
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
