package javasessions;

import java.util.Scanner;
import java.util.stream.Stream;

public class HELLODIFF {

	public static void main(String[] args) {
		//1: Print HELLO for the given string "AHCECLWLXO"
		String b="AHCECLWLXO";
		String[] split=b.split("");
		for(int i=1;i<split.length;i=i+2) {
			System.out.print(split[i]);
		}

		//2.Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
		System.out.println(" ");
		String c="ahceclwlxo";
		String[] splitt=c.split("");
		//c.toUpperCase();
		for(int i=1;i<splitt.length;i=i+2) {
			System.out.print(splitt[i].toUpperCase());
		}
		System.out.println(" ");
		String s="AHCECLWLXO";
		Stream.iterate(1, i->i+2).map(n->s.charAt(n)).limit(s.length()/2).forEach(System.out::print);
		//2: Print all the numbers between -15 to 10.
		for(int i=-15;i<10;i++) {
			//System.out.println(i);
		}
		//Ask user to enter a number and then print the multiplication table of the input number.
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();int mul=1;
		for(int i =1;i<=10;i++) {
			System.out.println(a+ "*"+ i+" ="+ i*a);
		}
		
	}

}

