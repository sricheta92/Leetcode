package com.graph;

public class FindTheCelebrity {
	
	public static void main(String[] args) {
		
		System.out.println(findTheCelebrity(3));
	}
	
	private static int findTheCelebrity(int n) {
		
		int candidate = 0;
		for(int i =0;i<n;i++) {
			if(knows(candidate, i)) {
				candidate  = i;
			}
		}
		
		for(int i =0;i<n ;i++) {
			if(candidate == i) {
				continue;
			}
			if(knows(candidate, i) || !knows(i, candidate)) {
				return -1;
			}
			
		}
		return candidate;
		
		
	}

	public static boolean knows(int a , int b) {
		return true;
	}

}
