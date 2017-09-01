/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.codeapp.methods;

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
                return true;
            }else{
                newUser.setSig(end);
                end.setAnt(newUser);
                root.setSig(newUser);
                newUser.setAnt(root);
                end=newUser;
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
}
