package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CourseScheduleII {

	static boolean hasCycle = false;
	static int[][] prerequisites = new int[][] {{1,0}};
	public static void main(String[] args) {
		findOrder(2, prerequisites);
	}

	public static int[] findOrder(int numCourses, int[][] prerequisites) {

		List<Integer> adj[] = new LinkedList[numCourses];

		for(int i =0;i< numCourses;i++) {
			adj[i] = new LinkedList<Integer>();
		}
		for(int[] pre : prerequisites) {
			adj[pre[0]].add(pre[1]);
		}
		boolean[] visited = new boolean[numCourses];
		boolean[] used = new boolean[numCourses];
		Stack<Integer> stack  = new Stack<Integer>();
		for(int i =0;i< numCourses;i++) {
			if(dfs(i, adj, visited, used,stack)) {
				return new int[] {};
			}

		}
		int[] res = new int[numCourses];
		int count=0;
		System.out.println(stack.size());
		while(!stack.isEmpty()) {
			res[count++] = stack.pop();
		}
		return res;

	}

	public static boolean dfs(int i, List<Integer>[] adj, boolean[] visited, boolean[] used, Stack<Integer> stack) {

		if(used[i]) {
			return false;
		}

		if(visited[i]) {
			return true;
		}
		visited[i] = true;
		Iterator<Integer> it = adj[i].listIterator();

		while(it.hasNext()) {
			int node = it.next();
			if(dfs(node, adj, visited, used,stack)) {
				return true; 
			}
		}

		visited[i] = false;
		used[i] = true;
		stack.push(i);
		return false;
	}
}
