/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import pk.codeapp.model.Function;
import pk.codeapp.model.User;

/**
 *
 * @author Jose Pablo Brenes
 */
public class Methods
{

    private User root, end;
    private User newUser;
    private Function rootFunction=null;
    
    private User actualUser;

    private File userFile = new File("src/pk/codeapp/tools/user.ser");

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
                if (searchUser(userName) == null) {
                    end.setSig(newUser);
                    newUser.setAnt(end);
                    end = newUser;
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

    public boolean isValidEmailAddress(String email)  // email format checker
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"; // Email Pattern 
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public void writeUser() // Methods to save users in binaryfile
    {
        if (userFile.exists()) {
            userFile.delete();
            System.out.println("Deleted");
        }

        User reco = root;
        FileOutputStream file = null;
        ObjectOutputStream output = null;
        do {
            try {
                file = new FileOutputStream(userFile, true);
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
            reco = reco.getSig();
        } while (reco != root);

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

    public void chargeUsers() // method that chage user from binary file
    {

        try {
            FileInputStream saveFile = new FileInputStream(userFile);
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
            do {
                reco = reco.getAnt();
            } while (reco != end);

            root = reco;
        }
    }

    public User searchUser(String userName)
    {
        if (end == null) {
            return null;
        } else {
            User searchUser = end;
            do {
                if (searchUser.getUserName().equals(userName)) {
                    return searchUser;
                }
                searchUser = searchUser.getAnt();
            } while (searchUser != end);
            return null;
        }
    }

    public void updateUser(String name, String Username, String Password, String email)
    {
        actualUser.setEmail(email);
        actualUser.setName(name);
        actualUser.setPassword(Password);
        actualUser.setUserName(Username);

    }

    public User getActualUser()
    {
        return actualUser;
    }

    public void setActualUser(User actualUser)
    {
        this.actualUser = actualUser;
    }

    public boolean addFunction(String name, String color)
    {
        Function  newFunction = new Function(name, color);
        if (rootFunction == null) {
            rootFunction = newFunction;
            return true;
        } else {
            newFunction.setSig(rootFunction);
            rootFunction = newFunction;
            return true;
        }
        
    }
}
