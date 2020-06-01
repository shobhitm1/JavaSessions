package javasessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is Java best language is java";
		String str1="Python is Python not Java should Java but Python";
		findDupilicateWords(str);findDupilicateWords(str1);
		findDupilicateWords("hi hi hi");
		findDupilicateWords("hello");
	}
	public static void findDupilicateWords(String str) {
	String words[]=str.split(" ");
	Map<String,Integer> wordCount=new HashMap<String,Integer>();
	for(String word:words) {
		 if(wordCount.containsKey(word)) {
			 wordCount.put(word, wordCount.get(word)+1);
		 }
		 else {
			 wordCount.put(word,1);
		 }
	} 
	Set<String> wordsinString = wordCount.keySet();
	for(String word:wordsinString) {
		if(wordCount.get(word)>1) {
			System.out.println(word+": "+wordCount.get(word));
		}
	}
	
	//extracting all the keys from the map
	
	
	}
}
