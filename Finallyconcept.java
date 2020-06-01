package javasessions;

import java.rmi.AccessException;

public class Finallyconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sequence of finally is first try then catch after that finally block
		//if exception handling is not proper,then exception will be thrown and finally block will be executed.
		//Test1();
		// test2();
		division();
	}
	public static void Test1() {	
		try {
			System.out.println("Inside test method");
			throw new Exception("test");
			}catch(Exception e) {
				System.out.println("Catching exception");
			}
		finally { //will give a guarantee that finally block will execute for sure,after try-catch block.
			System.out.println("This method will execute for sure.");
		}
		
		
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("test2 finally");
		}
	}
	
	public static void division() {
		int i=10;
		try {
			System.out.println("Inside Try block");
			int k=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		finally {
			System.out.println("test3 finally");
		}
		
	}
}
