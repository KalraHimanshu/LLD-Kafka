package kafka.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// interface...
public class Topic { // multiple implemmentations based we can concurrency
    Integer id;
    String name;
    List<Message> messages = new ArrayList<>();// can be removed...

    Map<Integer, Message> conMess = new ConcurrentHashMap<>();

    AtomicInteger messageCounter= new AtomicInteger(0);

    public Message getMessage(int offset) {
        return messages.get(offset);
    }

    public boolean addParallelMessage(Message message){
        conMess.put(messageCounter.addAndGet(1), message);
        return true;
    }

    public Message getParallelMessage(int offset) {
        return conMess.get(offset);
    }

    public boolean addMessage(Message message){
        return messages.add(message);
    }



}
