package javasessions;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindromenumber(121);
		isPalindromenumber(0);
		isPalindromenumber(221);
		isPalindromenumber(151);
		
		
	}
	public static void isPalindromenumber(int num) {
		System.out.println("THe number is "+num);
		int rev=0;
		int sum=0;
		int temp;
		temp=num;
		
		while(num>0) {
			rev=num%10;
			num=num/10;
			sum=(sum*10)+rev;
			
		}
		//System.out.println(num);
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}
}
