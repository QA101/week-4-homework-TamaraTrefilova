
public class Person {
	final String firstName;
	final String lastName;
	final int age;
	
	String getFirstName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	int getAge() {
		return age;
	}

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
  
}
