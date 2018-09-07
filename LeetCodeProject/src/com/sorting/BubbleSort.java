package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[]{7,4,2,3,1,9};
		//doBubbleSort(arr);
		improvedBubbleSort(arr);
		print(arr);
	}

	private static void improvedBubbleSort(int[] arr) {
		boolean swapped = true;
		for(int pass = arr.length-1;pass>=0 && swapped;pass--) {
			swapped = false;
			for(int i =0;i<pass-1;i++) {
				
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
					swapped = true;
				}
			}
		}
		
	}

	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i +" ");
		}
		
	}

	private static void doBubbleSort(int[] arr) {
		
		for(int pass = arr.length-1;pass>=0;pass--){
			for(int  i =0;i<pass-1;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i, i+1);
				}
			}
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
