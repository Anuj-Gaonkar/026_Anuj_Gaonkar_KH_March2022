class Main{
	public static void main(String args[]){
		int a1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int a2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum[][] = new int[3][3];
		int sub[][] = new int[3][3];
		int mul[][] = new int[3][3];
		int transpose[][] = new int[3][3];
		int diagonal[] = new int[3];
		
		sum = TestArrays.addMatrix(a1, a2);
		sub = TestArrays.substractMatrix(a1, a2);
		mul = TestArrays.multiplyMatrix(a1, a2);
		transpose = TestArrays.transposeMatrix(a1);
		int elemSum = TestArrays.sumOfElements(a1);
		diagonal = TestArrays.diagonalElement(a1);
		
		System.out.println("a1:");
		TestArrays.printMatrix(a1);
		System.out.println("a2:");
		TestArrays.printMatrix(a2);
		
		System.out.println("Sum of all the matrix elements: "+ elemSum+"\n");
		System.out.println("a1 + a2 = ");
		TestArrays.printMatrix(sum);
		System.out.println("a1 - a2 = ");
		TestArrays.printMatrix(sub);
		System.out.println("a1 x a2 = ");
		TestArrays.printMatrix(mul);
		System.out.println("Transpose of a1:");
		TestArrays.printMatrix(transpose);
		System.out.println("Diagonal elements of a1:");
		TestArrays.printMatrix(diagonal);
	}
}