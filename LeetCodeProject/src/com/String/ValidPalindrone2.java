package com.String;

import javax.xml.bind.SchemaOutputResolver;

public class ValidPalindrone2 {
	
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		
		int l =0;
		int h = s.length()-1;
		int count =0;
		while(l<h) {
			if(s.charAt(l++)!= s.charAt(h--)) {
				count++;
			}
			
		}
		if(l==h && count ==1) {
			return false;
		}
	
		if(count==0 ||count==1) {
			return true;
		}else {
			return false;
		}
			
	}

}
