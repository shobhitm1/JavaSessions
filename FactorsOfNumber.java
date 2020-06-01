package javasessions;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =37;
		for(int i=1;i<=60;i++) {
			if(num%i==0) {
				System.out.println("Factor of "+num +" is:-"+i);
			}
		}
	}

}
