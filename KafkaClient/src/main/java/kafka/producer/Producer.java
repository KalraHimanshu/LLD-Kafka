package kafka.producer;

import kafka.client.Client;
import kafka.client.Message;
import kafka.client.Topic;

public class Producer{

    private Client client;

    public Producer(Client client) {
        this.client = client;
    }

    public boolean produce(String topicName, Message message) {
        return client.getBroker().getTopic(topicName).addMessage(message);
    }

}
