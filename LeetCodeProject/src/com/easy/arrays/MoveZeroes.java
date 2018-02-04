package com.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		 for(int i = 0;i<nums.length-1;i++){
	           for(int j = 0 ;j<nums.length -i-1;j++){
	               if(nums[j] == 0){
	                   int temp = nums[j];
	                   nums[j] = nums[j+1];
	                   nums[j+1] = temp;
	               }
	           }
	        }
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
