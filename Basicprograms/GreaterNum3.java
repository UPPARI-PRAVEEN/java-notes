class GreaterNum3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int d = (a>b ? a : b);
	String res = (d > c ? d + " is Largest" : c + " Is Largest Value");
	System.out.println(res);
    }
}
