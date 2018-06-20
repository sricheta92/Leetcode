package com.easy.arrays;

public class FlipImage {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[][] {{1,1},{1,0,1,1},{0,0,0}};
		
		System.out.println(arr.length);
		
		for(int[] a: arr) {
			int[] rev_arr = reverse(a);
			int[] invert_arr =Invert(rev_arr);
		}
		
	System.out.println(arr);	
	
	}

	private static int[] Invert(int[] rev_arr) {
		
		int count=0;
		for(int a :rev_arr) {
			a = (a ==1) ? 0 :1;
			rev_arr[count] =a;
			count++;
			
		}
		return rev_arr;
		
	}

	private static int[] reverse(int[] a) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		return a;
		
	}

}
