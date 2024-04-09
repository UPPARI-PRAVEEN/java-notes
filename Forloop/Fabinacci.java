class Fabinacci {
    public static void main(String[] args) {
	int num = 100,a=0,b=1,res=0;
	System.out.println(a);
	System.out.println(b);
	while(a+b <= 100){
		res = a + b;
		System.out.println(res);
		a = b;
		b = res; 
	}
		

       
    }
}
