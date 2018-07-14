package com.String;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
	
		 s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		 int l =0;
		 int h = s.length()-1;
		 
		 while(l<h) {
			 if(s.charAt(l++)!= s.charAt(h--)) {
				 return false;
			 }
		 }
		 return true;
		
	}
}
