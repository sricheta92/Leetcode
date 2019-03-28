package com.easy.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOf2Arrays {
	
	public static void main(String[] args) {
		intersect(new int[]{  1, 2, 3, 4}, new int[]{1, 4, 6});
		union(new int[] {1,2,3,4}, new int[] {5,6,7});
	}

	private static void union(int[] is, int[] is2) {
		

		int i =0;
		int j =0;
		int m = nums1.length;
		int n = nums2.length;
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		
		int i =0;
		int j =0;
		int m = nums1.length;
		int n = nums2.length;
		
		while(i< m && j< n) {
			if(nums1[i] < nums2[j]) {
				i++;
			}
			else if(nums1[i] > nums2[j]) {
				j++;
			}else {
				System.out.println(nums1[i++]);
				j++;
			}
		}
		
		return null;
		/*Map<Integer,Integer> map = new HashMap<Integer,Integer>();
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
			
		}*/
		
	/*	//return myList;
        int[] arr = new int[myList.size()];
        int count=0;
        for(int i : myList){
            arr[count++] = i;
        }
        return arr;*/
	}

}
