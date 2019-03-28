package com.dynamicprogramming;

public class LongestPalindromeSubsequence {
	
	public static void main(String[] args) {
		longestPalindromeSubsequence("agbdba");
	}

	private static void longestPalindromeSubsequence(String s) {
		
		//System.out.println((char)(97));
		int[][] arr = new int[s.length()][s.length()];
		
		for(int i =0;i<s.length();i++) {
			arr[i][i] = 1;
		}
		
		for(int l =2;l<=s.length();l++) {
			for(int i=0;i<s.length()-l+1;i++) {
				int j = i +l-1;
				if(l==2 && s.charAt(i) == s.charAt(j)) {
					arr[i][j] = 2;
				}else if (s.charAt(i) == s.charAt(j)) {
					arr[i][j] = arr[i+1][j-1]+2;
				}else {
					arr[i][j] = Math.max(arr[i+1][j], arr[i][j-1]);
				}
			}
		}
		
		System.out.println( arr[0][s.length()-1]);
		
	}

}
