package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Purchase;

import javax.ejb.Local;

@Local
public interface OrderingServiceLocal {
    void submitNewOrder(Purchase purchase);
}
