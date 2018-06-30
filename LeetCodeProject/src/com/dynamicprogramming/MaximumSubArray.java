package com.dynamicprogramming;

public class MaximumSubArray {


	 public int maxSubArray(int[] nums) {
	        
	        int max =nums[0];
	        int max_ending =0;
	        
	        for(int i =0;i<nums.length;i++){
	            
	            max_ending =max_ending + nums[i];
	            
	            if(max_ending> max){
	                max= max_ending;
	            }
	            
	            if(max_ending<0){
	                max_ending =0;
	            }
	            
	        }
	        
	        return max;
	        
	    }
}
