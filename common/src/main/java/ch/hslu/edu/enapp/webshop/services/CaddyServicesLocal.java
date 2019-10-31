package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PurchaseItem;

import java.util.LinkedList;

public interface CaddyServicesLocal {
    void addProductToCaddy(String productName);

    LinkedList<PurchaseItem> getCaddyList();

    void removeProductFromCaddyList(String productName);

    void removeAllProductFromCaddy();

    public void addProductToCaddy(String productName, int quantity);
}
