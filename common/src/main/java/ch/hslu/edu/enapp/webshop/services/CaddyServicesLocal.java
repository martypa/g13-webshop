package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PurchaseItem;

import java.util.LinkedList;

public interface CaddyServicesLocal {
    void addProductToCaddy(String productNo);

    LinkedList<PurchaseItem> getCaddyList();

    void removeProductFromCaddyList(String productNo);

    void removeAllProductFromCaddy();

    public void addProductToCaddy(String productName, int quantity);
}
