package wedding.screen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.Category;
import wedding.entity.Product;
import static wedding.entity.Product_.idCategory;
import wedding.entity.facade.CategoryFacadeLocal;
import wedding.entity.facade.ProductFacadeLocal;
import wedding.shoppingCart.ShoppingCartItem;

@Named
@SessionScoped
public class ProductManagedBean implements Serializable {

    @Inject
    private ProductFacadeLocal productFacadeLocal;
    private CategoryFacadeLocal categoryFacadeLocal;
    
    private Integer quantity;
    private List<ShoppingCartItem> shoppingCartItems = new ArrayList<>();
    private Category category;
    private Product product = new Product();
    
    public ProductManagedBean() {
    }

    public void addToCart(Product product) {
        for (ShoppingCartItem shoppingCartItem : shoppingCartItems) {
            if (shoppingCartItem.getProduct().getId() == product.getId()) {
                int newQuantity = shoppingCartItem.getQuantity() + quantity;
                shoppingCartItem.setQuantity(newQuantity);
                return;
            }
        }
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(product, quantity);
        shoppingCartItems.add(shoppingCartItem);
    }
    
    public String confirm(){
        return "buy";
    }

    public List<ShoppingCartItem> getShoppingCartItems() {
        return shoppingCartItems;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }   

    public List<Product> getAllDresses() {
        return productFacadeLocal.getAllDresses();        
    }
    
    public List<Product> getAllSuits() {
        return productFacadeLocal.getAllSuits();        
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
