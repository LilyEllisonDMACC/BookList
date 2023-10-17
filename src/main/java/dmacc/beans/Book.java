/**
 * @author tehli - lbellison
 * CIS175 - Fall 2023
 * Oct 17, 2023
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author LILY ELLISON - LBELLISON
 * CIS175 - FALL 2023
 * Oct 17, 2023
 */
@Entity
public class Book {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String author;
	private String topic;
	private double price;
	
	public Book() {
		super();
		this.topic="Biology";
	}
	
	public Book(String title) {
		super();
		this.title = title;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, String topic) {
		super();
		this.title = title;
		this.author = author;
		this.topic = topic;
	}
	
	public Book(String title, String author, String topic, double price) {
		super();
		this.title = title;
		this.author = author;
		this.topic = topic;
		this.price = price;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", topic=" + topic + ", price=" + price
				+ "]";
	}
	
	
}
