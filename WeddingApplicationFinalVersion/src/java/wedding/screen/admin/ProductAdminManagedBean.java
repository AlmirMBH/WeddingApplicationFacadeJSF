package wedding.screen.admin;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.Product;
import wedding.entity.facade.ProductFacadeLocal;
import wedding.shoppingCart.ShoppingCartItem;

@Named
@SessionScoped
public class ProductAdminManagedBean implements Serializable {

    @Inject
    private ProductFacadeLocal productFacadeLocal;
    private List<ShoppingCartItem> shoppingCartItems;
    private Product product= new Product();

    public ProductAdminManagedBean() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> loadAll() {
        return productFacadeLocal.findAll();
    }

    public List<ShoppingCartItem> getShoppingCartItems() {
        return shoppingCartItems;
    }

    public void addProductToShoppingCart(Product product) {
        for (ShoppingCartItem shoppingCartItem : shoppingCartItems) {
            shoppingCartItem = new ShoppingCartItem(product);
            shoppingCartItems.add(shoppingCartItem);
        }
    }
    
    public String add() {
        this.productFacadeLocal.create(this.product);
        this.clear();
        return "adminProducts";
    }
    
    public void delete(Product product) {
        this.productFacadeLocal.remove(product);
    }
    
    public String edit(Product product) {
        this.product = product;
        return "editProduct";
    }
    
    public String edit() {
        this.productFacadeLocal.edit(this.product);
        this.product = new Product();
        return "adminProducts";
    }
    
    public void clear() {
        this.product.setName(null);
        this.product.setCode(null);
        this.product.setColor(null);
        this.product.setSize(null);
        this.product.setPrice(0);
    }
    
    
    
}
    

