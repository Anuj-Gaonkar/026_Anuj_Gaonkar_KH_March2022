//Write a Java Program to find sum of the digits of a given number.

import java.util.*;
class Q10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int digit = 0;
		int sum = 0;
		while(num > 0){
			digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println(sum);
		
	}
}