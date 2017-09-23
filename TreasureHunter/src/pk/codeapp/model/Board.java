/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.model;

import java.io.Serializable;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Board implements Serializable{
    private int posX;
    private int posY;
    private int numPosicion;
    private Function function;
    // missing functions
    private Board sig, ant;
    
    public Board(int posX,int posY,int numPosicion,Function function){
        this.posX=posX;
        this.posY=posY;
        this.numPosicion=numPosicion;
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

    public int getNumPosicion() {
        return numPosicion;
    }

    public void setNumPosicion(int numPosicion) {
        this.numPosicion = numPosicion;
    }
    
}
