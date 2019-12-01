package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.Purchase;
import ch.hslu.edu.enapp.webshop.dto.SalesOrderStatus;
import ch.hslu.edu.enapp.webshop.services.OrderStatusServiceLocal;
import ch.hslu.edu.enapp.webshop.services.PurchaseServiceLocal;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named
@RequestScoped
public class OrderStatusJSF {

    @Inject
    OrderStatusServiceLocal orderStatusService;
    @Inject
    PurchaseServiceLocal purchaseService;
    @Inject
    UserSessionJSF userSessionJSF;



    public List<SalesOrderStatus> getAllOrderStatus(){
        List<Purchase> purchaseList = purchaseService.getPurchaseByCustomerName(userSessionJSF.getUsername());
        List<SalesOrderStatus> salesOrderStatuses = new ArrayList<>();
        for (Purchase p:purchaseList) {
            salesOrderStatuses.add(orderStatusService.getSalesOrderStatus(p.getCorrelationId()));
        }
        return salesOrderStatuses;
    }



}
