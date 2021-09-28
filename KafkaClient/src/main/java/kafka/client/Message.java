package kafka.client;
// can use Builder pattern

//@GetterS
public class Message {
    String key;
    String data;

    public Message(String msg) {
        data = msg;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
