package model;

import visitor.Visitor;

public class Article extends CompositeContent {
    private String content;

    // Fill in dummy content
    {
        content = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, "
                + "sed diam nonumy eirmod tempor invidunt ut labore et dolore "
                + "magna aliquyam erat, sed diam voluptua. At vero eos et "
                + "accusam et justo duo dolores et ea rebum.";
    }

    /**
     * Creates an article with the given title and author.
     * @param title
     * @param author
     */
    public Article(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Get the content of the article.
     * @return
     */
    public String getContent() {
        return content;
    }

    public void accept(Visitor v) {
        v.visit(this);
        for(Content elem : this.children) {
            elem.accept(v);
        }
    }
}
