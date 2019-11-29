package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.SalesOrderStatus;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;


@Singleton
public class OrderStatusService implements OrderStatusServiceLocal {

    private String BASE_URL = "http://enapp-daemons.el.eee.intern:9080/EnappDaemonWeb/rest/salesorder/corr/";


    public OrderStatusService() {
    }



    @Override
    public SalesOrderStatus getSalesOrderStatus(String correlationID){
        final Client client = ClientBuilder.newBuilder().newClient();
        String url = BASE_URL+correlationID;
        final WebTarget target = client.target(url);
        SalesOrderStatus orderStatus = null;
        try {
            final Invocation.Builder builder = target.request();
            orderStatus = builder.get(SalesOrderStatus.class);

        }catch(Exception e){ }
        return orderStatus;
    }




}
