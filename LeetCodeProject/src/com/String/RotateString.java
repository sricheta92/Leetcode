package com.String;

public class RotateString {
	
	static String A = "";

	public static  boolean rotateString(String Aa, String B) {

		A = Aa;
		if(Aa.equals(B)) {
			return true;
		}
		for(int i =0;i<A.length();i++) {
			shiftByInteger(A,1);
			if(A.equals(B)) {
				return true;
			}
		}
		return false;
	}

	private static String shiftByInteger(String a, int shiftBy) {
		
		String res = "";
		char[] arr = a.toCharArray();
		for(int i= 1;i<arr.length;i++) {
			res= res+arr[i]; 
		}
		res = res+arr[0];
		A = res;
		return res;
	}

	public static void main(String[] args) {
		System.out.println(rotateString("abcde", "cdeab"));
	}
}
