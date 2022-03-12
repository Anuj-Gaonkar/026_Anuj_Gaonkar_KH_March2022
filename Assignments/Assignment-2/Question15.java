/*
15. Write a Java program to swap two variables.
*/

class Question15{
	public static void main(String args[]){
		/* 
		//Without using third variable
		int n1 = 10;
		int n2 = 20;
		System.out.println("n1 = "+n1+" n2 = "+n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("n1 = "+n1+" n2 = "+n2);
		*/
		
		//Using thiord variable
		int n1 = 10;
		int n2 = 30;
		System.out.println("n1 = "+n1+" n2 = "+n2);
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("n1 = "+n1+" n2 = "+n2);
	}
}