package com.String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	public static void main(String[] args) {
		 System.out.println(isIsomorphicString("foo" ,"bar"));
	}
	
	
	// Think about cases ab aa, egg add
	private static boolean isIsomorphicString(String s, String t) {
		
		Map<Character, Character> forwardMap = new HashMap<Character, Character>();
		Map<Character, Character> backwardMap = new HashMap<Character, Character>();
		for(int i =0;i< s.length();i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if(forwardMap.containsKey(a)) {
				if(!forwardMap.get(a).equals(b)) {
					return false;
				}
			}else if(!backwardMap.containsKey(b)) {
				forwardMap.put(a, b);
				backwardMap.put(b, a);
			}else {
				return false;
			}
		}
		return true;
	}
}
