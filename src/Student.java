import java.util.ArrayList;

public class Student extends Person {

	int grade;
	ArrayList<Book> books = null;
	public Student(String firstName, String lastName, int age, int grade) {
		super(firstName, lastName, age);
		this.grade = grade;
		this.books = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public boolean getBook(Book book) {
		if(books.contains(book)) {
			return true;
		}
		return false;
	}
}
