
package ch.hslu.edu.enapp.webshop.erp;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2019-11-15T13:13:16.160+01:00
 * Generated source version: 3.3.4
 *
 */
public final class ItemPort_ItemPort_Client {

    private static final QName SERVICE_NAME = new QName("urn:microsoft-dynamics-schemas/page/item", "Item_Service");

    private ItemPort_ItemPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ItemService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        ItemService ss = new ItemService(wsdlURL, SERVICE_NAME);
        ItemPort port = ss.getItemPort();

        {
        System.out.println("Invoking update...");
        ch.hslu.edu.enapp.webshop.erp.Item _update_itemVal = null;
        javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.Item> _update_item = new javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.Item>(_update_itemVal);
        port.update(_update_item);

        System.out.println("update._update_item=" + _update_item.value);

        }
        {
        System.out.println("Invoking isUpdated...");
        java.lang.String _isUpdated_key = "";
        boolean _isUpdated__return = port.isUpdated(_isUpdated_key);
        System.out.println("isUpdated.result=" + _isUpdated__return);


        }
        {
        System.out.println("Invoking create...");
        ch.hslu.edu.enapp.webshop.erp.Item _create_itemVal = null;
        javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.Item> _create_item = new javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.Item>(_create_itemVal);
        port.create(_create_item);

        System.out.println("create._create_item=" + _create_item.value);

        }
        {
        System.out.println("Invoking readMultiple...");
        java.util.List<ch.hslu.edu.enapp.webshop.erp.ItemFilter> _readMultiple_filter = null;
        java.lang.String _readMultiple_bookmarkKey = "";
        int _readMultiple_setSize = 0;
        ch.hslu.edu.enapp.webshop.erp.ItemList _readMultiple__return = port.readMultiple(_readMultiple_filter, _readMultiple_bookmarkKey, _readMultiple_setSize);
        System.out.println("readMultiple.result=" + _readMultiple__return);


        }
        {
        System.out.println("Invoking updateMultiple...");
        ch.hslu.edu.enapp.webshop.erp.ItemList _updateMultiple_itemListVal = null;
        javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.ItemList> _updateMultiple_itemList = new javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.ItemList>(_updateMultiple_itemListVal);
        port.updateMultiple(_updateMultiple_itemList);

        System.out.println("updateMultiple._updateMultiple_itemList=" + _updateMultiple_itemList.value);

        }
        {
        System.out.println("Invoking read...");
        java.lang.String _read_no = "";
        ch.hslu.edu.enapp.webshop.erp.Item _read__return = port.read(_read_no);
        System.out.println("read.result=" + _read__return);


        }
        {
        System.out.println("Invoking createMultiple...");
        ch.hslu.edu.enapp.webshop.erp.ItemList _createMultiple_itemListVal = null;
        javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.ItemList> _createMultiple_itemList = new javax.xml.ws.Holder<ch.hslu.edu.enapp.webshop.erp.ItemList>(_createMultiple_itemListVal);
        port.createMultiple(_createMultiple_itemList);

        System.out.println("createMultiple._createMultiple_itemList=" + _createMultiple_itemList.value);

        }
        {
        System.out.println("Invoking delete...");
        java.lang.String _delete_key = "";
        boolean _delete__return = port.delete(_delete_key);
        System.out.println("delete.result=" + _delete__return);


        }

        System.exit(0);
    }

}
