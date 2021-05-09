 package javasessions;

public class IntegerDigitsSum {

	public static void main(String[] args) {
		int a=1231298991;
		int sum=0;
		while(a!=0) {
			sum=sum+a%10;
			a=a/10;
			
		}System.out.println("The sum of digits is" + " "+ sum);

	}

}
