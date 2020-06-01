 package javasessions;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums=20;
		getcountPrimenumber(20);
		System.out.println(" ");
		System.out.println("Total prime numbers are:-"+" "+count);
		System.out.println("2 is a prime number"+" "+isPrimeNumber(2));
		System.out.println("3 is a prime number"+" "+isPrimeNumber(3));
		System.out.println("10 is a prime number"+" "+isPrimeNumber(10));
		System.out.println("17 is a prime number"+" "+isPrimeNumber(17));
		System.out.println("0 is a prime number"+" "+isPrimeNumber(0));
		System.out.println("1 is a prime number"+" "+isPrimeNumber(1));
		System.out.println("-3 is a prime number"+" "+isPrimeNumber(-3));
		System.out.println("-2 is a prime number"+" "+isPrimeNumber(-2));
		//Negative Integers are not considered as prime numbers.
	}
	
	public static boolean isPrimeNumber(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
	//to count the number of prime numbers
	static int count = 0;
	public static void getcountPrimenumber(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
	}

}
