package com.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	public int V;
	public LinkedList<Integer> adj[]  ;
	
	Graph(int num){
		this.V = num;
		adj = new LinkedList[num];
		for(int i =0;i<num;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}

	public void dfs() {
		
		boolean[] visited = new boolean[V];
		
		for(int i =0;i<V;i++) {
			if(!visited[i]) {
				dfsUtil(i, visited);
			}
		}
		
	}

	private void dfsUtil(int i, boolean[] visited) {
		
		visited[i] = true;
		System.out.print(i+" ");
		ListIterator<Integer> it = adj[i].listIterator();
		
		while(it.hasNext()) {
			int node = it.next();
			if(!visited[node]) {
				dfsUtil(node, visited);
			}
		}
		
	}

	public void bfs() {
		
		boolean[] visited = new boolean[V];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			
			Integer node = queue.poll();
			System.out.print(node +" ");
			
			ListIterator<Integer> it = adj[node].listIterator();
			while(it.hasNext()) {
				int n = it.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
			}
		}

	public void topologicalSort() {
	
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0;i<V;i++) {
			topologicalSortUtil(i, visited,stack);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+ " ");
		}
	}

	private void topologicalSortUtil(int i, boolean[] visited, Stack<Integer> stack) {
		
		visited[i] = true;
		ListIterator<Integer> it = adj[i].listIterator();
		while(it.hasNext()) {
			int n = it.next();
			if(!visited[n]) {
				topologicalSortUtil(n, visited, stack);
			}
		}
		stack.push(i);
		
	}

	

	public int[] shortestReach(int start, int end) {
		
		   
        Queue<Integer> queue = new LinkedList<Integer>();
        int[] distances = new int[V];
        Arrays.fill(distances,-1);
        queue.add(start);
        distances[start] =0;
        
        while(!queue.isEmpty()){
            int i = queue.poll();    
            ListIterator<Integer> it = adj[i].listIterator();
            while(it.hasNext()){
            	int n = it.next();
                if(distances[n]==-1){
                    distances[n]  =distances[i]+1 ;
                    queue.add(n);
                }
              
            }
          
        }
        
        return distances;
		
	}
		
	

	
}
