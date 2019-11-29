package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Purchase;

public interface PurchaseServiceLocal {
    void submitNewPurchase(Purchase purchase);

    void submitPurchaseItems(Purchase purchase);

    Purchase getPurchaseByCustomerName(String customerName);

    void setCorrelationIdByPurchaseID(int purchaseID, String correlationID);
}
