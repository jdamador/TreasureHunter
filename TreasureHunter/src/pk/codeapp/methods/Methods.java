/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
    private String namefile = "user.ser";
    ArrayList<User> array= new ArrayList();

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
           FileOutputStream file= null;
           ObjectOutputStream output =null;
           try{
               file = new FileOutputStream(namefile,true);
               output = new ObjectOutputStream(file);
               output.writeObject(newUser);
               System.out.println("Done");
               return true;
           }
           catch(Exception ex){
               ex.printStackTrace();
           }finally{
               if(file!=null){
                   try {
                       file.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
               if(output !=null){
                   try {
                      file.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                   
                   
               }
           }
        
        
        return false;
    }

public User readUser(String userName){
    User  reco=null;
    try{
            
            FileInputStream saveFile = new FileInputStream(namefile);
            ObjectInputStream save;
            try{
                while(true){
                    save = new ObjectInputStream(saveFile);
                    reco = (User) save.readObject();
                    System.out.println("Aqui");
                    if(reco.getUserName().equalsIgnoreCase(userName)){
                        System.out.println(reco.getUserName());
                        return reco;
                    }
                   
                    
                }
            }catch(EOFException e){
                //e.printStackTrace();
            }
            saveFile.close(); 

        }catch(Exception exc){
           
        }
      return reco;
}
}