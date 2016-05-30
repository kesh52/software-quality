package model;

import java.util.LinkedList;
import java.util.List;

public class NewsCollection {
	
	private String topic;
	private List<Article> articles = new LinkedList<Article>();
	private List<Image> images = new LinkedList<Image>();
	private List<NewsCollection> collections = new LinkedList<NewsCollection>();
		
	public NewsCollection(String topic) {
		this.topic = topic;
	}
	
	/**
	 * Get the topic of the collection.
	 * @return
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * Get the list of articles stored directly in this collection.
	 * @return articles stored in this collection
	 */
	public List<Article> getArticles() {
		return articles;
	}
	
	/**
	 * Get the list of images stored directly in this collection.
	 * @return images stored in this collection
	 */
	public List<Image> getImages() {
		return images;
	}
	
	/**
	 * Get the list of collections stored directly in this collection.
	 * @return collections stored in this collection
	 */
	public List<NewsCollection> getCollections() {
		return collections;
	}
	
	/**
	 * Store an article directly in this collection.
	 * @param article
	 * @return this collection (enables method chaining)
	 */
	public NewsCollection addArticle(Article article) {
		articles.add(article);
		return this;
	}
	
	/**
	 * Store an image directly in this collection.
	 * @param image
	 * @return this collection (enables method chaining)
	 */
	public NewsCollection addImage(Image image) {
		images.add(image);
		return this;
	}
		
	/**
	 * Store another collection directly in this collection.
	 * @param collection
	 * @return this collection (enables method chaining)
	 */
	public NewsCollection addCollection(NewsCollection collection) {
		collections.add(collection);
		return this;
	}
}
