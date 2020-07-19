package bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "pozdravniBean1")
@Dependent
public class HelloWorld1 {

    public HelloWorld1() {
    }
    
    public String getMessage(){
        return "ManagedBean-a kreiran u skladu sa javax.annotation";
    }
    
    
}
