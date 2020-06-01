package javasessions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double first =reader.nextDouble();
		double second =reader.nextDouble();
		
		double result =0;
		 System.out.println("Enter any operator among :(+ - / *)");
		 char operator =reader.next().charAt(0);
		 switch (operator) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '/':
			result=first/second;
			break;
		case '*':
			result=first*second;
			break;	

		default:
			System.out.println("Enter the correct operator");
			
			break;
		}
		System.out.println(result);
	}

}
