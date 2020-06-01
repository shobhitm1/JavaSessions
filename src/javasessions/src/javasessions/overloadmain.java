package javasessions;

public class overloadmain {
	//JVM will search main with this method String[]// it should be public static void
	// If we comment void main (String[] args) then compiler won't show the run options.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method-1");
		
		main(20);main(10,2); 
	}
	//method overloading:- different number of method with same name and different arguments
	 
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("main method-2");
	}
	public static void main(int a ,int b) {
		// TODO Auto-generated method stub
		System.out.println("main method-3");
	}
 
}
