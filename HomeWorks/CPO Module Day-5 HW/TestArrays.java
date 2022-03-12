public class TestArrays{
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