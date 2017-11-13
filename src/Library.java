import java.util.ArrayList;


/*
 * Simple class to represent a library.
 * Library contains an arraylist of books
 */
public class Library {

	private ArrayList<Book> catalog = new ArrayList<Book>();
	
	public static void main(String[] args) {
		Library lib = new Library();
		
		System.out.println(lib.toString());
	}
	
	/**
	 * Constructs a library with multiple books in the catalog
	 */
	public Library() {
		catalog.add(new Book("Dune", 500, "Fiction", "Frank Herbert"));
		
		catalog.add(new
				Book("The Wretched of Muirwood (Legends of Muirwood Book 1)", 300, "Fantasy", "Jeff Wheeler"));
		
		catalog.add(new Book("The Blight of Muirwood (Legends of Muirwood Book 2)", 466, "Fantasy", "Jeff Wheeler"));
		
		catalog.add(new Book("Dune Messiah", 340, "Science Fiction", ""));
		
		catalog.add(new Book("Children of Dune", 420, "Science Fiction",  ""));
	}
	
	/**
	 * Adds a book to catalog
	 * @param book - Book
	 */
	public void addBook(Book book) {
		this.catalog.add(book);
	}
	/*
	 * Returns every book title from within the library's catalog.
	 */
	public String toString() {
		String returnString = "";
		for( Book b : catalog) {
			returnString += b + "\n";
		}
		return returnString;
	}

	public void setCatalog(ArrayList<Book> catalog2) {
		this.catalog = catalog2;
		
	}

	ArrayList<Book> getCatalog() {
		return catalog;
	}
	
	public  Book getBookByTitle(String bookTitle) {
		Book bookA = new Book();
		for(Book bookB:catalog) {
			if(bookB.getTitle().equals(bookTitle)){
				bookA = bookB;
				return bookA;
			}
		}
		return null;
		
	}
	
	public  void bookCheckout( Student student, String bookTitle) {
		 Book book = this.getBookByTitle( bookTitle);
		if(book==null) {
			System.out.println("This book is not in our library");		
		} else if(book.status){
			student.books.add(book);
			book.status= false;
			System.out.println("Book "+book.getTitle()+" is added to student's "+
		student.firstName +" "+student.lastName+" catalog");
		} else {
			System.out.println("Book "+book.getTitle()+" is already checkout");
		}
	}
	
	
	public void bookReturn(Student student, String bookTitle) {
		 Book book = this.getBookByTitle( bookTitle);
		 if(book==null) {
				System.out.println("This book is not in our library");		
			} else if (student.books.remove(book)){
				book.status= true;
				System.out.println("Book "+book.getTitle()+" is removed from to student's "+
				student.firstName +" "+student.lastName+" catalog");
			} else {
				System.out.println("Book "+book.getTitle()+" is removed from to student's "+
						student.firstName +" "+student.lastName+" catalog");
			}
	}
}
