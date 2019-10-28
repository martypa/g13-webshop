package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Purchase;

public interface PurchaseServiceLocal {
    int submitNewPurchase(Purchase purchase);

    void submitPurchaseItems(Purchase purchase, int purchaseNr);

    Purchase getPurchaseByCustomerName(String customerName);
}
