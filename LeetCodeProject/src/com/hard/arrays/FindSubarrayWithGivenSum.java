package com.hard.arrays;

public class FindSubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 4, 20, 3, 10, 5};
		int sum = 33;
		findSubarrayWithGivenSum(arr, sum);
	}

	private static void findSubarrayWithGivenSum(int[] arr, int sum) {
		
		int curr_sum =0;
		int start =0;
		for(int i =0;i<arr.length;i++) {
			while(curr_sum> sum && start<i-1 ) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if(sum == curr_sum) {
				System.out.println(start +" " + (i-1) );
				break;
			}
			curr_sum = curr_sum+ arr[i];
		}
	}
}
