package first_package;

public class Main {

	public static void main(String[] args) {
		
//		Person p1 = new Person("Pippo", "Rossi", 23);
		
//		System.out.println(p1);
		
		Doctor d1 = new Doctor("Pippo", "Rossi", 30, "Surgeon", 12, 100, 95);
		
		System.out.println(d1);
		
		System.out.println("\n> Is the Dr." + d1.getName() + " a good doctor? -> "
				+ d1.goodDoctor());
		

	}

}
