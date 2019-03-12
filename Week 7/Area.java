/*
 * File: Area.java
 * Author:Sarah DiPietra
 * Created 3.12.2019
 * Description: Program will calculate the area of a rectangle, where the length and width are given by the user, the area of a circle, where the radius is given by the user, and the area of a triangle, where the base and height are given by the user. . 
 */
import java.util.Scanner; 

public class Area {	
	static Scanner scnr = new Scanner(System.in);
	
	/* 
	 * For: rectangleArea
	 * Input: Width and Length
	 * Process: Area = Width * Length
	 * Output: Area
	 */
	public static void rectangleArea() {
	
		
		System.out.println("Enter the width: ");
		double sideWidth = scnr.nextDouble();
		System.out.println("Enter the length: ");
		double sideLength = scnr.nextDouble();
		
		double rectangleArea = sideLength * sideWidth;
		System.out.println("The area is: " + rectangleArea);
	}
	

	/* 
	 * For: circleArea
	 * Input: Radius
	 * Process: Area = Radius * Radius * PI
	 * Output: Area
	 */
	public static void circleArea() {
			
		System.out.println("Enter the radius: ");
		double circleRadius = scnr.nextDouble();

		double circleArea = Math.PI * Math.pow(circleRadius, 2.0);
		System.out.println("The area is: " + circleArea);
		}
		
	/* 
	 * For: triangleArea
	 * Input: Base and Height
	 * Process: Area = Base * Height * 1/2
	 * Output: Area
	 */
	public static void triangleArea() {
				
		System.out.println("Enter the base length: ");
		double lengthBase = scnr.nextDouble();
		System.out.println("Enter the height length: ");
		double lengthHeight = scnr.nextDouble();

		double triangleArea = 1/2 * lengthHeight * lengthBase;
		System.out.println("The area is: " + triangleArea);
		}
			
	public static void main(String[] args) {
		rectangleArea();
		circleArea(); 
		triangleArea();
		}
		
	}


