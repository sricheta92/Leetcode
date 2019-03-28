package com.hard.arrays;

/**
 * Kadane's Algorithm
 * @author Sricheta's computer
 *
 */
public class MaximumSumSubArray {

	public static void main(String[] args) {
		findMaximumSumSubArray(new int[] {-2, -3, 4, -1});
	}

	private static void findMaximumSumSubArray(int[] arr) {
		
		int max_end_here =0;
		int max =0;
		int start =0;
		int end = 0;
		int s =0;
		
		for(int i =0;i<arr.length;i++) {
			max_end_here = max_end_here +arr[i];
			if(max<max_end_here) {
				max = max_end_here;
				start =s;
				end =i;
			}
			if(max_end_here<0) {
				max_end_here =0;
				s = i+1; 
			}
		}
		System.out.println(start + " " +end);
		System.out.println(max);
		
	}
}
