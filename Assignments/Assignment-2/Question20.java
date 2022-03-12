/*
20. Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F
*/

import java.util.Scanner;
class Question20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a decimal number : ");
		int test = sc.nextInt();
		System.out.println("Hexadecimal nummber is : "+Integer.toHexString(test));
	}
}