
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "secondBean", eager = true)
@ViewScoped
public class SecondBean implements Serializable{
    
    private String message = "SecondBean";

    public SecondBean() {
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getMessage(){
        return message;
    }
}
