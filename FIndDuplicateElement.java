package javasessions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//import com.google.common.collect.Multiset;
//import com.google.common.collect.Multiset.Entry;



public class FIndDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Compare each element -Worst approach as time complexity is O(n*n)
		
		String names[]= {"Java", "Javascript", "C", "C++", "Python", "Java","C"};
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])){
					System.out.println("Duplicate element is "+" "+names[i]);
				}
			}
		}
		
		//2.Using HashSet (Java collection):: Stores unique values //Tine complecity :O(n)
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name)==false)
			{
				System.out.println("Duplicate element :-"+name);
			}
		}
		
		//3.Using HashMap
		Map<String,Integer> storemap = new HashMap<String,Integer>();
		for(String name:names) {
			Integer count = storemap.get(name);
			if(count == null) {
				storemap.put(name, 1);
			}
			else {
				storemap.put(name,++count);
			}
		}
		//Set<Entry<String, Integer>> entrySet = storemap.entrySet();
	}	

}
