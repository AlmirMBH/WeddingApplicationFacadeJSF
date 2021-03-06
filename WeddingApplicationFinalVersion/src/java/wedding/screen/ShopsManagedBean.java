
package wedding.screen;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import wedding.entity.Shops;
import wedding.entity.facade.ShopsFacadeLocal;

@Named
@SessionScoped
public class ShopsManagedBean implements Serializable{
    
    @Inject
    private ShopsFacadeLocal shopsFacadeLocal;
    Shops shop = new Shops();

    public ShopsManagedBean() {
    }

    public ShopsFacadeLocal getShopsFacadeLocal() {
        return shopsFacadeLocal;
    }

    public void setShopsFacadeLocal(ShopsFacadeLocal shopsFacadeLocal) {
        this.shopsFacadeLocal = shopsFacadeLocal;
    }    
    
    public List<Shops> findAll(){
    return shopsFacadeLocal.findAll();
    }
    
    public List<Shops> findCatering(){
    return shopsFacadeLocal.findCatering();
    }
    
    public List<Shops> findPhotoVideo(){
    return shopsFacadeLocal.findPhotoVideo();
    }
    
    public List<Shops> findDecorations(){
    return shopsFacadeLocal.findDecorations();
    }

    public Shops getShop() {
        return shop;
    }

    public void setShop(Shops shop) {
        this.shop = shop;
    }
    
    
}
