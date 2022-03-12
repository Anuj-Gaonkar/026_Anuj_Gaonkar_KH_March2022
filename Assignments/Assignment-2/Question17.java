/*
17. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output
Sum of two binary numbers: 101
*/

class Question17{
	public static void main(String args[]){
		int n1 = 0b10;  //0b for denoting binary number
		int n2 = 0b11;
		int sum = n1 + n2;
		System.out.println(Integer.toBinaryString(sum));
	}
}