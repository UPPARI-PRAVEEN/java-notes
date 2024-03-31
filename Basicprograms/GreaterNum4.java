class GreaterNum4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
	int d = 35;
      	int res = ( a > b ? (a > c ? (a > d ? a : d) : (c > d ? c : d)) : ( b > c ? (b > d ? b : d ) : (c > d ? c : d)));
	System.out.println(res + " is Largest Value ");
	
    }
}
