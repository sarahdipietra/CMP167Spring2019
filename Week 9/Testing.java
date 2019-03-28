
public class Testing {

	public static void main(String[] args) {
		Person firstPerson = new Person("Sarah", 16, 'F'); 
		Person secondPerson = new Person("Ezra", 11, 'M'); 
		Person thirdPerson = new Person("Lenny", 47, 'M'); 
		Person fourthPerson = new Person("Nicole", 46, 'F'); 
		
		System.out.print("Expecting: Cannot generate a Drivers Liscense" + "\n" + "Got:");
		DMV.generateDL(firstPerson.age, false);
		System.out.print("\nExpecting: Cannot generate a Drivers Liscense" + "\n" + "Got:");
		DMV.generateDL(secondPerson.age, false);
		System.out.print("\nExpecting: Cannot generate a Drivers Liscense" + "\n" + "Got:");
		DMV.generateDL(thirdPerson.age, true);
		System.out.print("\nExpecting: Cannot generate a Drivers Liscense" + "\n" + "Got:");
		DMV.generateDL(fourthPerson.age, true);
		
	}
}
