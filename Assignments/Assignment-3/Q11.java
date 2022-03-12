//Write a Java Program to find the smallest of 3 numbers (a,b,c)

import java.util.*;
class Q11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter c:");
		int c = sc.nextInt();
		
		if(a > b &&  a > c){
			System.out.println("A is greater");
		} else if(b > a && b > c){
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}
}