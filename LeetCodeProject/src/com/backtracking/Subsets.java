package com.backtracking;

import java.util.Arrays;

public class Subsets {

	public static void main(String[] args) {
		doSubsets(new int[]{1,2,3});
	}

	private static void doSubsets(int[] arr) {
		
		int[] A = new int[arr.length];
		Arrays.sort(arr);
		backTrack(A,arr, 0, arr.length);
		
	}

	private static void backTrack(int[] a	, int[] arr, int level, int length) {
		
		if(level == length) {
			process(a,arr);
		}else {
			for(int i =0;i<=1;i++) {
				a[level] = i;
				backTrack(a, arr, level+1, length);
			}
		}
		
	}

	private static void process(int[] a, int[] arr) {
		
		for(int i =0;i<arr.length;i++) {
			if(a[i]==1) {
				System.out.print(arr[i]+" ");
			}
		}
		
		System.out.println("");
		
	}
}
