package com.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
	
	static boolean dp[][];

	public static void main(String[] args) {
		
		findSubsets(new int[]{1, 2, 3, 7, 8, 10, 11,11},11);
		
	}

	private static void findSubsets(int[] arr, int sum) {
		
		 dp = new boolean[arr.length+1][sum+1];
		for(int i =0;i<dp.length;i++) {
			dp[i][0] = true;
		}
		
		for(int  i =1;i<=arr.length;i++) {
			for(int j =1;j<= sum;j++) {
				if(j-arr[i-1]>=0) {
					dp[i][j] = dp[i-1][j] || dp[i-1][j- arr[i-1]];
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[arr.length][sum]);
		List<Integer> p = new ArrayList<Integer>();
		printPaths(arr,arr.length-1, sum,p  );
	}

	private static void printPaths(int[] arr, int i, int sum, List<Integer> p) {
		
		if(sum !=0 && i== 0 && dp[0][sum]) {
			p.add(arr[i]);
			display(p);
			p.clear();
			return;
		}
		
		if(i ==0 && sum ==0) {
			display(p);
			p.clear();
			return;
		}
		
		 // If given sum can be achieved after ignoring
        // current element.
        if (dp[i][sum])
        {
            // Create a new vector to store path
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(p);
            printPaths(arr, i-1, sum, b);
        }
        
		if(sum>= arr[i] && dp[i][sum-arr[i]]) {
			p.add(arr[i]);
			printPaths(arr, i-1, sum-arr[i],p);
		}
	
	}

	private static void display(List<Integer> p) {
		for(int a :p) {
			System.out.print(a + " ");
		}
		System.out.println("");
		
	}
}
