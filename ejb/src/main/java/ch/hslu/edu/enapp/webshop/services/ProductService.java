package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Product;
import ch.hslu.edu.enapp.webshop.entity.ProductEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ProductService implements ProductServiceLocal {

    @PersistenceContext
    private EntityManager em;


    public ProductService() {
    }

    @Override
    public List<Product> getAllProducts() {
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getAllProducts", ProductEntity.class);
        final List<ProductEntity> results = query.getResultList();
        List<Product> productList = new ArrayList<>();
        results.forEach(item -> productList.add(new Product(
                item.getNo(),
                item.getDescription(),
                item.getOwner(),
                item.getMediafileName(),
                item.getSearchDescription(),
                item.getQtyOnSalesOrder(),
                item.getUnitPrice())));
        return productList;
    }

    @Override
    public Product getProductByNo(String productNo){
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getProdcutByNo", ProductEntity.class)
                .setParameter("no", productNo);
        final ProductEntity results = query.getResultList().get(0);

        return new Product(results.getNo(),
                results.getDescription(),
                results.getOwner(),
                results.getMediafileName(),
                results.getSearchDescription(),
                results.getQtyOnSalesOrder(),
                results.getUnitPrice());
    }

}
