
public class Book{
	private String title;
	int pages;
	String genre;
	String author;
	boolean status;
	
	
	/*
	 * Constructor for the book
	 */
	public Book(String title, int pages, String genre, String author) {
		this.setTitle(title);
		this.pages = pages;
		this.genre = genre;
		this.author = author;
	}
	
	public Book() {
		
	}
	boolean isStatus() {
		return status;
	}

	void setStatus(boolean status) {
		this.status = status;
	}

	public String toString() {
		return getTitle();
	}
	
	public String Details() {
		return "Title: " + getTitle() + ", #pages: " + pages + ", Author: " + author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
}
