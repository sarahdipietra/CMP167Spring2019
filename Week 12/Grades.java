/*
 * File: Grades.java
 * Author:Sarah DiPietra
 * Created 4.18.2019
 * Description: Program will use a variety of methods to perform different tasks.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Grades {
	static Scanner scnr = new Scanner(System.in);

	public static int readGrades(int[] grades) {
		/** Parameters: Grades - The array  that will hold the grades that are read in.
		 ** Returns: Position - The number of grades that were given by the user. 
		 **/
		int position = 0;
		while (position < grades.length) {
			System.out.print("Enter a grade: ");
			int grade = scnr.nextInt();
			if (grade >= 0) {
				grades[position] = grade;
				position++;
			}
			else {
				break;
			}
		}
		return position;
	}

	public static void rotateElements(int[] arr) {
		/** Parameters: Arr - An array  of integer values.
		 ** Returns: Position - The number of grades that were given by the user. 
		 **/
		for (int i = 1; i < arr.length; i++) {
			if ((i + 1) == arr.length - 1) {
				arr[0] = arr[arr.length - 1];
			}
			arr[i] = arr[i];
		}
	}

	public static void main(String[] args) {
		int [] iArray = new int [10];
		int size = readGrades(iArray);
		System.out.println("The size of the array is " + size);
		System.out.println(Arrays.toString(iArray));
		rotateElements(iArray);
		System.out.println(Arrays.toString(iArray));

	}
}
