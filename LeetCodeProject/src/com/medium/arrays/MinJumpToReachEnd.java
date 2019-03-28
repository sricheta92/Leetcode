package com.medium.arrays;

public class MinJumpToReachEnd {
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,3,1,1,1,2,4,2,0,1,1};
		int[] result = new int[arr.length];
		System.out.println(jumpArr(arr, result));
	}

	private static int  jumpArr(int[] arr, int[] result) {
		
		int[] jump = new int[arr.length];
		  jump[0] = 0;
	        for(int i=1; i < arr.length ; i++){
	            jump[i] = Integer.MAX_VALUE-1;
	        }
		for(int i =1;i< arr.length;i++) {
			for(int j =0;j<i;j++) {
				if(arr[j]+ j>=i) {
					if(jump[i] > jump[j]+ 1) {
						result[i] = j;
						jump[i] = jump[j] +1;
					}
				}
			}
		}
		
		return jump[jump.length-1];
		
	}
}
