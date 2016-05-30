package output;

import model.NewsCollection;

public interface FormatingStrategy {
    void print(NewsCollection rootCollection);
}
