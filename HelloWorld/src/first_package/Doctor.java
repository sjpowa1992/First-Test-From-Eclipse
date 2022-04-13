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
	
	public int getTotalOperations() {
		return total_operations;
	}
	
	public void setTotaloperations(int total_operations) {
		this.total_operations = total_operations;
	}
	
	public int getSuccessful_operations() {
		return successful_operations;
	}
	
	public void setSuccessfuloperation(int successful_operations) {
		this.successful_operations = successful_operations;
	}
	
	// ================================================= //
	
	// constructor
	
	public Doctor(String name, String lastname, int age, String type, int years_of_work,
			int total_operations ,int successful_operations) {
		super(name, lastname, age);
		this.type = type;
		this.years_of_work = years_of_work;
		this.total_operations = total_operations;
		this.successful_operations = successful_operations;
	}

	// ================================================= //

	// toString METHOD
	
	public String toString() {
		return	super.toString() 			 +
				"\n> Type of doctor: " 		 + type +
				"\n> Year of work: " 		 + years_of_work +
				"\n> Total operations: " 	 + total_operations +
				"\n> Successful operation: " + successful_operations;
	}
	
	// ================================================= //
	
	// if the doctor has done more than 90% of successful op on totals
	// he is a good doctor
	public boolean goodDoctor() {
		
		if( ((90*total_operations) / 100) <= successful_operations)
			return true;

		return false;
	}
	
}
