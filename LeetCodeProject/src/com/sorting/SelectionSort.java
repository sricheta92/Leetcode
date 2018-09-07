package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[]{7,4,2,3,1,9};
		doSelectionSort(arr);
		print(arr);
	}

	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i +" ");
		}
		
	}
	
	private static void doSelectionSort(int[] arr) {
		
		int min = 0;
		
		for(int i =0;i<arr.length-1;i++) {
			min = i;
			for(int j = i+1;j<arr.length;j++) { 
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
		
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
