package com.number;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(1213));
	}

	private static boolean isPalindrome(int x) {
		
		if(x<0 || (x!=0 && x%10 ==0)) return false;
		
		int rev =0;
		int p =x;
		while(x>0) {
			rev = rev*10 + x%10;
			x = x/10;
		}
		
		return p == rev;
	}
}
