package com.String;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		//System.out.println('9' - '0');
		System.out.println(decodeString("3[a]2[bc]"));
	}

	private static String decodeString(String str) {
		Stack<Integer> countStack = new Stack<Integer>();
		Stack<String> resStack = new Stack<String>();

		int i =0;
		String res ="";
		while(i< str.length()) {
			int count =0;
			if(Character.isDigit(str.charAt(i))) {
				while(Character.isDigit(str.charAt(i))){
					count = count*10 + str.charAt(i) -'0';
					i++;
				}
				countStack.push(count);
			}else if(str.charAt(i) == '[') {
				resStack.push(res);
				res = "";
				i++;
			}else if(str.charAt(i) == ']') {
				
				StringBuilder sb = new StringBuilder(resStack.pop());
				int repeatTime =countStack.pop();
				for(int j =0;j< repeatTime;j++) {
					sb.append(res);
				}
				res = sb.toString();
				i++;			
			}else {
				res += str.charAt(i);
				i++;
			}
			
		}
		return res;
		
		
	}

}
