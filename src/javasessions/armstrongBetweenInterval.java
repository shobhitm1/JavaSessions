package javasessions;

import java.util.Scanner;

public class armstrongBetweenInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second numeber");
		num2=sc.nextInt();
		for(int i=num1;i<=num2;i++) {
			int num,rem,cube=0;
			num=i;
			while(num!=0) {
				rem=num%10;
				cube=cube+(rem*rem*rem);
				num=num/10;
			}
		if(cube==i)
			System.out.println("Armstrong number is "+" "+i );
		}
		
	}

}
