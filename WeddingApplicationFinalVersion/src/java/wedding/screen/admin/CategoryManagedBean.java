package wedding.screen.admin;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.Category;
import wedding.entity.facade.CategoryFacadeLocal;

@Named
@SessionScoped
public class CategoryManagedBean implements Serializable {

    @Inject
    private CategoryFacadeLocal categoryFacadeLocal;
    

    public CategoryManagedBean(CategoryFacadeLocal categoryFacadeLocal) {
        this.categoryFacadeLocal = categoryFacadeLocal;
    }

    public CategoryManagedBean() {
    }

    public CategoryFacadeLocal getCategoryFacadeLocal() {
        return categoryFacadeLocal;
    }

    public void setCategoryFacadeLocal(CategoryFacadeLocal categoryFacadeLocal) {
        this.categoryFacadeLocal = categoryFacadeLocal;
    }

}
