/*
 * Author:Sarah DiPietra
 * Created 2.7.2019
 * Description: Program will calculate the average of 3 numbers. 
 */
import java.util.Scanner; class Average {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double Number1;
		double Number2;
		double Number3;
	
		System.out.println("Enter Number 1: ");
		Number1 = scnr.nextDouble();
		System.out.println("Enter Number 2: ");
		Number2 = scnr.nextDouble();
		System.out.println("Enter Number 3: ");
		Number3 = scnr.nextDouble();
		
		double Average = (Number1 + Number2 + Number3) / 3;
		System.out.print("Average: " + Average);
	}
} 