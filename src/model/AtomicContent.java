package model;

import visitor.Visitor;

public abstract class AtomicContent implements Content {

    protected String title;
	protected String author;

	public void accept(Visitor v) {
        v.visit(this);
    }

	/**
	 * Get the title of the image.
	 * @return title
	 */
	public String getTitle() {
	    return title;
	}

	/**
	 * Get the author of the image.
	 * @return author
	 */
	public String getAuthor() {
	    return author;
	}
}
