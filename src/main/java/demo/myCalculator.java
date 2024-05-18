package demo;

public class myCalculator {
         public int sum(int a, int b) {
        	 return a+b;
         }
         public int diff(int a, int b) {
        	 return a-b;
         }
         public int mul(int a, int b) {
        	 return a*b;
         }
         public int div(int a, int b) {
        	 return a/b;
         }	
         public void show() {
        	 System.out.println("Hello GFG"); 
         }	
         public void show1() {
        	 System.out.println("Hello GFG2"); 
         }	
	
	public static void main(String[] args) {
		myCalculator calc = new myCalculator();
		System.out.println("sum is :" +calc.sum(20, 10));
		System.out.println("diff is :" +calc.diff(20, 10));
		System.out.println("mul is :" +calc.mul(20, 10));
		System.out.println("div is :" +calc.div(20, 10));
        calc.show();
        calc.show1();
	}

}
