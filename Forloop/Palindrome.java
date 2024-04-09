class Palindrome {
    public static void main(String[] args) {
	int num = 234323;	
	int res = 0,rem, temp = num;
	while( num != 0){
		rem = num % 10;
		res = res*10 + rem;
		num /=10;						
	}
	if(temp == num){
		System.out.println("Palindrome");
	}else {
		System.out.println("not a palindrome");
	}

       
    }
}
