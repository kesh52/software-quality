package test;

import model.Article;
import model.Image;
import model.NewsCollection;

public class Example {
	
	public static void main(String[] args) {
		NewsCollection masterCollection = new NewsCollection("Sports");
		masterCollection.addCollection(new NewsCollection("Tennis")
				.addArticle(new Article("Aaron Carter wins Wimbledon","ups"))
				.addImage(new Image("The Becker-Faust", 800, 600, "zdf"))
				.addImage(new Image("Aaron Carter smiling", 1280, 720, "anonymous"))
				.addArticle(new Article("Greenpeace riots at Wimbledon finals: "
						+ "the grass is always greener on the artificial side", "dpd")))
		.addCollection(new NewsCollection("Formula 1")
				.addArticle(new Article("Mika H�kkinen back on track", "pdf"))
				.addArticle(new Article("Alonso driving wrong-way at the Monaco Grand Prix", "ard")))
		.addCollection(new NewsCollection("Soccer")
				.addCollection(new NewsCollection("German Soccer")
						.addImage(new Image("Rooney parody", 800, 600, "anonymous"))
						.addArticle(new Article("Paul Simon prays for Luis Suarez's soul", "gps"))
				.addCollection(new NewsCollection("UK Soccer")		
						.addArticle(new Article("Oliver Kahn signs trainer contract at Schalke 04", "ddr")))));
		
		printInformationList(masterCollection);
		System.out.println("\n=================\n");
		printContents(masterCollection);
	}
	
	/**
	 * Print a list showing information about all directly or transitively
	 * referenced items in the given collection.
	 */	
	public static void printInformationList(NewsCollection rootCollection) {
		System.out.println("###" + rootCollection.getTopic() + "###");
		for (Article article : rootCollection.getArticles()) {
			System.out.println("Article: " + article.getTitle() + ", Author: " 
					+ article.getAuthor());
		}
		for (Image image : rootCollection.getImages()) {
			System.out.println("Image: " + image.getTitle() 
					+ ", Resolution: " + image.getWidth() 
					+ "x" + image.getHeight() 
					+ ", Author: " + image.getAuthor());
		}
		for (NewsCollection collection : rootCollection.getCollections()) {
			printInformationList(collection);
		}
	}
	
	/**
	 * Print the contents of all directly or transitively referenced items in
	 * the given collection.
	 */	
	public static void printContents(NewsCollection rootCollection) {
		for (Article article : rootCollection.getArticles()) {
			System.out.println("###" + article.getTitle() + "###");
			System.out.println(article.getContent());
			System.out.println();
		}
		for (Image image : rootCollection.getImages()) {
			System.out.println("###" + image.getTitle() + "###");
			image.drawImage();
			System.out.println();
		}
		for (NewsCollection collection : rootCollection.getCollections()) {
			printContents(collection);
		}		
	}	
}
