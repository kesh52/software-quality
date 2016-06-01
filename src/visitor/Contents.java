package visitor;

import model.Article;
import model.AtomicContent;
import model.CompositeContent;
import model.Image;
import model.NewsCollection;

public class Contents implements Visitor{

    public void visit(Article element) {
        System.out.println("###" + ((CompositeContent)element).getTitle() + "###");
        System.out.println(((Article)element).getContent());
        System.out.println();
    }

    public void visit(Image element) {
        System.out.println("###" + ((AtomicContent)element).getTitle() + "###");
        ((Image) element).drawImage();
        System.out.println();
    }

    public void visit(NewsCollection element) {}
}
