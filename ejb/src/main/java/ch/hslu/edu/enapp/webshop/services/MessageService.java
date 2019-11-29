package ch.hslu.edu.enapp.webshop.services;



import ch.hslu.edu.enapp.webshop.dto.Customer;
import ch.hslu.edu.enapp.webshop.dto.Purchase;
import ch.hslu.edu.enapp.webshop.dto.PurchaseMessage;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.UUID;

@Stateless
public class MessageService implements MessageServiceLocal {

    @Inject
    CustomerServiceLocal customerService;

    @Resource(name = "jms/enappQueueAMQ")
    private Queue enappQueue;

    @Resource(name = "MyRemoteJmsQueueConnectionFactory")
    private ConnectionFactory enappRemoteFactory;


    public MessageService() {
    }

    @Override
    public void sendNewMessage(Purchase purchase){


        try {
            Connection connection = enappRemoteFactory.createConnection();
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(enappQueue);

            final JAXBContext jaxbContext = JAXBContext.newInstance(PurchaseMessage.class);
            final StringWriter writer = new StringWriter();
            final Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(createMessage(purchase), writer);
            final String textmessage = writer.toString();

            final TextMessage textMessage = session.createTextMessage(textmessage);
            textMessage.setStringProperty("MessageFormat", "Version 1.5");
            textMessage.setJMSCorrelationID(UUID.randomUUID().toString());
            producer.send(textMessage);
        } catch (JAXBException | JMSException e) {
            e.printStackTrace();
        }
    }


    private PurchaseMessage createMessage(Purchase purchase){
        Customer customer = customerService.getCustomerByLoginName(purchase.getCustomerName());

        return new PurchaseMessage(
                String.valueOf(purchase.getPurchaseID()),
                String.valueOf(purchase.getPayID()),
                String.valueOf(purchase.getAmount()),
                String.valueOf(purchase.getDatetime()),
                new PurchaseMessage.PurchaseCustomer(
                        customer.getDynNavCustNo(),
                        customer.getLastName(),
                        customer.getAddress(),
                        "6010",
                        "Lucern",
                        customer.getLoginName()
                ),
                purchase.getPurchaseItemList()
        );
    }

}
