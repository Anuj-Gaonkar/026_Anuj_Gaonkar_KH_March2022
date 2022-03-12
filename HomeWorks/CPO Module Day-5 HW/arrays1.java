class arrays1{
	public static void main(String args[]){
		int a1[][] = {{10,20,30,40,50},{12,22,32,42,52},{14,24,34,44,54},{16,26,36,46,56},{18,28,38,48,58}};
		int a2[][] = {{60,70,80,90,100},{62,72,82,92,102},{64,74,84,94,104},{66,76,86,96,106},{68,78,88,98,108}};
		
		//int a3[][] = new int[5][5];
		
		/*
		for(int x[]:a1){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		*/
		int c[][] = new int[5][5];
		c = addMatrix(a1, a2);
		for(int x[]:c){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		

	}
	
	public static int addMatrix(int a1[][], int a2[][]){
		int a3[][] = new int[5][5];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a2.length; j++){
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		return a3;
		/*
		public static int addMatrix(int a1[][], int a2[][])
		Error:
		C:\Study\CDAC\PG-DAC-March-22\Module 1 - CPOS\Day 5 - CPO\HW>java arrays1.java
		arrays1.java:17: error: incompatible types: int cannot be converted to int[][]
                c = addMatrix(a1, a2);
                             ^
		arrays1.java:35: error: incompatible types: int[][] cannot be converted to int
                return a3;
		
		*/
	}
	
}