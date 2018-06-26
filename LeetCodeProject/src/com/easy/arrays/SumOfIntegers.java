package com.easy.arrays;

public class SumOfIntegers {

	public static void main(String[] args) {
		System.out.println(sum(38));
	}

	private static int sum(int n) {
		
		if(n<10) {
			return n;
		}
		int ans =0;
		int sum = 0;
		while(n>0) {
			sum = sum + n%10;
			n = n/10;
		}
		
	
		return sum(sum);
	}
}
