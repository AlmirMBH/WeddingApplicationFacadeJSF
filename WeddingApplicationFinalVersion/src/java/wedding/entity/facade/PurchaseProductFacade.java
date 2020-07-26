
package wedding.entity.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import wedding.entity.PurchaseProduct;


@Stateless
public class PurchaseProductFacade extends AbstractFacade<PurchaseProduct> implements PurchaseProductFacadeLocal {

    @PersistenceContext(unitName = "WeddingApplicationFinalVersionPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public PurchaseProductFacade() {
        super(PurchaseProduct.class);
    }
    
    
}
