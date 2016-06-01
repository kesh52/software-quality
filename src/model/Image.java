package model;

import visitor.Visitor;

public class Image extends AtomicContent{
    private int width;
    private int height;

    /**
     * Creates an image with the given title and author and a resolution
     * defined by width and height.
     * @param title
     * @param width
     * @param height
     * @param author
     */
    public Image(String title, int width, int height, String author) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.author = author;
    }

    /**
     * Get the width of the image.
     * @return width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of the image.
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Draws the image to the screen.
     */
    public void drawImage() {
        /*
         *  Dummy implementation
         */
        System.out.println("#########");
        System.out.println("#       #");
        System.out.println("#       #");
        System.out.println("#########");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
