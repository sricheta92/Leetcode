package com.easy.arrays;

public class SearchInsertPosition {
	public static int searchInsert(int[] A, int target) {
		 int low = 0, high = A.length-1;
	        while(low<=high){
	            int mid = (low+high)/2;
	            if(A[mid] == target) return mid;
	            else if(A[mid] > target) high = mid-1;
	            else low = mid+1;
	        }
	        return low;
		
    }
	
	
	public static void main(String[] args) {
		System.out.println(searchInsert(new int[] {1,2,4,5,6}, 3));
	}
}

