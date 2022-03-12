//Swap two numbers without using third variable approach.

import java.util.*;
class Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		int copyOfNum1 = num1;
		int copyOfNum2 = num2;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Given input in sequence is "+copyOfNum1+" and "+copyOfNum2);
		System.out.println("After swapping the sequence is "+num1+" and "+num2);
	}
}