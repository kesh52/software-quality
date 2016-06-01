package visitor;

import model.Article;
import model.AtomicContent;
import model.CompositeContent;
import model.Image;
import model.NewsCollection;

public class InformationList implements Visitor	{

    public void visit(Article element) {
        System.out.println("Article: " + ((CompositeContent)element).getTitle() + ", Author: "
                + ((CompositeContent)element).getAuthor());
    }

    public void visit(Image element) {
        System.out.println("Image: " + ((AtomicContent)element).getTitle()
                + ", Resolution: " + ((Image)element).getWidth()
                + "x" + ((Image)element).getHeight()
                + ", Author: " + ((AtomicContent)element).getAuthor());
    }

    public void visit(NewsCollection element) {
        System.out.println("###" + ((NewsCollection)element).getTopic() + "###");
    }
}
