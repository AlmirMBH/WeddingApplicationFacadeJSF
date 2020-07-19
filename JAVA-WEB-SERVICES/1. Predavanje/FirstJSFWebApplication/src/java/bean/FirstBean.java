
package bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "firstBean", eager = false)
@ViewScoped
public class FirstBean implements Serializable{
    
    // Dependency Injection secondBean (sadržaj) u firstBean
    @ManagedProperty(value = "#{secondBean}")
    private SecondBean secondBean;

    public FirstBean() {
    }

    public SecondBean getSecondBean() {
        return secondBean;
    }

    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }
    
    public String getMessageFromSecondBean(){
        return secondBean.getMessage();
    }
}
