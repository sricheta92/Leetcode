package com.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrams(a);
	}
	
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        List<List<String>> res = new ArrayList<List<String>>();
	        for(String a : strs){
	        	char[] c = a.toCharArray();
	             Arrays.sort(c);
	             String b = new String(c);
	             if(map.containsKey(b)) {
	            	 map.get(b).add(a);
	             }else {
	            	 List<String> l = new ArrayList<String>();
	            	 l.add(a);
	            	 map.put(b, l);
	            	 // map.put(b, new ArrayList<String>(a));
	             }
	             
	        }
	        
	      
	     
	        for(Map.Entry<String, List<String>> ent: map.entrySet()) {
	        	res.add(ent.getValue());
	        }
	        System.out.println(res);
	        return res;
	    }

}
