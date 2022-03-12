//Check the given number is EVEN or ODD.
import java.util.*;
class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println("Given number is Even number.");
		} else {
			System.out.println("Given number is Odd number.");
		}
		
	}
}