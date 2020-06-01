package javasessions;

public class FactorialNummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial of 3=3*2*1
		//Factorial of 5= 5*4*3*2*1 //Factorial of 0 is 1
		System.out.println("Factorial is "+" "+factorial(0));
		System.out.println(fact(0));
	}
	//1.Without recursion
	public static int factorial(int num) {
		
		int fact=1;
		if(num==0) {
			return 1;
		}
		for(int i=1;i<=num;i++) {
		fact=fact*i;
		}
		return fact;
	}
	//2.With Recursion :- function which calls itself.
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return (num*fact(num-1));
		}
	}

}
