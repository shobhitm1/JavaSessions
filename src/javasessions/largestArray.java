package javasessions;

import java.util.Arrays;

public class largestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {11,23,411,0,999};
		int max=ar[0];
		Arrays.sort(ar);
	
		int lenght=ar.length;
		System.out.println("Max value bitches "+ ar[lenght-1]);
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
				//System.out.println(ar[i]);
			}
		}
		System.out.println(max);
		
	}

}
