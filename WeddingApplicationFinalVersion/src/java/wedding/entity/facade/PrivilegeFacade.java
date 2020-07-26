package wedding.entity.facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import wedding.entity.Privilege;

@Stateless
public class PrivilegeFacade extends AbstractFacade<Privilege> implements PrivilegeFacadeLocal {

    @PersistenceContext(unitName = "WeddingApplicationFinalVersionPU")
    private EntityManager entityManager;

    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    public PrivilegeFacade() {
        super(Privilege.class);
    }
   
    @Override
    public Privilege find(){
        Query query = entityManager.createNamedQuery("Privilege.findByName");
        Privilege privilege = (Privilege) query.setParameter("user", query).getSingleResult();
        return privilege;
        
    }
    
}
