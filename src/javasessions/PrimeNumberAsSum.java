package javasessions;

public class PrimeNumberAsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkPrime(17));
		//System.out.println(checkPrime(32));
		boolean flag=false;
		int num1=4;
		for(int i=2;i<=num1/2;i++) {
			if(checkPrime(i))
			{
				if(checkPrime(num1-i)) {
					System.out.println(num1+"= "+i+" + "+(num1-i));
					flag=true;
				}
			}
		}
		if(!flag) {
			System.out.println(num1+" "+"can't be expressed as a sum of prime numbers");
		}
		
	}
	public static boolean checkPrime(int num) {
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}
}
