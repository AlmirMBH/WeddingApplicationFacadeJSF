
package wedding.entity.facade;

import java.util.List;
import javax.ejb.Local;
import wedding.entity.Shops;

@Local
public interface ShopsFacadeLocal {

    void create(Shops shops);

    void edit(Shops shops);

    void remove(Shops shops);

    Shops find(Object id);

    List<Shops> findAll();

    List<Shops> findRange(int[] range);

    int count();
    
}
