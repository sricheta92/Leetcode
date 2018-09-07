package com.hard.arrays;

public class MaximumProductSubArray {

	public static void main(String[] args) {
		findMaximumProductSubArray(new int[] {-2, 3, -4});
	}

	private static int findMaximumProductSubArray(int[] A) {
		
		if (A.length == 0) return 0;
		   int max = A[0], min = A[0], totalMax = A[0];
		   for (int i = 1; i < A.length; i++) {
		       int tempMax = A[i] * max;
		       int tempMin = A[i] * min;
		       max = Math.max(Math.max(tempMax,tempMin), A[i]);
		       min = Math.min(Math.min(tempMax,tempMin), A[i]);
		       totalMax = Math.max(totalMax, max);
		   }
		   System.out.println(totalMax);
		   return totalMax;
	}

	private static void swap(int[] A, int imax, int imin) {
		
		int temp = imax;
		imax = imin;
		imin = temp;
		
	}
}
