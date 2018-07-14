package com.dynamicprogramming;

public class ClimbStairsMinCost {

	public static void main(String[] args) {
		System.out.println(climbStairsMinCost(new int[] {10,15,20}));
	}

	private static int climbStairsMinCost(int[] cost) {
		
		int[] f = new int[cost.length+1];
		
		int f0 = cost[0];
		int f1= cost[1];
		
		for(int i =2;i<cost.length;i++) {
			int fucurr = cost[i] +Math.min(f0, f1);
			f0 = f1;
			f1 = fucurr;
		}
		
		return Math.min(f0, f1);
	}
}
