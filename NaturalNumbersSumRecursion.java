package javasessions;

public class NaturalNumbersSumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		int sum=add(num);
		System.out.println("The sum of first "+num+" "+"natural number ="+" "+sum);
	}
	public static int add(int num) {
		
		if(num!=0) {
			return num+add(num-1);
		}
		else {
			return num;
		}
		
	}

}
