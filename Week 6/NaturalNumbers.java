/*
 * File: NaturalNumbers.java
 * Author:Sarah DiPietra
 * Created 3.5.2019
 * Description: Program will calculate the sum of the first n natural numbers, where the n is given by the user. 
 */
import java.util.Scanner; 

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numNatural;
		int numSum = 0;
		
		System.out.println("Enter number of natural numbers: ");
		numNatural = scnr.nextInt();
	
		while (numNatural >=1) {
			numSum = (numSum + numNatural + (numNatural - 1));
			numNatural = numNatural - 2;
		}
		
		System.out.println("Sum of the numbers is: " + numSum);
		
	}
}
