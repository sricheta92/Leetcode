package com.medium.arrays;

public class FidMinInRotatedArray {

	public static void main(String[] args) {
		
		System.out.println(findMin(new int[]{3,4,5,1,2}, 0, 4));
	}
	public static int findMin(int[] arr, int low , int  high) {
		/*        
		
		int mid = low +(high -low)/2;
		
		if(mid<high && arr[mid]> arr[mid+1]) {
			return arr[mid+1];
		}
		
		if( low<mid && arr[mid-1]> arr[mid]) {
			return arr[mid];
		}
		
		if(arr[high]> arr[mid]) 
			return findMin(arr, low, mid-1);
		return findMin(arr, mid+1, high);*/
		
		
		
		// 3,4,5,1,2
		
		int mid = low + (high - low)/2;
		
		if(low<mid  && arr[mid-1]> arr[mid] ){
			return mid;
		}
		
		if( mid< high && arr[mid] > arr[mid+1]) {
			return mid+1;
		}
		
		if(arr[high]< arr[mid]) {
			findMin(arr, mid+1,high );
		}else {
			findMin(arr, low,mid-1 );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
