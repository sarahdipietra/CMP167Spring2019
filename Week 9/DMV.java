public class DMV {
	public static void genrateDL(int age, boolean testPass) {
		
		if (age >= 17 && testPass == true) {
			System.out.println("Drivers Liscense is generated");
		}
		else  {
			System.out.println("Cannot generate a drivers liscense");
		}
	}
	public static int expirationDate(int yearGenerated) {
		int expirationYear = yearGenerated + 10; 
		return expirationYear;
	}
}
