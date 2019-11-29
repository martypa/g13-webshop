package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Product;
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
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Stateless
public class PurchaseService implements PurchaseServiceLocal {


    @PersistenceContext
    private EntityManager em;


    public PurchaseService() {
    }

    @Override
    public void submitNewPurchase(Purchase purchase) {
        PurchaseEntity newPurchaseEntity = new PurchaseEntity();

        final TypedQuery<CustomerEntity> customerQuery = em.createNamedQuery("getCustomerByName", CustomerEntity.class)
                .setParameter("name", purchase.getCustomerName());

        newPurchaseEntity.setId(purchase.getPurchaseID());
        newPurchaseEntity.setCustomer(purchase.getCustomerName());
        newPurchaseEntity.setCustomerByCustomer(customerQuery.getSingleResult());
        newPurchaseEntity.setDatetime(purchase.getDatetime());
        newPurchaseEntity.setState("Registriert");
        newPurchaseEntity.setAmount(purchase.getAmount());
        newPurchaseEntity.setPayid(purchase.getPayID());

        em.persist(newPurchaseEntity);
    }

    @Override
    public void submitPurchaseItems(Purchase purchase){

        final TypedQuery<Long> numberOfPurchaseItemQuery = em.createNamedQuery("getNumberOfPurchaseitem", Long.class);
        final int d = Math.toIntExact(numberOfPurchaseItemQuery.getSingleResult());
        final TypedQuery<PurchaseEntity> purchaseQuary = em.createNamedQuery("getPurchaseById", PurchaseEntity.class)
                .setParameter("id", purchase.getPurchaseID());
        final PurchaseEntity selectedPurchase = purchaseQuary.getSingleResult();

        int purchaseitemId = d+1;
        for (PurchaseItem item: purchase.getPurchaseItemList()) {
            final TypedQuery<ProductEntity> productQuery = em.createNamedQuery("getProdcutByNo", ProductEntity.class)
                    .setParameter("no", item.getProduct().getNo());
            PurchaseitemEntity itemEntity = new PurchaseitemEntity();
            itemEntity.setId(purchaseitemId);
            itemEntity.setProduct(item.getProduct().getNo());
            itemEntity.setPurchase(purchase.getPurchaseID());
            itemEntity.setQuantity(item.getQuantity());
            itemEntity.setPurchaseByPurchase(selectedPurchase);
            itemEntity.setProductByProduct(productQuery.getSingleResult());
            em.persist(itemEntity);
            purchaseitemId++;
        }
    }

    @Override
    public Purchase getPurchaseByCustomerName(String customerName) {
        final TypedQuery<PurchaseEntity> query = em.createNamedQuery("getPurchaseByCustomerName", PurchaseEntity.class)
                .setParameter("customer", customerName);
        final PurchaseEntity results = query.getResultList().get(0);

        return getPurchaseByPurchaseEntity(results);
    }

    private Purchase getPurchaseByPurchaseEntity(PurchaseEntity p){
        LinkedList<PurchaseItem> itemList = new LinkedList<>();

        for (PurchaseitemEntity i:p.getPurchaseitemsById()) {
            itemList.add(new PurchaseItem(getProductByProductEntity(i.getProductByProduct()),i.getQuantity()));
        }
        return new Purchase(
                p.getId(),
                p.getCustomer(),
                p.getDatetime(),
                p.getState(),
                itemList
        );
    }

    private Product getProductByProductEntity(ProductEntity p){
        return new Product(
                p.getNo(),
                p.getDescription(),
                p.getOwner(),
                p.getMediafileName(),
                p.getSearchDescription(),
                p.getQtyOnSalesOrder(),
                p.getUnitPrice()
        );
    }






}
