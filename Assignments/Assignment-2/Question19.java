/*
19. Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
*/


import java.util.Scanner;
class Question19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimnal number : ");
		int number = sc.nextInt();
		System.out.println("Binary number is : "+Integer.toBinaryString(number));
	}
}