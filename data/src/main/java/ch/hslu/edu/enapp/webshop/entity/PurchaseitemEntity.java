package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getNumberOfPurchaseitem", query = "SELECT COUNT(i) FROM PurchaseitemEntity i"),
        @NamedQuery(name = "getAllItems", query = "SELECT i FROM PurchaseitemEntity i"),
})
@Table(name = "purchaseitem", schema = "webshop", catalog = "")
public class PurchaseitemEntity {
    private int id;
    private int purchase;
    private String product;
    private int quantity;
    private PurchaseEntity purchaseByPurchase;
    private ProductEntity productByProduct;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "purchase", nullable = false, insertable=false, updatable=false)
    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }

    @Basic
    @Column(name = "product", nullable = false, insertable=false, updatable=false)
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseitemEntity that = (PurchaseitemEntity) o;
        return id == that.id &&
                purchase == that.purchase &&
                product == that.product &&
                quantity == that.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, purchase, product, quantity);
    }

    @ManyToOne
    @JoinColumn(name = "purchase", referencedColumnName = "id", nullable = false)
    public PurchaseEntity getPurchaseByPurchase() {
        return purchaseByPurchase;
    }

    public void setPurchaseByPurchase(PurchaseEntity purchaseByPurchase) {
        this.purchaseByPurchase = purchaseByPurchase;
    }

    @ManyToOne
    @JoinColumn(name = "product", referencedColumnName = "no", nullable = false)
    public ProductEntity getProductByProduct() {
        return productByProduct;
    }

    public void setProductByProduct(ProductEntity productByProduct) {
        this.productByProduct = productByProduct;
    }
}
