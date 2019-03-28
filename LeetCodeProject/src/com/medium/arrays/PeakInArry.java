package com.medium.arrays;

public class PeakInArry {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2};
		System.out.println(findPeak(arr));
	}

	private static int findPeak(int[] arr) {
		String s = "sry";
		s.indexOf('1');
		int low = 0;
		int high = arr.length-1;
		int n = arr.length;
		while(low<=high) {
			
			int mid = low + (high-low)/2;
			
			if((mid == 0 || arr[mid] > arr[mid-1]) && (mid == n-1 || arr[mid] > arr[mid+1])) {
				return mid;
				
			}else if (arr[mid]<arr[mid+1]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			
			
			
		}
		
		return -1;
		
	}
}
