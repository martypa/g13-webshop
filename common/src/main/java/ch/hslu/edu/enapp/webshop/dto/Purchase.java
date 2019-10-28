package ch.hslu.edu.enapp.webshop.dto;

import java.sql.Timestamp;
import java.util.LinkedList;

public class Purchase {
    private String customerName;
    private Timestamp datetime;
    private String state;
    private LinkedList<PurchaseItem> purchaseItemList;

    public Purchase(String customerName, Timestamp datetime, String state, LinkedList<PurchaseItem> purchaseItemList) {
        this.customerName = customerName;
        this.datetime = datetime;
        this.state = state;
        this.purchaseItemList = purchaseItemList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LinkedList<PurchaseItem> getPurchaseItemList() {
        return purchaseItemList;
    }

    public void setPurchaseItemList(LinkedList<PurchaseItem> purchaseItemList) {
        this.purchaseItemList = purchaseItemList;
    }
}
