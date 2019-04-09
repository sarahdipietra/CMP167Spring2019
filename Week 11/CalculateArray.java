/*
 * File: CalculateArray.java
 * Author:Sarah DiPietra
 * Created 4.9.2019
 * Description: Program will find the the sum and average of numbers in an array using different methods and a main method to check it. It will also find the number of odd elements in the array. 
 */

public class CalculateArray {
	public static int SumList(int[] array) {
		int arraySum = 0;
		for(int i = 0; i <= array.length-1; i++) {
			arraySum += array[i];
		}
		return arraySum;
	}

	public static double AverageList(int[] array) {
		double arrayAverage = 0;
		double arraySum = 0;
		for(int i = 0; i <= array.length-1; i++) {
			arraySum += array[i];
		}
		arrayAverage = arraySum / array.length;
		return arrayAverage;
	}

	public static int OddElements(int[] array) {
		int numOfOdd = 0;
		for(int i = 0; i <= array.length-1; i++) {
			if (array[i] % 2 == 0 ) {
				continue;
			}
			else {
				++numOfOdd;
			}
		}
		return numOfOdd;
	}

	public static void main(String[] args) {
		int[] array = {2, 3, 54, 12};

		System.out.println("The sum of the numbers in the array is " + SumList(array) + ".");
		System.out.println("The average of the numbers in the array is " + AverageList(array)+ ".");
		System.out.println("The amount of odd numbers in the array is " + OddElements(array)+ ".");
	}
}
