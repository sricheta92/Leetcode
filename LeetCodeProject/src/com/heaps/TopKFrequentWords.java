package com.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {

	public static void main(String[] args) {
		String[] arr = {"i", "love", "leetcode", "i", "love", "coding"};
		int k = 2;
		topKFrequent(arr, k);
	}

	private static List<String> topKFrequent(String[] nums, int k) {
		
	     
			 	List<String> list  = new ArrayList<String>();
		        Map<String,Integer> map = new HashMap<String,Integer>();
		        
		        PriorityQueue<String>  queue = new PriorityQueue<String>
		        (new Comparator<String>(){

					@Override
					public int compare(String arg0, String arg1) {
						if( map.get(arg0) - map.get(arg1) == 0) {
							return  arg1.compareTo(arg0);
						}else {
							return map.get(arg1) - map.get(arg0);
						}
					}
		        	
		        });
		        for(String num :nums){
		            if(map.containsKey(num)){
		                map.put(num, map.get(num)+1);
		            }else{
		               map.put(num, 1);
		            }
		            //queue.offer(map.)
		        }
		      
		        
		      for(String i : map.keySet()) {
		    	  queue.offer(i);
		      }
		        
		      for(int j = 0;j<k;j++) {
		    	  list.add(queue.poll());
		      }
		      return list;
		
	}
}
