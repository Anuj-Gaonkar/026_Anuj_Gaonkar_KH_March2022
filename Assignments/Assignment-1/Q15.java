//Write a Java Program to find LCM of two given numbers.

import java.util.*;
class Q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int a = sc.nextInt();
		System.out.println("Enter a number :");
		int b = sc.nextInt();
		int gsd = 0;
		for(int i = 1; (i <= a)&&(i<=b); i++){
			if((a%i==0)&&(b%i==0)){
				gsd = i;
			}
		}
		int LCM = (a*b)/gsd;
		System.out.println("LCM = "+LCM);
	}
}
