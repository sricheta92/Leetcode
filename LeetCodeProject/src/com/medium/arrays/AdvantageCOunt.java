package com.medium.arrays;

import java.util.Arrays;

public class AdvantageCOunt {
	
	public static void main(String[] args) {
		
		advantageCount(new int[]{2,0,4,1,2}, new int[]{1,3,0,0,2});
	}
	 public static int[] advantageCount(int[] A, int[] B) {
		 

	    //Arrays.sort(A);
		//Arrays.sort(B);
		 for(int i =0;i<A.length;i++) {
			 if(A[i]<B[i]) {
				 for(int j =i+1;j<A.length;j++) {
					 if(A[j]>B[i]) {
						 swap(j,i,A);
						 break;
					 }
				 }
			 }
		 }
	        
		 for(int i: A) {
			 System.out.print(i+" ");
		 }
		 return A;
	  }
	private static void swap(int j, int i, int[] A) {
		
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
	}

}
