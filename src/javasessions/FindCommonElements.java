package javasessions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,7,3,9,2};
		int arr2[]= {3,2,4,9,40,32,4};
		//1st Method
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.println("Common element is "+" "+arr[i]);
					}
				}
				
				
			}
		//2nd Method
		Integer[] array1 = {9, 4, 6, 2, 10, 10};
        Integer[] array2 = {14, 3, 6, 9, 10, 15, 17, 9};                    
        @SuppressWarnings("unchecked")
		Set hashSet = new HashSet<Integer>(Arrays.asList(array1)); 
        Set<Integer> commonElements = new HashSet();        
        for (int i = 0; i < array2.length; i++) {
            if (hashSet.contains(array2[i])) {
                commonElements.add(array2[i]);
            }
        }
        System.out.println("Common elements " + commonElements);
    }    
		
		
		
		
	}


