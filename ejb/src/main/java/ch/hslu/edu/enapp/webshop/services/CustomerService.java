package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Customer;
import ch.hslu.edu.enapp.webshop.entity.CustomerEntity;
import ch.hslu.edu.enapp.webshop.entity.CustomertoroleEntity;
import ch.hslu.edu.enapp.webshop.entity.CustomertoroleEntityPK;
import ch.hslu.edu.enapp.webshop.entity.RoleEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

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
        CustomerEntity customerEntity = null;
        try {
            customerEntity = customerQuery.getSingleResult();
        }catch (Exception e){
        }
        if(customerEntity != null){
            return customerEntityToCustomer(customerEntity);
        }else{
            return null;
        }
    }

    @Override
    public Customer getCustomerbyDynNO(String dynNo){
        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerbyDynNo", CustomerEntity.class)
                .setParameter("dynNo", dynNo);
        CustomerEntity customerEntity = customerQuery.getSingleResult();
        return customerEntityToCustomer(customerEntity);
    }

    @Override
    public void updateDynNo(String dynNo, String loginName){
        final Query customerQuery = em.createNamedQuery("updateDynNoByName")
                .setParameter("name", loginName)
                .setParameter("dynNo", dynNo);
        customerQuery.executeUpdate();
    }

    public void addNewCustomer(Customer customer, String password){
        CustomerEntity entity = new CustomerEntity();
        entity.setAddress(customer.getAddress());
        entity.setFirstname(customer.getFirstName());
        entity.setEmail(customer.getEmail());
        entity.setLastname(customer.getLastName());
        entity.setName(customer.getLoginName());
        entity.setPassword(password);
        entity.setDynNavCustNo(null);
        entity.setCustomertorolesByName(null);
        entity.setPurchasesByName(null);
        em.persist(entity);
    }

    @Override
    public void addUserRole(String userName){
        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerByName", CustomerEntity.class)
                .setParameter("name", userName);
        CustomerEntity customerEntity = customerQuery.getSingleResult();

        final TypedQuery<RoleEntity> roleQuery = em.createNamedQuery("getRole", RoleEntity.class);
        List<RoleEntity> list = roleQuery.getResultList();


        CustomertoroleEntity customertoroleEntity = new CustomertoroleEntity();
        customertoroleEntity.setName(userName);
        customertoroleEntity.setRole("user");
        customertoroleEntity.setRoleByRole(list.get(0));
        customertoroleEntity.setCustomerByName(customerEntity);
        em.persist(customertoroleEntity);
    }



    @Override
    public void updateCustomer(Customer customer, String password){
        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerByName", CustomerEntity.class)
                .setParameter("name", customer.getLoginName());
        CustomerEntity customerEntity = customerQuery.getSingleResult();

        customerEntity.setAddress(customer.getAddress());
        customerEntity.setDynNavCustNo(customer.getDynNavCustNo());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setFirstname(customer.getFirstName());
        customerEntity.setLastname(customer.getLastName());
        customerEntity.setPassword(password);

        final Query customerupdateQuery = em.createNamedQuery("updateCustomer")
                .setParameter("firstname", customer.getFirstName())
                .setParameter("password", password)
                .setParameter("lastname", customer.getLastName())
                .setParameter("address", customer.getAddress())
                .setParameter("email", customer.getEmail())
                .setParameter("dynNr", customer.getDynNavCustNo())
                .setParameter("loginName", customer.getLoginName());
        customerupdateQuery.executeUpdate();
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
