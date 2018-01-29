package com.easy.arrays;

import java.util.Arrays;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if(index>0){
            return index;
        }else{
            return searchPosition(nums,target);
        }
        
    }
	
	public static  int searchPosition(int[] nums,int target){
       
		int n = nums.length;
		if(target < nums[0]) {
			return 0;
		}
		if(target > nums[n-1]) {
			return n;
		}
		
		int l = 0;
		int r = n-1;
		
		while(l<=r) {
			
			int m  = l + (r-l)/2;
			
			if((nums[m]<target && target<nums[m+1]) ){
	            return m+1;
	        }
			if((nums[m]>target && target>nums[m-1])) {
				return m;
			}
			
			 // If x greater, ignore left half
	        if (nums[m] < target)
	            l = m + 1;
	 
	        // If x is smaller, ignore right half
	        else
	            r = m - 1;
		}
    
		return 0 ;
        
    }
	
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
	}
}
