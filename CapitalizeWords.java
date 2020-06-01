package javasessions;

public class CapitalizeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "hello people how do you do ?";
		
		String stra[]=str.split(" ");
		for(int i=0;i<stra.length;i++) {
			String a = stra[i].substring(0,1).toUpperCase();
			String b= stra[i].substring(1);
			System.out.print(a+b+" ");
		}
	}

}
