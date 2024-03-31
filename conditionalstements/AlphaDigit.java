class AlphaDigit {
    public static void main(String[] args) {
        char ch = 'a';
	if((ch >=  '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')||  (ch >= 'A' && ch <= 'z')){
	if(ch >=  '0' && ch <= '9'){
	System.out.println(ch + "it is digit");
	}else{
	System.out.println(ch + "it is alphabet");
	}
	}else {
	System.out.println(ch + "it is special character");
	}
	
	    }
}
