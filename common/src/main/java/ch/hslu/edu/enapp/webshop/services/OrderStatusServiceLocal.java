package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.SalesOrderStatus;

import javax.ejb.Local;

@Local
public interface OrderStatusServiceLocal {
    SalesOrderStatus getSalesOrderStatus(String correlationID);
}
