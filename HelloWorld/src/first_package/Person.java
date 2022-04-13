package first_package;

public class Person {

	// FIELDS
	
	private String name;
	private String lastname;
	private int age;

	// ================================================= //
	
	// getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// ================================================= //

	// ctor
	
	public Person(String name, String lastname, int age) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	
	// ================================================= //
	
	// toString method
	public String toString() {
		return
				">>> PERSON CARD <<<" 	+
				"\n> Name: " 			+ name +
				"\n> Lastname: " 		+ lastname +
				"\n> Age: " 			+ age;
	}
	
}
