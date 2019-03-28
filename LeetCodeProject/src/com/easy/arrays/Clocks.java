package com.easy.arrays;

import java.util.HashSet;
import java.util.Set;

public class Clocks {

	public static void main(String[] args) {
		solution("22:22:21","22:22:23");
	}

	public static int solution(String S, String T) {
		// write your code in Java SE 8
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(char a :S.toCharArray()  ) {
			if(a!= ':') {
				sb1.append(Integer.parseInt(Character.toString(a)));
			}
		}
	
		for(char a :T.toCharArray()  ) {
			if(a!= ':') {
				sb2.append(Integer.parseInt(Character.toString(a)));
			}
		}

		int diff = Integer.parseInt(sb1.toString()) - Integer.parseInt(sb2.toString());
		
		int greater  = (diff>0) ? Integer.parseInt(sb1.toString()) : Integer.parseInt(sb2.toString());
		int count =0;
		for(int i = greater;i<= Math.abs(diff)+greater;i++) {
			if(isIdentical(i+"")) {
				count++;
			}
		}
		
		System.out.println(count);
		return 0;

	}

	private static boolean isIdentical(String S) {
		Set<Integer> set1 = new HashSet<Integer>();
		for(char a :S.toCharArray()  ) {
			if(a!= ':') {
				set1.add(Integer.parseInt(Character.toString(a)));
			}
		}
		
		if(set1.size()<=2) {
			return true;
		}else {
			return false;
		}
		
	}
}
