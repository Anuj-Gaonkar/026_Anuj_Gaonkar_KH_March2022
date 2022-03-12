//Write a Java Program to print the digits of a Given Number.

import java.util.*;
class Q8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit = 0;
		while(num>0){
			digit = num % 10;
			System.out.println(digit);
			num /= 10;
		}
	}
}