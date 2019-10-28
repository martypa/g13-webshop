package ch.hslu.edu.enapp.webshop.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "getAllPurchase", query = "SELECT p FROM PurchaseEntity p"),
        @NamedQuery(name = "getPurchaseById", query = "SELECT p FROM PurchaseEntity p WHERE p.id=:id")
})
@Table(name = "purchase", schema = "webshop", catalog = "")
public class PurchaseEntity {
    private int id;
    private String customer;
    private Timestamp datetime;
    private String state;
    private CustomerEntity customerByCustomer;
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
    @Column(name = "customer", nullable = false, length = 255, insertable=false, updatable=false)
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Basic
    @Column(name = "datetime", nullable = false)
    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Basic
    @Column(name = "state", nullable = false, length = 255)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseEntity that = (PurchaseEntity) o;
        return id == that.id &&
                Objects.equals(customer, that.customer) &&
                Objects.equals(datetime, that.datetime) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, datetime, state);
    }

    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "name", nullable = false)
    public CustomerEntity getCustomerByCustomer() {
        return customerByCustomer;
    }

    public void setCustomerByCustomer(CustomerEntity customerByCustomer) {
        this.customerByCustomer = customerByCustomer;
    }

    @OneToMany(mappedBy = "purchaseByPurchase")
    public Collection<PurchaseitemEntity> getPurchaseitemsById() {
        return purchaseitemsById;
    }

    public void setPurchaseitemsById(Collection<PurchaseitemEntity> purchaseitemsById) {
        this.purchaseitemsById = purchaseitemsById;
    }
}
