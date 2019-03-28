package com.easy.arrays;

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6}};
		transpose(matrix);
	}

	private static void transpose(int[][] A) {
		  int[][] res = new int[A[0].length][A.length];
		  
		  for(int i =0;i<A.length;i++) {
			  for(int j =0;j<A[i].length;j++) {
				  res[j][i] = A[i][j];
			  }
		  }
		
		  for(int[] i : res) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		  }
	}

}
