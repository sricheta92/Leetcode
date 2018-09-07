package com.medium.arrays;

import java.util.Arrays;

public class StoneGame {

	
	public static void main(String[] args) {
		stoneGame(new int[]{5,3,4,5});
		
	}
	 public static boolean stoneGame(int[] piles) {
	      
	       return  stoneGameRecur(piles,0 ,0, true );
	    }
	    
	    public static boolean stoneGameRecur(int[] piles, int sumalex, int sumlee, boolean alex){
	        if(piles.length ==0){
	            return (sumalex>sumlee)? true: false;
	        }
	        int n = piles.length;
	        if(alex){
	          sumalex += Math.max(piles[0], piles[n-1]);
	        
	        }else{
	            sumlee += Math.min(piles[0], piles[n-1]);
	        }
	        int  maxIndex = (piles[n-1] == Math.max(piles[0], piles[n-1])) ? n-1 : 0;
	        int [] newArr = (maxIndex == n-1) ? Arrays.copyOfRange(piles, 0, piles.length - 1) : Arrays.copyOfRange(piles, 1, piles.length );
	     
	        return stoneGameRecur(    newArr, sumalex, sumlee, !alex);
	    }
}
