
public class Book{
	String title;
	int pages;
	String genre;
	String author;
	boolean status;
	
	
	/*
	 * Constructor for the book
	 */
	public Book(String title, int pages, String genre, String author) {
		this.title = title;
		this.pages = pages;
		this.genre = genre;
		this.author = author;
	}
	

	boolean isStatus() {
		return status;
	}

	void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		return title;
	}
	
	public String Details() {
		return "Title: " + title + ", #pages: " + pages + ", Author: " + author;
	}
}
