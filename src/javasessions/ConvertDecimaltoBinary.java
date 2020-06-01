package javasessions;
public class ConvertDecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result =convertdecimaltoBinary(9);
		System.out.println(result);

	}
	public static long convertdecimaltoBinary(int num) {
		long binary=0;
		int rem=1;
		int i=1;
		while(num!=0) {
			rem=num%2;
			num=num/2;
			binary+=rem*i;
			i*=10;
			
		}
		return binary;
	}
}
