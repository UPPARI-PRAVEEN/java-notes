class StarQM {
    public static void main(String[] args) {
       	for(int i = 1; i<=10; i++){
		for(int j = 1; j<=4; j++){
			if(i == 1 || (j== 1 && (i >= 7 && i <= 10)) || (j == 4 && (i >=1 && i <= 4)) ||(i==5 && j == 3) || (i == 6 && j == 2 )){
				System.out.print("* ");
			}else{	
				System.out.print("  ");
			}
			
		}
		System.out.println();
				
	}	
    }
}
