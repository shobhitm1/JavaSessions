package javasessions;

public class SwapIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20	;
		//1st method
		/*
		 * x=x+y; y=x-y; x=x-y; System.out.println("Value of x is"+" "+x);
		 * System.out.println("Value of y is"+" "+y);
		 */
		
		//2nd Method
		
		/*
		 * x=x*y; y=x/y; x=x/y;
		 * 
		 * System.out.println("Value of x is"+" "+x);
		 * System.out.println("Value of y is"+" "+y);
		 */
		
		//3rd Method
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("Value of x is"+" "+x);
		System.out.println("Value of y is"+" "+y);
		
		
	}

}
