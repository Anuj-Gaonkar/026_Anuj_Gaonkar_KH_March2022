/*
22. Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4
*/

import java.util.Scanner;
class Question22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a binary number : ");
		String binaryString = sc.next();
		System.out.println("Decimal number is: "+Integer.parseInt(binaryString, 2));
	}
}