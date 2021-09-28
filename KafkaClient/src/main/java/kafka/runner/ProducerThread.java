package kafka.runner;

import kafka.client.Client;
import kafka.client.Message;
import kafka.producer.Producer;

public class ProducerThread implements Runnable{

    String msg ;
    Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        new Producer(client).produce("test", new Message(msg));
    }
}
