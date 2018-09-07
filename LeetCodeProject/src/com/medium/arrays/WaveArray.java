package com.medium.arrays;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		doWaveArraySorting(new int[] {3, 6, 5, 10, 7, 20});
		System.out.println("");
		doWaveArray(new int[] {10, 90, 49, 2, 1, 5, 23});
		
	}
	
	/**
	 * If we make sure that all the even positioned elements are greater than the 
	 * adjacent odd elements, we can get wave for array.
	 * Time Complexity : O(n)
	 * @param arr
	 */
	private static void doWaveArray(int[] arr) {
		
		for(int i =0;i<arr.length;i=i+2) {
			
			if(i>0 && arr[i]< arr[i-1]) {
				swap(arr,i,i-1);
			}
			
			if(i<arr.length-1 && arr[i]< arr[i+1]) {
				swap(arr,i+1,i);
			}
			
		}
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
	}
	
	/**
	 * Sort the Array and swap the elements pair wise.
	 * Time Complexiity : O(nlogn)
	 * @param arr
	 */
	private static void doWaveArraySorting(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i =0;i<arr.length-1;i=i+2) {
			swap(arr, i, i+1);
		}
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i]  = arr[j];
		arr[j] = temp;
	}
	
	
}
