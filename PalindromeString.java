package javasessions;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsStringPalindrome("teet");
		IsStringPalindrome("asdas");
		IsStringPalindrome("tintin");
	}
	
	public static void IsStringPalindrome(String str)
	
	{
		String t;
		t=str;
		StringBuffer rev = new StringBuffer(String.valueOf(str)).reverse();
		System.out.println("Reversed string is "+rev);
		if(t.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome ");
		}
	}
}
