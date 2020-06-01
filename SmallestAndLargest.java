package javasessions;

import java.util.Arrays;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {0,0,23,24,27,0,30,12,99,10,-1 };
		int smallest=num[0];
		int largest=num[0];
		int j=0; //Time Complexity : O(n) //as there is only one loop
		for(int i=1;i<num.length;i++) {
			if(largest<num[i]) {
				largest=num[i];
			//	 j = i;
			}
			else if(num[i]<smallest) {
			smallest=num[i];
			}System.out.println("Largest number in this array is ::>"+" "+largest);
			System.out.println("Smallest number in this array is ::>"+" "+smallest);
			}
		System.out.println("Array is "+" "+Arrays.toString(num));
		
		System.out.println("Index is"+" "+j);
		
		
	}

}
