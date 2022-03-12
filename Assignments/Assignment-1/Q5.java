//How to check the given number is Positive or Negative in Java?
import java.util.*;
class Q5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println((num >= 0)?"Positive Number":"Negative Number");
	}
}