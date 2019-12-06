package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Customer;

import javax.ejb.Local;
import java.util.List;

@Local
public interface CustomerServiceLocal {
    Customer getCustomerByLoginName(String loginName);

    Customer getCustomerbyDynNO(String dynNo);

    void updateDynNo(String dynNo, String loginName);

    void addNewCustomer(Customer customer, String password);

    void addUserRole(String userName);

    void updateCustomer(Customer customer, String password);

    List<Customer> getAllCustomer();

    String getRoleByCustomerName(String customerLoginName);
}
