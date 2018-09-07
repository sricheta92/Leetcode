package com.hard.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		int ans = findLongestCommonSubsequence(new int[] {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42});
		System.out.println(ans);
	}

	private static int findLongestCommonSubsequence(int[] is) {
		
		int ans =0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i : is) {
			set.add(i);
		}
		
		for(int i =0;i<is.length;i++) {
			//check if this is the first elem in subsequence
			if(!set.contains(is[i]-1)) {
				
				int j = is[i];
				while(set.contains(j)) {
					j++;
				}
				
				if(ans<j-is[i]) {
					ans = j -is[i];
				}
				
			}
		}
		return ans;
		
		
	}
}
