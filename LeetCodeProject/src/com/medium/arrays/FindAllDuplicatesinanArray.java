package com.medium.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {

	 public static List<Integer> findDuplicates(int[] nums) {
	        
	        List<Integer> l = new ArrayList<Integer>();
	        boolean[] check = new boolean[nums.length];
	        
	        for(int i = 0;i<check.length;i++){
	            if(check[nums[i]-1]){
	                l.add(nums[i]);
	            }
	            check[nums[i]-1] = true;
	        }
	        return l;
	    }
	 
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(arr));
		
	}
}
