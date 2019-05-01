import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

	static int i;
	static Scanner scnr = new Scanner(System.in);

	public static int[] arrayCreator() {
		int grade; 
		int[] grades;
		ArrayList < Integer > userGrades = new ArrayList < Integer > (); 
		boolean Continue = true;

		while (Continue) {
			System.out.println("Enter a grade : ");
			grade = scnr.nextInt();
			if (grade >= 0) userGrades.add(grade); 
			else break; 
		}

		if (userGrades.size() != 0 ) {
			grades = new int[userGrades.size()];
			for (i = 0; i < grades.length; ++i) {
				grades[i] = userGrades.get(i); 
			}
		}
		else {
			grades = new int[0];
		}
		return grades;
	}

	public static int readGrades (int [] grades) {
	/* Parameters:
		grades - The array that will hold the grades that are read in.
	   Returns:
		The number of grades that were read from the user.
	 */
		int gradeValue = grades.length;

		return gradeValue; 
	}

	public static int sum (int[] arr) {
	/* Parameters:
		array - An array of int values
	   Returns:
		This method returns an int representing the computed sum of all the elements in arr
	 */
		int sum = 0; 
		for (i = 0; i <arr.length; ++i) {
			sum = sum + arr[i]; 
		}
		return sum;
	}

	public static int sum (int[] array, int firstIndex, int lastIndex) {
	/* Parameters:
		array - An array of int values
		firstIndex - The index of the first element to include in the sum
		lastIndex - The index of the last element to include in the sum
	   Returns:
		This method returns an int representing the computed sum of the elements in array starting at firstIndex and ending at lastIndex. 
		If either index is invalid, the method should return the value -666
	 */
		int sum = 0; 

		if (firstIndex < 0 || lastIndex >= array.length || firstIndex >= array.length || lastIndex < 0 || lastIndex < firstIndex) {
			return -666;
		}
		else {
			for (i = firstIndex; i <= lastIndex; ++i) {
				sum = sum + array[i]; 
			}
			return sum;
		}
	}

	public static double average (int[] array) {
		/* Parameters:
			array - An array of int values
		   Returns:
			This method returns a double representing the computed average of all the elements in array
		*/
		double sum = 0; 
		
		for (i = 0; i < array.length; ++i) {
			sum = sum + array[i]; 
		}
		return (sum / array.length);
	}

	public static int maxValue (int [] array) {
	/* Parameters:
	 	array - An array of int values
	   Returns:
		This method returns an int representing the maximum value of all the elements in array
	 */
		int maxVal = array[0]; 

		for (i = 0; i < array.length; ++i) {
			if (array[i] > maxVal) {
				maxVal = array[i];
			}
			else {
				continue;
			}
		}
		return maxVal;
	}

	public static int maxValue (int[] array, int firstIndex, int lastIndex) { 
		/* Parameters:
		 	array - An array of int values
			firstIndex - The index of the first element to include in the search
			lastIndex - The index of the last element to include in the search		   
		   Returns:
			This method returns an int representing the maximum value of the elements in array in the range starting at firstIndex and ending at lastIndex. 
			If either index is invalid, the method should return the value -666 
		*/
		int maxVal = array[0];

		if (firstIndex < 0 || lastIndex >= array.length || firstIndex >= array.length || lastIndex < 0 || lastIndex < firstIndex) {
			return -666;
		}
		else {
			for (i = firstIndex; i <= lastIndex; ++i) {
				if (array[i] > maxVal) {
					maxVal = array[i];
				}
				else {
					continue; 
				}
			}
			return maxVal;
		} 
	}

	public static int indexOfFirstMaxValue (int[] array) {
		/* Parameters:
			array - An array of int values
     	   Returns:
			This method returns an int representing the index of the first occurrence of maximum value in array
		 */
		int maxVal = array[0];
		int elementAmount = 0;

		for (i = 0; i < array.length;++i) {
			if (array[i] > maxVal) {
				maxVal = array[i];
			}
			else {
				continue;
			}
		}

		for (i = 0; i < array.length; ++i) {
			if (array[i] == maxVal) elementAmount = i;
		}
		return elementAmount;
	}

	public static int minValue (int [] array) {
		/* Parameters:
			array - An array of int values
		   Returns:
			This method returns an int representing the minimum value of all the elements in array
		*/
		int minVal = array[0];

		for (i = 0; i < array.length; ++i) {
			if (array[i] < minVal) {
				minVal = array[i];
			}
			else {
				continue;
			}
		}
		return minVal;
	}

	public static int minValue (int[] array, int firstIndex, int lastIndex) {
		/* Parameters:
			array - An array of int values
			firstIndex - The index of the first element to include in the search
			lastIndex - The index of the last element to include in the search
		   Returns:
			This method returns an int representing the minimum value of the elements in array in the range starting at firstIndex and ending at lastIndex. 
			If either index is invalid, the method should return the value -666
		 */
		int minVal = array[0];

		if (firstIndex < 0 || lastIndex >= array.length || firstIndex >= array.length || lastIndex < 0 || lastIndex < firstIndex) {
			return -666;
		}
		else {
			for (i = firstIndex; i <= lastIndex; ++i) {
				if (array[i] < minVal) {
					minVal = array[i];
				}
				else {
					continue; 
				}

			}
			return minVal;
		}
	}

	public static int indexOfFirstMinValue (int[] array) {
		/* Parameters:
			array - An array of int values
		   Returns:
			This method returns an int representing the index of the first occurrence of minimum value in arrAY
		 */
		int minVal = array[0];
		int elementAmount = 0;

		for (i = 0; i < array.length; ++i) {
			if (array[i] < minVal) {
				minVal = array[i];
			}
			else {
				continue;
			}
		}
		
		for (i = 0; i < array.length; ++i) {
			if (array[i] == minVal) {
				elementAmount = i;
			}
		}
		return elementAmount;
	}

	public static int numberOfBelowAverageElements (int[] array) {
		/* Parameters:
			array - An array of int values
		   Returns:
			This method returns the count of elements in array that are below the average of all the elements in the array
		 */
		double average = average(array);
		int elementAmount = 0;

		for (i = 0; i < array.length; ++i) {
			if (array[i] < average) {
				++elementAmount;
			}
		}
		return elementAmount;
	}

	public static int numberOfAboveAverageElements (int[] array) {
		/* Parameters:
			array - An array of int values
		   Returns:
			This method returns the count of elements in array that are above the average of all the elements in the array
		 */
		double average = average(array);
		int elementAmount = 0;

		for (i = 0; i < array.length; ++i) {
			if (array[i] > average) {
				++elementAmount;
			}
		}
		return elementAmount;
	}

	public static void rotateElements (int[] array) {
		/* Parameters:
			array - An array of int values
		*/
		int lastInt = array[array.length - 1];
		for (i = array.length-1; i > 0; --i) {
			array[i] = array[i-1]; 
		}
		array[0] = lastInt;
	}

	public static void rotateElements (int[] arrayOne, int rotationCount) {
		/* Parameters:
			array - An array of int values
			rotationCount - The number of times to rotate the array elements to the right.
		 */
		int index = 0;
		int[] arrayTwo = new int[arrayOne.length];

		if (rotationCount > arrayOne.length) {
			rotationCount = (rotationCount % arrayOne.length); 
		}
		for (i = 0;i < rotationCount; ++i) {
			arrayTwo[i] = arrayOne[arrayOne.length-rotationCount + i]; 
		}
		for (i = rotationCount; i < arrayOne.length; ++i) {
			arrayTwo[i] = arrayOne[index];
			++index; 
		}
		for (i = 0;i < arrayOne.length; ++i) {
			arrayOne[i] = arrayTwo[i]; 
		}
	}

	public static void reverseArray (int[] arrayOne) {
		/* Parameters:
			array - An array of int values
			*/
		int[] arrayTwo = new int[arrayOne.length];
		int j = arrayOne.length;

		for (i = 0; i < arrayOne.length; ++i) {
			arrayTwo[j-1] = arrayOne[i]; 
			j = j - 1; 
		}
		for (i = 0; i < arrayOne.length; ++i) {
			arrayOne[i] = arrayTwo[i]; 
		}
	}

	public static void main(String[] args) {
		boolean Continue = true;

		while (Continue) {
			int [] grades = arrayCreator();
			if (grades.length != 0) {
				int numGrades = readGrades(grades);
				int maxValue = maxValue(grades);
				int minValue = minValue(grades);
				System.out.println("Number Of Grades = " + numGrades) ;
				System.out.println("Maximum Grade = " + maxValue);
				System.out.println("Minimum Grade = " + minValue);
				System.out.println(""); 
			}
			else { 
				Continue = false; 
				break;
			} 
		}
	}
}
