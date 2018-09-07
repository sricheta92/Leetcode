package com.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationalSum2 {

	public static void main(String[] args) {
		Set<Integer> ar = new HashSet<>();
		ar.add(2);
		ar.add(4);
		ar.add(6);
		ar.add(8);
 
		int sum = 8; // set value of sum
		List<List<Integer>> res = combinationSum2(new ArrayList<Integer>(ar), sum);
	}

	private static List<List<Integer>> combinationSum2(ArrayList<Integer> ar, int sum) {
		
		Collections.sort(ar);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		findSum(ar, res, list, sum , 0);
		
		for(List<Integer> l : res) {
			for(int a : l) {
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
		return res;
	}

	private static void findSum(ArrayList<Integer> ar, List<List<Integer>> list, List<Integer> tempList, int remain, int start) {
		
		  
		   if(remain < 0) return; /** no solution */
		   else if(remain == 0) list.add(new ArrayList<>(tempList));
		   else{
		      for (int i = start; i < ar.size(); i++) {
		         if(i > start && ar.get(i) == ar.get(i-1)) continue; /** skip duplicates */
		         tempList.add(ar.get(i));
		         findSum(ar, list , tempList, remain - ar.get(i), i+1);
		         tempList.remove(tempList.size() - 1);
		      }
		   }
	}
}
