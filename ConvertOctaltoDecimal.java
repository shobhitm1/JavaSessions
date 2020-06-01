package javasessions;

public class ConvertOctaltoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=convertoctalToDecimal(116);
		System.out.println(num);
	}
	public static int convertoctalToDecimal(int octal) {
		int decimal=0;
		int i=0;
		while(octal!=0) {
			int rem=octal%10;
			decimal+=(rem*(Math.pow(8, i)));
			++i;
			octal=octal/10;
		}
		return decimal;
	}
}
