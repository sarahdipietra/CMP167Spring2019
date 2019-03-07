/*
 * File: PowerofNNumbers.java
 * Author:Sarah DiPietra
 * Created 3.7.2019
 * Description: Program will calculate the factorial of any natural numbers from 1 to n (inclusive) using 'for' loops, where the n is given by the user. 
 */
import java.util.Scanner; 

public class PowerofNNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the number of powers: ");
		int n = scnr.nextInt();
		double numPower = 0;
				
		for (int i = 0; i < n; i++) {
			numPower = Math.pow(2.0, i);
			System.out.println(numPower);
		}

	}

}
