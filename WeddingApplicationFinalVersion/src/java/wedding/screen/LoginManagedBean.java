package wedding.screen;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.Privilege;
import wedding.entity.User;
import wedding.entity.facade.LoginFacadeLocal;
import wedding.entity.facade.UserFacadeLocal;

@Named
@SessionScoped
public class LoginManagedBean implements Serializable {

    @Inject
    private LoginFacadeLocal loginFacadeLocal;

    private String username;
    private String password;
    private String message = "";

    public LoginManagedBean() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String login() {
        User user = loginFacadeLocal.login(username, password);
        Privilege privilege = user.getIdPrivilege();
        if (user == null) {
            message = "User doesn't exist";
            return "login";
        }

        if (privilege.getName().equalsIgnoreCase("admin")) {
            return "adminHome";
        } else if (privilege.getName().equalsIgnoreCase("user")) {
            return "index";
        } else {
            return "home";
        }
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login";

    }
}
