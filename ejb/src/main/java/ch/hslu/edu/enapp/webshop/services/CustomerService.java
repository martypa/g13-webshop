package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Customer;
import ch.hslu.edu.enapp.webshop.entity.CustomerEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class CustomerService implements CustomerServiceLocal {

    @PersistenceContext
    private EntityManager em;


    public CustomerService() {

    }


    @Override
    public Customer getCustomerByLoginName(String loginName){
        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerByName", CustomerEntity.class)
                .setParameter("name", loginName);
        CustomerEntity customerEntity = customerQuery.getSingleResult();
        return customerEntityToCustomer(customerEntity);
    }

    @Override
    public Customer getCustomerbyDynNO(String dynNo){
        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerbyDynNo", CustomerEntity.class)
                .setParameter("dynNo", dynNo);
        CustomerEntity customerEntity = customerQuery.getSingleResult();
        return customerEntityToCustomer(customerEntity);
    }

    private Customer customerEntityToCustomer(CustomerEntity entity){
        return new Customer(
                entity.getName(),
                entity.getFirstname(),
                entity.getLastname(),
                entity.getAddress(),
                entity.getEmail(),
                entity.getDynNavCustNo()
        );
    }





}
