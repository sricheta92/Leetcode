package com.dynamicprogramming;

public class CoinChangeNumberOfCombinations {

	public static void main(String[] args) {
		System.out.println(coinChangeRecursive(4, new int[]{1,2}));
		System.out.println(coinChangeDP(4, new int[]{1,2}));
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
	
	private static int coinChangeDP(int sum, int[] coins) {
		
		int combos[] = new int[sum+1];
		combos[0] =1;
		
		
			for(int coin =0;coin<coins.length;coin++) {
				for(int i =1;i<combos.length;i++) {
					if(i>= coins[coin]) {
						combos[i] = combos[i] + combos[i-coins[coin]];
					}
			}
			
		}
		return combos[sum];
	}
}
