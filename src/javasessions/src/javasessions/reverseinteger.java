 package javasessions;

public class reverseinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1234567890;
		int rev = 0;
		
		while(i!=0) {
			rev=rev*10+i%10;
			i=i/10;
		}
		System.out.println("Reversed number is"+" "+rev);
		//Second Method using StringBuffer class
		System.out.println(new StringBuffer(String.valueOf(rev)).reverse());
	}

}
