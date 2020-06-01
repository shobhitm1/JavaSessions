package javasessions;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String r="100A";
		Integer.parseInt(r); //NumberFormatException will be thrown as above String is not pure string.It is a mixture of string and int. 
		//int to Integer conversion
		int i = 100;
		Integer intob = Integer.valueOf(i);
		System.out.println(intob);
		Integer j = i;// Autoboxing
		System.out.println(j);
		
		//Integer to int conversion
		Integer ob = new Integer(200);
		int z = ob.intValue();
		System.out.println(z);
		int a = ob;// Unboxing
		System.out.println(a);

		// String to double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d);

		// String to int conversion:
		String e = "100";
		System.out.println(e + 20);
		int f = Integer.parseInt(e);
		System.out.println(f);

		// String to boolean
		String s = "true";
		boolean b = Boolean.parseBoolean(s);
		System.out.println("b");
		
		//int to String conversion
		int p=20;
		System.out.println(p+20); 
		String q= String.valueOf(p);
		System.out.println(q+20);
	}

}
