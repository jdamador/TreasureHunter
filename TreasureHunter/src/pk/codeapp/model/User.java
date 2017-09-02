package pk.codeapp.model;

/**
 *
 * @author Jose Pablo Brenes
 */
public class User implements java.io.Serializable{
    private String name;
    private String userName;
    private String email;
    private String password;
    private String rol; // Admin or Player
    private User sig,ant;
    private Board gameSig;
    
    public User(String name,String userName,String email,String password,String rol){
        this.name=name;
        this.userName=userName;
        this.email=email;
        this.password=password;
        this.rol=rol;
        sig=ant=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getSig() {
        return sig;
    }

    public void setSig(User sig) {
        this.sig = sig;
    }

    public User getAnt() {
        return ant;
    }

    public void setAnt(User ant) {
        this.ant = ant;
    }

    public Board getGameSig() {
        return gameSig;
    }

    public void setGameSig(Board gameSig) {
        this.gameSig = gameSig;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
