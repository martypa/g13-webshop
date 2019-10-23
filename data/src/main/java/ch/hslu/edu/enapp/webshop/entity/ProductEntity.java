package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getProducts", query = "SELECT u FROM ProductEntity  u"),
        @NamedQuery(name = "getRockProducts", query = "SELECT u FROM ProductEntity u WHERE u.mediapath=:mediapath"),
        @NamedQuery(name = "getProductByName", query = "SELECT u FROM ProductEntity u WHERE u.name=:name")
})
@Table(name = "product", schema = "webshop", catalog = "")
public class ProductEntity {
    private int id;
    private String name;
    private String description;
    private String mediapath;
    private BigDecimal unitprice;
    private Collection<PurchaseitemEntity> purchaseitemsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "mediapath", nullable = false, length = 255)
    public String getMediapath() {
        return mediapath;
    }

    public void setMediapath(String mediapath) {
        this.mediapath = mediapath;
    }

    @Basic
    @Column(name = "unitprice", nullable = false, precision = 2)
    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(mediapath, that.mediapath) &&
                Objects.equals(unitprice, that.unitprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, mediapath, unitprice);
    }

    @OneToMany(mappedBy = "productByProduct")
    public Collection<PurchaseitemEntity> getPurchaseitemsById() {
        return purchaseitemsById;
    }

    public void setPurchaseitemsById(Collection<PurchaseitemEntity> purchaseitemsById) {
        this.purchaseitemsById = purchaseitemsById;
    }
}
