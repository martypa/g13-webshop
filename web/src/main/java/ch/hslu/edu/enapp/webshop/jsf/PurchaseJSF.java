package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.Purchase;
import ch.hslu.edu.enapp.webshop.dto.SalesOrderStatus;
import ch.hslu.edu.enapp.webshop.services.*;
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
    OrderingServiceLocal orderService;
    @Inject
    CaddyJSF caddy;
    @Inject
    OrderStatusServiceLocal orderStatusService;
    @Inject
    CustomerServiceLocal customerService;

    private boolean empty = true;

    public String submitPurchase() {
        if (caddy.getCaddyList().isEmpty()) {
            this.empty = true;
            return "/failPurchase";
        } else {
            this.empty = false;
            Purchase purchase = new Purchase(
                    user.getUsername(),
                    new Timestamp(System.currentTimeMillis()),
                    "Registriert",
                    caddy.getCaddyList()
            );

            boolean statusOK = orderService.submitNewOrder(purchase);

            if(statusOK){
                SalesOrderStatus status;
                do {
                    status = orderStatusService.getSalesOrderStatus(purchase.getCorrelationId());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while (status == null || status.getDynNAVCustomerNo() == null);
                customerService.updateDynNo(status.getDynNAVCustomerNo(), user.getUsername());
            }


            caddy.removeAllProducts();
            return "/index";
        }
    }


}
