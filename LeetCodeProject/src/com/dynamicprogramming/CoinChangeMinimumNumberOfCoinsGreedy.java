package com.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeMinimumNumberOfCoinsGreedy {

	public static void main(String[] args) {
		
		System.out.println(coinChangeMinimumNumberOfCoins(3, new int[] { 2}));
		//System.out.println(2^2^100);
	}

	private static int coinChangeMinimumNumberOfCoins(int sum, int[] coins) {
		
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int i =coins.length-1;i>=0;i--) {
			while(coins[i]<=sum) {
				sum -= coins[i];
				ans.add(coins[i]);
			}
		}
		
		for(int i: ans) {
			System.out.print(i+ " ");
		}
		return 0;
	}

	private static void print(int[] min) {
		
		for(int i: min) {
			System.out.print( i +" ");
		}
		System.out.println("");
	}
}
