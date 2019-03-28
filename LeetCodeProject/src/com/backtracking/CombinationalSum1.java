package com.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationalSum1 {

	public static void main(String[] args) {
		Set<Integer> ar = new HashSet<>();
		ar.add(2);
		ar.add(5);
		ar.add(6);
		ar.add(7);
 
		int sum = 7; // set value of sum
		List<List<Integer>> res = combinationSum(new ArrayList<Integer>(ar), sum);
	}

	private static List<List<Integer>> combinationSum(ArrayList<Integer> ar, int sum) {
		
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

	private static void findSum(ArrayList<Integer> ar, List<List<Integer>> res, List<Integer> list, int sum, int i) {
		
		if(sum<0) {
			return;
		}
		
		if(sum ==0) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		// Recur for all remaining elements that
				// have value smaller than sum.
				while (i < ar.size() && sum - ar.get(i) >= 0) {
		 
					// Till every element in the array starting
					// from i which can contribute to the sum
					list.add(ar.get(i)); // add them to list
		 
					// recur for next numbers
					findSum(ar, res, list, sum - ar.get(i), i);
					i++;
		 
					// remove number from list (backtracking)
					list.remove(list.size() - 1);
				}
	}
}
