package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Purchase;

import java.util.List;

public interface PurchaseServiceLocal {
    void submitNewPurchase(Purchase purchase);

    void submitPurchaseItems(Purchase purchase);

    List<Purchase> getPurchaseByCustomerName(String customerName);

    void setCorrelationIdByPurchaseID(int purchaseID, String correlationID);
}
