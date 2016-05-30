package visitor;

import model.Content;

public interface Visitor {
    void visit(Content element);
}
