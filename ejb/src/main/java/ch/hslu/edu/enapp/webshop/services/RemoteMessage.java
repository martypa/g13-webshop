package ch.hslu.edu.enapp.webshop.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "jms/enappQueueAMQ")
public class RemoteMessage implements MessageListener {

    private static final Logger logger = LogManager.getLogger(RemoteMessage.class);

    public RemoteMessage() {
    }

    @Override
    public void onMessage(Message message) {

        logger.info("Message retourn" + message.toString());

    }

}
