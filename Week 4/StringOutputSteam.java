/*
 * File: StringOutputStream.java
 * Author: Sarah DiPietra
 * Created 2.19.2019
 * Description: Program demonstrates String Output Stream. 
 */
import java.util.Scanner; 
import java.io.PrintWriter;
import java.io.StringWriter;

public class StringOutputStream {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringWriter fullnameSW = new StringWriter();
		PrintWriter  fullnamePW = new PrintWriter(fullnameSW); 
		
		System.out.print("Please enter \" firstname lastname\": ");
		String wordOne = input.next();
		String wordTwo = input.next();
		
		fullnamePW.print(wordOne + ", " + wordTwo);
		String fullname = fullnameSW.toString();
		
		System.out.println(fullname); 
	}
}
