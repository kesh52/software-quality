package model;

import java.util.ArrayList;

public abstract class CompositeContent implements Content {

    protected ArrayList<Content> children = new ArrayList<>();
    protected String title;
    protected String author;

    public ArrayList<Content> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Content> children) {
        this.children = children;
    }

    public void addElement(Content element) {
        this.getChildren().add(element);
    }

    /**
     * Get the title of the article.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the author of the article.
     * @return author
     */
    public String getAuthor() {
        return author;
    }
}
