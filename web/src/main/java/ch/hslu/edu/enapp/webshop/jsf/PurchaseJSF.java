package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.Purchase;
import ch.hslu.edu.enapp.webshop.services.PostFinanceServiceLocal;
import ch.hslu.edu.enapp.webshop.services.PurchaseServiceLocal;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;


@RequestScoped
@Named
public class PurchaseJSF{


    @Inject
    UserSessionJSF user;
    @Inject
    PurchaseServiceLocal purchaseService;
    @Inject
    CaddyJSF caddy;
    @Inject
    PostFinanceServiceLocal postFinanceService;

    private boolean empty = true;

    public String submitPurchase(){
       /* if(caddy.getCaddyList().isEmpty()){
            this.empty = true;
            return "/failPurchase";
        }else {
            this.empty = false;
            Purchase purchase = new Purchase(
                    user.getUsername(),
                    new Timestamp(System.currentTimeMillis()),
                    "Registriert",
                    caddy.getCaddyList()
            );

            int i = purchaseService.submitNewPurchase(purchase);
            purchaseService.submitPurchaseItems(purchase, i);
            caddy.removeAllProducts();*/
            this.postFinanceService.send();
            return "/index";

    }

    public boolean getEmpty(){
        return this.empty;
    }


}
