package com.dynamicprogramming;

public class LargestCommonSubsequence {

	 
	public static void main(String[] args) {
		System.out.println(largetsCommonSubsequenceDp("ABCDGH","AEDFHR"));
	} 

	private static int largetsCommonSubsequenceDp(String string1, String string2) {
		 
		int[][] cache = new int[string1.length()+1][string2.length()+1];
		int max =0;
		for(int i =1;i<cache.length;i++) {
			for(int j =1;j<cache[i].length;j++) {
				if(string1.charAt(i-1) == string2.charAt(j-1)) {
					cache[i][j] = cache[i-1][j-1]+1;
				}else {
					System.out.println(string1.charAt(i-1));
					cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
				}
				if(cache[i][j]>max) {
					max = cache[i][j];
				}
			}
		}
		
		return max;
	}
}
