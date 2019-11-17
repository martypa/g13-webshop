package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getAllProducts", query = "SELECT p FROM ProductEntity p"),
        @NamedQuery(name = "getProdcutByNo", query = "SELECT p FROM ProductEntity p WHERE p.no=:no")
})
@NamedNativeQueries({
})
@Table(name = "product", schema = "webshop", catalog = "")
public class ProductEntity {
    private String no;
    private String description;
    private String owner;
    private String mediafileName;
    private String searchDescription;
    private Double qtyOnSalesOrder;
    private Double unitPrice;

    @Id
    @Column(name = "no", nullable = false, length = 127)
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "owner", nullable = true, length = 20)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "mediafileName", nullable = true, length = 15)
    public String getMediafileName() {
        return mediafileName;
    }

    public void setMediafileName(String mediafileName) {
        this.mediafileName = mediafileName;
    }

    @Basic
    @Column(name = "searchDescription", nullable = true, length = 15)
    public String getSearchDescription() {
        return searchDescription;
    }

    public void setSearchDescription(String searchDescription) {
        this.searchDescription = searchDescription;
    }

    @Basic
    @Column(name = "qtyOnSalesOrder", nullable = true, precision = 0)
    public Double getQtyOnSalesOrder() {
        return qtyOnSalesOrder;
    }

    public void setQtyOnSalesOrder(Double qtyOnSalesOrder) {
        this.qtyOnSalesOrder = qtyOnSalesOrder;
    }

    @Basic
    @Column(name = "unitPrice", nullable = false, precision = 0)
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return Double.compare(that.unitPrice, unitPrice) == 0 &&
                Objects.equals(no, that.no) &&
                Objects.equals(description, that.description) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(mediafileName, that.mediafileName) &&
                Objects.equals(searchDescription, that.searchDescription) &&
                Objects.equals(qtyOnSalesOrder, that.qtyOnSalesOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, description, owner, mediafileName, searchDescription, qtyOnSalesOrder, unitPrice);
    }
}
