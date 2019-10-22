package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Product;
import ch.hslu.edu.enapp.webshop.entity.ProductEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.xml.registry.infomodel.User;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ProductService implements ProductServiceLocal {

    @PersistenceContext
    private EntityManager em;


    public ProductService() {
    }

    @Override
    public Product getFirstProduct(){
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getProducts", ProductEntity.class);
        final List<ProductEntity> results = query.getResultList();
        final ProductEntity userEntity = results.get(0);
        final Product product = new Product();
        product.setName(userEntity.getName());
        return product;
    }

    @Override
    public List<Product> getProductsMediaPaths(String mediapath){
        final TypedQuery<ProductEntity> query = em.createNamedQuery("getRockProducts", ProductEntity.class).setParameter("mediapath", mediapath);
        final List<ProductEntity> results = query.getResultList();
        List<Product> productList = new ArrayList<>();
        results.forEach(item -> productList.add(new Product(item.getName(),
                item.getDescription(),
                item.getMediapath(),
                item.getUnitprice())));
        return productList;
    }



}
