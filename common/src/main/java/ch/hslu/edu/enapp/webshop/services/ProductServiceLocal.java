package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Product;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductServiceLocal {
    List<Product> getAllProducts();

    Product getProductByNo(String productNo);
}
