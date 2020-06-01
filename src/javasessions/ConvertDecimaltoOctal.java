package javasessions;

public class ConvertDecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result =Decimaltooctal(109);
		System.out.println(result);
	}
	public static long Decimaltooctal(int decimal) {
		long octal=0;
		int i=1;
		int rem;
		while(decimal!=0) {
			rem=decimal%8;
			decimal=decimal/8;
			octal+=rem*i;
			i*=10;
		}
		
		return octal;
	}
}
