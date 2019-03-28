package com.graph;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DikshtraShortestPath {
	
	public static void main(String[] args) {
		
		WeightedGraph graph = new WeightedGraph(30);
		graph.addEdge(0, 1,1);
	    graph.addEdge(1, 0,0);
	    graph.addEdge(1, 2,3);
	  //  graph.addEdge(2, 0);
	    graph.addEdge(2, 3,4);
	  //  graph.addEdge(3, 3);
        Node[] res =dikshtra(graph,0);
        for(Node n : res) {
        	System.out.println(n.vertice+" ==> "+ n.key+" ");
        }
        
	}

	private static Node[] dikshtra(WeightedGraph graph, int source) {
		
		Node[] keys = new Node[graph.V];
		boolean[] mset = new boolean[graph.V];
		for(int i =0;i<keys.length;i++) {
			keys[i] = new Node(i,Integer.MAX_VALUE);
		}
		
		keys[source].key = 0;
		Queue<Node> q = new PriorityQueue<Node>();
		q.addAll(Arrays.asList(keys));
		
		while(!q.isEmpty()) {
			Node n = q.poll();
			List<Edge> edges = n.getEdges(n.vertice);
			mset[n.vertice] = true;
			for(Edge edge : edges) {
				Node n1 = (Node)it.next();
				if(mset[n1.vertice] == false &&	 n.key+ \n1.< keys[n1.vertice].key) {
					 q.remove(keys[n1.vertice]);
					keys[n1.vertice].key = n.key;
					q.add(keys[n1.vertice]);
				}
				
			}
		}
		
		return keys;
	}

}
