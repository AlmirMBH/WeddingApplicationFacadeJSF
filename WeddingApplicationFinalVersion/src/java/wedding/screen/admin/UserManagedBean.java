
package wedding.screen.admin;

import java.io.Serializable;
import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.User;
import wedding.entity.facade.UserFacadeLocal;

@Named
@ViewScoped
public class UserManagedBean implements Serializable{
    
    @Inject
    private UserFacadeLocal userFacadeLocal;
    private User user= new User();
    private String username;
    private String password;
    private boolean loggedIn;

    public UserManagedBean() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
     public List<User> loadAll() {
        return userFacadeLocal.findAll();
    }    
    
     public void add(){
        userFacadeLocal.create(user);
        this.user= new User();
    }
    
    public void delete(User user){
        userFacadeLocal.remove(user);
    }
    
    public String edit(User user){
        return "editUser";
    }
    
    public String edit(){
        userFacadeLocal.edit(user);
        return "adminUsers";
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String loginSession(){                
        if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
            loggedIn = true;
            return "index";
        }
        return null;        
    }

    public void logout(){
        loggedIn = false;
    }
}
