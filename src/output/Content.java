package output;

import model.Article;
import model.Image;
import model.NewsCollection;

public class Content implements FormatingStrategy{

    /**
     * Print the contents of all directly or transitively referenced items in
     * the given collection.
     */
    public void print(NewsCollection rootCollection) {
        for (Article article : rootCollection.getArticles()) {
            System.out.println("###" + article.getTitle() + "###");
            System.out.println(article.getContent());
            System.out.println();
        }
        for (Image image : rootCollection.getImages()) {
            System.out.println("###" + image.getTitle() + "###");
            image.drawImage();
            System.out.println();
        }
        for (NewsCollection collection : rootCollection.getCollections()) {
            print(collection);
        }
    }
}
