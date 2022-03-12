/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
import java.lang.Math;
class Question11{
	public static void main(String args[]){
		float radius = 7.5F;
		//final double pi = 3.14549d;
		double perimeter = (2 * Math.PI * radius);
		double area = (Math.PI * radius * radius);
		System.out.println("Perimeter is = "+perimeter);
		System.out.println("Area is = "+area);
	}
}