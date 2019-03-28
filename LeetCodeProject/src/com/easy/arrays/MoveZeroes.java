package com.easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		 /*for(int i = 0;i<nums.length-1;i++){
	           for(int j = 0 ;j<nums.length -i-1;j++){
	               if(nums[j] == 0){
	                   int temp = nums[j];
	                   nums[j] = nums[j+1];
	                   nums[j+1] = temp;
	               }
	           }
	        }*/
		/*
		int left =0;
		int right = nums.length-1;
		while(left<right) {
			while(left<right && nums[left] !=0) {
				left++;
			}
			while(left<right && nums[right] ==0) {
				right--;
			}
			if(left<right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right--;
			}
		}*/
		
		
		int odd= 1;
		int even =0;
		int n = nums.length-1;
		while(true) {
			while(even<=n && nums[even] %2 ==0) {
				even+=2;
			}
			while(odd<=n && nums[odd]%2 ==1) {
				odd+=2;
			}
			
			if(even<n && odd<n) {
				int temp = nums[even];
				nums[even] = nums[odd];
				nums[odd] = temp;
				even+=2;
				odd+=2;
			}else {
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		//int[] arr = {0,1,0,3,12};
		int[] arr = {3, 6, 12, 1, 5, 8};
		moveZeroes(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
