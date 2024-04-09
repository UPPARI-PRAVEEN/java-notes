class IndividualDigits {
    public static void main(String[] args) {
		
	int res = 0;
	for(int num = 234323; num != 0; num/=10){
		res = num % 10;
		System.out.println(res);
		
	}
       
    }
}
