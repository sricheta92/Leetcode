package com.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeNumberOfCombinations {
	
	public static void main(String[] args) {
		System.out.println(coinChangeRecursive(4, new int[]{1,2}));
		System.out.println(coinChangeDP2DArray(4, new int[]{1,2}));
		System.out.println(coinChangeDP1DArray(4, new int[]{1,2}));
		List<Integer> ans = new ArrayList<Integer>();
		printCoinChangingSolution(15, new int[]{3,4,6,7,9}, ans, 0);
	}

	private static void printCoinChangingSolution(int sum, int[] coins, List<Integer> list, int start) {
		
		if(sum == 0) {
			for(int a : list) {
				System.out.print(a +" ");
			}
			System.out.println("");
		}
		for(int i = start; i< coins.length;i++) {
			if(coins[i] <= sum) {
				list.add(coins[i]);
				printCoinChangingSolution(sum - coins[i], coins, list, start);
				list.remove(list.size()-1);
			}				
		}
		
	}

	private static int coinChangeRecursive(int sum, int[] coins) {
		
		if(sum==0) {
			return 1;
		}
		
		if(sum<0) {
			return 0;
		}
		int sum1 =0;
		for(int coin : coins ) {
			sum1 += coinChangeRecursive(sum-coin, coins);
		}
		
		return sum1;
	}
	
	private static int coinChangeDP2DArray(int sum, int[] coins) {
		
		int[][] table = new int[coins.length+1][sum+1];
		
		for(int i =0;i<coins.length;i++) {
			table[i][0] =1;
		}
		
		for(int i = 1;i<=sum;i++) {
			for(int j =1;j<= coins.length;j++) {
				if(coins[j-1] <=i) {
					table[j][i] =  table[j-1][i] + table[j][i - coins[j-1]]; 
				}else {
					table[j][i] = table[j-1][i];
				}
			}
		}
		
		return table[coins.length][sum];
	}
}
