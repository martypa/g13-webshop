package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Order;
import ch.hslu.edu.enapp.webshop.dto.PostFinanceResponse;
import ch.hslu.edu.enapp.webshop.dto.Purchase;

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



    public OrderingService() {
    }


    @Override
    public void submitNewOrder(Purchase purchase){

        purchase.setPurchaseID((new Random().nextInt()*-1));
        PostFinanceResponse response = postFinanceService.send(purchase.getPurchaseID(), purchase.getAmount());
        purchase.setPayID(response.getPAYID());
        purchaseService.submitNewPurchase(purchase);
        purchaseService.submitPurchaseItems(purchase);
    }



}
