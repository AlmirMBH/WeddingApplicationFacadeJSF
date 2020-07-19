
package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean( name = "navigationBean", eager = true )
public class NavigationBean {
    
    // DI proslijeđuje se ime stranice iz login.xhtml forme "Uslovna navigacija"
    @ManagedProperty( value = "#{param.pageId}")
    private String pageId;

    public NavigationBean() {
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }    

    public String getPage() {
        return pageId;
    }
    
    public String showPage(){
        if("1".equals(pageId)){
            return "index";
        }else if("2".equals(pageId)){
            return "secondJSFPage";
        }else
        return "login";
    }
}
