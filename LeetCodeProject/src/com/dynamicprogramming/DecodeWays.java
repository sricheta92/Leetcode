package com.dynamicprogramming;

public class DecodeWays {
	static int countDecodingRecursive(char[] digits, int n)  
	{ 
		// base cases 
		if (n == 0 || n == 1) 
			return 1; 

		// Initialize count 
		int count = 0;  

		// If the last digit is not 0, then  
		// last digit must add to 
		// the number of words 
		if (digits[n - 1] > '0') 
			count += countDecodingRecursive(digits, n - 1); 

		// If the last two digits form a number 
		// smaller than or equal to 26, 
		// then consider last two digits and recur 
		if (digits[n - 2] == '1' ||  
				(digits[n - 2] == '2' && digits[n - 1] < '7')) 
			count += countDecodingRecursive(digits, n - 2); 

		return count; 
	} 

	// Driver program to test above function 
	public static void main(String[] args)  
	{ 
		char digits[] = {'0','1','2'}; 
		int n = digits.length; 
		System.out.printf("Count is %d", countDecodingRecursive(digits, n)); 
		System.out.printf("Count is %d", countDecodingDP("226")); 
	}

	private static Object countDecodingDP(String s) {
		 if(s == null || s.length() == 0) {
	            return 0;
	        }
	        int n = s.length();
	        int[] dp = new int[n+1];
	        dp[0] = 1;
	        dp[1] = s.charAt(0) != '0' ? 1 : 0;
	        for(int i = 2; i <= n; i++) {
	            int first = Integer.valueOf(s.substring(i-1, i));
	            int second = Integer.valueOf(s.substring(i-2, i));
	            if(first >= 1 && first <= 9) {
	               dp[i] += dp[i-1];  
	            }
	            if(second >= 10 && second <= 26) {
	                dp[i] += dp[i-2];
	            }
	        }
	        return dp[n];
	} 
}
