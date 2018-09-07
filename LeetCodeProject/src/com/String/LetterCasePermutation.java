package com.String;

import java.util.HashSet;
import java.util.Set;

public class LetterCasePermutation {

	public static void main(String[] args) {
		generateLetterCasePermutation("aabc");
	}

	private static void generateLetterCasePermutation(String s) {
		
		/*Set<String> list = new HashSet<String>();
		list.add(s);
		
		for(int i =0;i<s.length();i++) {
			(s.charAt(i)+"").toUpperCase();
		}*/
		char[] c = s.toCharArray();
		double powset = Math.pow(2, c.length);
		for(int i =0;i<powset;i++) {
			
			for(int j =0;j<s.length();j++) {
				//System.out.println((i & (1<<j)));
				if((i & (1<<j)) >0) {
					
					System.out.print(c[j]);
				}
				//System.out.println( );
			}
			System.out.println("");
		}
		
	}
}
