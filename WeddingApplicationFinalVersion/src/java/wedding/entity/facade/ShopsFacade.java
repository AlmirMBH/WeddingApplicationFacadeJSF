
package wedding.entity.facade;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import wedding.entity.Shops;


@Stateless
public class ShopsFacade extends AbstractFacade<Shops> implements ShopsFacadeLocal {

    @PersistenceContext(unitName = "WeddingApplicationFinalVersionPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public ShopsFacade() {
        super(Shops.class);
    }
    
        public List<Shops> findAll() {
        try {
            Query query = entityManager.createNamedQuery("Shops.findAll");
            return query.getResultList();
        } catch (Exception exception) {
            exception.getMessage(); //printStackTrace();
            // return new ArrayList<>();
            return Collections.emptyList();
        }        
    }
    
}
