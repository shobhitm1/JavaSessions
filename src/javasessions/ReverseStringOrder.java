package javasessions;

public class ReverseStringOrder {

	public static void main(String[] args) {
		String str = "My name is Shobhit";
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
		}	
		System.out.println(" ");
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}

	}

}
