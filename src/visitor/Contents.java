package visitor;

import java.util.ArrayList;

import model.Article;
import model.AtomicContent;
import model.CompositeContent;
import model.Content;
import model.Image;
import model.NewsCollection;

public class Contents implements Visitor{

    public void visit(Content element) {

        if (element instanceof NewsCollection) {
            visitChildren(element);
        }

        if (element instanceof Article) {
            System.out.println("###" + ((CompositeContent)element).getTitle() + "###");
            System.out.println(((Article)element).getContent());
            System.out.println();
            visitChildren(element);
        }

        if (element instanceof Image) {
            System.out.println("###" + ((AtomicContent)element).getTitle() + "###");
            ((Image) element).drawImage();
            System.out.println();
        }
    }

    private void visitChildren(Content element) {
        ArrayList<Content> children = ((CompositeContent)element).getChildren();

        for (Content elem : children) {
            visit(elem);
        }
    }
}
