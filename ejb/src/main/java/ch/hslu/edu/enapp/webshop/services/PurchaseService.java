package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Purchase;
import ch.hslu.edu.enapp.webshop.dto.PurchaseItem;
import ch.hslu.edu.enapp.webshop.entity.CustomerEntity;
import ch.hslu.edu.enapp.webshop.entity.ProductEntity;
import ch.hslu.edu.enapp.webshop.entity.PurchaseEntity;
import ch.hslu.edu.enapp.webshop.entity.PurchaseitemEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class PurchaseService implements PurchaseServiceLocal {


    @PersistenceContext
    private EntityManager em;


    public PurchaseService() {
    }

    @Override
    public int submitNewPurchase(Purchase purchase) {
        PurchaseEntity purchaseEntity = new PurchaseEntity();
        int id = 0;

        final TypedQuery<PurchaseEntity> purchasePuery = em.createNamedQuery("getAllPurchase", PurchaseEntity.class);
        final List<PurchaseEntity> results = purchasePuery.getResultList();
        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerByName", CustomerEntity.class)
                .setParameter("name", purchase.getCustomerName());

        if (!results.isEmpty()) id = results.size();
        purchaseEntity.setId(id);
        purchaseEntity.setCustomer(purchase.getCustomerName());
        purchaseEntity.setCustomerByCustomer(customerQuery.getSingleResult());
        purchaseEntity.setDatetime(purchase.getDatetime());
        purchaseEntity.setState("Registriert");

        em.persist(purchaseEntity);
        return id;
    }

    @Override
    public void submitPurchaseItems(Purchase purchase, int purchaseNr){

        final TypedQuery<PurchaseitemEntity> purchasePuery = em.createNamedQuery("getAllItems", PurchaseitemEntity.class);
        final List<PurchaseitemEntity> results = purchasePuery.getResultList();
        final TypedQuery<PurchaseEntity> purchaseQuary = em.createNamedQuery("getPurchaseById", PurchaseEntity.class)
                .setParameter("id", purchaseNr);

        int purchaseitemId = 0;
        if(!results.isEmpty()) purchaseitemId = results.size();
        for (PurchaseItem item: purchase.getPurchaseItemList()) {
            final TypedQuery<ProductEntity> productQuery = em.createNamedQuery("getProductByID", ProductEntity.class)
                    .setParameter("id", item.getProduct().getId());
            PurchaseitemEntity itemEntity = new PurchaseitemEntity();
            itemEntity.setId(purchaseitemId);
            itemEntity.setProduct(item.getProduct().getId());
            itemEntity.setPurchase(purchaseNr);
            itemEntity.setQuantity(item.getQuantity());
            itemEntity.setPurchaseByPurchase(purchaseQuary.getSingleResult());
            itemEntity.setProductByProduct(productQuery.getSingleResult());
            em.persist(itemEntity);
            purchaseitemId++;
        }
    }

    @Override
    public Purchase getPurchaseByCustomerName(String customerName) {
        return null; //TODO: implement getPurchasebyCustomerName()
    }


}
