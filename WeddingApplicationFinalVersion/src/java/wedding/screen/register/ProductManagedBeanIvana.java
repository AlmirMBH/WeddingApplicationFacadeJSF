
package wedding.screen.register;


import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import wedding.entity.Product;
import wedding.entity.facade.ProductFacadeLocal;


@ManagedBean(name = "productManagedBeanIvana", eager = true)
@SessionScoped
public class ProductManagedBeanIvana implements Serializable {

    @EJB
    private ProductFacadeLocal productFacadeLocal;

    private Product product = new Product();

    public ProductManagedBeanIvana() {

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> findAll() {
        return productFacadeLocal.findAll();
    }

    public String add() {
        this.productFacadeLocal.create(this.product);
        this.clear();
        return "index";
    }

    public void delete(Product product) {
        this.productFacadeLocal.remove(product);

    }

    public String edit(Product product) {
        this.product = product;
        return "edit";
    }

    public String edit() {
        this.productFacadeLocal.edit(this.product);
        this.product = new Product();
        return "index";
    }

    public void clear() {
        this.product.setName(null);
        this.product.setCode(null);
        this.product.setColor(null);
        this.product.setSize(null);
        this.product.setPrice(0);
    }

}
