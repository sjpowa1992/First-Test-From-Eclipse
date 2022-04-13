package first_package;

public class Doctor extends Person {

	// FIELDS
	
	private String type;
	private int years_of_work;
	private int total_operations;
	private int successful_operations;
	
	// ================================================= //
	
	// GETTERS - SETTERS
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getYears_of_work() {
		return years_of_work;
	}
	
	public void setYears_of_work(int years_of_work) {
		this.years_of_work = years_of_work;
	}
	
	public int getSuccessful_operations() {
		return successful_operations;
	}
	
	public void setSuccessfuloperation(int successful_operations) {
		this.successful_operations = successful_operations;
	}
	
	public int getTotalOperations() {
		return total_operations;
	}
	
	public void setTotalOperations() {
		this.total_operations = total_operations;
	}
	
	// ================================================= //
	
	// constructor
	
	public Doctor(String name, String lastname, int age, String type, int years_of_work,
			int successful_operations) {
		super(name, lastname, age);
		this.type = type;
		this.years_of_work = years_of_work;
		this.successful_operations = successful_operations;
	}

	// ================================================= //

	// toString METHOD
	
	public String toString() {
		return	super.toString() +
				"\nType of doctor: " + type +
				"\nYear of work: " + years_of_work +
				"\nSuccessful operation: " + successful_operations;
	}
	
	// ================================================= //
	
	public boolean goodDoctor() {
		
		if( (90*successful_operations) / 100 >= 90)
			return true;
		
		return false;
	}
	
}
