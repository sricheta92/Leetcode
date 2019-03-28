package com.easy.arrays;

public class CountAndSay {
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(countAndSay(6));
		
		
	}

	private static String  countAndSay(int n) {
		if(n ==1) {
			return "1";
		}
		
		String str = "1";
		
		for(int i =2;i<=n;i++) {
			str = str+"$";
			int count = 1;
			String temp = "";
			for(int j = 1;j< str.length();j++) {
				if(str.charAt(j)!= str.charAt(j-1)) {
					temp = temp + count;
					temp = temp +str.charAt(j-1);
					count =1;
				}else {
					count++;
				}
			}
			str = temp;
		}
		
		return str;
	}
}
