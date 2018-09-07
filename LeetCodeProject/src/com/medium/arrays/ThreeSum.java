package com.medium.arrays;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		do3SumBySorting(new int[] {-1, 0, 1, 2, -1, -4}, 0);
	}

	private static void do3SumBySorting(int[] arr, int sum) {
		
		Arrays.sort(arr);
		
		for(int i=0 ;i<arr.length-2;i++) {
			int l = i+1;
			int r = arr.length-1;
			
			while(l<r) {
				if(arr[l]+arr[r]+arr[i] == sum) {
					System.out.println("indexes are" + arr[l] +" "+arr[r] +" "+ arr[i]);
					return;
				}
				
				if(arr[l]+arr[r]+arr[i] < sum) {
					l++;
				}else {
					r--;
				}
			}
		}
		
		
	}
}
