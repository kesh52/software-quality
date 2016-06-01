package visitor;

import model.Article;
import model.Image;
import model.NewsCollection;

public interface Visitor {
    void visit(Article element);
    void visit(Image element);
    void visit(NewsCollection element);
}
