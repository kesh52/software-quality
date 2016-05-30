package model;

public class NewsCollection extends CompositeContent{

    private String topic;

    public NewsCollection(String topic) {
        this.topic = topic;
    }

    /**
     * Get the topic of the collection.
     * @return
     */
    public String getTopic() {
        return topic;
    }
}
