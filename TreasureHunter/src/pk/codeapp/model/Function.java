/*  * To change this license header, choose License Headers in Project Properties.  * To change this template file, choose Tools | Templates  * and open the template in the editor.  */ package pk.codeapp.model; /**  *  * @author Jose Pablo Brenes  */ public class Function {     private String functions;     private String color;     private Function sig;     public Function(String fuction, String color){         this.functions=fuction;         this.color=color;         sig=null;     }    public String getFuctions() {         return functions;     }     public void setFuctions(String fuctions) {         this.functions = fuctions;    }   public String getColor() {        return color;    }    public void setColor(String color) {         this.color = color;    }    public Function getSig() {         return sig;    }    public void setSig(Function sig) {         this.sig = sig;    }}