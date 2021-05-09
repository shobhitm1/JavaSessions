package javasessions;

public class sortArray {

	public static void main(String[] args) {
		int[] ar = {-10,20,-99,-18,19,59};
		int len=ar.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				int temp=0;
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
				}
			System.out.print(ar[i] +  " ");
		}
		/*
		 * for(int arr : ar) { System.out.print(arr + " "); }
		 */

	}

}
