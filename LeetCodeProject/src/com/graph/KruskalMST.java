package com.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalMST {

	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdge(0, 1,1);
	    graph.addEdge(0, 2,9);
	    graph.addEdge(1, 2,3);
	  //  graph.addEdge(2, 0);
	    graph.addEdge(2, 3,4);
	  //  graph.addEdge(3, 3);
	    List<Edge> res = kruskalMST(graph);
	    for(Edge i  :res) {
	    	System.out.println(i.getWeight()+" "); 
	    }
	}

	 public static  List<Edge>  kruskalMST(Graph graph) {
		
		 
		 DisjointSet set = new DisjointSet();
		 for(int e : graph.getVertices()) {
			 set.makeSet(e);
		 }
		 
		 List<Edge> res = new ArrayList<Edge>();
		 Collections.sort(graph.getEdges());
		
		 for(Edge edge : graph.getEdges()) { 
			 int p1 = set.findSet(edge.getVertex1());
			 int p2 = set.findSet(edge.getVertex2());
			 if(p1 != p2) {
				res.add(edge);
				set.union(edge.getVertex1(), edge.getVertex2());
			 }
		 }
		return res;
	}
}
