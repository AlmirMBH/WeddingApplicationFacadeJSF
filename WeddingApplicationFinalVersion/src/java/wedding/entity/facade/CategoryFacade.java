
package wedding.entity.facade;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import wedding.entity.Category;

@Stateless
public class CategoryFacade extends AbstractFacade<Category> implements CategoryFacadeLocal {

    @PersistenceContext(unitName = "WeddingApplicationFinalVersionPU")
    private EntityManager entityManager;
    

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public CategoryFacade() {
        super(Category.class);
    }
    
    @Override
    public List<Category> findAll() {
        try {
            Query query = entityManager.createNamedQuery("Category.findAll");
            return query.getResultList();                    
        } catch (Exception exception) {
            exception.printStackTrace();
            return Collections.emptyList();
        }
    }
}
