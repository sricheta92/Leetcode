package com.easy.arrays;

import javax.swing.text.Position;

public class AlternatePositiveNegetiveNumbers {
	
	public static void main(String[] args) {
		sort(new int[] { -2, 3, 5, 0, -3, 7 ,-1});
	}

	private static void sort(int[] arr) {
		

		// step 1: move negative numbers before the positive figures 
		int lesserIndex=-1;
		int arrLen = arr.length ; 
		for(int i=0; i<arrLen; i++){
			if(arr[i]<0){
				lesserIndex++; 
				int tmp = arr[lesserIndex]; 
				arr[lesserIndex] = arr[i];
				arr[i] = tmp; 
			}
		}
		
		
		int negBound = lesserIndex+1;
		int posIndex = negBound;
		
		for(int negIngex = 0;negIngex<negBound && posIndex<arr.length; negIngex+=2, posIndex+=1){
			int tmp = arr[posIndex]; 
			arr[posIndex] = arr[negIngex] ; 
			arr[negIngex] = tmp ;
			negBound++;
		}
		
		
		for(int a : arr) {
			System.out.print(a);
		}
		
	}

}
