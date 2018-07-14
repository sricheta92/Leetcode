package com.dynamicprogramming;

public class CoinChangeCoinsRequiqred {

	static int[] coins = new int[]{10,6,1};
	public static void main(String[] args) {
		int n = 11;
		int[] cache = new int[12];
		for(int i =0;i<cache.length;i++) {
			cache[i] = -1;
		}
		System.out.println(makeChange(11, cache));
	}

	private static int makeChange(int change, int[] cache) {
		
		if(change ==0) return 0;
		if(cache[change]>=0) {return cache[change];}
		int max = Integer.MAX_VALUE;
		
		for(int coin :coins) {
			if(change -coin>=0) {
				int curr = makeChange(change -coin, cache);
				if(curr<max) {
					max = curr;
				}
			}
			
		}
		cache[change]=  max+1;
		return cache[change];
	}
	
	
}
