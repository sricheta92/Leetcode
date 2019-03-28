package com.dynamicprogramming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class KnapSack01 {

	public static void main(String[] args) {
		int val[] = {1, 2};
	    int wt [] = {1, 10};
	   
	//   System.out.println(MaxValueFromKnapSack(Arrays.asList(val), wt, 50));
		System.out.println(MaxValueFromKnapSack(val, wt, 4));
		
	//	mergeStrings("abu", "tv");
		
		  File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt"); 
		  // abs [10:00:33 ]
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  List<String> list = new ArrayList<String>();
		  String st; 
		  while ((st = br.readLine()) != null) {
		   
		  } 
		
	
	//atbvu
	private static void mergeStrings(String first, String second) {
		
		StringBuilder sb = new StringBuilder();
		int n = first.length();
		int m = second.length();
		int i=0;
		int j =0;
		while(i<n && j< m) {
			sb.append(first.charAt(i++));
			sb.append(second.charAt(j++));
		}
		
		while(i<n) {
			sb.append(first.charAt(i++));
		}
		while(j<m) {
			sb.append(second.charAt(j++));
		}
		//System.out.println(sb.toString());
	}

	private static int MaxValueFromKnapSack(int[] val, int[] wt, int W) {
	/*
		int cache[][]  = new int[val.length+1][W+1];
		
		for(int i =1;i<cache.length;i++) {
			for(int j =1;j<cache[i].length;j++){
				if(j-val[i-1]>=0) {
					cache[i][j] = Math.max(cache[i-1][j], cache[i-1][j -val[i-1]] + wt[i-1]);
				}else {
					
					cache[i][j] = cache[i-1][j];
				}
			}
		}
		
		return cache[val.length][W];*/
		
		
		//unbounded
		int dp[] = new int[W + 1]; 
        int n = wt.length;
        // Fill dp[] using above recursive formula 
        for(int i = 0; i <= W; i++){ 
            for(int j = 0; j < n; j++){ 
                if(val[j] <= i){ 
                    dp[i] = Math.max(dp[i], dp[i - val[j]] +  
                                wt[j]); 
                } 
            } 
        } 
        return dp[W]; 
	}
	
	private static int MaxValueFromKnapSack(List<Integer> books, List<Integer> booksPrice, int W) {
		
		int cache[][]  = new int[books.size()+1][W+1];
		
		for(int i =1;i<cache.length;i++) {
			for(int j =1;j<cache[i].length;j++){
				if(j-books.get(i-1)>=0) {
					cache[i][j] = Math.max(cache[i-1][j], cache[i-1][j -books.get(i-1)] + booksPrice.get(i-1));
				}else {
					cache[i][j] = cache[i-1][j];
				}
			}
		}
		
		return cache[books.size()][W];
	}
}
