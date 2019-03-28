package com.medium.arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		sortArrayByParityII(new int[] {4});
		 int arr[] = new int[]{5, 5, 10, 100, 10, 5}; 
	        System.out.println(findMaxSum(arr, arr.length)); 
	}

	private static char[] findMaxSum(int[] arr, int length) {
		int odd=0;
		int even =1;
		
	}

	public static int[] sortArrayByParityII(int[] A) {

		for(int i = 0;i<A.length-1;i++){

			if(A[i] %2 != 0 && i %2 ==0 ){
				if(i> 0 && A[i-1] %2 ==0){
					swap(A,i, i-1); 
				}else{
					swap(A,i, i+1); 
				}

			}

		}
		return A;
	}
	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
