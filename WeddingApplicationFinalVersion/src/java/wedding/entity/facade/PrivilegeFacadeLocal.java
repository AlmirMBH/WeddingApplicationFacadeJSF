
package wedding.entity.facade;

import java.util.List;
import javax.ejb.Local;
import wedding.entity.Privilege;

@Local
public interface PrivilegeFacadeLocal {
    
    public Privilege find(String name);

    void create(Privilege privilege);

    void edit(Privilege privilege);

    void remove(Privilege privilege);

    Privilege find(Object id);
    
    public Privilege find();

    List<Privilege> findAll();

    List<Privilege> findRange(int[] range);

    int count();
   
    
    
}
