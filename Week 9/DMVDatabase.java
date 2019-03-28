import java.util.Scanner;

public class DMVDatabase {
	static Scanner scnr = new Scanner(System.in);

	static int age; 
	static boolean testPass;
	static int yearGenerated; 
	static int expirationYear;
	static String test;


	public static void generateDL(int age, boolean testPass) {

		if (age >= 17 && testPass == true) {
			System.out.println("Drivers Liscense is generated");
		}
		else  {
			System.out.println("Cannot generate a Drivers Liscense");
		}
	}	

	public static int expirationDate(int yearGenerated) {

		System.out.println("Enter the year: ");
		yearGenerated = scnr.nextInt();

		int expirationYear = yearGenerated + 10; 
		return expirationYear;
	}

	public static void main(String[] args) {

		System.out.println("Enter your age: ");
		age = scnr.nextInt();
		System.out.println("Did you pass your test? (Yes/No)");
		String test = scnr.next();
		if (test.equalsIgnoreCase("Yes")) {
			testPass = true;
		}
		else if (test.equalsIgnoreCase("No")) {
			testPass = false;
		}

		generateDL(age, testPass); 
		if (age >= 17 && testPass == true)
			expirationYear = expirationDate(yearGenerated); 


		System.out.println("The expiration date of your Drivers Liscense is " + expirationYear);
	}
}
