package com.medium.arrays;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		search(new int[] {5,7,7,8,8,10}, 1);
	}

	private static int[] search(int[] arr, int key) {
		
		int[] res = new int[2];
		
		// Counts first occurrence
		int low = 0;
		int high = arr.length-1;
		int first =-1;
		while(low<=high) {
			
			int mid = low+ (high-low)/2;
			if((mid == 0 || key> arr[mid-1]) && arr[mid] == key) {
				first = mid;
				break;
			}
			else if(key>arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			
		}
		
		// counts second occurance
		 low = 0;
		 high = arr.length-1;
		 int last = -1;
		 while(low<=high) {
				
				int mid = low+ (high-low)/2;
				if((mid == arr.length-1 || key< arr[mid+1]) && arr[mid] == key) {
					last = mid;
					break;
				}
				else if(key<arr[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
				
			}
		 
		 res[0] = first;
		 res[1] = last;
		System.out.println(res[0] +" "+ res[1]);
		
		return res;
		
	}
	
}
