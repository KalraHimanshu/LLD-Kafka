package kafka.client;

public class Client {

    Broker broker ;

    public Client(Broker broker) {
        this.broker = broker;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public Message readMessage(String topicName, int offset) {
        Topic topic = broker.getTopic(topicName);
        return topic.getMessage(offset);
    }

    public boolean produce(String topicName, Message message) {
        Topic topic = broker.getTopic(topicName);
        return topic.addMessage(message);
    }
}
