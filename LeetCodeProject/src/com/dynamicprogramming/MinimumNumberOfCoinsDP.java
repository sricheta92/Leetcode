package com.dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfCoinsDP {

	public static void main(String[] args) {
		System.out.println(minimumOfNumberOfCoinsRecursive(11, new int[] { 9,1,1,5,6}));
		System.out.println(minimumOfNumberOfCoinsBottomUp(11, new int[] { 9,1,1,5,6}));
	}

	private static int minimumOfNumberOfCoinsRecursive(int V, int[] coins) {
		
		if(V ==0 ) {
			return 0;
		}
		int res = Integer.MAX_VALUE;
		for(int i =0;i<coins.length;i++) {
			if(V >=coins[i]) {
				int sub_res = minimumOfNumberOfCoinsRecursive(V-coins[i], coins);
				if(sub_res!=Integer.MAX_VALUE && sub_res+1< res) {
					res = sub_res+1;
				}
			}
		}
		return res;
	}
	
	public static int minimumOfNumberOfCoinsBottomUp(int V, int[] coins) {
		
		int[] table = new int[V+1];
		table[0] = 0;
		
		for(int i =1;i< coins.length;i++) {
			table[i] = Integer.MAX_VALUE;
		}
		
		
		for(int i =0;i<V;i++) {
			for(int j =0;j< coins.length;j++) {
				if(coins[j] >=i) {
					int sub_res = table[i-coins[j]];
					if(sub_res!=Integer.MAX_VALUE && sub_res+1 < table[i]) {
						table[i] = sub_res+1;
					}
				}
			}
		}
		return table[V];
	}
	
}
