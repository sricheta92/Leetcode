package com.String;

import javax.xml.bind.SchemaOutputResolver;

// program to check whether it is possible to make
//string palindrome by removing one character
public class ValidPalindrone2 {
	
	public static void main(String[] args) {
		String s = "abc";
		//System.out.println(validPalindrome(s));
		System.out.println(validPalindrometest(s));
	}

	private static boolean validPalindrometest(String s) {
		
		char[] c = s.toCharArray();
		int low =0;
		int high = s.length() -1;
		while(low<high) {
			if(c[low]!=c[high]) {
				   return isPalindrome(c, low+1, high) || isPalindrome(c, low, high-1);
			}
			 low++;
	         high--;
		}
		return true;
		
	}

	private static boolean isPalindrome(char[] c, int low, int high) {
		  while(low< high){
	            if(c[low++] != c[high--]){
	                return false;
	            }
	        }
	        return true;
	}

	private static boolean validPalindrome(String s) {
		  int l =0;
	        int h = s.length()-1;
	        
	        while(l<h){
	            if(s.charAt(l)== s.charAt(h)){
	                l++;
	                h--;
	            }else{
	            	/*  If removing str[low] makes the whole string palindrome.
	                We basically check if substring str[low+1..high] is
	                palindrome or not. */
	                if(isPalindrome(s.substring(l+1, h+1))){
	                    return true;
	                }
	                
	                /*  If removing str[high] makes the whole string palindrome
	                We basically check if substring str[low..high-1] is
	                palindrome or not. */
	                if(isPalindrome( s.substring(l, h-1))){
	                    return true;
	                }
	                
	                return false;
	                
	            }
	        }
	        
	        
	        return true;
			
	}
	public static boolean isPalindrome(String s){
	       
	       int l =0;
	       int h = s.length()-1;
	       
	       while(l<h){
	           if(s.charAt(l++)!= s.charAt(h--)){
	               return false;
	           }
	       }
	       
	       return true;
	       
	   }

}
