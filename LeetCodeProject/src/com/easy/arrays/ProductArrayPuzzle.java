package com.easy.arrays;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		doProductArrayPuzzle(new int[] {10,3,5,6,2});
	}

	private static void doProductArrayPuzzle(int[] arr) {
		
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] prod = new int[arr.length];
		
		left[0] =1;
		right[arr.length-1]=1;
		
		for(int i =1;i<arr.length;i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		
		for(int i =arr.length-2;i>=0;i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		for(int i =0;i<arr.length;i++) {
			prod[i] = left[i] * right[i];
		}
		
		for(int i : prod) {
			System.out.print( i +" ");
		}
	
		
	}
}
