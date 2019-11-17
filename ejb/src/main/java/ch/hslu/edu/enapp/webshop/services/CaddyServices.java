package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Product;
import ch.hslu.edu.enapp.webshop.dto.PurchaseItem;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;

@Stateless
public class CaddyServices implements CaddyServicesLocal {

    @Inject
    private ProductServiceLocal productservice;

    private LinkedList<PurchaseItem> caddyList;


    public CaddyServices() {
        this.caddyList = new LinkedList<>();
    }

    @Override
    public void addProductToCaddy(String productNo) {
        Product tmp = productservice.getProductByNo(productNo);
        boolean noMatch = true;
        try {
            for (PurchaseItem i : caddyList) {
                if (i.getProduct().getNo() == tmp.getNo()) {
                    int q = i.getQuantity();
                    i.setQuantity((q + 1));
                    noMatch = false;
                }
            }
            if (noMatch) {
                this.caddyList.add(new PurchaseItem(tmp, 1));
            }
        }catch (ConcurrentModificationException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void addProductToCaddy(String productName, int quantity) {
        Product tmp = productservice.getProductByNo(productName);
        try {
            for (PurchaseItem i : caddyList) {
                if (i.getProduct().getNo() == tmp.getNo()) {
                    int q = i.getQuantity();
                    i.setQuantity((q + quantity));
                }
            }
        }catch (ConcurrentModificationException ex){
            System.out.println(ex);
        }
    }

    @Override
    public LinkedList<PurchaseItem> getCaddyList(){
        return this.caddyList;
    }

    @Override
    public void removeProductFromCaddyList(String productNo) {
        try {
            Product tmp = productservice.getProductByNo(productNo);
            for (PurchaseItem i : caddyList) {
                if (i.getProduct().getNo() == tmp.getNo()) {
                    caddyList.remove(i);
                }
            }
        }catch (ConcurrentModificationException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void removeAllProductFromCaddy(){
        this.caddyList.clear();
    }
}
