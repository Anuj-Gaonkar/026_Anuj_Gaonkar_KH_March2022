class pattern4part3{
	public static void main(String args[]){
		
		for(int i = 1; i <= 9; i++){
			int count = 1;
			for(int j = i; j <= 9; j++){
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(count+++" ");
			}
			int count1 = i-1;
			for(int j = 1; j <= i-1; j++){
				System.out.print(count1--+" ");
			}
			System.out.println();
		}
	}
}

/*

Output:
                  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/