package com.number;

public class CountingBits {
	
	public static void main(String[] args) {
		countBits(5);
	}
	
	
	public static int[] countBits(int num) {
	        
	        int[]  res = new int[num+1];
	        
	        for(int i =0;i<=num;i++ ){
	            res[i] = Integer.bitCount(i);
	        }
	        
	        return res;
	        
	    }
}
