package ch.hslu.edu.enapp.webshop.services;

import ch.hslu.edu.enapp.webshop.dto.PostFinanceCall;
import ch.hslu.edu.enapp.webshop.postfinance.DccResponse;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import javax.ejb.Stateful;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Stateful
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
    public void send(){
        PostFinanceCall callObject = new PostFinanceCall(
                1500,
                "5399999999999999",
                "CHF",
                "RES",
                1235,
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

        JAXBContext jaxbContext     = null;
        try {
            jaxbContext = JAXBContext.newInstance( DccResponse.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new StringReader(xmlResponse));
            DccResponse response = (DccResponse) jaxbUnmarshaller.unmarshal(reader);
        } catch (JAXBException | XMLStreamException e) {
            e.printStackTrace();
        }

    }





}
