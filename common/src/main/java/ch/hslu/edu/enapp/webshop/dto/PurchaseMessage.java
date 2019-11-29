package ch.hslu.edu.enapp.webshop.dto;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PurchaseMessage {

    public String purchaseId;
    @XmlElement(name = "payId")
    public String payID;
    public String student = "tamarty";
    public String totalPrice;
    public String date;
    @XmlElement(name = "customer")
    public PurchaseCustomer Customer;

    @XmlElementWrapper(name = "lines")
    @XmlElement(name = "line")
    public List<PurchaseItemTmp> purchaseItemList;


    public PurchaseMessage(String purchaseID, String payID, String totalPrice, String date, PurchaseCustomer customer, LinkedList<PurchaseItem> itemslist) {
        this.purchaseId = purchaseID;
        this.payID = payID;
        this.totalPrice = totalPrice;
        this.date = date;
        this.Customer = customer;
        this.purchaseItemList = generateList(itemslist);
    }

    public PurchaseMessage() {
    }

    private List<PurchaseItemTmp> generateList(List<PurchaseItem> items){
        List<PurchaseItemTmp> tmpList = new ArrayList<>();
        for (PurchaseItem i: items) {
            tmpList.add(new PurchaseItemTmp(i));
        }
        return tmpList;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    public static class PurchaseCustomer{
        public String dynNavCustNo = "";
        public String name = "";
        public String address = "";
        public String postCode = "";
        public String city = "";
        public String shopLoginname = "";

        public PurchaseCustomer(String dynNavCustNo, String name, String address, String postCode, String city, String shopLoginname) {
            this.dynNavCustNo = dynNavCustNo;
            this.name = name;
            this.address = address;
            this.postCode = postCode;
            this.city = city;
            this.shopLoginname = shopLoginname;
        }


    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class PurchaseItemTmp{
        public String msDynNAVItemNo;
        public String description;
        public String quantity;
        public String totalLinePrice;

        public PurchaseItemTmp(PurchaseItem item) {
            this.msDynNAVItemNo = item.getProduct().getNo();
            this.description = item.getProduct().getDescription();
            this.quantity = String.valueOf(item.getQuantity());
            this.totalLinePrice = String.valueOf((item.getProduct().getUnitPrice()*item.getQuantity()));
        }
    }

}
