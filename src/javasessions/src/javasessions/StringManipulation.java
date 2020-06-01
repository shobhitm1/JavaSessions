package javasessions;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string-->collection of different characters.
		// Using String Functions //Strings are immutable objects.//String does not have reverse functions.
		String str = "   The rains have started here sky  ";
		String str1 = "The rains have Started here sky";
		int len =str.length(); //find the length of the string.
		System.out.println(len); //size method is for list objects or arraylist.
		System.out.println(str.charAt(5)); //to get the string at an index.
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		//System.out.println(str.indexOf('s',str.indexOf('s', str.indexOf('s')+1)));
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello")); //it will return -1 as it is not present in the string.
		//string comparison is case sensitive ..comparison should be exact sequence
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,9));//exclude 9th value i.e. from 0 to 8
		System.out.println(str.trim());// removes before and after space ,does not remove in between spaces.
		System.out.println(str.replace(" ",""));
		String date="01-12-2020";
		System.out.println(date.replace("-","/"));
		String stri="Hello_world_test_selenium";
		String test[]=stri.split("_"); //split method will always return in string array
		for(int i=0;i<test.length;i++) {
			System.out.println(test[i]);
		}
		System.out.println(str.concat(test[0]));
		String x="Hello";String y="World";int a=100; int b =200;
		System.out.println(x.concat(y));System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
	}

}
