package javasessions;

public class CountDigitsinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=1234;
		int count=0;
		countInt(100002); 
	}
	
	
	public static void countInt(int num) {
		int count = 0;
		while(num!=0) 
		{
			num=num/10;
			count++;
			
		}
		System.out.println("The number of digits are"+" "+count);
		
	}

}
