package com.easy.trees;

public class RescursionTree {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
	}

	private static int factorial(int i) {
		
		if(i ==0) {
			return 1;
		}
		int ans =0;
		ans =  ans * factorial(i-1);
		return ans;
		
		
	}
}
