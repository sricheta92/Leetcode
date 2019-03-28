package com.graph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DetectCycleInDirectedGraph {

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		System.out.println("Has Cycle ---" + detectCycleUsingDFS(graph));
		System.out.println("Has Cycle ---" + detectCycleUsingColorCode(graph));
	}


	/**
	 * Time Complexity = O(V+ E)
	 * @param graph
	 * @return
	 */
	private static boolean detectCycleUsingColorCode(Graph graph) {

		Set<Integer>  white = new HashSet<Integer>();
		Set<Integer> gray = new HashSet<Integer>();
		Set<Integer> black = new HashSet<Integer>();

		// First put all the vertices to white set
		white = graph.getVertices();

		// iterate through all white set vertex and do a DFS
		for(Integer vertex : white) {
			if(dfs(vertex, white, gray, black, graph)) {
				return true;
			}
		}
		return false;
	}

	private static boolean dfs(Integer vertex, Set<Integer> white, Set<Integer> gray,  Set<Integer> black, Graph graph) {
		moveVertex(vertex, white, gray);
		Iterator<Integer> it = graph.adj[vertex].listIterator();

		while(it.hasNext()) {
			int adj = it.next();

			if(black.contains(adj)) {
				continue;
			}

			if(gray.contains(adj)) {
				return true;
			}

			if(dfs(adj, white, gray, black, graph)) {
				return true;
			}
		}
		moveVertex(vertex, gray, black);
		return false;
	}

	private static void moveVertex(Integer vertex, Set<Integer> source, Set<Integer> destination) {
		source.remove(vertex);
		destination.add(vertex);		
	}

	private static boolean detectCycleUsingDFS(Graph graph) 
	{
		boolean[] visited = new boolean[graph.V];

		for(int i =0;i< graph.V;i++) {
			if(detectCycleUsingDFSUtil(i, visited, graph)) {
				return true;
			}
		}

		return false;

	}

	private static boolean detectCycleUsingDFSUtil(int i, boolean[] visited, Graph graph) {
		if(!visited[i]) {
			visited[i] = true;
			Iterator<Integer> it= graph.adj[i].listIterator();
			while(it.hasNext()) {
				int j = it.next();
				if(visited[j]) {
					return true;
				}
				if(detectCycleUsingDFSUtil(j, visited, graph)) {
					return true;
				}
			}
			visited[i] = false;
		}
		return false;
	}
}
