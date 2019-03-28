package com.String;

import javax.swing.text.AttributeSet.CharacterAttribute;

public class LongestPalindromSubstring {


	public static void main(String[] args) {
		String str = "eabcb"; 
		System.out.println("Length is: " +  
				longestPalSubstr(str));
	}

	private static String longestPalSubstr(String str) {

		boolean[][] arr = new boolean[str.length()][str.length()];
		int maxLength =0;
		int start =0;
		int end =0;
		for(int i =0;i<str.length();i++) {
			arr[i][i] = true;
		}

		for(int l =2;l<=str.length();l++) {
			for(int i =0;i<str.length()-l+1;i++) {
				int j = i +l-1;
				if(str.charAt(i) == str.charAt(j) && j == i+1) {
					arr[i][j] = true;
				}else if(arr[i+1][j-1] && str.charAt(i) == str.charAt(j)){
					arr[i][j] = true;
				}
				
				if(arr[i+1][j-1]&& maxLength< j-i+1) {
					maxLength = j-i+1;
					start = i;
					end = j;
				}
			}

		}
		
		System.out.println(str.substring(start, end+1));
		return "";
		
	}
}

