package com.medium.heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequencyElements {

	 public static List<Integer> topKFrequent(int[] nums, int k) {
	        
		 	List<Integer> list  = new ArrayList<Integer>();
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        PriorityQueue<Integer>  queue = new PriorityQueue<Integer>
	        (new Comparator<Integer>(){

				@Override
				public int compare(Integer arg0, Integer arg1) {
					return map.get(arg0) - map.get(arg1);
				}
	        	
	        });
	        for(int num :nums){
	            if(map.containsKey(num)){
	                map.put(num, map.get(num)+1);
	            }else{
	               map.put(num, map.get(num));
	            }
	            //queue.offer(map.)
	        }
	      
	        
	      for(int i : map.keySet()) {
	    	  queue.offer(i);
	      }
	        
	      for(int j = 0;j<k;j++) {
	    	  list.add(queue.poll());
	      }
	      return list;
	    }
	 
	 public static void main(String[] args) {
		
		 int arr[] = {1,1,1,2,2,3};
		 int k = 2;
		 topKFrequent(arr,k);
		 
	}
}
