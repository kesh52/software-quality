package visitor;

import java.util.ArrayList;

import model.Article;
import model.AtomicContent;
import model.CompositeContent;
import model.Content;
import model.Image;
import model.NewsCollection;

public class InformationList implements Visitor	{

    public void visit(Content element) {

        if (element instanceof NewsCollection) {
            System.out.println("###" + ((NewsCollection)element).getTopic() + "###");
            visitChildren(element);
        }

        if (element instanceof Article) {
            System.out.println("Article: " + ((CompositeContent)element).getTitle() + ", Author: "
                    + ((CompositeContent)element).getAuthor());
            visitChildren(element);
        }

        if (element instanceof Image) {
            System.out.println("Image: " + ((AtomicContent)element).getTitle()
            + ", Resolution: " + ((Image)element).getWidth()
            + "x" + ((Image)element).getHeight()
            + ", Author: " + ((AtomicContent)element).getAuthor());
        }
    }

    private void visitChildren(Content element) {
        ArrayList<Content> children = ((CompositeContent)element).getChildren();

        for (Content elem : children) {
            visit(elem);
        }
    }
}
