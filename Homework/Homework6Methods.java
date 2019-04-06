import java.lang.Math;

public class Homework6Methods {

	public static int getMaxOf2Ints(int A, int B) {
		int maxValue = Math.max(A, B);
		return maxValue;
	}

	public static int getMinOf2Ints(int A, int B) {
		int minValue = Math.min(A, B);
		return minValue;
	}
	
	public static int getMaxOf3Ints(int A, int B, int C) {
		int maxValue = Math.max(Math.max(A, B), C);
		return maxValue;
	}

	public static void printMinOf3Ints(int A, int B, int C) {
		int minValue = Math.min(Math.min(A, B), C);
		System.out.println("The min is " + minValue);
	}
	
	public static int getProdOfAllPositiveInts(int n, int prodValue){
		for (int i = 1; i <= n; i++) {
			prodValue = prodValue * i;
		}
		return prodValue; 
	}
	
	public static int getProdOfAllNegativeInts(int n, int prodValue){
		for (int i = 1; i <= n; i++) {
			prodValue = prodValue * i;
		}
		return prodValue; 
	}
}
