class Divisible34 {
    public static void main(String[] args) {
        int num = 12;
	if(num % 3 == 0 && num % 4 != 0 ){
	System.out.println(num + "good morning");
	}else{
	if(num % 4 == 0 && num % 3 != 0){
	System.out.println(num + "good After noon");
	} else{
	if(num % 3 == 0 && num % 4 == 0){
	System.out.println(num + "good evening");
	} else {
	System.out.println("good night");
	}
	}
	}
	
    }
}
