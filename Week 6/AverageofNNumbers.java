/*
 * File: AverageofNNumbers.java
 * Author:Sarah DiPietra
 * Created 3.7.2019
 * Description: Program will calculate the average of any natural numbers from 1 to n (inclusive) all using 'for' loops, where the n is given by the user. 
 */
import java.util.Scanner; 

public class AverageofNNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	
		System.out.println("Enter the number of natural numbers: ");
		double n = scnr.nextInt();
		double numSum = 0;
		double numAverage = 0;
		
		for (double i = 1; i <= n; i++) {
			numSum = numSum + i;
		}
			numAverage = numSum / n;
		System.out.println("The average of the first " + n + " natural numbers is: " + numAverage);
	}
}
