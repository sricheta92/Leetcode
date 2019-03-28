package com.hard.arrays;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationPhone {
	public static void main(String[] args) {
		String[] coding = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> output = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		letterCombinations(output, 0, "23",coding,sb);
		System.out.println(output);
	}

	private static void letterCombinations(List<String> output, int index, String digit, String[] coding, StringBuilder sb) {
			if(digit.length() == sb.length()) {
				output.add(sb.toString());
			}
			
			for(int i =index;i<digit.length();i++) {
				String code = coding[digit.toCharArray()[i] -'0'];
				for(char c : code.toCharArray()) {
					sb.append(c);
					letterCombinations(output, i+1, digit, coding, sb);
					
					sb.setLength(sb.length()-1);
				}
			
			}
		
	}

}