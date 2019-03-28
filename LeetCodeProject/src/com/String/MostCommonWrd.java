package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class MostCommonWrd {

	public static void main(String[] args) {
		String paragraph  = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		//	System.out.println(mostCommonWord(paragraph,banned ));
		System.out.println(mostCommonWordHeap(paragraph, banned));
	}

	private static String mostCommonWordHeap(String paragraph, String[] banned) {

		if(paragraph == null){
			return null;
		}
		String arr[] = paragraph.toLowerCase().replaceAll("[?',;.]", "").split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();


		List<String> bannedList = Arrays.asList(banned);


		for(String str : arr) {
			// if(!bannedList.contains(str)){
			map.put(str, map.getOrDefault(str, 0)+1);
			// }
		}

		PriorityQueue<String> queue = new PriorityQueue<String>(new Comparator<String>(){
			public int compare(String a, String b){
				return map.get(b) - map.get(a);
			}
		});

		
		for(String str : arr) {
			if(!bannedList.contains(str)){
				queue.add(str);
			}
		}

		return queue.poll();

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
