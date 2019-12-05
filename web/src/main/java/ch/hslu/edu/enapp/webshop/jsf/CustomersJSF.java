package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.Customer;
import ch.hslu.edu.enapp.webshop.dto.Purchase;
import ch.hslu.edu.enapp.webshop.dto.SalesOrderStatus;
import ch.hslu.edu.enapp.webshop.services.CustomerServiceLocal;
import ch.hslu.edu.enapp.webshop.services.OrderStatusServiceLocal;
import ch.hslu.edu.enapp.webshop.services.PurchaseServiceLocal;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named
@RequestScoped
public class CustomersJSF {

    @Inject
    CustomerServiceLocal customerService;



    public List<Customer> getAllCustomers(){
        List<Customer> l =  customerService.getAllCustomer();
        int i = 0;
        return l;
    }



}
