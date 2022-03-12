class arrays1{
	public static void main(String args[]){
		int a1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int a2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum[][] = new int[3][3];
		int sub[][] = new int[3][3];
		int mul[][] = new int[3][3];
		int transpose[][] = new int[3][3];
		int diagonal[] = new int[3];
		
		sum = addMatrix(a1, a2);
		sub = substractMatrix(a1, a2);
		mul = multiplyMatrix(a1, a2);
		transpose = transposeMatrix(a1);
		int elemSum = sumOfElements(a1);
		diagonal = diagonalElement(a1);
		
		System.out.println("a1:");
		printMatrix(a1);
		System.out.println("a2:");
		printMatrix(a2);
		
		
		System.out.println("Sum of all the matrix elements: "+ elemSum+"\n");
		System.out.println("a1 + a2 = ");
		printMatrix(sum);
		System.out.println("a1 - a2 = ");
		printMatrix(sub);
		System.out.println("a1 x a2 = ");
		printMatrix(mul);
		System.out.println("Transpose of a1:");
		printMatrix(transpose);
		System.out.println("Diagonal elements of a1:");
		printMatrix(diagonal);
		
		
	}
	
	public static void printMatrix(int a1[]){
		for(int x:a1){
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static void printMatrix(int a1[][]){
		for(int x[]:a1){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] addMatrix(int a1[][], int a2[][]){
		int a3[][] = new int[3][3];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1.length; j++){
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return a3;
	}
	
	public static int[][] substractMatrix(int a1[][], int a2[][]){
		int a3[][] = new int[3][3];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1.length; j++){
				a3[i][j]=a2[i][j]-a1[i][j];
			}
		}
		return a3;
	}
	
	public static int[][] multiplyMatrix(int a1[][], int a2[][]){
		int a3[][] = new int[3][3];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1.length; j++){
				a3[i][j]=a1[i][j]*a2[i][j];
			}
		}
		return a3;
	}
	
	public static int[][] transposeMatrix(int a1[][]){
		int a3[][] = new int[3][3];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1.length; j++){
				a3[i][j] = a1[j][i];
			}
		}
		return a3;
	}
	
	public static int sumOfElements(int a1[][]){
		int sum = 0;
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1.length; j++){
				sum += a1[i][j];
			}
		}
		return sum;
	}
	
	public static int[] diagonalElement(int a1[][]){
		int a3[] = new int[3];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1.length; j++){
				if(i==j){
					a3[i] = a1[i][j];
				}
			}
		}
		return a3;
	}
}
		
/*
output:

C:\Study\CDAC\PG-DAC-March-22\Module 1 - CPOS\Day 5 - CPO\HW>java arrays2.java
a1:
1 2 3
4 5 6
7 8 9

a2:
1 2 3
4 5 6
7 8 9

Sum of all the matrix elements: 45

a1 + a2 =
2 4 6
8 10 12
14 16 18

a1 - a2 =
0 0 0
0 0 0
0 0 0

a1 x a2 =
1 4 9
16 25 36
49 64 81

Transpose of a1:
1 4 7
2 5 8
3 6 9

Diagonal elements of a1:
1 5 9
*/


/*
		System.out.println("Transpose:");
		for(int x[]:transpose){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\nAddition of matrix a1 and a2");
		for(int x[]:sum){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nSubstraction of matrix a1 and a2");
		for(int x[]:sub){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nMultiplication of matrix a1 and a2");
		for(int x[]:mul){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//int a1[][] = {{10,20,30,40,50},{12,22,32,42,52},{14,24,34,44,54},{16,26,36,46,56},{18,28,38,48,58}};
		//int a2[][] = {{60,70,80,90,100},{62,72,82,92,102},{64,74,84,94,104},{66,76,86,96,106},{68,78,88,98,108}};
*/