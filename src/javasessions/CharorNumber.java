package javasessions;

public class CharorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c= '4';
		if((c>='a' && c<='z') || (c>='A'&&c<='Z')){
			System.out.println(c+" "+"is an alphabet");
		}
		else {
			System.out.println(c+":- "+"It is a number");
		}
	}

}
