//Write a java program to Reverse a given number.

import java.util.*;
class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		int digit = 0;
		int reverse = 0;
		int copyOfNumber = a;
		while(a != 0){
			digit = a % 10;
			reverse = (reverse*10)+digit;
			a /= 10;
		}
		System.out.println(reverse);
	}
}
