package model;

import visitor.Visitor;

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

    public void accept(Visitor v) {
        v.visit(this);
        for(Content elem : this.children) {
            elem.accept(v);
        }
    }
}
