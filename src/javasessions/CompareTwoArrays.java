package javasessions;

import java.util.ArrayList;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int [] a= {2,4,1,15,13};
		int [] b= {4,4,1,18,12};
		int[] c= {};
		ArrayList<Integer> ar= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				ar.add(i);
			}
		}
		ar.toArray();
		System.out.println(ar);
	}

}
