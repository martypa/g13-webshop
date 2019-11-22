package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PurchaseItem;

import javax.ejb.Local;
import java.util.LinkedList;

@Local
public interface CaddyServicesLocal {
    void addProductToCaddy(String productNo);

    LinkedList<PurchaseItem> getCaddyList();

    void removeProductFromCaddyList(String productNo);

    void removeAllProductFromCaddy();

    void addProductToCaddy(String productName, int quantity);
}
