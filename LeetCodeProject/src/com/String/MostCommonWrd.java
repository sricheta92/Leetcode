package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWrd {

	public static void main(String[] args) {
		String paragraph  = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(mostCommonWord(paragraph,banned ));
	}

	private static String mostCommonWord(String paragraph, String[] banned) {
		
		String[] arr = paragraph.toLowerCase().replaceAll("[!?',;.]", "").split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(banned)); 
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String item: arr) {
			if(!list.contains(item)) {
				map.put(item, map.getOrDefault(item, 0)+1);
			}
		}
		
		int max = -1;
		String res = "";
		for(String keys : map.keySet()) {
			if(map.get(keys)>max) {
				max = map.get(keys);
				res = keys;
			}
		}
		
		return res;
		
		
		
	}
}
