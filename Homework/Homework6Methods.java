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

	public static int getMedianOf3Ints(int A, int B, int C) {
		if (A >= B && A <= C) {
			return A;
		}
		else if (B >= C && B <= A) {
			return B;
		}
		else if (C >= A && C <= B) {
			return C;
		}
		else {
			return A;
		}
	}

	public static void printMinOf3Ints(int A, int B, int C) {
		int minValue = Math.min(Math.min(A, B), C);
		System.out.println("The min is " + minValue);
	}

	public static int getProdOfAllPositiveInts(int n, int prodValue){
		if (n <= 0) {
			return 0;
		}
		else {
			for (int i = 1; i <= n; i++) {
				prodValue = prodValue * i;
			}
		}
		return prodValue; 
	}

	public static int getProdOfAllNegativeInts(int n, int prodValue){
		if (n >= 0) {
			return 0;
		}
		else {
			for (int i = 1; i >= n; i--) {
				prodValue = prodValue * i;
			}
		}
		return prodValue; 
	}

	public static boolean isProdOfAllNegativeIntsNegative(int n) {
		int prodValue = 1;
		for (int i = -1; i >= n; --i) {
			prodValue = prodValue * i;
		}
		if (prodValue < 0) {
			return true;
		}
		else {
			return false; 
		}
	}

	public static char getCharAtIndex(String s, int index) {
		if (index >= 0 && index < s.length()) {
			char character = s.charAt(index);
			return character;
		}
		else {
			return '?';
		}
	}

	public static int getCountOfCharInString(String s, char c) {
		int charNumber = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				++charNumber;
			}
		}
		return charNumber;
	}

	public static String getStringReversed(String s) {
		String sReversed = "";
		for (int i = s.length(); i >= 0; i++) {
			sReversed = sReversed + (s.charAt(i));
		}
		return sReversed;
	}

	public static String getStringTitleCased(String s) {
		if (s.length() == 0) {
			return s;
		}
		else {
			s = s.substring(0, 1).toUpperCase() + s.substring(1);
			for (int i = 0; i < s.length(); i++) {
				if (Character.isWhitespace(s.charAt(i - 1))) {
					s = s.substring(0, i) + s.substring(i, i + 1).toUpperCase() + s.substring(i + 1);
				}
				if (!(Character.isWhitespace(s.charAt(i - 1))) && Character.isUpperCase(s.charAt(i))) {
					s = s.substring(0, i) + s.substring(i, i + 1).toLowerCase() + s.substring(i + 1);
				}
			}
			return s;
		}
	}
}
