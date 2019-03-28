package com.medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FourSum {

	public static void main(String[] args) {
		fourSum(new int[] {1,2,3,4,5}, 10);

	}

	public static List<List<Integer>> fourSum(int[] nums, int sum) {
		Set<List<Integer>>  res = new HashSet();
		if(nums == null){
			return new ArrayList<>(res);
		}
		Map<Integer, List<Pair>> map = new HashMap<Integer, List<Pair>>();
		for(int i =0;i<nums.length -1;i++) {
			for(int j =i+1;j<nums.length;j++) {
				int val = sum - (nums[i]+ nums[j]);
				if(map.containsKey(val)) {
					
					
					for(Pair p : map.get(val)) {
						int x = p.x;
						int y = p.y;
						if((x!=i && y != i) && (y!=j && x != j) ) {
							List<Integer> l = new ArrayList<Integer>();
							l.add(nums[i]);
							l.add(nums[j]);
							l.add(nums[x]);
							l.add(nums[y]);
							System.out.println(nums[x] +" "+ nums[y] +" "+  nums[i]  +" "+ nums[j]);
							Collections.sort(l);
							res.add(l);
						}
					}
					
					
				}
					map.putIfAbsent(nums[i]+nums[j], new ArrayList<>());
					map.get(nums[i]+ nums[j]).add(new Pair(i,j));
				
				
			}
		}
		if(res.equals(Arrays.asList(nums))) {
			return new  ArrayList<>();
		}
		return new ArrayList<>(res);
	}
	
}


 class Pair{
	int x;int y;
	 public Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
