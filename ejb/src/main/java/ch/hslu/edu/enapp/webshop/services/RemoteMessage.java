package ch.hslu.edu.enapp.webshop.services;

import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(name = "jms/enappQueueAMQ")
public class RemoteMessage implements MessageListener {
    public RemoteMessage() {
    }

    @Override
    public void onMessage(Message message) {

    }
}
