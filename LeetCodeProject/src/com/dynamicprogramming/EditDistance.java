package com.dynamicprogramming;

public class EditDistance {
	public static void main(String[] args) {
		System.out.println(editDistance("horse","ros"));
		System.out.println(minDistance("horse","ros"));
	}

	private static int editDistance(String word1, String word2) {
		 int m = word1.length();
	        int n = word2.length();
	        int[][] dp = new int[m + 1][n + 1];
	        for (int i = 0; i < dp.length; i++) {
	            dp[i][0] = i;
	        }
	        for (int i = 0; i < dp[0].length; i++) {
	            dp[0][i] = i;
	        }
	        for (int i = 1; i <=word1.length(); i++) {
	            for (int j = 1; j <= word2.length(); j++) {
	                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1];
	                } else {
	                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
	                }
	            }
	        }
	        return dp[m][n];
	}
	
public static int minDistance(String word1, String word2) {
        
        int[][] arr = new int[word1.length()+1][word2.length()+1];
        
        for(int i =0 ;i<arr.length;i++){
            arr[i][0] = i;
        }
        
        for(int i =0 ;i<arr[0].length;i++){
            arr[0][i] = i;
        }
        
        for(int i =1;i<=word1.length();i++){
            for(int j =1;j<=word2.length();j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1];
                }else{
                    arr[i][j] = Math.min(Math.min(arr[i-1][j], arr[i][j-1]) ,arr[i-1][j-1])+1;
                }
            }
        }
        
        return arr[word1.length()][word2.length()];
    }

}
