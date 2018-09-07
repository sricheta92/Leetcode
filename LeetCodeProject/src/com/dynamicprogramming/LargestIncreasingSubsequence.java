package com.dynamicprogramming;

public class LargestIncreasingSubsequence {

	public static void main(String[] args) {
		
		longestIncreasingSubsequnce(new int[]{1,3,6,7,9,4,10,5,6});
	}

	private static void longestIncreasingSubsequnce(int[] is) {
		
		
		
		int[] T = new int[is.length];
		int count=0;
		for(int i :is) {
			T[count++] = 1; 
		}
		
		for(int i =1;i<is.length;i++) {
			for(int j =0;j<i;j++) {
				if(is[i]>is[j]) {
					T[i] = Math.max(T[i], T[j]+1);
				}
			}
		}
		int max =0;
		for(int i =0;i<T.length;i++) {
			if(T[i]>max) {
				max = T[i];
			}
		}
		
		System.out.println(max);
	}
}
