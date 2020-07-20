
package beans;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userManagedBean", eager = true)
@SessionScoped
public class UserManagedBean implements Serializable{
    
    private String username;
    private String password;
    private boolean loggedIn;
    private Date date;
    private Number number;

    public UserManagedBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }    

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
    
    
    
    
    
    
    
    public String login(){
        // Validacija
        if("admin".equals(username) && "Admin1!".equals(password)){
            loggedIn = true;
            return "products";
        }else
            return "index";
    }
    
    public void logout(){
        loggedIn = false;
    }
    
    public String getMessage(){
        return "UserManagedBean";
    }
    
}
