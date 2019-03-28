package com.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinSliceWeight {

	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		//list.add(l1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		List<Integer> l3 = new ArrayList<Integer>();
		l3.add(7);
		l3.add(8);
		l3.add(9);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		Set<Integer> res = new HashSet<Integer>();
		int cost[][] = { {1, 2, 3}, 
				{4, 8, 2}, 
				{1, 5, 3} }; 
		System.out.println(minCost(cost,2,2));
		//System.out.println(min);
	}
	private static int minCost(int[][] cost, int row, int col) {

		int res =Integer.MAX_VALUE;

		if(cost.length == 1) {
			for(int i =0;i<col;i++) {
				res = Math.min(cost[0][i], res);
			}
			return res;
		}

		for(int i =0;i<row;i++) {
			 res =Integer.MAX_VALUE;
			for(int j =0;j<col;j++) {
				//System.out.println(res);
				if(j>0 && j<col-1) {
					cost[i][j] += Math.min(Math.min(cost[i][j], cost[i][j-1]), cost[i][j+1]);
				}else if(j==0) {
					cost[i][j] += Math.min(cost[i][j+1], cost[i][j]);
				}else {
					cost[i][j] +=Math.min(cost[i][j-1], cost[i][j]);
				}
				res = Math.min(res, cost[i][j]);
			}


		}
		return res;


	}



}
