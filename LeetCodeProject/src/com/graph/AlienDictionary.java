package com.graph;

import java.util.Arrays;

public class AlienDictionary {
	static int N = 26;
	public static void main(String[] args) {
		String[] words = {"wrt","wrf","er","ett","rftt"}; 
        System.out.println(printOrder(words)); 
	}

	private static String printOrder(String[] words) {
		  
        
		boolean[][] adj = new boolean[N][N];
		int[] visited = new int[N];
		Arrays.fill(visited, -1);
		
		for(String s : words) {
			for(char c : s.toCharArray()) {
				visited[c -'a'] = 0;
			}
		}
		
		for(int i =0;i< words.length-1;i++) {
			String curr = words[i];
			String next = words[i+1];
			
			for(int j =0; j< Math.min(curr.length(), next.length()); j++) {
				if(curr.charAt(j) != next.charAt(j)) {
					adj[curr.charAt(j) - 'a'][next.charAt(j) - 'a'] = true;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i =0 ;i<N;i++) {
			if(visited[i] == 0 && dfs(i, sb, adj, visited )) return "";
		}
		
		return sb.reverse().toString();
	}

	private static boolean dfs(int i, StringBuilder sb, boolean[][] adj, int[] visited) {
		if(visited[i]== 0) {
			visited[i] = 1;
			for(int j =0;j<N;j++) {
				if(adj[i][j]) {
					if(visited[j] == 1) return true;
					if(dfs(j, sb, adj, visited)) return true;
				}
			}
			visited[i] = 2;
			sb.append((char) (i +'a'));
		}
		return false;
	}

}
