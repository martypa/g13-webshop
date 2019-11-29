package ch.hslu.edu.enapp.webshop.dto;

import java.sql.Timestamp;
import java.util.LinkedList;

public class Purchase {
    private int purchaseID;
    private String customerName;
    private Timestamp datetime;
    private long payID;
    private double amount;
    private String state;
    private String correlationId;
    private LinkedList<PurchaseItem> purchaseItemList;

    public Purchase(String customerName, Timestamp datetime, String state, LinkedList<PurchaseItem> purchaseItemList) {
        this.purchaseID = purchaseID;
        this.customerName = customerName;
        this.datetime = datetime;
        this.state = state;
        this.purchaseItemList = purchaseItemList;
        this.amount = calculateAmount(purchaseItemList);
    }

    public Purchase(int purchaseID, String customerName, Timestamp datetime, String state, LinkedList<PurchaseItem> purchaseItemList) {
        this.purchaseID = purchaseID;
        this.customerName = customerName;
        this.datetime = datetime;
        this.state = state;
        this.purchaseItemList = purchaseItemList;
        this.amount = calculateAmount(purchaseItemList);
    }

    public long getPayID() {
        return payID;
    }

    public void setPayID(long payID) {
        this.payID = payID;
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

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double calculateAmount(LinkedList<PurchaseItem> items){
        double total = 0;
        for (PurchaseItem i:items) {
            total = total + (i.getQuantity()*i.getProduct().getUnitPrice());
        }
        return total;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
}
