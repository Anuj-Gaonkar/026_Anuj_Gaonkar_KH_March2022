class pattern10part2{
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			for(int j = i; j <= 5; j++){
				System.out.print(" ");
			}
			for(int j = 5; j>=1; j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
     * * * * *
    * * * * *
   * * * * *
  * * * * *
 * * * * *
*/