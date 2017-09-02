/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import pk.codeapp.model.User;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Methods {
    private User root,end;
    private User newUser;
   
    
    public boolean add_User(String name,String userName,String email,String password,String rol){ //Cheack border sig
        if(isValidEmailAddress(email)==true){
            newUser=new User(name, userName, email, password, rol);
            if(root==null){
                root =end= newUser;
                writeUser(newUser); // add to BinaryFile
                return true;
            }else{
                newUser.setSig(end);
                end.setAnt(newUser);
                root.setSig(newUser);
                newUser.setAnt(root);
                end=newUser;
                writeUser(newUser);
                return true;
            }
        }
        return false;
    }
    public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"; // Email Pattern 
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern); // Compile Email
           java.util.regex.Matcher m = p.matcher(email); // Check for that same pattern
           return m.matches();
    }
    public  void writeUser(User newUser) // Methods to save users in binaryfile
    {
        String namefile = "/pk.codeapp.tools/users.dat";
        try 
        {
            FileOutputStream outFile = new FileOutputStream(namefile);
            ObjectOutputStream objectOut = new ObjectOutputStream(outFile);
            // se escriben dos objetos de la clase Persona
            objectOut.writeObject(newUser);
            objectOut.close();
            System.out.println("Se ha agregado con exito");
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) 
        {
            System.out.println(e.getMessage());
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    public User readUser(){
        String namefile = "/pk.codeapp.tools/users.dat";
        try {
            FileInputStream ficheroEntrada = new FileInputStream(namefile);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            User User;
            // se leen dos objetos de la clase Persona
            return User readUser = (User)objetoEntrada.readObject();
            // se cierra el flujo de objetos objetoEntrada
            objetoEntrada.close();
            System.out.println("DNI\t Nombre");
            System.out.println(p1);
            System.out.println(p2);
            } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
            System.out.println(e.getMessage());
            } catch (Exception e) {
            System.out.println(e.getMessage());
            };
        return null;
    }
    
    
}
