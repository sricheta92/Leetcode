package com.graph;

public class DetectCycleInUndirectedGraph {
	
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
	    graph.addEdge(0, 2);
	    graph.addEdge(1, 2);
	    graph.addEdge(2, 0);
	    graph.addEdge(2, 3);
	    graph.addEdge(3, 3);
	    System.out.println("Has Cycle ---" + detectCycle(graph));
	}

	private static boolean detectCycle(Graph graph) {
		DisjointSet set = new DisjointSet();
		for(int v : graph.getVertices()) {
			set.makeSet(v);
		}
		
		for(Edge e : graph.getEdges()) {
			
			int parent1 = set.findSet(e.getVertex1());
			int parent2 = set.findSet(e.getVertex2());
			
			if(parent1 == parent2) {
				return true;
			}else {
				set.union(parent1, parent2);
			}
		}
		return false;
		
		
	}
	
}
