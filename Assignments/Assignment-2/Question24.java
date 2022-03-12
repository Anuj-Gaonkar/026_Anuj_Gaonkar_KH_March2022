/*
24. Write a Java program to convert a binary number to a Octal number.
Input Data:
Input a Binary Number: 111
Expected Output
Octal number: 7
*/

import java.util.Scanner;
class Question24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Binary Number: ");
		String binaryInput = sc.next();
		int binaryToDecimal = Integer.parseInt(binaryInput, 2);
		System.out.println("Octal number: "+ (Integer.toOctalString(binaryToDecimal)));
	}
}