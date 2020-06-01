package javasessions;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=1001;
		int decimal=converBinarytoDecima(num);
		System.out.println(decimal);
	}
	
	
	public static int converBinarytoDecima(long num) {
		int decimalNumber=0;
		int i=0;
		long rem;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			decimalNumber+=rem*(Math.pow(2, i));
			++i;
		}
		return decimalNumber;
	}

}
