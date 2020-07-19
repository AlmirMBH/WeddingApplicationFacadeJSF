package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "loginBean", eager = true)
public class LoginBean implements Serializable{

    public LoginBean() {
    }
    
    public String login(){
        // U ovu metodu ide logika logina: validacija username i passwordx        
        return "index";
    }
}
