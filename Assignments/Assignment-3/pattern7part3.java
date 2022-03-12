class pattern6part3{
	public static void main(String args[]){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(" ");
			}
			for(int j = i; j <= 9; j++){
				System.out.print(10-i+" ");
			}
			System.out.println();
		}
	}
}

/*
output:

 9 9 9 9 9 9 9 9 9
  8 8 8 8 8 8 8 8
   7 7 7 7 7 7 7
    6 6 6 6 6 6
     5 5 5 5 5
      4 4 4 4
       3 3 3
        2 2
         1
*/