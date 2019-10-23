package ch.hslu.edu.enapp.webshop.jsf;


import ch.hslu.edu.enapp.webshop.dto.Product;
import ch.hslu.edu.enapp.webshop.services.ProductServiceLocal;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ProductJSF {

    @Inject
    private ProductServiceLocal productService;

    public Product getFirstproduct() {
        return productService.getFirstProduct();
    }

    public List<Product> getRockProducts(){
        return productService.getProductsMediaPaths("Rock");
    }

    public List<Product> getIndieProducts(){
        return productService.getProductsMediaPaths("Indie");
    }

    public List<Product> getPopProducts(){
        return productService.getProductsMediaPaths("Pop");
    }

    public List<Product> getElectronicProducts(){
        return productService.getProductsMediaPaths("Electronic");
    }

    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
