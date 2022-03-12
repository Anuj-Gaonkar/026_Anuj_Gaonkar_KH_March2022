//To print the following series EVEN number Series 2 4 6 8 10 12 14 16 .....

import java.util.*;
class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}