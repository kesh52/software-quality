package output;

import model.Article;
import model.Image;
import model.NewsCollection;

public class InformationList implements FormatingStrategy{

    /**
     * Print a list showing information about all directly or transitively
     * referenced items in the given collection.
     */
    public void print(NewsCollection rootCollection) {
        System.out.println("###" + rootCollection.getTopic() + "###");
        for (Article article : rootCollection.getArticles()) {
            System.out.println("Article: " + article.getTitle() + ", Author: "
                    + article.getAuthor());
        }
        for (Image image : rootCollection.getImages()) {
            System.out.println("Image: " + image.getTitle()
                    + ", Resolution: " + image.getWidth()
                    + "x" + image.getHeight()
                    + ", Author: " + image.getAuthor());
        }
        for (NewsCollection collection : rootCollection.getCollections()) {
            print(collection);
        }
    }
}
