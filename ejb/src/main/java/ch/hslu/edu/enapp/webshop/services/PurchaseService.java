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
import javax.persistence.Query;
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
        PurchaseEntity newPurchaseEntity = new PurchaseEntity();

        final TypedQuery<Long> numberOfPurchasesQuery = em.createNamedQuery("getNumberOfPurchases", Long.class);
        int id = Math.toIntExact(numberOfPurchasesQuery.getSingleResult());

        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerByName", CustomerEntity.class)
                .setParameter("name", purchase.getCustomerName());

        newPurchaseEntity.setId(id);
        newPurchaseEntity.setCustomer(purchase.getCustomerName());
        newPurchaseEntity.setCustomerByCustomer(customerQuery.getSingleResult());
        newPurchaseEntity.setDatetime(purchase.getDatetime());
        newPurchaseEntity.setState("Registriert");

        em.persist(newPurchaseEntity);
        return id;
    }

    @Override
    public void submitPurchaseItems(Purchase purchase, int purchaseNr){

        final TypedQuery<Long> numberOfPurchaseItemQuery = em.createNamedQuery("getNumberOfPurchases", Long.class);
        final int numberOfPurchaseItem = Math.toIntExact(numberOfPurchaseItemQuery.getSingleResult());
        final TypedQuery<PurchaseEntity> purchaseQuary = em.createNamedQuery("getPurchaseById", PurchaseEntity.class)
                .setParameter("id", purchaseNr);
        final PurchaseEntity selectedPurchase = purchaseQuary.getSingleResult();

        int purchaseitemId = numberOfPurchaseItem;
        for (PurchaseItem item: purchase.getPurchaseItemList()) {
            final TypedQuery<ProductEntity> productQuery = em.createNamedQuery("getProdcutByNo", ProductEntity.class)
                    .setParameter("no", item.getProduct().getNo());
            PurchaseitemEntity itemEntity = new PurchaseitemEntity();
            itemEntity.setId(purchaseitemId);
            itemEntity.setProduct(item.getProduct().getNo());
            itemEntity.setPurchase(purchaseNr);
            itemEntity.setQuantity(item.getQuantity());
            itemEntity.setPurchaseByPurchase(selectedPurchase);
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
