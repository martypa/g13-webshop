package ch.hslu.edu.enapp.webshop.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class Product {

    private String no;
    private String description;
    private String owner;
    private String mediafileName;
    private String searchDescription;
    private BigDecimal qtyOnSalesOrder;
    private BigDecimal unitPrice;


    public Product() {
    }

    public Product(String no,
                   String description, String owner,
                   String mediafileName, String searchDescription, BigDecimal qtyOnSalesOrder, BigDecimal unitPrice) {
        this.no = no;
        this.description = description;
        this.owner = owner;
        this.mediafileName = mediafileName;
        this.searchDescription = searchDescription;
        this.qtyOnSalesOrder = qtyOnSalesOrder;
        this.unitPrice = unitPrice;
    }


    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMediafileName() {
        return mediafileName;
    }

    public void setMediafileName(String mediafileName) {
        this.mediafileName = mediafileName;
    }

    public String getSearchDescription() {
        return searchDescription;
    }

    public void setSearchDescription(String searchDescription) {
        this.searchDescription = searchDescription;
    }

    public BigDecimal getQtyOnSalesOrder() {
        return qtyOnSalesOrder;
    }

    public void setQtyOnSalesOrder(BigDecimal qtyOnSalesOrder) {
        this.qtyOnSalesOrder = qtyOnSalesOrder;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
