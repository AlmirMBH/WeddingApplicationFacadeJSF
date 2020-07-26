package wedding.screen.admin;


import java.io.Serializable;
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

    public List<wedding.entity.Product> loadAll() {
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
    
    public String add(){
        productFacadeLocal.create(product);
        this.product= new Product();
        return"adminProducts";
    }
    
    public void delete(Product product){
        productFacadeLocal.remove(product);
    }
    
    public String edit(Product product){
        this.product = product;
        return "editProduct";
    }
    
    public String edit(){
        productFacadeLocal.edit(product);
        return "adminProducts";
    }
}
    

