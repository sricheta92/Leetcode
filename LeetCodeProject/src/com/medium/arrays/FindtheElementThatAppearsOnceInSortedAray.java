package com.medium.arrays;

/**
 * Time complexity : O(log(N))
 * @author Sricheta's computer
 *
 */
public class FindtheElementThatAppearsOnceInSortedAray {

	public static void main(String[] args) {
		findtheElementThatAppearsOnceInSortedAray(new int[] {1,1, 2, 4,4, 5,5,6,6});
	}

	private static void findtheElementThatAppearsOnceInSortedAray(int[] arr) {
		
		int low = 0;
		int high = arr.length -1;
		
		while(low<=high) {
			
			if(low == high) {
				System.out.println(arr[low]);
				return;
			}
			
			int mid = low + (high -low) /2;
			
			//check if mid i even or odd

			if(mid %2  ==0 ) {
				if(arr[mid] == arr[mid+1]) {
					low = mid+2;
				}else {
					high = mid;
				}
			}else {
				if(arr[mid] == arr[mid-1]) {
					low  = mid +1;
				}else {
					high = mid -1;
				}
			}
		}
		
	}
	
}
