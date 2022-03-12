//How to add two numbers without using the arithmetic operators in Java?

import java.util.*;
class Q12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		for(int i = 1; i <= b; i++){
			a++;
		}
		System.out.println("a + b = "+a);
	}
}