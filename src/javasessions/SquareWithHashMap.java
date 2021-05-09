package javasessions;

import java.util.HashMap;

public class SquareWithHashMap {

	public static void main(String[] args) {
		int[] array= {1,4,5,25,6};
		int n=array.length;
		squaremthod(array,n);
		
	}

	public static void squaremthod(int [] array,int n) {
		int count = 0;
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i],map.get(array[i])+1);
			}
			else {
				map.put(array[i], 1);
			}
		}
		for(int i=0;i<n;i++) {
			int square=array[i]*array[i];
			count += map.containsKey(square)?map.get(square):0;
		}
		System.out.println(count);	
	}

}
