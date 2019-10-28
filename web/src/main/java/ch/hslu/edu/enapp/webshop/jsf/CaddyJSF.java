package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.PurchaseItem;
import ch.hslu.edu.enapp.webshop.services.CaddyServicesLocal;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

@Named
@RequestScoped
public class CaddyJSF {

    @Inject
    private CaddyServicesLocal caddyService;

    public void addProductToCaddy(String productName){
        caddyService.addProductToCaddy(productName);
    }

    public LinkedList<PurchaseItem> getCaddyList(){
        return caddyService.getCaddyList();
    }

    public void removeProductFromCaddyList(String productName){
        caddyService.removeProductFromCaddyList(productName);
    }

    public void removeAllProducts(){
        caddyService.removeAllProductFromCaddy();
    }

    public boolean isNotEmpty(){
        return !caddyService.getCaddyList().isEmpty();
    }

}
