package javasessions;

public class arms {

	public static void main(String[] args) {
		int num=153;
		int rem,cube=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			cube=cube+(rem*rem*rem);
			num=num/10;
	}	
		System.out.println(cube);
		System.out.println(num);
		if(temp==cube) {
			System.out.println("Armstrong Yes");
		}
		else {
			System.out.println("No");	
		}
		
}
}
