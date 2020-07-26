
package wedding.entity.facade;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import wedding.entity.Product;

@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeLocal {

    @PersistenceContext(unitName = "WeddingApplicationFinalVersionPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public ProductFacade() {
        super(Product.class);
    }
    
    @Override
        public List<Product> getAllProducts() {
        try {
            Query query = entityManager.createNamedQuery("Product.findAll");
            return query.getResultList();
        } catch (Exception exception) {
            exception.printStackTrace();
            return Collections.emptyList();
        }
    }
    
}
