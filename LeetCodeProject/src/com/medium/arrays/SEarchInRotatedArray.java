package com.medium.arrays;

public class SEarchInRotatedArray {
	
	public static void main(String[] args) {
		System.out.println(search(new int[] {1,3}, 0, 0, 1));
	}

	private static int search(int[] arr, int key , int low, int high) {
		

		int pivot = findPivot(arr, low, high);
		
		//Array Is not not rotated at all
		if(pivot == -1) {
			return binarySearch(arr,key, 0, arr.length-1);
		}
		if(arr[pivot] == key) {
			return pivot;
		}
		if(arr[0]<=key) {
			return binarySearch(arr,key, 0, pivot-1);
		}else {
			return binarySearch(arr,key, pivot+1, arr.length-1);	
		}
		
	
	}

	private static int binarySearch(int[] arr, int key, int low, int high) {
		
		if(high<low) {
			return -1;
		}
		
		while(low<=high) {
			
			int mid = low +(high -low)/2;
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid]<key) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		
	return -1;
	}

	private static int findPivot(int[] arr, int low, int high) {
		
		if(high<low) {
			return -1;
		}
		
		if(high == low) {
			return low;
		}
		int mid = low + (high -low)/2;
		if(low<mid && arr[mid-1]>arr[mid]) {
			return mid-1;
		}
		if(high>mid && arr[mid+1]<arr[mid]) {
			return mid;
		}
		if(arr[low]>= arr[mid]) {
			return findPivot(arr, low, mid-1);
		}else {
			return findPivot(arr, mid+1, high);
		}
		
	}

}
