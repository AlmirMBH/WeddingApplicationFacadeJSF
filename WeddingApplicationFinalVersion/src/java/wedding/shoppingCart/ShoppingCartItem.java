
package wedding.shoppingCart;

import java.io.Serializable;
import wedding.entity.Product;


public class ShoppingCartItem implements Serializable {
    
    private Product product;
    private Integer quantity;

    public ShoppingCartItem() {
    }

    public ShoppingCartItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ShoppingCartItem(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    
}
