/*
 * File: AgeTitle.java
 * Author:Sarah DiPietra
 * Created 2.21.2019
 * Description: Program will  classify the person's age after imputting their age. 
 */
import java.util.Scanner;  

public class AgeTitle {	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	int numAge;
		
	System.out.println("Enter Age: ");
	numAge = scnr.nextInt();
	
	if (numAge > 25) {
		System.out.println("The person is an adult.");
	}
	
	else if (18 < numAge && numAge < 25) {
		System.out.println("The person is a young adult.");	
	}
	
	else { 
		System.out.println("The person is an teen.");
	}


	}
}
