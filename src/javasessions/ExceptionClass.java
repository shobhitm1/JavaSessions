package javasessions;

import java.io.IOException;

public class ExceptionClass {

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside Try block");
			throw new IOException();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//catch(IOException e) {
		//	System.out.println(e.getMessage());
		//}
		finally {
			System.out.println("Hello");
		}
	}

}
