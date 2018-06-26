package com.String;

public class ExcelSheetColumnNumber {
	
	public static void main(String[] args) {
		System.out.println(titleToNumber("AA"));
	}

	private static int titleToNumber(String s) {
		
		int sum =0;
		int n = s.length();
		for(int i =n-1;i>-1;i--) {
			sum += Math.pow(26,  n - (i+1))*(s.charAt(i) -'A'+1);
		}
		
		return sum;
	}

}
