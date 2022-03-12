/*
25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8
*/

import java.util.*;
class Question25{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input any octal number: ");
		String octalNumber = sc.next();
		int octalToDecimal = Integer.parseInt(octalNumber, 8);
		System.out.println("Equivalent decimal number: "+octalToDecimal);
	}
}