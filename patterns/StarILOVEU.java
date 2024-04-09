class StarILOVEU {
    public static void main(String[] args) {
       	for(int i = 1; i<=5; i++){
		for(int j = 1; j<=30; j++){
			if(j == 2 || j == 5 || j == 9 || j == 11 || j == 24 || j == 28 || j == 30 || (i == 1 && j <= 3) || (i == 5 && j <= 3) || (i == 5 && (j >= 5 && j <=7)) || (i == 1 && j == 10) || (i == 5 && j == 10) || ((j-i == 12) || ( i+j == 22)) || (i== 1 && (j>=24 && j<= 26)) || (i== 3 && (j>=24 && j<= 26)) || (i== 5 && (j>=24 && j<= 26)) || (i == 5 && j == 29) ){
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
							
		}
		System.out.println();
				
	}	
    }
}
