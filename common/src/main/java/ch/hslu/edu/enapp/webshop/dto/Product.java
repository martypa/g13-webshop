package ch.hslu.edu.enapp.webshop.dto;

import java.math.BigDecimal;

public class Product {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String description;
    private String mediapath;
    private BigDecimal unitprice;

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMediapath() {
        return mediapath;
    }

    public Product(int id, String name, String description, String mediapath, BigDecimal unitprice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mediapath = mediapath;
        this.unitprice = unitprice;
    }

    public void setMediapath(String mediapath) {
        this.mediapath = mediapath;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
