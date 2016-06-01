package model;

import visitor.Visitor;

public interface Content {
    void accept(Visitor visitor);
}
