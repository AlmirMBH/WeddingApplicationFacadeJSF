
package wedding.screen.admin;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.Shops;
import wedding.entity.facade.ShopsFacadeLocal;

@Named
@SessionScoped
public class ShopsAdminManagedBean implements Serializable {
    
   @Inject
    private ShopsFacadeLocal shopsFacadeLocal;
    
    private Shops shop = new Shops();
    
    public ShopsAdminManagedBean() {
    }

    public Shops getShop() {
        return shop;
    }

    public void setShop(Shops shop) {
        this.shop = shop;
    }
    
    
    public  List<Shops> loadAll(){
    return shopsFacadeLocal.findAll();
    }
    
    
     public String add(){
        shopsFacadeLocal.create(shop);
        this.shop= new Shops();
        return"adminShops";
    }
    
    public void delete(Shops shop){
       shopsFacadeLocal.remove(shop);
    }
    
    public String edit(Shops shop){
        return "editShop";
    }
    
    public String edit(){
        shopsFacadeLocal.edit(shop);
        return "adminShops";
    }
}


