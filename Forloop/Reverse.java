class Reverse {
    public static void main(String[] args) {
		
	int res = 0,rem;
	for(int num = 234323; num != 0; num/=10){
		rem = num % 10;
		res = res*10 + rem;						
	}
	System.out.println(res);

       
    }
}
