/*
23. Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: D
*/

import java.util.Scanner;
class Question23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a binary number : ");
		//String binaryCode = "0b";
		String binaryString = sc.next();
		//int binaryInt = sc.nextInt();
		//binaryString = binaryCode+binaryString;
		
		//System.out.println("binaryInt : "+ binaryInt);
		int decimal = Integer.parseInt(binaryString, 2);	// Converting binary string to decimal integer
		//System.out.println(decimal);
		System.out.println(Integer.toHexString(decimal));	// Converting decimal integer to hexadecimal string
	}
}