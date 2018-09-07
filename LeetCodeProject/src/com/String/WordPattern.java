package com.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog cat cat dog"));
	}

	public static boolean wordPattern(String pattern, String str) {

		String[] arr = str.split(" ");
		Map<Character, String> map = new HashMap<Character,String>();
		Set<String> set = new HashSet<String>();

		if(pattern.length()!= arr.length){
			return false;
		}

		for(int i =0; i<pattern.length();i++){

			if(map.containsKey(pattern.charAt(i))){
				if(!map.get(pattern.charAt(i)).equals(arr[i])){
					return false;
				}
			}else{
				if(set.contains(arr[i])){
					return false;
				}else{
					set.add(arr[i]);
				}
			}
			map.put(pattern.charAt(i), arr[i]);


			

		}

		return true;

	}

}

