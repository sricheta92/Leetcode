package com.String;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("bb"
				+ ""));
	}

	private static int longestPalindrome(String str) {
		int[] arr = new int[256];
		for(int i=0;i<str.toCharArray().length;i++) {
			arr[str.charAt(i)]++;
		}

		int res = 0;
		boolean odd = false;
		for (int i = 0; i <256; i++)
			if (arr[i] % 2 ==0) {
				res = res+ arr[i];
			}else {
				res = res+ arr[i] -1;
				odd = true;
			}

		if(odd) {
			return res+1;
		}else {
			return res;
		}
	}

}
