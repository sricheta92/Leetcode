package com.graph;

import java.util.Iterator;

/**
 * Write : What is Strongly connected graph?
 * @author ruj
 *
 */
public class isStronglyConnectedGraph {
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
	    graph.addEdge(1, 2);
	   // graph.addEdge(1, 2);
	 //  graph.addEdge(2, 0);
	    graph.addEdge(2, 3);
	//   graph.addEdge(3, 3);
	   System.out.println("Is Strongly connected " + isStronglyConnected(graph));
	
	}

	private static boolean isStronglyConnected(Graph graph) {
		
		boolean[] visited = new boolean[graph.V];
		
		graph.dfsUtil(0, visited);
		
		for(int i =0;i<visited.length;i++) {
			if(visited[i] == false) {
				return false;
			}
		}
		Graph g1 = dotranspose(graph,graph.V);
		
		for(int i =0;i<visited.length;i++) {
			visited[i] = false;
		}
		
		g1.dfsUtil(0, visited);
		
		for(int i =0;i<visited.length;i++) {
			if(visited[i] == false) {
				return false;
			}
		}
		
		return true;
		
	}

	private static Graph dotranspose(Graph g, int V) {
		Graph g1 = new Graph(V);
		for(int i =0;i<V;i++) {
			Iterator<Integer> iter = g.adj[i].listIterator();
			while(iter.hasNext()) {
				//int neighbour = iter.next();
				g1.adj[iter.next()].add(i);
			}
		}
		
		return g1;
	}
}
