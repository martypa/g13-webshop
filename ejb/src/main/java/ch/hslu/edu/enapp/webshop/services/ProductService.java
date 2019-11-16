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
    public Product getFirstProduct() {
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getProducts", ProductEntity.class);
        final List<ProductEntity> results = query.getResultList();
        final ProductEntity userEntity = results.get(0);
        final Product product = new Product();
        product.setMediafileName(userEntity.getMediafileName());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getProducts", ProductEntity.class);
        final List<ProductEntity> results = query.getResultList();
        List<Product> productList = new ArrayList<>();
        results.forEach(item -> productList.add(new Product(
                item.getNo(),
                item.getDescription(),
                item.getOwner(),
                item.getMediafileName(),
                item.getSearchDescription(),
                BigDecimal.valueOf(item.getQtyOnSalesOrder()),
                BigDecimal.valueOf(item.getUnitPrice()))));
        return productList;
    }

    @Override
    public Product getProductByName(String productName) {
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getProductByName", ProductEntity.class).
                setParameter("name", productName);
        final List<ProductEntity> results = query.getResultList();
        final ProductEntity userEntity = results.get(0);
/*        final Product product = new Product(userEntity.getKey(),
                userEntity.getName(),
                userEntity.getDescription(),
                userEntity.getMediapath(),
                userEntity.getUnitprice());*/
        return null;
    }


}
