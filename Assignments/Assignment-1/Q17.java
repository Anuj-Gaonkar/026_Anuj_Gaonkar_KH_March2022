//Check whether the Given Number is a Palindrome or NOT.
import java.util.*;
class Q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int digit = 0;
		int reverse = 0;
		int copyOfNum = num;
		while(num > 0){
			digit = num % 10;
			reverse = (reverse * 10)+digit;
			num /= 10;
		}
		if(copyOfNum == reverse){
			System.out.println("is palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}