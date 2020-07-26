
package wedding.entity.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import wedding.entity.Shops;

@Stateless
public class ShopsFacade extends AbstractFacade<Shops> implements ShopsFacadeLocal {

    @PersistenceContext(unitName = "WeddingApplicationFinalVersionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShopsFacade() {
        super(Shops.class);
    }
    
}
