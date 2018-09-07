package com.easy.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOf2Arrays {
	
	public static void main(String[] args) {
		intersect(new int[]{  1}, new int[]{1});
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i : nums1) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		 List<Integer> myList = new ArrayList<Integer>();
		for(int i : nums2) {
			if(map.containsKey(i)){
                if(map.get(i)>0){
                    map.put(i,(map.get(i))-1);
                  
					myList.add(i);
                }
            }
			
		}
		
		//return myList;
        int[] arr = new int[myList.size()];
        int count=0;
        for(int i : myList){
            arr[count++] = i;
        }
        return arr;
	}

}
