class SumIndividualDigits {
    public static void main(String[] args) {
		
	int sum = 0,rem;
	for(int num = 234323; num != 0; num/=10){
		rem = num % 10;
		sum = sum + rem;
						
	}
	System.out.println(sum);

       
    }
}
