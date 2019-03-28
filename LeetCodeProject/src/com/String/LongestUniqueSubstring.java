package com.String;

import java.util.Arrays;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		System.out.println(longestUniqueSubstr(str));
	}

	private static int longestUniqueSubstr(String str) {
		
		int[] visited = new int[256];
		Arrays.fill(visited, -1);
		int cur_len = 1;
		int maxlen =1;
		visited[str.charAt(0)] = 0;
		int prev_index;
		for(int i =1; i< str.length();i++) {
			prev_index = visited[str.charAt(i)];
			
			if(prev_index == -1 || i - cur_len> prev_index) {
				cur_len++;
			}else {
				
				if(cur_len> maxlen) {
					maxlen = cur_len;
					
				}
				cur_len = i - prev_index;
			}
			visited[str.charAt(i)] = i;
		}
		
		
		return maxlen;
		//System.out.println(maxlen);

		
		
	
		
		
		
		
		
		
	}
}
