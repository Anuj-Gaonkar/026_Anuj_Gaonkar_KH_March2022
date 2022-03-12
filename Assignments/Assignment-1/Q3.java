//Find the Factorial of a number using Recursion.

import java.util.*;
class Q3{
	public static void main(String[] args){
		System.out.println(Q3.factorial(5));
	}
	
	public static int factorial(int n){
		if (n == 0){
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}