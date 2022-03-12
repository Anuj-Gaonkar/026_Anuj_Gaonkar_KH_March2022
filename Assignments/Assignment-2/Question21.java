/*
21. Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17
*/

import java.util.Scanner;
class Question21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a decimal number : ");
		int number = sc.nextInt();
		System.out.println("Octal number is: "+Integer.toOctalString(number));
	}
}