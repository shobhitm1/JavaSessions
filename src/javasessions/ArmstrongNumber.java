package javasessions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//153=(1*1*1)+(5*5*5)+(3*3*3) Number is armstrong number
		//407 is a armstrong no. 
		isArmstrong(153); 

		isArmstrong(0);
		isArmstrong(371);
		}
	public static void isArmstrong(int num) {
		System.out.println("The given number is"+" "+num);
		int cube=0;
		int r;
		int temp;
		temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(temp==cube) {
			System.out.println("This number is armstrong number");
		}
		else {
			System.out.println("Number is not armstrong number");
		}
	}
}
