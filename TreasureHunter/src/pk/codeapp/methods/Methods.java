
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import pk.codeapp.model.User;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Methods
{

    private User root, end;
    private User newUser;
    private String namefile = "users.dat";
    public boolean add_User(String name, String userName, String email, String password, String rol)
    { //Cheack border sig
        if (isValidEmailAddress(email) == true) {
            newUser = new User(name, userName, email, password, rol);
            if (root == null) {
                root = end = newUser;
                writeUser(newUser); // add to BinaryFile
                return true;
            } else {
                if (readUser(userName) == null) {
                    newUser.setSig(end);
                    end.setAnt(newUser);
                    root.setSig(newUser);
                    newUser.setAnt(root);
                    end = newUser;
                
                    writeUser(newUser);
                    return true;
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Format wrong mail format!!!");
            return false;
        }
        return false;
       
    }

    public boolean isValidEmailAddress(String email)
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"; // Email Pattern 
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern); // Compile Email
        java.util.regex.Matcher m = p.matcher(email); // Check for that same pattern
        return m.matches();
    }

    public boolean writeUser(User newUser) // Methods to save users in binaryfile
    {
        try 
        {
            FileOutputStream fileOut = new FileOutputStream(namefile);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            if(readUser(newUser.getUserName())==null){
  
            objectOut.writeObject(newUser);
            objectOut.close();
            System.out.println("finalizado");
            
            
            }
        }
        
        catch (FileNotFoundException e) 
        {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) 
        {
            System.out.println("Exepcion 1");
            return true;
        } catch (Exception e) 
        {
            System.out.println("Exepcion 2");
            System.out.println(e.getMessage());
        }
        return false;
    }

public User readUser(String userName)
    { // Methods to read users in binaryfile and return object user
       User aux,running;
        try {
            FileInputStream inFile = new FileInputStream(namefile);
            ObjectInputStream inObject = new ObjectInputStream(inFile);
            
            aux = (User)inObject.readObject();
            running = aux;
            boolean reco=true;
            while(reco){
                System.out.println("Nombre del running "+running.getUserName());
                do{
                    
                if(aux.getUserName().equals(userName)){
                    inObject.close();
                   System.out.println("Son iguales");
                    return aux;
                }else{
                    System.out.println("Recorriendo");
                    System.out.println("Nombre de usuario: "+userName);
                    System.out.println("Usuario Actual"+aux.getUserName());
                    aux = aux.getAnt();
                }
            }while(aux!=running);reco=false;}
            
             inObject.close();
            } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
            } catch (IOException e) {
                System.out.println("Exepcion 1");
                
            } catch (Exception e) {
            System.out.println("Exepcion 2");
   
            };
        return null;
    }

}