package kafka.client;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Broker { // can have some Interface with major functionalities of this Systemm with different options

    String address;
    String port;
    Map<String, String> props;
    Map<String, Topic> topics; //topicName ,
    Broker instance = null;

    public Topic getTopic(String name) {
        return topics.getOrDefault(name, null); // even create and put back to broker
    }

    public Map<String, Topic> getTopics() {
        return topics;
    }

    public void setTopics(Map<String, Topic> topics) {
        this.topics = topics;
    }



    public void initialize() {
        topics = new ConcurrentHashMap<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Map<String, String> getProps() {
        return props;
    }

    public void setProps(Map<String, String> props) {
        this.props = props;
    }

    public void start(){

    }

    public Broker(String address, String port) {
        this.address = address;
        this.port = port;
        initialize();
    }

}
