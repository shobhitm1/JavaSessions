package javasessions;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="World";
		
		System.out.println("Before Swapping ");
		System.out.println("Value of A is ::>"+a);
		System.out.println("Value of B is ::>"+b);
		int len= a.length();
		//1.Append a and b
		a=a+b;
		//2. Store inital string a in string b
		b=(a.substring(0,(a.length()-b.length())));
		//3.Store initial string b in string a
		a=a.substring(b.length());
		System.out.println("After Swapping "); 
		System.out.println("Value of A is "+a);
		System.out.println("Value of B is "+b);
		
		
		
		
	}

}
