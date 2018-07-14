package com.dynamicprogramming;

public class KnapSack01 {

	public static void main(String[] args) {
		int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
	    int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
		System.out.println(MaxValueFromKnapSack(val, wt, 30));
	}

	private static int MaxValueFromKnapSack(int[] val, int[] wt, int W) {
	
		int cache[][]  = new int[wt.length+1][W+1];
		
		for(int i =1;i<cache.length;i++) {
			for(int j =1;j<cache[i].length;j++){
				if(j-wt[i-1]>=0) {
					cache[i][j] = Math.max(cache[i-1][j], cache[i-1][j -wt[i-1]] + val[i-1]);
				}else {
					
					cache[i][j] = cache[i-1][j];
				}
			}
		}
		
		return cache[wt.length][W];
	}
}
