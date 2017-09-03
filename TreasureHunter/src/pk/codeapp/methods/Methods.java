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
public class Methods
{

    private User root, end;
    private User newUser;

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
        return false;
    }

    public boolean isValidEmailAddress(String email)
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"; // Email Pattern 
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern); // Compile Email
        java.util.regex.Matcher m = p.matcher(email); // Check for that same pattern
        return m.matches();
    }

    public void writeUser(User newUser) // Methods to save users in binaryfile
    {
        String namefile = "users.dat";
        try {
            FileOutputStream outFile = new FileOutputStream(namefile);
            ObjectOutputStream objectOut = new ObjectOutputStream(outFile);
            if (readUser(newUser.getUserName()) == null) {
                objectOut.writeObject(newUser);
                objectOut.writeObject(null);
                objectOut.close();
                System.out.println("Se ha agregado con exito");
            } else {
                objectOut.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("¡El fichero no existe!");
        } catch (IOException e) {
            System.out.println("entro1");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("entro2");
            System.out.println(e.getMessage());
        }
    }

    public User readUser(String userName)
    { // Methods to read users in binaryfile and return object user
        String namefile = "users.dat";

        try {
            FileInputStream inFile = new FileInputStream(namefile);
            ObjectInputStream inObject = new ObjectInputStream(inFile);
            User readUser = (User) inObject.readObject();
            
            while (readUser != null) {
                System.out.println("Estuve aqui!");
                if (readUser.getUserName().equalsIgnoreCase(userName)) {
                    inObject.close();
                    return readUser;
                } else {
                    readUser = (User) inObject.readObject();
                   
                }
            }
            inObject.close();
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
