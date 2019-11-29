package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Order;
import ch.hslu.edu.enapp.webshop.dto.PostFinanceResponse;
import ch.hslu.edu.enapp.webshop.dto.Purchase;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Random;
import java.util.UUID;

@Stateless
public class OrderingService implements OrderingServiceLocal {

    @Inject
    PostFinanceServiceLocal postFinanceService;

    @Inject
    PurchaseServiceLocal purchaseService;

    @Inject
    MessageServiceLocal messageService;

    @Inject
    OrderStatusServiceLocal orderStatusService;



    public OrderingService() {
    }


    @Override
    public boolean submitNewOrder(Purchase purchase){
        boolean statusOK = false;
        purchase.setPurchaseID((new Random().nextInt(1000000-0) + 0));
        PostFinanceResponse response = postFinanceService.send(purchase.getPurchaseID(), purchase.getAmount());
        if(response.getPAYID() != null) {
            purchase.setPayID(response.getPAYID());
            String correlationID = messageService.sendNewMessage(purchase);
            purchase.setCorrelationId(correlationID);
            purchaseService.submitNewPurchase(purchase);
            purchaseService.submitPurchaseItems(purchase);
            statusOK = true;
        }
        return statusOK;
    }



}
