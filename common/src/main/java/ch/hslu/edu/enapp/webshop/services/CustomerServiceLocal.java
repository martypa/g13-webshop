package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Customer;

import javax.ejb.Local;

@Local
public interface CustomerServiceLocal {
    Customer getCustomerByLoginName(String loginName);

    Customer getCustomerbyDynNO(String dynNo);
}
