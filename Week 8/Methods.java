/*
 * File: Methods.java
 * Author:Sarah DiPietra
 * Created 3.19.2019
 * Description: Program will find the names and number of people encountered by aliens, where the names and number are inputed by the user.
 */
import java.util.Scanner;

public class Methods {
	static Scanner scnr = new Scanner(System.in);
	
	
	public static String Method1() {
		
		System.out.println("Greetings Earthling!!");
		return "Sarah";
	}

	public static void Method2() {
		
		String personsName;
		Method1();
		
		System.out.println("What is your name? ");
		personsName = scnr.next();
		
		if (personsName.charAt(personsName.length() - 1) == 'a' || personsName.charAt(personsName.length() - 1) == 'e') {
			System.out.println("Hello, Miss " + personsName + "\n");
		}
		else {
			System.out.println("Hello, Mister " + personsName + "\n");
		}
	}
	
	public static void Method3(int numOfPeople) {
		
		System.out.println("How many humanoids are with you? ");
		numOfPeople = scnr.nextInt();
		for (int i = 0; i < numOfPeople; ++i) {
			Method2();
		}
	}
	
	public static void main(String[] args) {
		int numOfPeople = 0;
		Method2(); 
		Method3(numOfPeople);
	}
}
