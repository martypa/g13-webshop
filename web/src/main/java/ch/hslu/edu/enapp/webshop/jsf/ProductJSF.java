package ch.hslu.edu.enapp.webshop.jsf;


import ch.hslu.edu.enapp.webshop.dto.Product;
import ch.hslu.edu.enapp.webshop.services.ERPServiceLocal;
import ch.hslu.edu.enapp.webshop.services.ProductServiceLocal;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.net.MalformedURLException;
import java.util.List;

@Named
@RequestScoped
public class ProductJSF {

    @Inject
    private ProductServiceLocal productService;

    @Inject
    private ERPServiceLocal erpServiceLocal;


    public List<Product> getAllProducts(){
        this.erpServiceLocal.updateDataBase();
        return productService.getAllProducts();
    }

}
