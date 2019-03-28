package com.medium.heaps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		String str = "tree";
		System.out.println(sortCharactersByFrequency(str));
	}

	private static String sortCharactersByFrequency(String s) {
		char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<Map.Entry<Character, Integer>>(new Comparator<Map.Entry<Character, Integer>>(){
            public int compare(Map.Entry<Character, Integer> c1, Map.Entry<Character, Integer> c2) {
                return c2.getValue() - c1.getValue() ;
            }
        });
        
        for(int i =0;i< s.length();i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        queue.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            Map.Entry<Character, Integer> i = queue.poll();
            for(int j =0;j<i.getValue();j++) {
            	sb.append(i.getKey());
            }
        }
       
        return sb.toString();
        
		
		
	}
}
