package com.dynamicprogramming;

public class ClimbStairs {
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}

	private static int climbStairs(int n) {
		
		int f[] = new int[n+1];
		f[0] = 0;
		f[1] = 1;
		f[2] = 2;
		
		for(int i =3;i<n+1;i++) {
			f[i] = f[i-1] +f[i-2];
		}
		
		return f[n];
		
		
	}

}
