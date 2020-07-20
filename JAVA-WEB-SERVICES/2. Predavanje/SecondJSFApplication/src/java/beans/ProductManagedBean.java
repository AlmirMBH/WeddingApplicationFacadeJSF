
package beans;

import beans.model.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "productManagedBean", eager = true)
@ViewScoped
public class ProductManagedBean implements Serializable{
    
    // @EJB - povlačenje proizvoda iz baze
    // private ProductSessionBeanLocal productSessionBean;

    public ProductManagedBean() {
    }
    
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Toshiba", 1000));
        products.add(new Product(2, "LG", 1800));
        products.add(new Product(3, "Samsung", 1500));
        products.add(new Product(4, "Sony", 2400));
        return products;
    }
    
}
