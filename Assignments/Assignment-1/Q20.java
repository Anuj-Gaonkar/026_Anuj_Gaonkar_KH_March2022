//print the following series ODD number Series 1 3 5 7 9 11 13 ....

import java.util.*;
class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
	}
}