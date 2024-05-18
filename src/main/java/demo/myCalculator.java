package demo;

public class myCalculator {
         public int sum(int a, int b) {
        	 return a+b;
         }
         public int diff(int a, int b) {
        	 return a-b;
         }
           	
	
	public static void main(String[] args) {
		myCalculator calc = new myCalculator();
		System.out.println("sum is :" +calc.sum(20, 10));
		System.out.println("diff is :" +calc.diff(20, 10));

	}

}
