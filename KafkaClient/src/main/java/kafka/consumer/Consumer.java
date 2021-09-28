package kafka.consumer;

import kafka.client.Client;
import kafka.client.Message;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Consumer {

    String id;
    Client kafkaClient;
    Map<String, Integer> topicOffsetInfo; // topicName , offset

    public Consumer(Client kafkaClient) {
        this.kafkaClient = kafkaClient;
        topicOffsetInfo = new ConcurrentHashMap<>();
    }

    public void subscribe(String topicName) {
        if (!topicOffsetInfo.containsKey(topicName))
            topicOffsetInfo.put(topicName, 0);
    }

    public Message read(String topicName) {
        Message message = kafkaClient.readMessage(topicName, topicOffsetInfo.getOrDefault(topicName, 0));
        System.out.println("Consumer_id:"+ id +"TopicName:"+ topicName+ "Message Data: "+ message.getData());
        return message;
    }

}
