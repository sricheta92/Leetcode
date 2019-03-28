package com.String;

public class NextPermutation {
	
	public static void main(String[] args) {
		int[] nums = new int[] {9,1,2,4,3,1,0};
		nextPermuatation(nums);
	}

	private static void nextPermuatation(int[] nums) {
		
		int i = nums.length-1;
		
		for(;i>=1;i--) {
			if(nums[i]>nums[i-1]) {
				break;
			}
		}
		
		swap(nums, i-1);
		reverse(nums, i);
		
		for(int a : nums) {
			System.out.print(a+" ");
		}
		
	}

	private static void reverse(int[] nums, int i) {
		int start = i;
		int end = nums.length-1;
		while(start<end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	
	private static void swap(int[] nums, int i) {
		
		for(int j = nums.length-1;j>i;j--) {
			if(nums[j]>nums[i]) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				break;
			}
		}
		
	}

}
