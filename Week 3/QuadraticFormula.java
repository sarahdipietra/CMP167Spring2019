/*
 * File: QuadraticFormula.java
 * Author:Sarah DiPietra
 * Created 2.12.2019
 * Description: Program will calculate the roots of an equation using the quadratic formula and the discriminant. 
 */
import java.util.Scanner; public class QuadraticFormula {

	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
				
		System.out.println("\t\t Welcome to the Quadratic Calculator 3000. ");
		System.out.println("This program will calculate the roots of an equation using the quadratic formula and the discriminant.");
		
		double variableA;
		double variableB;
		double variableC;
		
		System.out.println("Enter Variable A: ");
		variableA = scnr.nextDouble();
		System.out.println("Enter Variable B: ");
		variableB = scnr.nextDouble();
		System.out.println("Enter Variable C: ");
		variableC = scnr.nextDouble();
		
		double valueDiscriminant = Math.pow(variableB, 2.0) - (4 * variableA * variableC);
		double firstRoot;
		double secondRoot;
		firstRoot = ((-1 * variableB) + Math.sqrt(valueDiscriminant)) / (2 * variableA);
		secondRoot = ((-1 * variableB) - Math.sqrt(valueDiscriminant)) / (2 * variableA);
		
		System.out.print("The first root is: ");
		System.out.println(firstRoot);
		System.out.print("The second root is: ");
		System.out.println(secondRoot);
	}
}
