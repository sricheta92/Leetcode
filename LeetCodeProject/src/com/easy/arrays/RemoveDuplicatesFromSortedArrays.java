package com.easy.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromSortedArrays {

	public static int removeDuplicates(int[] nums) {
        int count =0;
        
             for(int i = 0;i<nums.length-1;i++){
                 if(nums.length>2){
                     if(nums[i] == nums[i+1] && (i+1 != nums.length-1) ){
                       //  count++;
                         int temp = nums[i+1];
                         nums[i+1] = nums[i+2];
                         nums[i+2] = temp;
                     }
                     else if(nums[i] == nums[i+1]  && (i+1 == nums.length-1)) {
                    //	 count++;
                    	 Arrays.copyOf(nums, nums.length-1);
                     }
                 }else{
                     if(nums[i] == nums[i+1]){
                         Arrays.copyOf(nums, nums.length-1);
                         return 1;
                     }
                 }
             }
             
             
       Set<Integer> s = new HashSet<Integer>();
       for(int j = 0;j<nums.length;j++) {
    	   s.add(nums[j]);
       }
        return  s.size();
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2};
		System.out.println(removeDuplicates(arr));
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i] +" ");
		}
	}
}
