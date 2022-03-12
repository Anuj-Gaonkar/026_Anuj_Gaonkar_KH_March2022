/*
18. Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110
*/

class Question18{
	public static void main(String args[]){
		int n1 = 0b10;  //0b for denoting binary number
		int n2 = 0b11;
		int mul = n1 * n2;
		System.out.println(Integer.toBinaryString(mul));
	}
}