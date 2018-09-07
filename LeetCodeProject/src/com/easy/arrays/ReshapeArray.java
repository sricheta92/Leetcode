package com.easy.arrays;

public class ReshapeArray {

	public static void main(String[] args) {
		int r = 1;
		int c =4;
		int arr[][] = new int[][] {{1,2}, {3,4}};
		reshape(arr, r, c);
				
	}

	private static int[][] reshape(int[][] arr, int r, int c) {
		
		int[][] res = new int[r][c];
		
		int rorig = arr.length;
		int corig = arr[0].length;
		
		//int count = corig;
		if(r*c != rorig*rorig) {
			return arr;
		}
		 int i1 = 0, j1 = 0;
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				res[i][j] = arr[i1][j1];
			
				j1++;
				if(j1>= corig) {
					j1 =0;
					i1++;
				}
			}
		}
		
		return res;
	}
}
