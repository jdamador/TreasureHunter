/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;


import java.awt.Color;
import java.io.BufferedReader;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultListModel;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import pk.codeapp.model.Board;
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
    private Function rootFunction;
    private Function pointerAux;
    private User actualUser;
    private Color color;
    private File userFile = new File("src/pk/codeapp/tools/user.ser");
    File tokenFile = new File("src/pk/codeapp/tools/tokens.txt");
    private boolean activePaint;
    private String specialFunction = "";
    String tokens[] = new String[4];
    private Board mapSelected;
    DefaultListModel<String> showUser = new DefaultListModel();
    User showActual;

    ImageIcon icon = new ImageIcon("src/pk/codeapp/tools/alert.png");

    public Methods()
    {
        root = end = null;
        rootFunction = null;

    }
    /**
     * Add user 
     * @param name
     * @param userName
     * @param email
     * @param password
     * @param rol
     * @return 
     */
    public boolean addUser(String name, String userName, String email, String password, String rol)
    { //Cheack border sig
        //this method return true or false when the operation is successful or fail.
        if (isValidEmailAddress(email) == true) {
            //Create a new user instance
            newUser = new User(name, userName, email, password, rol);
            if (end == null) {
                //linkending when array is empty 
                root = newUser;
                end = newUser;
                end.setSig(root);
                root.setAnt(end);

                return true;
            } else {
                //likending when has elements
                if (searchUser(userName) == null) {
                    end.setSig(newUser);
                    newUser.setAnt(end);
                    end = newUser;
                    end.setSig(root);
                    root.setAnt(end);
                    return true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Format wrong mail format!!!");
            return false;
        }
        return false;

    }

    /**
     * Method that verify if email format is valid
     * @param email
     * @return 
     */
    public boolean isValidEmailAddress(String email) // email format checker
    {
        //Return true or false when email is valid or wrong
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"; // Email Pattern 
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public void writeUser() // Methods to save users in binaryfile
    {
        //write user in binary file

        if (userFile.exists()) {
            //clean file
            userFile.delete();
            System.out.println("Deleted");
        }

        User reco = root; //Intance temporary that save the read line
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

    public User getActualUser()
    {
        return actualUser;
    }

    public void setActualUser(User actualUser)
    {
        this.actualUser = actualUser;
      
    }

    public Board getMapSelected() {
        return mapSelected;
    }

    public void setMapSelected(Board mapSelected) {
        this.mapSelected = mapSelected;
    }
    
    public Function getRootFunction()
    {
        return rootFunction;
    }

    public boolean getActivePaint()
    {
        return activePaint;
    }

    public void setActivePaint(boolean activePaint)
    {
        this.activePaint = activePaint;
    }

    public String getSpecialFunction()
    {
        return specialFunction;
    }

    public void setSpecialFunction(String specialFunction)
    {
        this.specialFunction = specialFunction;
    }

    public Board getRootBoard()
    {
        return actualUser.getGameSig();
    }
    
    public User getShowActual() {
        return showActual;
    }

    public void setShowActual(User showActual) {
        this.showActual = showActual;
    }

    public void setRootBoard(Board newRootBoard)
    {
        actualUser.setGameSig(newRootBoard);
    }
    public String[] getTokens()
    {
        return tokens;
    }

    public boolean setToken(String token)
    {

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == null) {
                tokens[i] = token;
                System.out.println(tokens[i]);
                return true;
            } else {
                if (token.equals(tokens[i])) {
                    return false;
                }
            }
        }
        return false;
    }

    public File getTokenFile()
    {
        return tokenFile;
    }

//</editor-fold>
    /**
     *  method that chage user from binary file
     */
    public void chargeUsers() 
    {
        //Read user from binary file
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
            root = end.getSig();
            showActual = root;
        }

    }
    /**
     * Methods to search user with name
     * @param userName
     * @return User
     */
    public User searchUser(String userName)
    {
        //Search a user in the binary file
        /*
        *@Return the user when this is found or null when this is not
         */
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

    /**
     * add new element to board
     *
     * @param column
     * @param row
     * @param numPosition
     * @param function
     * @return true or false when operation is successful
     */
    public boolean addBoard(int column, int row, int numPosition, Function function)
    {
        Board newblock = new Board(column, row, numPosition, function);
        newblock.setSig(null);
        if (actualUser.getGameSig() == null) {
            actualUser.setGameSig(newblock);
            return true;
        } else {
            newblock.setSig(actualUser.getGameSig());
            actualUser.getGameSig().setAnt(newblock);
            actualUser.setGameSig(newblock);
            return true;
        }
    }

    /**
     * Create new function
     *
     * @param name
     * @param color
     * @return true or false when operation is successful
     */
    public boolean addFunction(String name, String color)
    {
        Function newFunction = new Function(name, color);
        if (rootFunction == null) {
            rootFunction = newFunction;
            System.out.println("rootFunction=" + rootFunction.getColor());
            return true;
        } else {
            newFunction.setSig(rootFunction);
            rootFunction = newFunction;
            return true;
        }
    }

    /**
     * Delete user from the array
     *
     * @param username
     */
    public void deleteUser(String username)
    {
        if (root == null) {
            root = null;
        } else {
            if (root.getUserName().equals(username)) {
                root = root.getSig();
                root.setAnt(end);
                JOptionPane.showMessageDialog(null, "Deleted!");
            } else {
                if (end.getUserName().equals(username)) {
                    end = end.getAnt();
                    end.setSig(root);
                    JOptionPane.showMessageDialog(null, "Deleted!");
                } else {
                    User find = searchUser(username);
                    if (find != null) {
                        find.getAnt().setSig(find.getSig());
                        find.getSig().setAnt(find.getAnt());
                        JOptionPane.showMessageDialog(null, "Deleted!");
                    } else {
                        JOptionPane.showMessageDialog(null, "User don't exist");
                    }
                }
            }

        }
    }

    /**
     * Write in text file
     *
     * @param file
     * @param data
     */
    public void writeInTextFile(File file, String[] data)
    {
        //<editor-fold desc="Delete file" defaultstate="collapsed">
        if (file.exists()) {
            //clean file
            file.delete();
            System.out.println("Deleted");
        }
        //</editor-fold>
        try {
            FileWriter writer = new FileWriter(tokenFile);
            for (int i = 0; i < data.length; i++) {
                if (null != data[i]) {
                    writer.write(data[i]);
                    writer.write("\r\n");   // write new line
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromTextFile(File file, String[] arrayFinite)
    {
        try {

            BufferedReader data = new BufferedReader(new FileReader(file));
            String text;
            int i = 0;
            while ((text = data.readLine()) != null) {
                arrayFinite[i] = text;
                i++;
            }
        } catch (Exception e) {
            System.out.println("fail to read");
        }
    }
/**
 * Methods to know Color
 * @param color
 * @return Color
 */
    public Color getColor(String color)
    { // Methods to get Color through String 
        switch (color) {
            case "blue":
                return Color.blue;
            case "red":
                return Color.red;
            case "green":
                return Color.green;
            case "yellow":
                return Color.yellow;
            case "orange":
                return Color.orange;
            case "pink":
                return Color.pink;
            case "magenta":
                return Color.magenta;
            case "cyan":
                return Color.cyan;

        }
        return null;
    }

    public void setTokens(String[] tokens)
    {
        this.tokens = tokens;
    }
   /**
    * Print User
    * @param type
    * @return 
    */
    public DefaultListModel printUser(int type)
    {
        showUser.clear();
        if (end != null) {
            switch (type) {
                case 1: { //Show start
                    showActual = root;

                    break;
                }
                case 2: {//Show end
                    showActual = end;
                    break;
                }
                case 3: {//Show back
                    showActual = showActual.getAnt();
                    break;
                }
                case 4: { //Show ahead
                    showActual = showActual.getSig();
                    break;
                }

            }
            showUser.addElement("Name:\n\t\t\t\t\t " + showActual.getName());
            showUser.addElement("UserName:\n\t\t\t\t\t " + showActual.getUserName());
        }
        return showUser;

    }

}
