/*
 * File: FactorialofNNumbers.java
 * Author:Sarah DiPietra
 * Created 3.7.2019
 * Description: Program will calculate the factorial of any natural numbers from 1 to n (inclusive) using 'for' loops, where the n is given by the user. 
 */
import java.util.Scanner; 

public class FactorialofNNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	 
		System.out.println("Enter the number of natural numbers: ");
		int n = scnr.nextInt();
		int numFactorial = 1;
		
		for (int i = 1; i <= n; i++) {
			numFactorial = numFactorial * i; 
		}
		System.out.println("The factorial of the first " + n + " natural numbers is: " + numFactorial);
		
		
	}

}
