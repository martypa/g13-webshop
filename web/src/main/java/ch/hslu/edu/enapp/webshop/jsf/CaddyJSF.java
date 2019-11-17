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

    public void addProductToCaddy(String productNo){
        caddyService.addProductToCaddy(productNo);
    }

    public void addProductToCaddyWithQuantity(String productname, int quantity){
        caddyService.addProductToCaddy(productname,quantity);
    }

    public LinkedList<PurchaseItem> getCaddyList(){
        return caddyService.getCaddyList();
    }

    public void removeProductFromCaddyList(String productNo){
        caddyService.removeProductFromCaddyList(productNo);
    }

    public void removeAllProducts(){
        caddyService.removeAllProductFromCaddy();
    }

    public boolean isNotEmpty(){
        return !caddyService.getCaddyList().isEmpty();
    }

}
