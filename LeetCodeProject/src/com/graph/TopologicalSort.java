package com.graph;

public class TopologicalSort {

	public static void main(String[] args) {
		 Graph g = new Graph(4);
	     //   g.addEdge(5, 2);
	      //  g.addEdge(5, 0);
	  //      g.addEdge(4, 0);
	        g.addEdge(0, 1);
	        g.addEdge(1, 2);
	        g.addEdge(2, 3);
	 
	        System.out.println("Following is a Topological " +
	                           "sort of the given graph");
	        g.topologicalSort();

	}
}
