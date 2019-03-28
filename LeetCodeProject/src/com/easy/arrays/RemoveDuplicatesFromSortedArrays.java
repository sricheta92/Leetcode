package com.easy.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromSortedArrays {

	public static int removeDuplicates(int[] nums) {
		int j =0;
		for(int i =0;i<nums.length-1;i++) {
			if(nums[i] != nums[i+1]) {
				nums[j++] = nums[i];
			}
		}
		nums[j++] = nums[nums.length-1];
		return j;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,1,2};
		int n =removeDuplicates(arr);
		for(int i =0;i<n;i++) {
			System.out.println(arr[i] +" ");
		}
	}
}
