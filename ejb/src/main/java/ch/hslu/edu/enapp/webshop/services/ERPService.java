package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.Product;
import ch.hslu.edu.enapp.webshop.entity.ProductEntity;
import ch.hslu.edu.enapp.webshop.erp.*;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.xml.namespace.QName;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ERPService implements ERPServiceLocal {

    private final String WSDL_LOCATION = "http://enapp-was-global02.el.eee.intern:7047/DynamicsNAVTest/WS/iCompany%20HSLU%20T%26A/Page/Item";
    private final String DOMAIN = "ICOMPANY";
    private final String USER = "icDynNAVWsStudentSvc";
    private final String PASSWORD = "ic0mp@ny";

    private final String NAMESPACE_URI = "urn:microsoft-dynamics-schemas/page/item";
    private final String SERVICE_NAME = "Item_Service";
    private final String PORT_NAME = "Item_Port";

    @PersistenceContext
    private EntityManager em;


    public ERPService() {
    }


    @Override
    public boolean updateDataBase() {
        updateLocalDataBase(getAllProductsFromERP());
        return false;
    }


    private void updateLocalDataBase(ItemList newList) {
        ArrayList<ProductEntity> pList = convertItemListToProductEntityList(newList);
        for (ProductEntity p:pList) {
            insertNewProduct(p);
        }
        insertNewProduct(pList.get(0));
    }

    private void insertNewProduct(ProductEntity p) {
        Query q = em.createNativeQuery("INSERT INTO product(" +
                "no," +
                "description,owner," +
                "mediafileName,searchDescription," +
                "qtyOnSalesOrder,unitPrice) VALUES(?,?,?,?,?,?,?)");
        q.setParameter(1,p.getNo());
        q.setParameter(2,p.getDescription());
        q.setParameter(3,p.getOwner());
        q.setParameter(4,p.getMediafileName());
        q.setParameter(5,p.getSearchDescription());
        q.setParameter(6,p.getQtyOnSalesOrder());
        q.setParameter(7,p.getUnitPrice());
        q.executeUpdate();
    }

    private ProductEntity convertItemToProductEntity(Item item) {
        ProductEntity pEntity = new ProductEntity();
        pEntity.setDescription(item.getDescription());
        pEntity.setMediafileName(item.getMediafileName());
        pEntity.setNo(item.getNo());
        pEntity.setOwner(item.getOwner());
        pEntity.setQtyOnSalesOrder(item.getQtyOnSalesOrder().doubleValue());
        pEntity.setUnitPrice(item.getUnitPrice().doubleValue());
        pEntity.setSearchDescription(item.getSearchDescription());
        return pEntity;
    }

    private ArrayList<ProductEntity> convertItemListToProductEntityList(ItemList list) {
        ArrayList<ProductEntity> pList = new ArrayList<>();
        for (Item i : list.getItem()) {
            pList.add(convertItemToProductEntity(i));
        }
        return pList;
    }

    private ItemList getAllProductsFromERP() {
        ItemList itemList = null;
        try {
            final URL wsdl = new URL(WSDL_LOCATION);
            final QName itemPageQName = new QName(NAMESPACE_URI, SERVICE_NAME);
            Authenticator.setDefault(new Authenticator() {
                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(DOMAIN + "\\" + USER, PASSWORD.toCharArray());
                }
            });

            final ItemService itemService = new ItemService(wsdl, itemPageQName);
            final ItemPort itemPort = itemService.getItemPort();

            final List<ItemFilter> filterList = new ArrayList<ItemFilter>();
            final ItemFilter filter = new ItemFilter();
            filter.setField(ItemFields.PRODUCT_GROUP_CODE);
            filter.setCriteria("MP3");
            filterList.add(filter);


            itemList = itemPort.readMultiple(filterList, null, 0);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return itemList;
    }


}
