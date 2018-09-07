package com.String;

public class PatternMatching {
	
	public static void main(String[] args) {
		
		naivePatternMatching("Sricheta Ruj San Jose State University", "San1");
	}

	private static void naivePatternMatching(String text, String pat) {
		
		char[] textArr = text.toCharArray();
		char[] patArr = pat.toCharArray();
		
		for(int i =0; i<textArr.length;i++) {
			int j =0;
			while(j<patArr.length && textArr[i+j] == patArr[j]) {
				j++;
			}
			
			if(j == patArr.length) {
				System.out.println("Pattern found at "+ i);
			}
		}
		
	}

}
