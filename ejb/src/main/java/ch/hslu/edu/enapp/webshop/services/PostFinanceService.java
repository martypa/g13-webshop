package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PostFinanceCall;
import ch.hslu.edu.enapp.webshop.dto.PostFinanceResponse;


import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ws.rs.client.*;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

@Stateless
public class PostFinanceService implements PostFinanceServiceLocal {


    private final String PSPID              = "HSLUiCompany";
    private final String USERID             = "enappstudents";
    private final String PSWD               = "ds2H9ZV.p!8r";
    private final String SHA1_PASSWORD_IN   = "hslu!comp@ny.websh0p";
    private final String CONTENT_TYPE       = "application/x-www-form-urlencoded";
    private final String REQUEST_URL        = "https://e-payment.postfinance.ch/ncol/test/orderdirect.asp";
    private final String QUERY_URL          = "https://e-payment.postfinance.ch/ncol/test/querydirect.asp";
    private final String MAINTENANCE_URL    = "https://e-payment.postfinance.ch/ncol/test/maintenancedirect.asp";


    public PostFinanceService() {
    }


    @Override
    public PostFinanceResponse send(int orderID, double amount){

        int amountTmp = (int)amount*100;

        PostFinanceCall callObject = new PostFinanceCall(
                amountTmp,
                "5399999999999999",
                "CHF",
                "RES",
                orderID,
                PSPID,
                SHA1_PASSWORD_IN,
                USERID,
                PSWD,
                "1222",
                "123"
        );


        final Client client = ClientBuilder.newBuilder().newClient();
        final WebTarget target = client.target(REQUEST_URL);
        final Invocation.Builder builder = target.request();
        final Response result = builder.post(Entity.form(callObject.getCallObject()));
        final String xmlResponse = result.readEntity(String.class);

        PostFinanceResponse response = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( PostFinanceResponse.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new StringReader(xmlResponse));
            response = (PostFinanceResponse) jaxbUnmarshaller.unmarshal(reader);
        } catch (JAXBException | XMLStreamException e) {
            e.printStackTrace();
        }
        return response;
    }

}
