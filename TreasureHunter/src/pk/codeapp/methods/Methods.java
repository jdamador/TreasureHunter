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
import javax.swing.ImageIcon;
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

    ImageIcon icon = new ImageIcon("src/pk/codeapp/tools/alert.png");

    public boolean add_User(String name, String userName, String email, String password, String rol)
    { //Cheack border sig
        if (isValidEmailAddress(email) == true) {
            newUser = new User(name, userName, email, password, rol);
            if (end == null) {
                root = end = newUser;
                end.setSig(newUser);
                root.setAnt(end);
                
                return true;
            } else {
                if(searchUser(userName)!=null){
                     end.setSig(newUser);
                    newUser.setAnt(end);
                    end=newUser;
                    root.setAnt(end);
                    end.setSig(root);
                    return true;
                }
            }
        } else {
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

    public void writeUser() // Methods to save users in binaryfile
    {
        User reco = root;
        FileOutputStream file = null;
        ObjectOutputStream output = null;
        do {
            try {
                file = new FileOutputStream(namefile, true);
                output = new ObjectOutputStream(file);
                output.writeObject(reco);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (file != null) {
                    try {
                        file.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (output != null) {
                    try {
                        file.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
          reco=reco.getSig();
        }while(reco!=root);
        
    
    
}

//<editor-fold desc="getter and setter" defaultstate="collapsed">
public ImageIcon getIcon()
    {
        return icon;
    }

    public void setIcon(ImageIcon icon)
    {
        this.icon = icon;
    }
//</editor-fold>

    public void chargeUsers()
    {
        try {
            FileInputStream saveFile = new FileInputStream(namefile);
            ObjectInputStream save;
            try {
                save = new ObjectInputStream(saveFile);
                end = (User) save.readObject();
            } catch (EOFException e) {
                //e.printStackTrace();
            }
            saveFile.close();
        } catch (Exception exc) {
        }
        //

        if (end != null) {
            User reco = end;
            do{
                 reco = reco.getAnt();
            }
            while (reco!= end) ;
               
            
            root = reco;
        }
    }

    public User searchUser(String userName)
    {
        if(end==null){
            return null;
        }else{
            User searchUser=end;
            do{
                if(searchUser.getUserName().equals(userName)){
                    return searchUser;
                }
                searchUser= searchUser.getAnt();
            }while(searchUser!=end);
            return null;
        }
    }

}
