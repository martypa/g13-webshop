package ch.hslu.edu.enapp.webshop.dto;

public class Order {

    private int orderID;
    private long payID;
    private int purchaseID;
    private int dynNavCustNo;
    private String customer;


    public Order() {
    }

    public Order(long payID, int purchaseID, int dynNavCustNo, String customer) {
        this.payID = payID;
        this.purchaseID = purchaseID;
        this.dynNavCustNo = dynNavCustNo;
        this.customer = customer;
        this.orderID = purchaseID;
    }

    public long getPayID() {
        return payID;
    }

    public void setPayID(long payID) {
        this.payID = payID;
    }

    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public int getDynNavCustNo() {
        return dynNavCustNo;
    }

    public void setDynNavCustNo(int dynNavCustNo) {
        this.dynNavCustNo = dynNavCustNo;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
