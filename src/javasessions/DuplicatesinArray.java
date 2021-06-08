package javasessions;

import java.util.Arrays;

public class DuplicatesinArray {

	public static void main(String[] args) {
		int[] arr= {12,11,11,13,1,9,67,76,76};
		int n=arr.length;
		int j=duplicate(arr,n);
		System.out.println("Array After removing duplicates");
		for(int i=0;i<j;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int duplicate(int[] arr, int n) {
		Arrays.sort(arr);
		if(n==0 || n==1) {
			System.out.println("This array can not have duplicate values");
		}
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[n-1];
		for (int i=0; i<j; i++) {
            arr[i] = temp[i];
		}
		
		System.out.println(j);
		return j;
	}

}
