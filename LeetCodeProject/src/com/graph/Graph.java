package com.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {

	public int V;
	public Set<Integer> vertices = new HashSet<Integer>();
	public List<Edge> edges = new ArrayList<Edge>();
	public LinkedList<Integer> adj[]  ;
	
	Graph(int num){
		this.V = num;
		adj = new LinkedList[num];
		for(int i =0;i<num;i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w){
		vertices.add(v);
		vertices.add(w);
		edges.add(new Edge(v, w, 0));
		adj[v].add(w);
	}

	void addEdge(int v1, int v2, int w ){
		vertices.add(v1);
		vertices.add(v2);
		edges.add(new Edge(v1, v2, w));
		adj[v1].add(v2);
	}
	
	public Graph transpose(int V) {
		
		Graph g = new Graph(V);
		for(int i =0;i<V;i++) {
			Iterator<Integer> iter = g.adj[i].listIterator();
			while(iter.hasNext()) {
				//int neighbour = iter.next();
				adj[iter.next()].add(i);
			}
		}
		
		return g;
		
	}


	public void dfs() {
		
		boolean[] visited = new boolean[V];
		
		for(int i =0;i<V;i++) {
			if(!visited[i]) {
				dfsUtil(i, visited);
			}
		}
		
	}

	public void dfsUtil(int i, boolean[] visited) {
		
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

	public Set<Integer> getVertices() {
		return vertices;
	}
		
	public List<Edge> getEdges() {
		return edges;
	}

	
	
}
