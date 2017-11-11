import java.util.ArrayList;

public class School {
	
	//Variables for this class

	Library library = new Library();
	ArrayList<Student> listOfStudents = new ArrayList<>();
	ArrayList<Teacher> listOfTeachers = new ArrayList<>();
	int numStudents = 0;
	String name;
	int numTeachers = 0;
	Student student;
	Teacher teacher;
	final static int MAX_STUDENTS = 1500;
	final static int MAX_TEACHERS = 300;
	String status;
	final static String OPEN = "Open";
	final static String CLOSED = "Closed";
	
	
	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	public static void main(String args[]) {
		//TODO create a school (similar to the library)
		School school = new School("Harbour Pointe"); 
	
		//TODO Print the toString method in school. Such as, school.toString()
		System.out.println(school.toString());
		//TODO Print any other variables that make sense for a school. Be creative.
		
		System.out.println("Shool name: "+school.getSchoolName());
		System.out.println("Status: " +school.getSchoolStatus());
		school.closeSchool();
		System.out.println("Status: " +school.getSchoolStatus());
		try {
			school.setNumStudents(400);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Number of students is : "+school.getStudents());
		try {
			school.setNumTeachers(600);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Number of teachers is : "+school.getTeachers());
	}
	
	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name) {
		this.name = name;
		this.status = OPEN;
	}
	
	
	/**
	 * Constructs a school.
	 */
	public School() {
	}
	
	/**
	 * Write a method to return a list of all books at the school
	 */
	public String toString() {
		return this.library.toString();
	}
	
	/**
	 * adds a single student to the school
	 */
	public void AddSingleStudent() {
		numStudents++;
		//Do I need a MAX_STUDENTS ???
	}
	
	/**
	 * adds a single teacher to the school
	 */
	public void AddSingleTeacher() {
		this.numTeachers++;
	}
	
	/**
	 * removes a single teacher from the school
	 */
	public void removeSingleTeacher() {
		if(numTeachers > 0) {
			numTeachers--;
		}
	}
	/**
	 * removes a single student from the school
	 */
	public void removeSingleStudent() {
		if(numStudents > 0) {
			numStudents--;
		}
	}
	
	/**
	 * method to return number of teachers
	 * 
	 * @return number of teachers in the school
	 */
	public int getTeachers() {
		return numTeachers;
	}
	
	void setNumStudents(int numStudents) throws Exception{
		if(MAX_STUDENTS<numStudents) {
			throw new  IllegalArgumentException("Entered value more that max number "+MAX_STUDENTS); 
		} 
		this.numStudents = numStudents;
	}

	Library getLibrary() {
		return library;
	}

	void setLibrary(Library library) {
		this.library = library;
	}

	static int getMaxStudents() {
		return MAX_STUDENTS;
	}

	String getSchoolName() {
		return name;
	}

	void setSchoolName(String name) {
		this.name = name;
	}

	void setNumTeachers(int numTeachers) throws Exception{
		if(MAX_TEACHERS<numTeachers) {
			throw new  IllegalArgumentException("Entered value more that max number "+MAX_TEACHERS); 
		} 
		this.numTeachers = numTeachers;
	}

	/**
	 * method to return number of students
	 * 
	 * @return number of students in the school
	 */
	public int getStudents() {
		return numStudents;
	}
	
	void openSchool() {
		this.status = OPEN;
	}
	
	void closeSchool() {
		this.status = CLOSED;
	}
	
	
	String getSchoolStatus() {
		return this.status;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Teacher> getListOfTeachers() {
		return listOfTeachers;
	}

	public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
		this.listOfTeachers = listOfTeachers;
	}

	public ArrayList<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(ArrayList<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
}
