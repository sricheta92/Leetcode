package com.medium.arrays;

public class RotateArray {

	public static void main(String[] args) {
		rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7},2);
	}

	private static void rotateArray(int[] nums, int d) {
		for(int i =0;i<d;i++) {
			leftRotate(nums);
		}
		
		for(int i: nums) {
			System.out.print(i+" ");
		}
	}

	private static void leftRotate(int[] nums) {
		
		int t = nums[0];
		for(int i =1;i<nums.length;i++) {
			nums[i-1] = nums[i];
		}
		nums[nums.length-1] = t;
		
	}
}
