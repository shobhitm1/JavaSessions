package javasessions;

import java.util.Arrays;

public class Squares {
	public static int count=0;
	public static void main(String[] args) {
		
		int[] ar= {10,2,13,6,5};
		Arrays.sort(ar);
		for(int d : ar) {
			System.out.print(d + " ");
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=1;j<ar.length;j++) {
				int square=ar[i]*ar[i];
				if(square==ar[j]) {
					count++;	
				}
				
			}
		}System.out.println(count);
		
		if(count==0) {
			System.out.println("NO Sqaures Found in this array");
		}

	}

}
