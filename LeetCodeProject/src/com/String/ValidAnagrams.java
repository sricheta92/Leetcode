package com.String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {

	public static void main(String[] args) {

		System.out.println(isAnagram("a","b"));
		System.out.println(isAnagramUsingHashMap("ccac","ccac"));

	}

	private static boolean isAnagramUsingHashMap(String s, String t) {
		if(s == null && t == null) {
			return true;
		}
		if(s== null || t== null) {
			return false;
		}
		if(s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : t.toCharArray()) {
			int count = map.getOrDefault(c, 0);
			if(count == 0) {
				return false;
			}
			map.put(c, count-1);
		}
		return true;
	}

	public  static boolean isAnagram(String s, String t) {


		if(s.length() != t.length()){
			return false;
		}
		int[] arr1 = new int[256];
		for(int i =0;i<s.length();i++){
			arr1[s.charAt(i)]++;
		}

		for(int j =0;j<t.length();j++){
			arr1[t.charAt(j)]--;
		}
		for(int k =0;k<arr1.length;k++) { 
			if(arr1[k]!=0) {
				return false;
			}
		}


		return true;

	}
}
