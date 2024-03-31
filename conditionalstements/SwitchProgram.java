class SwitchProgram {
    public static void main(String[] args) {
        char ch ='A';
	if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
		switch(ch){
			case 'a':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'e':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'i':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'o':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'u':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'A':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'E':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'I':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'O':{
				System.out.println(ch+ "it is ovewel");
				break;
			}
			case 'U':{
				System.out.println(ch+ "it is ovewel");
				break;
			}

			default:{
				System.out.println(ch + "it is a consonent");
			}
				


		}
	} else {
		System.out.println(ch + "it is special character");
	}	
    }
}
