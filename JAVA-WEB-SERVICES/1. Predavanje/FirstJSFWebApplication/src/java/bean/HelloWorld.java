
package bean;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

// Mi nećemo instancirati ovaj objekat, to će uraditi neki JSF kontejner.
// Kontejneru samo trebamo reći kako da zove taj objekat "name = 'pozdravniBean'", ako mi to ne
// navedemo po default-u će biti "helloWorld"
// Eager = true ili lazy - kreira se odmah prilikom startanja aplikacije ili tek kad treba tj. 
// kad se kontaktira povezana jsf stranica
// ManagedBean može imati anotacije (npr. @NoneScoped)

@ManagedBean(name = "pozdravniBean", eager = true)
// @NoneScoped
// @RequestScoped
// @ViewScoped
 @SessionScoped
// @ApplicationScoped
public class HelloWorld implements Serializable{
    
    // private String message = "Pozdrav iz ManagedBean-a";

    public HelloWorld() {
    }

    public String getMessage() {
        // return message;
        return "ManagedBean";
    }
        
    public int getHashCode(){
        return hashCode();
    }
}
